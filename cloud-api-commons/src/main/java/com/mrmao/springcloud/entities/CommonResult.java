package com.mrmao.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: MrMao
 * @Date: 2022/3/26
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    //404 not found
    private Integer code;

    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }

}
