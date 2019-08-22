package com.juaracoding.contohcaraintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StevanActivity extends AppCompatActivity {
  TextView txtStevan;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_stevan);

    txtStevan = (TextView) findViewById(R.id.txtStevan);
  }
}
