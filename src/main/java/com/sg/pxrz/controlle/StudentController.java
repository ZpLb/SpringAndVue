package com.sg.pxrz.controlle;

import com.sg.pxrz.common.JsonResult;
import com.sg.pxrz.entity.Student;
import com.sg.pxrz.repository.StudentRepository;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author sg@csii.com.cn
 * @Date 2020/5/21 17:19
 */
@RestController
@RequestMapping(value = "/student/")
@Api
@Slf4j
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("findAll")
    public JsonResult findAll(){
       List<Student> result = studentRepository.findAll();
       log.info("查询结果为："+result);
       return new JsonResult(200,"查询成功",result);
    }
}
