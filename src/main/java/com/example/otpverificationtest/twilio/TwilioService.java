package com.example.otpverificationtest.twilio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TwilioService {

    @Autowired
    private SmsSender smsSender;

   public void sendSms(@Qualifier("twilio") SmsRequest smsRequest)
    {
        smsSender.sendSms(smsRequest);
    }
}
