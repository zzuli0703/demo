package com.example.demo.sensitiveTest;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 640804
 * @ClassName: TridNode
 * @projectName Demo
 * @description: TODO
 * @date 2019/6/2118:36
 **/
public class TridNode {
    //定义字典树
    //key下一个字符，value是对应的节点
    public Map<Character,TridNode> subNode= new HashMap<>();

    //true：关键词终结，false不是结尾继续
    public Boolean end =false;

    //获取下一个节点
    public TridNode getSubNode(Character c){
        return subNode.get(c);
    }

    //向指定位置添加节点数
    public void addSubNode(Character c,TridNode node){
        subNode.put(c,node);
    }

    //是否关键词结尾
    public boolean isKeyWordEnd(){
        return end;
    }
    //设置为结尾
    public void setKeyWordEnd(boolean end){
        this.end=end;
    }
    //节点总数
    public int getSubNodeCount(){
        return subNode.size();
    }

}












