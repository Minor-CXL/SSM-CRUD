package com.Dragon.Kassel.controller;
import com.Dragon.Kassel.mapper.StudentMapper;
import com.Dragon.Kassel.pro.Student;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class PageQuery {

    ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");


    @RequestMapping("/pageTest")
    public String pageTest(@RequestParam(value = "pn",defaultValue = "1") Integer pn, Model model){
        StudentMapper stus = context.getBean(StudentMapper.class);

        PageHelper.startPage(pn,5);
        List<Student> students = stus.selectByExample(null);

        PageInfo pageInfo=new PageInfo(students,5);

        model.addAttribute("pageInfo",pageInfo);

        System.out.println("当前页码:"+pageInfo.getPageNum());
        System.out.println("总页数:"+pageInfo.getPages());
        System.out.println("总记录数:"+pageInfo.getTotal());

        System.out.print("在页面连续显示的页码:");

        int []nums=pageInfo.getNavigatepageNums();
        for(int i:nums)
            System.out.print(i+" ");

//        当前页的数据
        List<Student> list = pageInfo.getList();
        for(Object c:list)
        {
            c=(Student)c;
            System.out.println(c);
        }
        return "success";
    }

    @RequestMapping("/page")
    public String page(@RequestParam(value = "pn",defaultValue = "1") Integer pn,Model model){
        StudentMapper stus = context.getBean(StudentMapper.class);

        PageHelper.startPage(pn,5);
        List<Student> students = stus.selectByExample(null);

        PageInfo pageInfo=new PageInfo(students,5);

        model.addAttribute("pageInfo",pageInfo);

        return "success";
    }

    @RequestMapping("/Json")
    @ResponseBody
    public Msg Json(@RequestParam(value = "pn",defaultValue = "1") Integer pn,Model model){
        StudentMapper stus = context.getBean(StudentMapper.class);



        PageHelper.startPage(pn,5);
        List<Student> students = stus.selectByExample(null);

        PageInfo pageInfo=new PageInfo(students,5);


        model.addAttribute("pageInfo",pageInfo);

        return Msg.success().add("pageInfo",pageInfo);
    }

    @RequestMapping("/Select")
    @ResponseBody
    public Msg Select(@RequestParam(value = "pn",defaultValue = "1") Integer pn){
        StudentMapper stus = context.getBean(StudentMapper.class);

        PageHelper.startPage(pn,5);
        List<Student> students = stus.selectByExample(null);

        PageInfo pageInfo=new PageInfo(students,5);


        return Msg.success().add("info",pageInfo);

    }


}
