package com.nyg.ssm.enums;

import javax.xml.transform.Source;
public enum SourceEnum {
    ODER(0,"订单"),LOGIN(1,"登录"),ACTIVITY(2,"活动");
    private int id ;
    private String source;

    public int getId( ) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSource( ) {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
    SourceEnum(int id,String source){
        this.id = id;
        this.source = source;
    }

}
