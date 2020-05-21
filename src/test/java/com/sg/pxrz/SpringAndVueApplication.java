package com.sg.pxrz;

import com.sg.pxrz.entity.Student;
import com.sg.pxrz.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author sg@csii.com.cn
 * @Date 2020/5/21 17:23
 */
@SpringBootTest
@Slf4j
public class SpringAndVueApplication {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void findAll(){
       List<Student> result= studentRepository.findAll();
       System.out.println(result);
       log.info("查询结果为"+result);
    }
}
