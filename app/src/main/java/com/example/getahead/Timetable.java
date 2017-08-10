package com.example.getahead;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import layout.Eve.FriEve;
import layout.Eve.MonEve;
import layout.Eve.ThuEve;
import layout.Eve.TueEve;
import layout.Eve.WedEve;
import layout.Eve.MonEve;
import layout.Morn.MonMorn;
import layout.Noon.MonNoon;
import layout.Morn.FriMorn;
import layout.Morn.MonMorn;
import layout.Morn.ThuMorn;
import layout.Morn.TueMorn;
import layout.Morn.WedMorn;
import layout.Noon.FriNoon;
import layout.Noon.MonNoon;
import layout.Noon.ThuNoon;
import layout.Noon.TueNoon;
import layout.Noon.WedNoon;
import layout.Morn.TueMorn;

public class Timetable extends AppCompatActivity {


    public Button MondayMorning;// Button is wiget MondayMorning is it's id
    public Button TuesdayMorning;   //Buttons id is TuesdayMorning
    public Button WednesdayMorning;
    public Button ThursdayMorning;



    public void in(int i, final java.lang.Class m) {
        WednesdayMorning = (Button) findViewById(i);// R = resource.
        WednesdayMorning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent to = new Intent(Timetable.this, m); // Use auto complete   Intent = intent to do something, an action.


                startActivity(to);// lets activity run.
            }
        });

    }//remember to call it in @Override




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);

        in(R.id.MondayMorning, MonMorn.class);    // this calls the intent but changes the values in it.
        in(R.id.TuesdayMorning,TueMorn.class);
        in(R.id.WednesdayMorning,WedMorn.class);
        in(R.id.ThursdayMorning,ThuMorn.class);
        in(R.id.FridayMorning,FriMorn.class);

        in(R.id.button3,MonNoon.class);
        in(R.id.button4,TueNoon.class);
        in(R.id.button5,WedNoon.class);
        in(R.id.button6,ThuNoon.class);
        in(R.id.button7,FriNoon.class);

        in(R.id.button8,MonEve.class);
        in(R.id.button9,TueEve.class);
        in(R.id.button10,WedEve.class);
        in(R.id.button11,ThuEve.class);
        in(R.id.button12,FriEve.class);


    }

}


