package com.mybatis03dynamic.entities;

import java.io.Serializable;

/**
 * 学生实体
 */
public class Student implements Serializable {

  private long id;
  private String name;
  private String sex;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  @Override
  public String toString() {
    return "Student{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", sex='" + sex + '\'' +
            '}';
  }
}
