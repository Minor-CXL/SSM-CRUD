package com.Dragon.Kassel.controller;


import com.Dragon.Kassel.mapper.StudentMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DeleteStu {

    ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");


    @RequestMapping("/Delete")
    @ResponseBody

    public Msg delete(@RequestParam("dName") String dName){
        StudentMapper studentMapper = context.getBean(StudentMapper.class);


        studentMapper.deleteByPrimaryKey(dName);

        return Msg.success();
    }
}
