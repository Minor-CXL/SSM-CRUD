package com.Dragon.Kassel.controller;


import com.Dragon.Kassel.mapper.SchoolMapper;
import com.Dragon.Kassel.pro.School;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Dept {

    ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

    @RequestMapping("/Dept")
    @ResponseBody
    public Msg getSchoolDept(){
        SchoolMapper school = context.getBean(SchoolMapper.class);


        List<School> schools = school.selectByExample(null);



        return Msg.success().add("info",schools);
    }
}
