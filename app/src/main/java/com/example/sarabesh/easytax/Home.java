package com.example.sarabesh.easytax;



        import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {
    ImageButton ib1,ib2,ib3,ib4,ib5,ib6,ib7,ib8;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        b1=(Button)findViewById(R.id.button6);
        b2=(Button)findViewById(R.id.button7);
        b3=(Button)findViewById(R.id.button16);
        b4=(Button)findViewById(R.id.button17);
        b5=(Button)findViewById(R.id.button15);
        b6=(Button)findViewById(R.id.button);
        b7=(Button)findViewById(R.id.button4);
        b8=(Button)findViewById(R.id.button5);
        b9=(Button)findViewById(R.id.button3);
        b11= (Button) findViewById(R.id.button18);

        ib1= (ImageButton) findViewById(R.id.imageButton5);
        ib2= (ImageButton) findViewById(R.id.imageButton6);
        ib3= (ImageButton) findViewById(R.id.imageButton7);
        ib4= (ImageButton) findViewById(R.id.imageButton8);
        ib5= (ImageButton) findViewById(R.id.imageButton3);
        ib6= (ImageButton) findViewById(R.id.imageButton);
        ib7= (ImageButton) findViewById(R.id.imageButton2);
        ib8= (ImageButton) findViewById(R.id.imageButton4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.incometaxindia.gov.in/_layouts/15/dit/mobile/acts/all-acts.aspx"));
                startActivity(i);
            }
        });
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.incometaxindia.gov.in/_layouts/15/dit/mobile/acts/all-acts.aspx"));
                startActivity(i);
            }
        });
        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.utiitsl.com//UTIITSL_SITE/site/pan/"));
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.utiitsl.com//UTIITSL_SITE/site/pan/"));
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.co.in/maps/search/income+tax+office+location+in+india/@13.0475255,80.2090117,9z"));
                startActivity(i);
            }
        });
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.co.in/maps/search/income+tax+office+location+in+india/@13.0475255,80.2090117,9z"));
                startActivity(i);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Home.this,Helpline.class);
                startActivity(i);
            }
        });
        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Home.this,Helpline.class);
                startActivity(i);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.incometaxindiaefilling.gov.in/e-Filling/UserLogin/LoginHome.html"));
                startActivity(i);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.incometaxindiaefilling.gov.in/e-Filling/Reistration/RegistrationHome.html"));
                startActivity(i);
            }
        });


        ib6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Home.this,tax.class);
                startActivity(i);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Home.this,tax.class);
                startActivity(i);
            }
        });
        ib7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Home.this,info.class);
                startActivity(i);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Home.this,info.class);
                startActivity(i);
            }
        });
        ib5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Home.this,excemptions.class);
                startActivity(i);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Home.this,excemptions.class);
                startActivity(i);
            }
        });
        ib8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Home.this,forms.class);
                startActivity(i);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Home.this,excemptions.class);
                startActivity(i);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.incometaxindiaefilling.gov.in/e-Filling/Reistration/RegistrationHome.html"));
                startActivity(i);
            }
        });


    }

    }



