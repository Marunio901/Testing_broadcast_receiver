package com.example.patryko.testing_broadcast_receiver;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RemoteViews;

public class NotifyService extends AppCompatActivity {

    private int id = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void CustomNotification(String message){


        RemoteViews remoteViews = new RemoteViews(getPackageName(), R.layout.mojanotyfikacja);


        String str_title = message + id;


        Intent intent = new Intent(this, MyNotification.class);
        intent.putExtra("title", str_title);


        PendingIntent pIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);

        Notification.Builder builder = new Notification.Builder(this)
                .setSmallIcon(R.drawable.mobile)
                .setAutoCancel(true)
                .setContentIntent(pIntent)
                .setContent(remoteViews);

        remoteViews.setTextViewText(R.id.title, str_title );


        NotificationManager notman = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notman.notify(id++, builder.build());


    }

}
