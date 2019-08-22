package com.juaracoding.contohcaraintent;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Form3 extends AppCompatActivity {

    public static int ID_FORM_3=3333;
    public String datax="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_tiga);
        final String data =  getIntent().getStringExtra("data");
        Toast.makeText(Form3.this,data,Toast.LENGTH_LONG);
        ((Button)findViewById(R.id.button2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Form3.this,Form4.class);
                startActivityForResult(intent,ID_FORM_3);
            }
        });

        ((Button)findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(data.equalsIgnoreCase("from24")) {
                    Intent intent = new Intent();
                    intent.putExtra("data","from34");
                    setResult(Form3.ID_FORM_3,intent);
                    finish();
                }else{
                    finish();
                }


            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
          if(requestCode== Form3.ID_FORM_3 && resultCode == Form4.ID_FORM_4){
              setResult(Form4.ID_FORM_4,data);
              datax = data.getStringExtra("data");
              finish();
          }
    }
}
