package com.Dragon.Kassel.controller;


import com.Dragon.Kassel.mapper.StudentMapper;
import com.Dragon.Kassel.pro.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InfoAdd {

    ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

    @RequestMapping("/Add")
    @ResponseBody
    public Msg getSchoolDept(Student student){
        StudentMapper studentMapper = context.getBean(StudentMapper.class);


        studentMapper.insertSelective(student);

        return Msg.success();
    }
}
