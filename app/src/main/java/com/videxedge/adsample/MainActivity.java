package com.videxedge.adsample;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout linlay;
    AlertDialog.Builder adb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linlay=findViewById(R.id.linlay);
    }

    public void nobutton(View view) {
        adb=new AlertDialog.Builder(this);

        adb.setTitle("1st Example: Text only");
        adb.setMessage("This is a simple alert");

        AlertDialog ad=adb.create();
        ad.show();
    }

    public void nobuttonico(View view) {
        adb=new AlertDialog.Builder(this);

        adb.setTitle("2nd Example: Icon & Text only");
        adb.setMessage("This is a simple alert");
        adb.setIcon(R.drawable.droid);

        AlertDialog ad=adb.create();
        ad.show();
    }

    public void onebutton(View view) {
        adb=new AlertDialog.Builder(this);

        adb.setTitle("3rd Example: One button only");
        adb.setMessage("This is a simple alert");
        adb.setIcon(R.drawable.droid);
        adb.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        AlertDialog ad=adb.create();
        ad.show();
    }

    public void twobutton(View view) {
        adb=new AlertDialog.Builder(this);

        adb.setTitle("4th Example: Two buttons");
        adb.setMessage("Choose 2 options:");
        adb.setIcon(R.drawable.droid);
        adb.setPositiveButton("Change", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                linlay.setBackgroundColor(Color.GREEN);
            }
        });
        adb.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        AlertDialog ad=adb.create();
        ad.show();
    }

    public void threebuttons(View view) {
        adb=new AlertDialog.Builder(this);

        adb.setTitle("5th Example: Three buttons");
        adb.setMessage("Choose 3 options:");
        adb.setIcon(R.drawable.droid);
        adb.setPositiveButton("Change", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                linlay.setBackgroundColor(Color.RED);
            }
        });
        adb.setNeutralButton("Reset", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                linlay.setBackgroundColor(Color.WHITE);
            }
        });
        adb.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        AlertDialog ad=adb.create();
        ad.show();
    }
}
