package com.juaracoding.contohcaraintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Form1 extends AppCompatActivity {


    public void HelloWorld(){
        System.out.println("Hallo");
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_satu);

        ((Button)findViewById(R.id.button2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Form1.this,Form2.class);
                startActivity(intent);
            }
        });


        ((Button)findViewById(R.id.btnSMS)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("smsto:"));  // This ensures only SMS apps respond
                intent.putExtra("sms_body", "Hello Dari Juara Coding");
                //this is comment

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                    System.out.println("hallo");
                }
            }
        });
    }
}
