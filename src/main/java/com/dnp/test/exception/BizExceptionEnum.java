package com.dnp.test.exception;

/**
 * @author fengshuonan
 * @Description 所有业务异常的枚举
 * @date 2016年11月12日 下午5:04:51
 */
public enum BizExceptionEnum {
    CREATE_JOB_FAILE(500, "创建任务失败"),
    EXECUTE_JOB_FAILE(500, "执行任务失败"),
    DELETE_JOB_FAILE(500, "执行任务失败"),
    RESUME_JOB_FAILE(500, "执行任务失败"),
    PAUSE_JOB_FAILE(500, "暂停任务失败"),
    UPGREADE_JOB_FAILE(500, "更新定时任务失败"),
    GET_CRON_TRIGGER_EXCEPTION(600, "获取crontrigger异常");

    BizExceptionEnum(int code, String message) {
        this.friendlyCode = code;
        this.friendlyMsg = message;
    }

    BizExceptionEnum(int code, String message, String urlPath) {
        this.friendlyCode = code;
        this.friendlyMsg = message;
        this.urlPath = urlPath;
    }

    private int friendlyCode;

    private String friendlyMsg;

    private String urlPath;

    public int getCode() {
        return friendlyCode;
    }

    public void setCode(int code) {
        this.friendlyCode = code;
    }

    public String getMessage() {
        return friendlyMsg;
    }

    public void setMessage(String message) {
        this.friendlyMsg = message;
    }

    public String getUrlPath() {
        return urlPath;
    }

    public void setUrlPath(String urlPath) {
        this.urlPath = urlPath;
    }

}
