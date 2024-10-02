package com.neoteric.learning.datevalidation;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Date;
import java.util.TimeZone;

public class DateValidationTest {
    public static void main (String[]args){
        Date mylocalDate = new Date();
        SimpleDateFormat sd =new SimpleDateFormat();
        sd.setTimeZone(TimeZone.getTimeZone("UTC"));
        String utcStrDate=sd.format(mylocalDate);

        System.out.println("mylocalDate date "+mylocalDate);
        System.out.println("utcStrDate date"+mylocalDate);

    }
}
