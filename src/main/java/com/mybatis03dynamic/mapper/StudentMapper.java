package com.mybatis03dynamic.mapper;

import com.mybatis03dynamic.entities.QueryVo;
import com.mybatis03dynamic.entities.Student;
import java.util.List;
/**
 * @author LM_Code
 * @create 2019-03-31-16:30
 */
public interface StudentMapper {
    public List<Student> findAll();
    public Student selectStudentById(int id);
    public List<Student> selectStudentsByName(String name);
    public List<Student> selectStudentsByVo(QueryVo queryVo);
    public List<Student> selectStudentsByCondition(Student s);
    public List<Student> selectStudentsByList(QueryVo queryVo);
}
