package com.nyg.ssm.entity;
import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
  private Integer id;
  private String name;
  private String age;
  private Date birthday;

  public User( ) {
  }

  public long getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }


  public Date getBirthday() {
    return birthday;
  }

  @Override
  public String toString( ) {
    return "User{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", age='" + age + '\'' +
            ", birthday=" + birthday +
            '}';
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

}
