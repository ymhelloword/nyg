package com.nyg.ssm.entity.productenum;

/**
 * @Classname fruit
 * @Description TODO
 * @Date 2019/10/16 20:06
 * @Created by zjl
 */
public enum Fruit {
    //苹果
    pingGuo("pingmuo",1),
    //梨
    li("li",2),
    //西瓜
    xiGua("xigua",3),
    //香蕉
    banana("banana",4),
    //芒果
    mangGuo("mangguo",5),
    //草莓
    caoMei("caomei",6),
    //橘子
    juZi("juzi",7),
    //杏
    xin("xin",8),
    //菠萝
    boLuo("boluo",9),
    //甘蔗
    ganZe("ganze",10)
    ;
    private String name;
   private int index;

    Fruit(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public String getName( ) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex( ) {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public static int getId(String name){
        for ( Fruit c: Fruit.values() ){
            if ( c.name.equals(name) ){
                return c.index;
            }
        }
        return 0;
    }

}
