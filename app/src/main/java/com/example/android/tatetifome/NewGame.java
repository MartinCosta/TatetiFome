package com.example.android.tatetifome;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import static com.example.android.tatetifome.R.drawable.o;

/**
 * Created by Martin on 2/6/2017.
 */
public class NewGame extends AppCompatActivity {

    String turnOfX = "X";
    String turnOfO = "O";
    int turnCounter = 1;
    /** Building an Array that can store the status of all 9 boxes in the game. E.g boxArray [7] = 1 ==> "the box in the upper left corner is now an X".
     * 0 means it hasn´t been marked (pressed) yet neither by X or 0.
     * 1 means it´s been marked with an X.
     * -1 means it´s been marked with an O.
      */
    int[] boxArray = new int[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Mark method, main method for marking and checking boxes
     *
     * @param view
     */
    public void mark(View view) {

        switch (view.getId()) {
            case R.id.box1:
                ImageButton setMarkInBox1 = (ImageButton) findViewById(R.id.box1);

                if (boxArray[1]!=0){                        //Stops the method if not empty
                    displayMessageWin("Not an empty box");
                    break;
                }
                if (boxArray[1] == 0 && turnCounter % 2 == 1) {
                    setMarkInBox1.setImageResource(R.drawable.x);
                    boxArray[1]=1;
                } else if (boxArray[1] == 0 && turnCounter % 2 != 1) {
                    setMarkInBox1.setImageResource(o);
                    boxArray [1] = -1;
                }
                turnCounter++;
                checkForPlayer();
                checkWin();
                break;
            case R.id.box2:
                ImageButton setMarkInBox2 = (ImageButton) findViewById(R.id.box2);
                if (boxArray[2]!=0){                        //Stops the method if not empty
                    displayMessageWin("Not an empty box");
                    break;
                }
                if (boxArray[2] == 0 && turnCounter % 2 == 1) {
                    setMarkInBox2.setImageResource(R.drawable.x);
                    boxArray[2]=1;
                } else if (boxArray[2] == 0 && turnCounter % 2 != 1) {
                    setMarkInBox2.setImageResource(o);
                    boxArray [2] = -1;
                }
                turnCounter++;
                checkForPlayer();
                checkWin();
                break;
            case R.id.box3:
                ImageButton setMarkInBox3 = (ImageButton) findViewById(R.id.box3);
                if (boxArray[3]!=0){                        //Stops the method if not empty
                    displayMessageWin("Not an empty box");
                    break;
                }
                if (boxArray[3] == 0 && turnCounter % 2 == 1) {
                    setMarkInBox3.setImageResource(R.drawable.x);
                    boxArray[3]=1;
                } else if (boxArray[3] == 0 && turnCounter % 2 != 1) {
                    setMarkInBox3.setImageResource(o);
                    boxArray [3] = -1;
                }
                turnCounter++;
                checkForPlayer();
                checkWin();
                break;
            case R.id.box4:
                ImageButton setMarkInBox4 = (ImageButton) findViewById(R.id.box4);
                if (boxArray[4]!=0){                        //Stops the method if not empty
                    displayMessageWin("Not an empty box");
                    break;
                }
                if (boxArray[4] == 0 && turnCounter % 2 == 1) {
                    setMarkInBox4.setImageResource(R.drawable.x);
                    boxArray[4]=1;
                } else if (boxArray[4] == 0 && turnCounter % 2 != 1) {
                    setMarkInBox4.setImageResource(o);
                    boxArray [4] = -1;
                }
                turnCounter++;
                checkForPlayer();
                checkWin();
                break;
            case R.id.box5:
                ImageButton setMarkInBox5 = (ImageButton) findViewById(R.id.box5);
                if (boxArray[5]!=0){                        //Stops the method if not empty
                    displayMessageWin("Not an empty box");
                    break;
                }
                if (boxArray[5] == 0 && turnCounter % 2 == 1) {
                    setMarkInBox5.setImageResource(R.drawable.x);
                    boxArray[5]=1;
                } else if (boxArray[5] == 0 && turnCounter % 2 != 1) {
                    setMarkInBox5.setImageResource(o);
                    boxArray[5]=-1;
                }
                turnCounter++;
                checkForPlayer();
                checkWin();
                break;
            case R.id.box6:
                if (boxArray[6]!=0){                        //Stops the method if not empty
                    displayMessageWin("Not an empty box");
                    break;
                }
                ImageButton setMarkInBox6 = (ImageButton) findViewById(R.id.box6);
                if (boxArray[6] == 0 && turnCounter % 2 == 1) {
                    setMarkInBox6.setImageResource(R.drawable.x);
                    boxArray[6]=1;
                } else if (boxArray[6] == 0 && turnCounter % 2 != 1) {
                    setMarkInBox6.setImageResource(o);
                    boxArray[6]=-1;
                }
                turnCounter++;
                checkForPlayer();
                checkWin();
                break;
            case R.id.box7:
                if (boxArray[7]!=0){                        //Stops the method if not empty
                    displayMessageWin("Not an empty box");
                    break;
                }
                ImageButton setMarkInBox7 = (ImageButton) findViewById(R.id.box7);
                if (boxArray[7] == 0 && turnCounter % 2 == 1) {
                    setMarkInBox7.setImageResource(R.drawable.x);
                    boxArray[7]=1;
                } else if (boxArray[7] == 0 && turnCounter % 2 != 1) {
                    setMarkInBox7.setImageResource(o);
                    boxArray[7]=-1;
                }
                turnCounter++;
                checkForPlayer();
                checkWin();
                break;
            case R.id.box8:
                ImageButton setMarkInBox8 = (ImageButton) findViewById(R.id.box8);
                if (boxArray[8]!=0){                        //Stops the method if not empty
                    displayMessageWin("Not an empty box");
                    break;
                }
                if (boxArray[8] == 0 && turnCounter % 2 == 1) {
                    setMarkInBox8.setImageResource(R.drawable.x);
                    boxArray[8]=1;
                } else if (boxArray[8] == 0 && turnCounter % 2 != 1) {
                    setMarkInBox8.setImageResource(o);
                    boxArray[8]=-1;
                }
                turnCounter++;
                checkForPlayer();
                checkWin();
                break;
            case R.id.box9:
                if (boxArray[9]!=0){                        //Stops the method if not empty
                    displayMessageWin("Not an empty box");
                    break;
                }
                ImageButton setMarkInBox9 = (ImageButton) findViewById(R.id.box9);
                if (boxArray[9] == 0 && turnCounter % 2 == 1) {
                    setMarkInBox9.setImageResource(R.drawable.x);
                    boxArray[9]=1;
                } else if (boxArray[9] == 0 && turnCounter % 2 != 1) {
                    setMarkInBox9.setImageResource(o);
                    boxArray[9]=-1;
                }
                turnCounter++;
                checkForPlayer();
                checkWin();
                break;
        }
    }
    /*function to check Winner */
    public void checkWin() {
        String winX = "PLayer X is the winner!";
        String winO = "Player O is the winner!";

        if (boxArray[1]==1 && boxArray[2]==1 && boxArray[3]==1) {

            displayMessageWin(winX);

        } else if (boxArray[1]==-1 && boxArray[2]==-1 && boxArray[3]==-1) {

            displayMessageWin(winO);

        } else if (boxArray[1]==1 && boxArray[4]==1 && boxArray[7]==1) {

            displayMessageWin(winX);

        } else if (boxArray[1]==-1 && boxArray[4]==-1 && boxArray[7]==-1) {

            displayMessageWin(winO);

        } else if (boxArray[4]==1 && boxArray[5]==1 && boxArray[6]==1) {

            displayMessageWin(winX);

        } else if (boxArray[4]==-1 && boxArray[5]==-1 && boxArray[6]==-1) {

            displayMessageWin(winO);

        } else if (boxArray[7]==1 && boxArray[8]==1 && boxArray[9]==1) {

            displayMessageWin(winX);

        } else if (boxArray[7]==-1 && boxArray[8]==-1 && boxArray[9]==-1) {

            displayMessageWin(winO);

        } else if (boxArray[2]==1 && boxArray[5]==1 && boxArray[8]==1){

            displayMessageWin(winX);

        } else if (boxArray[2]==-1 && boxArray[5]==-1 && boxArray[8]==-1) {

            displayMessageWin(winO);

        } else if (boxArray[3]==1 && boxArray[6]==1 && boxArray[9]==1) {

            displayMessageWin(winX);

        } else if (boxArray[3]==-1 && boxArray[6]==-1 && boxArray[9]==-1) {

            displayMessageWin(winO);

        } else if (boxArray[1]==1 && boxArray[5]==1 && boxArray[9]==1) {

            displayMessageWin(winX);

        } else if (boxArray[1]==-1 && boxArray[5]==-1 && boxArray[9]==-1) {

            displayMessageWin(winO);

        } else if (boxArray[3]==1 && boxArray[5]==1 && boxArray[7]==1) {

            displayMessageWin(winX);

        } else if (boxArray[3]==-1 && boxArray[5]==-1 && boxArray[7]==-1) {

            displayMessageWin(winO);
        }
    }
    /* function to check turn for player */
    private void checkForPlayer() {
        if (turnCounter % 2 == 1) {
            displayTurnOfMessage(turnOfX); //it would do it so quickly that is better to anticipate and generate this message now this way
        } else {
            displayTurnOfMessage(turnOfO); //it would do it so quickly that is better to anticipate and generate this message now this way
        }
    }
    /*Function to display turn of player */
    private void displayTurnOfMessage(String turnOfSomeone) {
        TextView turnOfPlayerTextView = (TextView) findViewById(R.id.turnOf_text);
        turnOfPlayerTextView.setText("Turn of " + turnOfSomeone);
    }
    /* function to display Winning Player Message */
    private void displayMessageWin(String message) {
        TextView checkWinTextView = (TextView) findViewById(R.id.winCheck);
        checkWinTextView.setText(message);
    }
}


