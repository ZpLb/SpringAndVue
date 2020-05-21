package com.sg.pxrz.repository;

import com.sg.pxrz.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author sg@csii.com.cn
 * @Date 2020/5/21 17:16
 */

/**
 * 接口继承自JpaRepository
 * 共有两个泛型参数，<Student,Integer>,Student表示repository操作的表绑定的实体类，即entity
 * 第二个表示自增的id类型（主键id的类型）
 */
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
