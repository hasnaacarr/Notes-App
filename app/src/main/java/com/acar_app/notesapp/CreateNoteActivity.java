package com.acar_app.notesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CreateNoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_note);


        ImageView imageBack = findViewById(R.id.imageBack);
        imageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed(); //Etkinlik, kullanıcının geri tuşuna bastığını algıladığında çağrılır. Varsayılan davranışı çağrılmadan OnBackPressedDispatcherönce geri düğmesini kullanma şansı verilecektir .
            }

        });
    }
}