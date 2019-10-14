package com.qf.utils;

import org.springframework.stereotype.Component;

@Component
public class AlipayUtils {
//    public String pay(Payment payment) throws AlipayApiException {
//        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl,AlipayConfig.app_id,AlipayConfig.merchant_private_key,"json","utf-8",AlipayConfig.alipay_public_key,"RSA2");
//        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();//创建API对应的request
//        //设置请求参数
//        alipayRequest.setReturnUrl(AlipayConfig.return_url);
//        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);
//        alipayRequest.setBizContent("{" +
//                /*订单号（64位以内）*/"    \"out_trade_no\":"+payment.getOut_trade_no()+"," +
//               /*产品销售码*/ "    \"product_code\":\"FAST_INSTANT_TRADE_PAY\"," +
//                /*订单金额*/"    \"total_amount\":"+payment.getTotal_amount()+"," +
//                /*订单标题*/"    \"subject\":\"农产品\"," +
//                /*订单描述*/"    \"body\":\"农产品\"," +
//               /*公用回传参数*/ "    \"passback_params\":\"merchantBizType%3d3C%26merchantBizNo%3d2016010101111\"," +
//               /*业务扩展参数*/ "    \"extend_params\":{" +
//                "    \"sys_service_provider_id\":\"2088511833207847\"" +
//                "    }"+
//                "  }");
//        String form="";
//        form = alipayClient.pageExecute(alipayRequest).getBody(); //调用SDK生成表单        System.out.println(response.getBody());
//        return form;
//    }
}
