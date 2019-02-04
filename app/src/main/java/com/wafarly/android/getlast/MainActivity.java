package com.wafarly.android.getlast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
TextView textView;
String data="The action key performs a \"search\" operation, taking the user to the results of searching for the text the have typed (in whatever context is appropriate). Corresponds to";
List<String>list=new ArrayList<>();
String[]arryr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
    }

    public void geet(View view) {
 data.split(" ");
        arryr=data.split(" ");
textView.setText(arryr.length);

    }
}
