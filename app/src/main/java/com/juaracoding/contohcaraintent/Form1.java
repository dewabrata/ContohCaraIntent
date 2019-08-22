package com.juaracoding.contohcaraintent;

import android.content.Intent;
import android.database.DataSetObserver;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.SimpleAdapter;
import android.widget.Spinner;

import com.juaracoding.contohcaraintent.adapter.AdapterTodoListRecycle;
import com.juaracoding.contohcaraintent.adapter.CustomAdapter;
import com.juaracoding.contohcaraintent.adapter.ToDoListAdapter;
import com.juaracoding.contohcaraintent.model.ToDoList;

import java.util.List;

public class Form1 extends AppCompatActivity {

    Spinner list,list2 ;
    RecyclerView listTodo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);

        list = (Spinner)findViewById(R.id.spinner);
        list2 = (Spinner)findViewById(R.id.spinner2);
        listTodo=(RecyclerView)findViewById(R.id.listToDoList);


        ArrayAdapter spinnerArrayAdapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                new DataFactory().createDataSimpleList());

        list.setAdapter(spinnerArrayAdapter);


        ((Button)(findViewById(R.id.btnSendSMS))).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               callViewBrowser();

            }
        });


        ToDoListAdapter customAdapter = new ToDoListAdapter(this,
                R.layout.to_do_list_item,new DataFactory().createToDoList());
        list2.setAdapter(customAdapter);

        AdapterTodoListRecycle toadapter = new AdapterTodoListRecycle (this,new DataFactory().createToDoList());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(Form1.this, LinearLayoutManager.VERTICAL, false);
        listTodo.setLayoutManager(linearLayoutManager);

        listTodo.setAdapter(toadapter);
    }

    public void callIntentSMS(){
        Uri uriSms = Uri.parse("smsto:1234567899");
        Intent intentSMS = new Intent(Intent.ACTION_SENDTO, uriSms);
        intentSMS.putExtra("sms_body", "The SMS text");
        startActivity(intentSMS);
    }

    public  void callViewBrowser(){
        String url = "http://www.juaracoding.com";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}
