package com.sg.pxrz.entity;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author sg@csii.com.cn
 * @Date 2020/5/21 17:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
@Entity
@Table(name = "student")
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "student_sex")
    private String studentSex;

    @Column(name = "student_class")
    private String studentClass;

    @Column(name = "student_phone")
    private String studentPhone;


}
