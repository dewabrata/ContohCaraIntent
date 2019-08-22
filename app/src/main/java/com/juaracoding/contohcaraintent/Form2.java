package com.juaracoding.contohcaraintent;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Form2 extends AppCompatActivity {
    public static int ID_FORM_2=2222;
    String from4 = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_dua);


        ((Button)findViewById(R.id.button2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Form2.this,Form3.class);
                intent.putExtra("data",from4);
                startActivityForResult(intent,Form2.ID_FORM_2);
            }
        });

        ((Button)findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {


        if(requestCode==Form2.ID_FORM_2 && resultCode==Form4.ID_FORM_4){
            Toast.makeText(Form2.this,data.getStringExtra("data"),Toast.LENGTH_LONG).show();
            from4="from24";
        }

        if(requestCode==Form2.ID_FORM_2 && resultCode==Form3.ID_FORM_3){
            String fdata = data.getStringExtra("data");
           if(fdata!=null){
               if (fdata.equalsIgnoreCase("from34")){
                   finish();
               }
           }

        }
    }
}
