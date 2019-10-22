package com.nyg.ssm.entity.productenum;

/**
 * @Classname Vegetable
 * @Description TODO
 * @Date 2019/10/17 18:47
 * @Created by zjl
 */
public enum  Vegetable {

    baicai(1,"baicai"),//白菜
    bocai(2,"bocai"),//菠菜
    youcai(3,"youcai"),//油菜
    juanxincai(4,"juanxincai" ),//卷心菜
    jiucai(5,"jiucai"),//韭菜
    xiangcai(6,"xiangcai"),//香菜
    qingcai(7,"qingcai"),//青菜
    suanmiao(8,"suanmiao"),//蒜苗
    shengcai(9,"shengcai"),//生菜
    ganlan(10,"ganlan"),//甘蓝
    xiaocong(11,"xiaocong"),//小葱
    luobo(12,"luobu"),//萝卜
    malingshu(13,"malingshu"),//马铃薯
    shenjiang(14,"shenjiang"),//生姜
    dashuan(15,"dashuan"),//大蒜
    nangua(16,"nangua"),//南瓜
    donggua(17,"donggua"),//冬瓜
    sigua(18,"sigua"),//丝瓜
    huanggua(19,"huanggua"),//黄瓜
    xihongshi(20,"xihongshi"),//西红柿
    yumi(21,"yumi"),//玉米
    maodou(22,"maodou"),//毛豆
    wandou(23,"wandou"),//豌豆
    candou(24,"candou"),//蚕豆
    qiezi(25,"qiezi"),//qiezi
    lajiao(26,"lajiao"),//辣椒
    jiangdou(27,"jiangdou"),//豇豆
    sijidou(28,"sijidou"),//四季豆
    xianggu(29,"xianggu"),//香菇
    pingu(30,"pingu"),//平菇
    jinzhengu(31,"jinzhengu"),//金针菇
    muer(32,"muer")//木耳
    ;
    private int index;
    private String name;
    Vegetable(int index, String name){
        this.index=index;
        this.name= name;
    }

    public int getIndex( ) {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName( ) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static int getId(String name){
        for ( Vegetable v:values() ){
            if ( v.name.equals(name) ){
                return v.index;
            }
        }
        return 0;
    }
}
