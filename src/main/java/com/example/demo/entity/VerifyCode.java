package com.example.demo.entity;

import lombok.Data;

/**
 * @Description:
 * @author: ZPX
 * @createDate: 2020/6/16 16:05
 * @version: 1.0
 */
@Data
public class VerifyCode {
    private String code;

    private byte[] imgBytes;


}




