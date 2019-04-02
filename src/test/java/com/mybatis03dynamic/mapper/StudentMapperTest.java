package com.mybatis03dynamic.mapper;

import com.mybatis03dynamic.entities.QueryVo;
import com.mybatis03dynamic.entities.Student;
import com.mybatis03dynamic.utils.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LM_Code
 * @create 2019-03-31-16:46
 */
public class StudentMapperTest {
    StudentMapper studentMapper = null;
    SqlSession sqlSession = null;
    StudentMapper mapper;
    @Before
    public void before(){
        sqlSession = SqlSessionFactoryUtil.openSession(true);
        mapper = sqlSession.getMapper(StudentMapper.class);
    }
    @After
    public void after(){
        SqlSessionFactoryUtil.closeSession(sqlSession);
    }
    @Test
    public void testFindAll(){
        List<Student> students = mapper.findAll();
        for(Student student:students){
            System.out.println(student);
        }
    }
    @Test
    public void testSelectStudentById() throws Exception {
        Student student = mapper.selectStudentById(1);
        System.out.println(student);
        Assert.assertNotNull(student);
    }
    @Test
    public void testSelectStudentsByName(){
        List<Student> students = mapper.selectStudentsByName("o");
        for(Student student:students){
            System.out.println(student);
        }
        Assert.assertNotNull(students);
    }
    @Test
    public void testSelectStudentsByVo(){
        QueryVo queryVo = new QueryVo();
        Student s = new Student();
        queryVo.setStudent(s);
        s.setName("%y%");
        List<Student> students = mapper.selectStudentsByVo(queryVo);
        for(Student student:students){
            System.out.println(student);
        }
        Assert.assertNotNull(students);
    }
    @Test
    public void testSelectStudentsByCondition(){
        Student s = new Student();
//        s.setName("yangluo");
//        s.setSex("girl");
        List<Student> students = mapper.selectStudentsByCondition(s);
        for(Student student:students){
            System.out.println(student);
        }
        Assert.assertNotNull(students);
    }
    @Test
    public void testSelectStudentsByList(){
        QueryVo queryVo = new QueryVo();
        List<Integer> ids = new ArrayList<Integer>();
        for (int i = 1; i <= 6; i++) {
            ids.add(i);
        }
        queryVo.setIds(ids);
        List<Student> students = mapper.selectStudentsByList(queryVo);
        for(Student student:students){
            System.out.println(student);
        }
        Assert.assertNotNull(students);
    }
}
