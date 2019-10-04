package com.example.worldtime;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
//import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {


    //EditText editText;
    //Date date;
     //textView = findViewById(R.id.SydneyTime);
    //SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss a");
    //Calendar calendar = Calendar.getInstance();
    //String dateTime = dateFormat.format(calendar.getTime());
  //  textView.setText(dateTime);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        TextView tv = findViewById(R.id.SydneyTime);
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sd = new SimpleDateFormat("dd-MMM hh:mm a");
        String time = sd.format(calendar.getTime());
        tv.setText(time);

        TextView tv2 =findViewById(R.id.t2);
        TimeZone bj = TimeZone.getTimeZone("Asia/Shanghai");
        sd.setTimeZone(bj);
        String time2 = sd.format(calendar.getTime());
        tv2.setText(time2);

        TextView tv3 = findViewById(R.id.t3);
        TimeZone london = TimeZone.getTimeZone("WET");
        sd.setTimeZone(london);
        String time3 = sd.format(calendar.getTime());
        tv3.setText(time3);

        TextView tv4 = findViewById(R.id.t4);
        TimeZone ny = TimeZone.getTimeZone("America/New_York");
        sd.setTimeZone(ny);
        String time4 = sd.format(calendar.getTime());
        tv4.setText(time4);

        TextView tv5 = findViewById(R.id.t5);
        TimeZone paris = TimeZone.getTimeZone("Europe/Paris");
        sd.setTimeZone(paris);
        String time5 = sd.format(calendar.getTime());
        tv5.setText(time5);

      //  Calendar bj = Calendar.getInstance();
       // bj.setTimeZone(TimeZone.getTimeZone("China/Beijing"));
       // String time2 = sd.format(bj.getTime());
       // tv2.setText(time2);

        Button hr12 = findViewById(R.id.button12);
        hr12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = findViewById(R.id.SydneyTime);
                Calendar calendar = Calendar.getInstance();
                SimpleDateFormat sd = new SimpleDateFormat("dd-MMM hh:mm a");
                String time = sd.format(calendar.getTime());
                tv.setText(time);

                TextView tv2 =findViewById(R.id.t2);
                TimeZone bj = TimeZone.getTimeZone("Asia/Shanghai");
                sd.setTimeZone(bj);
                String time2 = sd.format(calendar.getTime());
                tv2.setText(time2);

                TextView tv3 = findViewById(R.id.t3);
                TimeZone london = TimeZone.getTimeZone("WET");
                sd.setTimeZone(london);
                String time3 = sd.format(calendar.getTime());
                tv3.setText(time3);

                TextView tv4 = findViewById(R.id.t4);
                TimeZone ny = TimeZone.getTimeZone("America/New_York");
                sd.setTimeZone(ny);
                String time4 = sd.format(calendar.getTime());
                tv4.setText(time4);

                TextView tv5 = findViewById(R.id.t5);
                TimeZone paris = TimeZone.getTimeZone("Europe/Paris");
                sd.setTimeZone(paris);
                String time5 = sd.format(calendar.getTime());
                tv5.setText(time5);

            }
        });

        Button hr24 = findViewById(R.id.button13);
        hr24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = findViewById(R.id.SydneyTime);
                Calendar calendar = Calendar.getInstance();
                SimpleDateFormat sd = new SimpleDateFormat("dd-MMM kk:mm");
                String time = sd.format(calendar.getTime());
                tv.setText(time);

                TextView tv2 =findViewById(R.id.t2);
                TimeZone bj = TimeZone.getTimeZone("Asia/Shanghai");
                sd.setTimeZone(bj);
                String time2 = sd.format(calendar.getTime());
                tv2.setText(time2);

                TextView tv3 = findViewById(R.id.t3);
                TimeZone london = TimeZone.getTimeZone("WET");
                sd.setTimeZone(london);
                String time3 = sd.format(calendar.getTime());
                tv3.setText(time3);

                TextView tv4 = findViewById(R.id.t4);
                TimeZone ny = TimeZone.getTimeZone("America/New_York");
                sd.setTimeZone(ny);
                String time4 = sd.format(calendar.getTime());
                tv4.setText(time4);

                TextView tv5 = findViewById(R.id.t5);
                TimeZone paris = TimeZone.getTimeZone("Europe/Paris");
                sd.setTimeZone(paris);
                String time5 = sd.format(calendar.getTime());
                tv5.setText(time5);

            }
        });

    }


        //Date date = new Date();
        //syd.setText();






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
