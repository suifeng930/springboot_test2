package com.mhc.web.controller;

import com.mhc.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 学生控制器
 * @author Andre930
 * @create 2019-01-17 14:29
 */
@Controller //一般写后台 有页面的
//@RestController //一般用于写Api  给移动客户端提供数据，一般是返回json数据的
@RequestMapping(value = "stu")
public class StudentController {


    @RequestMapping(value = "list")
//    @ResponseBody
    public String List(Model model){

        model.addAttribute("username","xiaoma");
        model.addAttribute("age",20);
        List<Student>  stuList=new ArrayList();
        model.addAttribute("stuList",stuList);

        stuList.add(new Student(1001,"zhangsan01","男"));
        stuList.add(new Student(1002,"zhangsan02","男"));
        stuList.add(new Student(1003,"zhangsan03","男"));
        stuList.add(new Student(1004,"zhangsan04","男"));
        stuList.add(new Student(1005,"zhangsan05","女"));
        return "stu/list"; //返回模板页面
    }



}

