package com.fxz.demo.ovaldemo;

/**
 * 描述：
 *
 * @author Fang
 * @date 2021-01-18 11:24:18
 */
public class BusinessException extends RuntimeException {

    public BusinessException() {
        super();
    }

    BusinessException(Object o) {
        System.out.println("对象：" + o.toString());
    }

}