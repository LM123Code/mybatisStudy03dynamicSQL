package com.mybatis03dynamic.entities;

import java.util.List;

/**
 * @author LM_Code
 * @create 2019-04-02-17:03
 */
public class QueryVo {
    private Student student = null;

    private List<Integer> ids = null;

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
