package com.juaracoding.contohcaraintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Form4 extends AppCompatActivity {

    public static int ID_FORM_4 =4444;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_empat);
        ((Button)findViewById(R.id.button2)).setVisibility(View.GONE);
        ((Button)findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("data","form4");
                setResult(ID_FORM_4,intent);
                finish();
                //|||||||||||||||||||||||||||||||||||||||||||||\\
                //                    || ||                    \\
                //                   ||   ||                   \\
                //                  ||     ||                  \\
                //                 ||       ||                 \\
                //                ||\       /||                \\
                //               ||  \     /  ||               \\
                //              ||    \   /    ||              \\
                //             ||      \ /      ||             \\
                //------------||-------|||-------||------------\\
                //           ||       //|\\       ||           \\
                //          ||      //  |  \\      ||          \\
                //         ||     //    |    \\     ||         \\
                //        ||    //      |      \\    ||        \\
                //       ||   //        |        \\   ||       \\
                //      ||  //          |          \\  ||      \\
                //     || //            |            \\ ||     \\
                //    ||//______________|______________\\||    \\
                //   || \\              |              // ||   \\
                //  ||   \\             |             //   ||  \\
                // ||     \\            |            //     || \\
                //||-------\\-----------------------//-------||\\
                // ||      //                       \\      || \\
                //  ||    //                         \\    ||  \\
                //   ||  //                           \\  ||   \\
                //----||//_____________________________\\||----\\
                /////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\
            }
        });
    }
}
