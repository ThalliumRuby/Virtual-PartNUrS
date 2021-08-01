package com.virtualpartnurs.common;

import com.virtualpartnurs.MainActivity;
import com.virtualpartnurs.entity.Remind;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReadWrite {

    static MainActivity mainActivity;       //Basic carrier
    static String username=null;       //Basic carrier
    static List<Remind> reminds=new ArrayList<>();

    static {
        reminds.add(new Remind("test1",new Date()));
        reminds.add(new Remind("test2",new Date()));
        reminds.add(new Remind("test3",new Date()));
        reminds.add(new Remind("test4",new Date()));
        reminds.add(new Remind("test5",new Date()));
        reminds.add(new Remind("test6",new Date()));
        reminds.add(new Remind("test7",new Date()));
        reminds.add(new Remind("test8",new Date()));
        reminds.add(new Remind("test9",new Date()));
        reminds.add(new Remind("test10",new Date()));
        reminds.add(new Remind("test11",new Date()));
    }


    public static boolean addRemind(Remind remind){
        reminds.add(remind);
        return true;
    }

    public static List<Remind> getReminds(){
        return reminds;
    }

    public static MainActivity getMainActivity(){
        return  mainActivity;
    }
    public static void setMainActivity(MainActivity mainActivity) {
        ReadWrite.mainActivity = mainActivity;
    }    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        ReadWrite.username = username;
    }
}
