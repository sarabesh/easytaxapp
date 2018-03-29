package com.example.sarabesh.easytax;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class Helpline extends AppCompatActivity {
    Button b1, b2, b3;
    ImageButton ib1,ib2,ib3;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpline);
        b1 = (Button) findViewById(R.id.button19);
        b2 = (Button) findViewById(R.id.button20);
        b3 = (Button) findViewById(R.id.button21);
        ib1= (ImageButton) findViewById(R.id.imageButton9);
        ib2= (ImageButton) findViewById(R.id.imageButton10);
        ib3= (ImageButton) findViewById(R.id.imageButton11);




        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:18001801961"));
                if( ContextCompat.checkSelfPermission(Helpline.this,
                        Manifest.permission.CALL_PHONE)== PackageManager.PERMISSION_GRANTED) {
                    startActivity(i);
                }

            }
        });
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:18001801961"));
                if( ContextCompat.checkSelfPermission(Helpline.this,
                        Manifest.permission.CALL_PHONE)== PackageManager.PERMISSION_GRANTED)
                    startActivity(i);


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:180042500025"));
                if( ContextCompat.checkSelfPermission(Helpline.this,
                        Manifest.permission.CALL_PHONE)== PackageManager.PERMISSION_GRANTED) {
                    startActivity(i);
                }


            }
        });
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:180042500025"));
                if( ContextCompat.checkSelfPermission(Helpline.this,
                        Manifest.permission.CALL_PHONE)== PackageManager.PERMISSION_GRANTED)
                    startActivity(i);


            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:+91 2027218080"));
                if( ContextCompat.checkSelfPermission(Helpline.this,
                        Manifest.permission.CALL_PHONE)== PackageManager.PERMISSION_GRANTED)
                startActivity(i);


            }
        });

        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:+91 2027218080"));

                if( ContextCompat.checkSelfPermission(Helpline.this,
                        Manifest.permission.CALL_PHONE)== PackageManager.PERMISSION_GRANTED)
                    startActivity(i);


            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }}



