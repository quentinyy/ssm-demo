package cn.me.execption;

public class MessageException extends Exception{
    private String msg;

    public MessageException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {

        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
