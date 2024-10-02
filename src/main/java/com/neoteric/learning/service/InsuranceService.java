package com.neoteric.learning.service;

import com.neoteric.learning.rapido.Insurance;
import com.neoteric.learning.rapido.User;

public class InsuranceService {
    public Insurance getInsurance(User user) {
       Insurance insurance=new Insurance();
       insurance.insuranceType="life-time";
       insurance.insuranceId="98";

        return insurance;
    }
}
