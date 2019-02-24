package cn.itsource.util;

public class AjaxResult {
    private boolean success=true;
    private String msg="操作成功";
    private Object object;

    public  static  AjaxResult me(){
        return new AjaxResult();
    }

/*
  失败构造函数
  public AjaxResult(String msg) {
        this.success = false;
        this.msg = msg;

    }

       成功构造函数
    public AjaxResult() {
    }*/

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getObject() {
        return object;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", object=" + object +
                '}';
    }

    public AjaxResult setObject(Object object) {
        this.object = object;
        return this;


    }
}
