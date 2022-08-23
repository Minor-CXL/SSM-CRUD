package com.Dragon.Kassel.controller;


import com.Dragon.Kassel.mapper.StudentMapper;
import com.Dragon.Kassel.pro.StudentExample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class checkName {


    ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

    @RequestMapping("/checkName")
    @ResponseBody
    public Msg checkName(String name){
        StudentMapper studentMapper = context.getBean(StudentMapper.class);

        StudentExample studentExample = new StudentExample();
        studentExample.createCriteria().andSNameEqualTo(name);
        final int count = studentMapper.countByExample(studentExample);

        if(count==0)
        return Msg.success();
        return Msg.fail();
    }
}
