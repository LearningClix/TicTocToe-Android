package com.learningclix.tictoctoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EndGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_game);
        Intent iFromMain = getIntent();
        String getMainIntent = iFromMain.getStringExtra("winnerName");
        TextView endGame;
        endGame = findViewById(R.id.endGame);
        if (getMainIntent.equals("O") || getMainIntent.equals("X")){
            endGame.setText("Winner is : " + getMainIntent);
        }else{
            endGame.setText("Game is drawn..");
        }

        Button btnMainActivity;
        btnMainActivity = findViewById(R.id.btnMainActivity);

        Intent mainActivity;
        mainActivity = new Intent(EndGame.this, MainActivity.class);

        btnMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(mainActivity);
            }
        });


    }
}