package com.e.colorsapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    private SeekBar sbRed=null, sbGreen=null, sbBlue=null, sbAlpha=null;
    private View vieColors;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sbRed=findViewById(R.id.sb_red);
        sbGreen=findViewById(R.id.sb_green);
        sbBlue=findViewById(R.id.sb_blue);
        sbAlpha=findViewById(R.id.sb_alpha);
        vieColors=findViewById(R.id.viewColor);

        registerForContextMenu(vieColors);

        sbRed.setOnSeekBarChangeListener(this);
        sbGreen.setOnSeekBarChangeListener(this);
        sbBlue.setOnSeekBarChangeListener(this);
        sbAlpha.setOnSeekBarChangeListener(this);







    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean bo) {
        int r=sbRed.getProgress();
        int g=sbGreen.getProgress();
        int b=sbBlue.getProgress();
        int a=sbAlpha.getProgress();

        int colorH = Color.argb(a,r,g,b);

        vieColors.setBackgroundColor(colorH);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.colors_menu1,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id= item.getItemId();
        switch (item.getItemId()){
            case R.id.itRed:
                Toast.makeText(this, "Car", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.itGreen:
                Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.itBlue:
                Toast.makeText(this, "Help", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.itYellow:
                Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.itTransaparent:
                Toast.makeText(this, "Exit", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.itMagenta:
                Toast.makeText(this, "Exit", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.itsemiTransaparent:
                Toast.makeText(this, "Exit", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.itCyan:
                Toast.makeText(this, "Exit", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.itBrown:
                Toast.makeText(this, "Exit", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.itAbout:
                Toast.makeText(this, "Exit", Toast.LENGTH_SHORT).show();
                return true;


        }
        return super.onOptionsItemSelected(item);
    }
}
