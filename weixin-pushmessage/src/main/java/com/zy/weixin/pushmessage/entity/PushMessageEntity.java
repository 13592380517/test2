package com.zy.weixin.pushmessage.entity;

import com.alibaba.fastjson.JSONObject;


public class PushMessageEntity {
    private String[] openidlist;
    private String template_id;
    private String url;
    private JSONObject data;

    public String[] getOpenidlist() {
        return openidlist;
    }

    public void setOpenidlist(String[] openidlist) {
        this.openidlist = openidlist;
    }

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public JSONObject getData() {
        return data;
    }

    public void setData(JSONObject data) {
        this.data = data;
    }
}
