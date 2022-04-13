package com.service.theserviceside.test.testEntity;

/**
 * @author duanqihang
 * Created with IntelliJ IDEA.
 * User: suse_QiHang
 * Date: 2022/4/13 22:42
 * Description:
 */
public class TestEntity {
    private int code;
    private String msg;

    public TestEntity(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "TestEntity{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
