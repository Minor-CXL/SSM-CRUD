package com.Kassel;

import com.Dragon.Kassel.mapper.StudentMapper;
import com.Dragon.Kassel.pro.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.UUID;


public class Test {


    @org.junit.Test
    public void show(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

        StudentMapper mapper = context.getBean(StudentMapper.class);
//        for(int i=1;i<=1000;i++){
//            if(i%2==0)
//            {
//
//                mapper.insert(new School(i,"龙族历史"));
//            }
//            else
//            {
//                mapper.insert(new School(i,"龙族炼金术"));
//            }
//        }

        for(int i=1;i<=50;i++){
            String uuid= UUID.randomUUID().toString().substring(0,3);
            if(i%3==0)
            {

                mapper.insertSelective(new Student("路明非"+uuid,"S级","everything"));
            }
            else if(i%4==0)
            {
                mapper.insertSelective(new Student("楚子航"+uuid,"A+级","君焰"));
            }
            else
            {
                mapper.insertSelective(new Student("凯撒"+uuid,"A级","镰鼬"));

            }
        }
    }


}
