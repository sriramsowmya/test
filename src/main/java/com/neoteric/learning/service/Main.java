package com.neoteric.learning.service;

import com.neoteric.learning.rapido.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        User user=new User();
        user.id="6";
        user.name="vihan";
        user.email="vihan1232@gmanil.com";
        user.mobileNo="4567888889";


        Location fromlocation = new Location();
        fromlocation.lon="7654";
        fromlocation.lat="7664";

        Location tolocation =new Location();
        tolocation.lat="5432";
        tolocation.lon="65532";


        Insurance driverInsurance=new Insurance();
        driverInsurance.insuranceId="345678";
        driverInsurance.insuranceType="life-time";



        Insurance vehicleInsurance=new Insurance();
        vehicleInsurance.insuranceId="7658790";
        vehicleInsurance.insuranceType="6years";


        Driver driver=new Driver();
        driver.name="vihan";
        driver.lience="qualified";
        driver.mobileNo="65432117777";
        driver.insurance=driverInsurance;


        Vehicle vehicle= new Vehicle();
        vehicle.vehicleNo="65543";
        VehicleTypeEnum typeEnum= VehicleTypeEnum.Car;
        vehicle.vehicleType=typeEnum;
        vehicle.insurance=vehicleInsurance;
        vehicle.driver=driver;



        Task task = new Task();
        task.userId=user.id;
        task.fromLocation=fromlocation;
        task.toLocation=tolocation;
        task.status="started";


        JobTaskMapping jobTaskMapping=new JobTaskMapping();
        jobTaskMapping.vehicle=vehicle;
        jobTaskMapping.taskId=task;
        jobTaskMapping.startTime=new Date();
        jobTaskMapping.endTime=new Date(new Date().getTime()+7000);


        System.out.println(jobTaskMapping.vehicle.driver.insurance.insuranceId);
        System.out.println(jobTaskMapping.vehicle.insurance.insuranceType);
        System.out.println(jobTaskMapping.taskId.toLocation);
        System.out.println(jobTaskMapping.vehicle.vehicleType);







    }
}
