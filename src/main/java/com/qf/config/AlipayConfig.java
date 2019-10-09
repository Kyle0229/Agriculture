package com.qf.config;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016101200671958";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCOG7dJvnN7NsHW63G7pxQXhZJFKouI0Ao8OWkHEMZpg0A2OWVHP6HPsH7oSEBnabwb7DNtUFKBVy6+3g3WhblZLAXdjJSMchbScAFVHJD9Tnz9t2AlXqHxzw05nfT6QFF/FYII4uhqASEzA6AX9kvcT+b91+CyY8bRvS7Fh/eB+NGiECEB/8Mi2yxnmphbRvQpJCh5rPYe6lAk8WNMvWRMsbjStTGcrU9xvFqB0bgN97yiRnNSgIZpbyD4iIB26FIJOWEJLRLrrEXbOHhgBHx8JMufrymH8BQHJMBDEqkO0Vstz207r6hDxzbSLUifexaV0S0ACYvKS5UqHZu2Q9U7AgMBAAECggEADSLOvIhYUGltXZqB9uCo4Mu+C5q1Lz5b09lStg586L/zLY/8pqthH7um333eRjDl7IbW8iHcnowajBYmnU/bJD0HhcU67giVx3oHBYEQffnFYAaVYp7uxVVoWY0aWg+b+O1aCcw/w5y7HuYU5GIl/QV9yrUr1hGXDUg5jJTW8jKUZAaSU2VBDTidkWKTP2YzjsjCXtBBNu70He75YTp6pXKu1m58ILZ0PmpaZyT2a9TMzTmQlOgoQjIgYPqRI/0vURs0PNp9+eiXpmgIhTCOK5bVMetrjwU1TcTL0dCxVKPRhmpOPs9D7d7tahESJxilUywH79pMOt6mWPbLNRDdYQKBgQDU/oqVQ00c+9B8a9Udzu2ixAmJ7YHupWBudaFHjkXBAH0n6opJRq/lqy3lIfwdPbXuWCsr44LnpO11c9FqKS/PV7eKf7duUbqTG3fK9ekk34hf2i0C9VRp9DuKSlrOKXLecJjz4nCOTGhXdbBrQmbTGvAd0RkWtruxPneC4pXAOQKBgQCqzSXGJagQysOTarw9XAdhlJa5nF5p+HmcLMYJpiHxkBmtgsbRCxV1vXzt1NTybGRDAWgydB1vAD5JQ4NbqwNWObm7JravfK1tfOnh2PJg/KnpE9Q8825vNY72+yXDLNJEhp9UtLa+z0YODosN3nCfRb7eKzXtH/LkXAHf3mkZEwKBgHfZhwd4aFLPyz/HuZLdVlBJOQjYkU1E118wZ4EJKGzypnooeonC8cUtLlUJa4DUsaOdDyXSDl3kKw31DrhK1rE4LXoMZZ349SBDy4N0Hi12bplo/fz1KPu5xysIrdHl9tH9z8Mj/qvDiM711UB1i8BsHwLYHuLuDe0tNjh64ULZAoGBAILolUkXV4b3QYrdRcVpoaaishs0xBBIhzyx/F8s29s/bM7V6vgRnLMPNo86jrP3a6kHjQsOf/ixoQuaGTXLDtWpjLbqZx59WpcOJFwbYToArWGc9xB4K25FCHw35at/0PEAlWHg2CfKyZDAiMdqc7s/Q5kYWU6TLCDme/FPkBHNAoGAajnGXvgwsLLcqRBGrKjrIp4djt8wElbe+3u0UBlc1yoaceasON/DYoJ4dko6XroTGMx2u2+FfESR//+KeJjsiaMZJJR1blw+efqR74HhOjY2BNiKnhXfkzEhtrnspnEN8gSLVV5kpCgbYyeqticJ9uRSHZH2UhkCm6W3/dLyx8U=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjfwFM0yHdV6+FXj4JKpNq8fzZ7LTlBGDvb607h+FEm8fa6kmDoGHib0CHZ/g8hG9rNEEoc5lgFCvA8mXbWQz880ARjaRKrlba5wv5gOG5DTw92bVqAmd9h6riNSwiOrC+MPQEa368tyDJHP56dpQ2V3Vi105AB8WokhHqolDexFBMpQq946A8HDlLtVuQJcZ4AYMQs9rpP0LDl2hRix09GMDTTMCFgMPYDFzk1qHJf9B5c14KiKPRwJ8Zq3npLG1cxZVBSI8VSx80GVLDiHa11/PPcjnDfCeEn7nsmi8RJlT39qNB2J/QdQWzZ3A9XucMttrA+8Nt3ih+YgKZL5ylwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8080/pay/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8080/#/";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
