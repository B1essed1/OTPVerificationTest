package com.example.otpverificationtest.twilio;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SmsRequest
{
    private String phoneNumber;
    private String sms;


    public SmsRequest(@JsonProperty("phoneNumber") String phoneNumber,@JsonProperty("sms") String sms) {
        this.phoneNumber = phoneNumber;
        this.sms = sms;
    }
}
