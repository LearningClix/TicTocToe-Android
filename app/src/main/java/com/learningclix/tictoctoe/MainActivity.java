package com.learningclix.tictoctoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    String btn1Str, btn2Str, btn3Str, btn4Str, btn5Str, btn6Str, btn7Str, btn8Str, btn9Str;
    int moveFlag = 0;
    int moveCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }
    private void init(){
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
    }

    public void check(View view){
        Button currentBtn = (Button) view;
        Intent iEndGame = new Intent(MainActivity.this, EndGame.class);

        if (currentBtn.getText().toString().equals("")) {

            moveCount++;

            if (moveFlag == 0) {
                currentBtn.setText("X");
                moveFlag = 1;
            } else {
                currentBtn.setText("O");
                moveFlag = 0;
            }

            if (moveCount > 4) {
                btn1Str = btn1.getText().toString();
                btn2Str = btn2.getText().toString();
                btn3Str = btn3.getText().toString();
                btn4Str = btn4.getText().toString();
                btn5Str = btn5.getText().toString();
                btn6Str = btn6.getText().toString();
                btn7Str = btn7.getText().toString();
                btn8Str = btn8.getText().toString();
                btn9Str = btn9.getText().toString();

                if (btn1Str.equals(btn2Str) && btn2Str.equals(btn3Str) && !btn1Str.equals("")) {
                    //1
                    restartGame();
                    iEndGame.putExtra("winnerName",btn1Str);
                    startActivity(iEndGame);
                } else if (btn4Str.equals(btn5Str) && btn5Str.equals(btn6Str) && !btn4Str.equals("")) {
                    //2
                    restartGame();
                    iEndGame.putExtra("winnerName",btn4Str);
                    startActivity(iEndGame);
                } else if (btn7Str.equals(btn8Str) && btn8Str.equals(btn9Str) && !btn7Str.equals("")) {
                    //3
                    restartGame();
                    iEndGame.putExtra("winnerName",btn7Str);
                    startActivity(iEndGame);
                } else if (btn1Str.equals(btn4Str) && btn4Str.equals(btn7Str) && !btn1Str.equals("")) {
                    //4
                    restartGame();
                    iEndGame.putExtra("winnerName",btn1Str);
                    startActivity(iEndGame);
                } else if (btn2Str.equals(btn5Str) && btn5Str.equals(btn8Str) && !btn2Str.equals("")) {
                    //5
                    restartGame();
                    iEndGame.putExtra("winnerName",btn2Str);
                    startActivity(iEndGame);
                } else if (btn3Str.equals(btn6Str) && btn6Str.equals(btn9Str) && !btn3Str.equals("")) {
                    //6
                    restartGame();
                    iEndGame.putExtra("winnerName",btn3Str);
                    startActivity(iEndGame);
                } else if (btn1Str.equals(btn5Str) && btn5Str.equals(btn9Str) && !btn1Str.equals("")) {
                    //7
                    restartGame();
                    iEndGame.putExtra("winnerName",btn1Str);
                    startActivity(iEndGame);
                } else if (btn3Str.equals(btn5Str) && btn5Str.equals(btn7Str) && !btn3Str.equals("")) {
                    //8
                    restartGame();
                    iEndGame.putExtra("winnerName",btn3Str);
                    startActivity(iEndGame);
                }else if (moveCount==9){
                    restartGame();
                    iEndGame.putExtra("winnerName","Game Drawn");
                    startActivity(iEndGame);
                }
            }
        }
    }

    public void restartGame(){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        moveFlag=0;
        moveCount=0;
    }
}