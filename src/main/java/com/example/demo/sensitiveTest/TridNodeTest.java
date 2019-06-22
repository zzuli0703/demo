package com.example.demo.sensitiveTest;


import org.apache.commons.lang.CharUtils;

/**
 * @author 640804
 * @ClassName: TridNodeTest
 * @projectName Demo
 * @description: TODO
 * @date 2019/6/2118:46
 **/
public class TridNodeTest {
    //根节点
    TridNode rootNode = new TridNode();

    //判断是否是符号
    public boolean isSymbol(char c) {
        int ic = (int) c;
        // 0x2E80-0x9FFF 东亚文字范围
        return !CharUtils.isAsciiAlphanumeric(c) && (ic < 0x2E80 || ic > 0x9FFF);
    }

    //添加关键字
    public void addWords(String text) {
        //节点初始为根节点
        TridNode subNode = rootNode;
        //循环每个字节
        for (int i = 0; i < text.length(); i++) {
            //得到当前字节
            char c = text.charAt(i);
            //过滤空格、符号
            if (isSymbol(c)) {
                continue;
            }
            //获取字节在字典树中对应的节点
            TridNode node = subNode.getSubNode(c);
            //如果为空
            if (node == null) {
                //新建节点
                node = new TridNode();
                //添加到根节点
                subNode.addSubNode(c, node);
            }
            //把当前节点作为根节点
            subNode = node;
            //如果为关键词结尾
            if (i == text.length() - 1) {
                //设置结尾为true
                subNode.setKeyWordEnd(true);
            }
        }
    }

    //过滤敏感词
    public String filter(String text) {
        //替代文字
        String explment = "XXX";
        StringBuffer result = new StringBuffer();
        TridNode tempNode = rootNode;

        //当前比较位置
        int position = 0;
        //起点
        int begin = 0;

        //循环
        while (position < text.length()) {
            //比较的字节
            char c = text.charAt(position);
            //如果是空格、符号
            if (isSymbol(c)) {
                //如果当前节点为根节点
                if (tempNode == rootNode) {
                    //添加到结果集里
                    result.append(c);
                    //开始节点后移
                    begin++;
                }
                //当前节点后移
                position++;
                continue;
            }
            //获得当前节点对应的字典树节点
            tempNode=tempNode.getSubNode(c);
            //如果为空，当前节点不是敏感词
            if (tempNode == null) {
                //添加到结果集中
                result.append(c);
                //指针后移
                begin++;
                position = begin;
                //节点指向根节点
                tempNode = rootNode;
                //如果不为空，且是敏感词结尾，则begin-position为敏感词
            } else if (tempNode.isKeyWordEnd()) {
                //替换敏感词
                result.append(explment);
                //开始字节指向当前字节下一字节
                begin = position + 1;
                //当前字节指向开始字节
                position = begin;
                //节点指向根节点
                tempNode=rootNode;
            } else {
                //如果不为空，属于敏感词字节，则比较下一字节
                //开始节点后移
                position++;
            }
        }
        result.append(text.substring(begin));
        return result.toString();
    }

    public static void main(String[] args){
        TridNodeTest t = new TridNodeTest();
        t.addWords("里");
        t.addWords("IT");
        t.addWords("服务");
        System.out.println(t.filter("你好，这里是，IT部门为您服务"));
    }
}
