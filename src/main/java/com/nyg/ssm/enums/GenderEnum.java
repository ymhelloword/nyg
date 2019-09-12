package com.nyg.ssm.enums;

public enum GenderEnum {
    MALE(1,"男"),FEMALE(0,"女"),SECRET(2,"保密");
    private int id;
    private String gender ;

    public int getId( ) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender( ) {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    GenderEnum(int id,String sex) {
        this.gender = sex;
        this.id = id;
    }
    public GenderEnum getSexById(int id){
        for ( GenderEnum sex : GenderEnum.values() ){
            if ( sex.getId()==id ){
                return sex;
            }
        }
        return null;
    }
}
