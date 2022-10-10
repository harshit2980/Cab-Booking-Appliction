package com.cab.demo.sevices;

import com.cab.demo.entity.Driver;
import com.cab.demo.entity.User;
import com.cab.demo.location.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import static java.lang.Math.*;

@Component
public class CabService {


    private static List<User> userList=new ArrayList<>();
    private static List<Driver> driverList=new ArrayList<>();

    static {
        userList.add(new User("Abhishek",'M', 23));
        userList.add(new User("Rahul",'M', 29));
        userList.add(new User("Nandini",'F', 22));
    }

    static{
        driverList.add(new Driver("Driver1",'M',22,"Swift,KA-01-12345",new Location(10,1)));
        driverList.add(new Driver("Driver2",'M',29,"Swift,KA-01-12345",new Location(11,10)));
        driverList.add(new Driver("Driver3",'M',24,"Swift,KA-01-12345",new Location(5,3)));
    }

    public List<Driver> findRide(String username,Location source,Location destination){
        List<Driver> availDriver=new ArrayList<>();
        for(Driver list:driverList){
            double diff_x=pow((list.getLocation().getX())- source.getX(),2);
            double diff_y=pow((list.getLocation().getY())- source.getY(),2);
            double distance=sqrt(diff_x + diff_y);
            if(distance<=5){
                 availDriver.add(list);}
        }
        return availDriver;
    }


}
