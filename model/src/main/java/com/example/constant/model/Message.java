package com.example.constant.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public enum Message {

    SUCCESS("成功"),
    FAIL("失败");

    private String message;

}
