package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        int activePlayer=0;
        boolean gameActive= true;
        int[] gameState={2,2,2,2,2,2,2,2,2};
        int[][] winPositions={{0,1,2},{3,4,5},{6,7,8},
                {0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};

        public void playerTap(View view){
            ImageView img= (ImageView)view;
            int tappedImg= Integer.parseInt(img.getTag().toString());
            if(!gameActive){
              //  View b= findViewById(R.id.restart);
             //   b.setVisibility(View.VISIBLE);
                 return;
            }
            if(gameState[tappedImg]==2){
                gameState[tappedImg]=activePlayer;
                img.setTranslationY(-1000f);
                if(activePlayer==0){
                    img.setImageResource(R.drawable.x);
                    activePlayer=1;
                    TextView status = findViewById(R.id.status);
                    status.setText("0's Turn - Tap to play");
                }else{
                    img.setImageResource(R.drawable.o);
                    activePlayer=0;
                    TextView status = findViewById(R.id.status);
                    status.setText("X's Turn - Tap to play");
                }
                img.animate().translationYBy(1000f).setDuration(300);
            }
            // check if player has won
            for(int[] winPosition: winPositions){
                if(gameState[winPosition[0]]==gameState[winPosition[1]]&&gameState[winPosition[1]]==gameState[winPosition[2]]&&gameState[winPosition[0]]!=2){
                    String winStr;
                    gameActive=false;
                    if(gameState[winPosition[0]]==0){
                        winStr="X has won";

                    }else{
                        winStr="0 has won";

                    }
                    TextView status=findViewById(R.id.status);
                    status.setText(winStr);
                    View b= findViewById(R.id.restart);
                    b.setVisibility(View.VISIBLE);
                    return;
                }

            }
            boolean emptySquare = false;
            for (int squareState : gameState) {
                if (squareState == 2) {
                    emptySquare = true;
                    break;
                }
            }
            if (!emptySquare && gameActive) {
                // Game is a draw
                gameActive = false;
                String winnerStr;
                winnerStr = "No one won";
                TextView status = findViewById(R.id.status);
                status.setText(winnerStr);
                View b= findViewById(R.id.restart);
                b.setVisibility(View.VISIBLE);
            }

        }
        public void gameReset(View view){
            gameActive=true;
            activePlayer=0;
            gameState= new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2};
            ((ImageView)findViewById(R.id.imageView0)).setImageResource(0);
            ((ImageView)findViewById(R.id.imageView1)).setImageResource(0);
            ((ImageView)findViewById(R.id.imageView2)).setImageResource(0);
            ((ImageView)findViewById(R.id.imageView3)).setImageResource(0);
            ((ImageView)findViewById(R.id.imageView4)).setImageResource(0);
            ((ImageView)findViewById(R.id.imageView5)).setImageResource(0);
            ((ImageView)findViewById(R.id.imageView6)).setImageResource(0);
            ((ImageView)findViewById(R.id.imageView7)).setImageResource(0);
            ((ImageView)findViewById(R.id.imageView8)).setImageResource(0);
             TextView status = findViewById(R.id.status);
             status.setText("X's Turn - Tap to play");
            View b= findViewById(R.id.restart);
            b.setVisibility(View.INVISIBLE);

        }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}