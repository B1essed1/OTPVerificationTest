package com.example.otpverificationtest.twilio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TwilioController
{
    @Autowired
    private TwilioService service;

    @PostMapping("/send")
    public void sendSms(@RequestBody SmsRequest smsRequest)
    {
        service.sendSms(smsRequest);
    }

}
