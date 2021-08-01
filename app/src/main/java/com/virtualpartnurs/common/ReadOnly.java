package com.virtualpartnurs.common;

import com.virtualpartnurs.MainActivity;

import java.util.Random;

public class ReadOnly {
    static String[] g_msg ={

            "good evening!","If it is raining outside, don't forget to bring your umbrella","Hi! Have you finish your todo list","love you, master~"
    };


    public static String getTip(){
        return g_msg[new Random().nextInt(g_msg.length)];
    }

}
