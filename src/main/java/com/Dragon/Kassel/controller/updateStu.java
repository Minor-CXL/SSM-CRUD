package com.Dragon.Kassel.controller;


import com.Dragon.Kassel.mapper.StudentMapper;
import com.Dragon.Kassel.pro.Student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class updateStu {

    ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

    @RequestMapping("/update")
    @ResponseBody
    public Msg update(Student student){
        StudentMapper studentMapper = context.getBean(StudentMapper.class);

        if(student.getsBlood().equalsIgnoreCase(""))
            student.setsBlood("龙王");

        studentMapper.updateByPrimaryKeySelective(student);

        return Msg.success();


    }
}
