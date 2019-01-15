package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * Created by dell on 2019/1/15.
 */
public class SellException extends  RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }
}