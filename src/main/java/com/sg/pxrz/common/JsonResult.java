package com.sg.pxrz.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author sg@csii.com.cn
 * @Date 2020/5/21 17:46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonResult<T> {

    private Integer code;  //状态码

    private String message;  //信息

    private T data;  //数据

    //没有数据返回的构造参数
    public JsonResult(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}
