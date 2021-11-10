package com.example.otpverificationtest.twilio;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("twilio")
public class TwilioSmsSender implements SmsSender{

    @Autowired
    private TwilioConfig twilioConfig;

    @Override
    public void sendSms(SmsRequest smsRequest)
    {
        PhoneNumber to =  new PhoneNumber(smsRequest.getPhoneNumber());
        PhoneNumber from = new PhoneNumber(twilioConfig.getTrialNumber());
        String sms = smsRequest.getSms();

        MessageCreator created = Message.creator(to,from,sms);
        created.create();

    }
}
