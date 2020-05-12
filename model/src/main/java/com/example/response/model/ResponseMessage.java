package com.example.response.model;

import com.example.constant.model.Constant;
import com.example.constant.model.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName ResponseMessage
 * @Author ResponseMessage
 * @Date 2020/5/10 0010 15:04
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseMessage {

    private Integer code;
    private Message message;

    public static ResponseMessage success() {
        return new ResponseMessage(Constant.ZERO, Message.SUCCESS);
    }
    public static ResponseMessage fail() {
        return new ResponseMessage(Constant.NINETY_NINE, Message.FAIL);
    }

}
