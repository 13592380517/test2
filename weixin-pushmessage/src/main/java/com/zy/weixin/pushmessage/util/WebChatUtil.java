package com.zy.weixin.pushmessage.util;

public class WebChatUtil {
    public static final String APPID = "wx67f29dd915aca502";
    public static final String APPSECRET = "7d93c776d72df006eb5267ba0578ae6f";
    // 微信模板接口
    public static final  String SEND_TEMPLAYE_MESSAGE_URL = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=";
    // 获取微信ACCESS_TOKEN接口
    public static final String ACCESS_TOKEN_URL = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=" + APPID
            + "&secret=" + APPSECRET;
}
