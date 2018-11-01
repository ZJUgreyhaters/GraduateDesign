package com.zju.message.pojo;

import java.util.Date;

/**
 * @ClassName: Message
 * @Description: TODO
 * @Author: wbchen
 * @Date: 2018/9/24 15:43
 * @Version 1.0.0
 **/

public class Message {
    private String message;
    private Date date;
    private long uid;

    Message(){}

    public Date getDate() {
        return date;
    }

    public long getUid() {
        return uid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }


}
