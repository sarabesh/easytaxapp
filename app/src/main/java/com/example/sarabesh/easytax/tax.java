package com.example.sarabesh.easytax;

import android.content.Context;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;



public class tax extends AppCompatActivity {
    EditText t2, t3, t4, t5, t6, t7, t8;
    TextView t;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tax);
        t=(TextView)findViewById(R.id.textView24);

        t2 = (EditText) findViewById(R.id.editText8);
        t3 = (EditText) findViewById(R.id.editText9);
        t4 = (EditText) findViewById(R.id.editText10);
        t5 = (EditText) findViewById(R.id.editText11);
        t6 = (EditText) findViewById(R.id.editText12);
        t7 = (EditText) findViewById(R.id.editText13);
        t8 = (EditText) findViewById(R.id.editText14);
        Toast.makeText(getApplicationContext(),"\nPLEASE ENTER YOUR ANNUAL DETAILS ONLY",Toast.LENGTH_LONG).show();
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
    }

    int a;

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.rb1:
                if (checked)

                    a = 1;
                break;
            case R.id.rb2:
                if (checked)
                    a = 2;
                break;
            case R.id.rb3:
                if (checked)
                    a = 3;
        }
    }

    void calc(View v) {
        float b, c = 0, f = 0, g = 0, h = 0, i = 0, j = 0;
        float d, e;

        b = Integer.parseInt(t2.getText().toString());
        c = Integer.parseInt(t3.getText().toString());
        f = Integer.parseInt(t4.getText().toString());
        g = Integer.parseInt(t5.getText().toString());
        h = Integer.parseInt(t6.getText().toString());
        i = Integer.parseInt(t7.getText().toString());
        j = Integer.parseInt(t8.getText().toString());
        d = b + c;
        if (a == 1) {

            if (d <= 250000)

                e = 0;
            else if (d >= 250010 && d <= 500000)
                e = (float) (d * 0.1);
            else if (d >= 500010 && d <= 1000000)
                e = (float) (25000 + ((d - 500000) * 0.2));
            else
                e = (float) (125000 + ((d - 100000) * 0.3));
            {
                if ((g >= 0) && (g <= 15000)) {
                    e = e - g;
                } else {
                    e = e - 15000;
                }
            }

            {
                if ((h >= 0) && (h <= 50000)) {
                    e = e - g;
                } else {
                    h = h - 50000;
                }
            }

        } else if (a == 2) {
            if (d <= 250000)

                e = 0;
            else if (d >= 250010 && d <= 500000)
                e = (float) (d * 0.1);
            else if (d >= 500010 && d <= 1000000)
                e = (float) (25000 + ((d - 500000) * 0.2));
            else
                e = (float) (125000 + ((d - 100000) * 0.3));
            {
                if ((g >= 0) && (g <= 15000)) {
                    e = e - g;
                } else {
                    e = e - 15000;
                }
            }
            {
                if ((h >= 0) && (h <= 50000)) {
                    e = e - g;
                } else {
                    h = h - 50000;
                }
            }
        } else {
            if (d <= 300000)

                e = 0;
            else if (d >= 300010 && d <= 500000)
                e = (float) (d * 0.1);
            else if (d >= 500010 && d <= 1000000)
                e = (float) (20000 + ((d - 500000) * 0.2));
            else
                e = (float) (120000 + ((d - 100000) * 0.3));
            {
                if ((g >= 0) && (g <= 15000)) {
                    e = e - g;
                } else {
                    e = e - 20000;
                }
            }
            {
                if ((h >= 0) && (h <= 750000)) {
                    e = e - g;
                } else {
                    h = h - 50000;
                }
            }
        }
        e = e - f;
        e = e - (1 / 3 * j);
        e = e - i;
        String s="Rs."+e;
        t.setText(s);

    }


}




