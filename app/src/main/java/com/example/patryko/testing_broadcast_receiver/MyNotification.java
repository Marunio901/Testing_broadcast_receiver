package com.example.patryko.testing_broadcast_receiver;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MyNotification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_notification);


        NotificationManager notmen = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notmen.cancel(0);

        Intent i = getIntent();

        String title = i.getStringExtra("title");


        TextView tvt = (TextView)findViewById(R.id.activity_title);




        tvt.setText(title);




    }






}
