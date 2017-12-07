package com.example.patryko.testing_broadcast_receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Patryko on 12/6/2017.
 */

public class MyBroadcastReceiver extends BroadcastReceiver {
   // private int id = 0;


    public void onReceive(Context context, Intent intent){

        String message = intent.getStringExtra("Message");
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();

//        NotifyService ns = new NotifyService();
//        ns.CustomNotification(message);


    }




}
