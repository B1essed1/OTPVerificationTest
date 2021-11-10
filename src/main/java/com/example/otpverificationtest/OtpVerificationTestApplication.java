package com.example.otpverificationtest;

import com.example.otpverificationtest.twilio.TwilioConfig;
import com.twilio.Twilio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class OtpVerificationTestApplication {


    public static void main(String[] args) {
        SpringApplication.run(OtpVerificationTestApplication.class, args);
    }

}
