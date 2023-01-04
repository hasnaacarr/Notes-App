package com.acar_app.notesapp;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.INotificationSideChannel;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_ADD_NOTE=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageAddNoteMain=findViewById(R.id.imageAddNoteMain);

        imageAddNoteMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //startActivityForResult( new Intent(getApplicationContext(), CreateNoteActivity.class,REQUEST_CODE_ADD_NOTE );
                //Intent intent = new Intent(getApplicationContext(), CreateNoteActivity.class);
                //startActivity(intent);
                Intent intent = new Intent(getApplicationContext(), CreateNoteActivity.class);
                startActivityForResult(intent, REQUEST_CODE_ADD_NOTE);


            }



            ;
        });

    }
}