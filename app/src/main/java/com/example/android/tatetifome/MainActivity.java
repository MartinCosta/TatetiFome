package com.example.android.tatetifome;

import android.view.View;
import android.widget.ImageButton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import static android.R.id.message;

public class MainActivity extends AppCompatActivity {

    boolean isLockedB7;         /* booleans to unlocked or locked Boxes*/
    boolean isLockedB8;
    boolean isLockedB9;
    boolean isLockedB4;
    boolean isLockedB5;
    boolean isLockedB6;
    boolean isLockedB1;
    boolean isLockedB2;
    boolean isLockedB3;
    String turnOfX = "X";
    String turnOfO = "O";
    int turnCounter = 1;
    //If is impar, is X turn, if is pair, is O turn

    boolean xBox1_check = false;  /* booleans use to check Winning player*/
    boolean xBox2_check = false;
    boolean xBox3_check = false;
    boolean xBox4_check = false;
    boolean xBox5_check = false;
    boolean xBox6_check = false;
    boolean xBox7_check = false;
    boolean xBox8_check = false;
    boolean xBox9_check = false;
    boolean oBox1_check = false;
    boolean oBox2_check = false;
    boolean oBox3_check = false;
    boolean oBox4_check = false;
    boolean oBox5_check = false;
    boolean oBox6_check = false;
    boolean oBox7_check = false;
    boolean oBox8_check = false;
    boolean oBox9_check = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   /* private void initializeGame(){
        isLockedB7=false;
    }*/

    public void mark (View view) {
            switch(view.getId())  {
                case R.id.box1:
                    ImageButton setMarkInBox1 = (ImageButton) findViewById(R.id.box1);
                    if (turnCounter % 2 == 1 && isLockedB1 == false){
                    setMarkInBox1.setImageResource(R.drawable.x);
                    xBox1_check = true;}
                    else if (turnCounter % 2 != 1 && isLockedB1 == false){
                        setMarkInBox1.setImageResource(R.drawable.o);
                        oBox1_check = true;}
                    isLockedB1 = true;
                    turnCounter++;
                    checkForPlayer();
                    checkWin();
                    break   ;
                case R.id.box2:
                    ImageButton setMarkInBox2 = (ImageButton) findViewById(R.id.box2);
                    if (turnCounter % 2 == 1 && isLockedB2 == false){
                        setMarkInBox2.setImageResource(R.drawable.x);
                        xBox2_check = true;}
                    else if (turnCounter % 2 != 1 && isLockedB2 == false) {
                        setMarkInBox2.setImageResource(R.drawable.o);
                        oBox2_check = true;}
                    isLockedB2 = true;
                    turnCounter++;
                    checkForPlayer();
                    checkWin();
                    break;
                case R.id.box3:
                    ImageButton setMarkInBox3 = (ImageButton) findViewById(R.id.box3);
                    if (turnCounter % 2 == 1 && isLockedB3 == false){
                        setMarkInBox3.setImageResource(R.drawable.x);
                        xBox3_check = true;}
                    else if (turnCounter % 2 != 1 && isLockedB3 == false) {
                        setMarkInBox3.setImageResource(R.drawable.o);
                        oBox3_check = true;}
                    isLockedB3 = true;
                    turnCounter++;
                    checkWin();
                    break;
                case R.id.box4:
                    ImageButton setMarkInBox4 = (ImageButton) findViewById(R.id.box4);
                    if (turnCounter % 2 == 1 && isLockedB4 == false){
                        setMarkInBox4.setImageResource(R.drawable.x);
                        xBox4_check = true;}
                    else if (turnCounter % 2 != 1 && isLockedB4 == false) {
                        setMarkInBox4.setImageResource(R.drawable.o);
                        oBox4_check = true;}
                    isLockedB4 = true;
                    turnCounter++;
                    checkForPlayer();
                    checkWin();
                    break;
                case R.id.box5:
                    ImageButton setMarkInBox5 = (ImageButton) findViewById(R.id.box5);
                    if (turnCounter % 2 == 1 && isLockedB5 == false){
                        setMarkInBox5.setImageResource(R.drawable.x);
                        xBox5_check = true;}
                    else if (turnCounter % 2 != 1 && isLockedB5 == false) {
                        setMarkInBox5.setImageResource(R.drawable.o);
                        oBox5_check = true;}
                    isLockedB5 = true;
                    turnCounter++;
                    checkForPlayer();
                    checkWin();
                    break;
                case R.id.box6:
                    ImageButton setMarkInBox6 = (ImageButton) findViewById(R.id.box6);
                    if (turnCounter % 2 == 1 && isLockedB6 == false){
                        setMarkInBox6.setImageResource(R.drawable.x);
                        xBox6_check = true;}
                    else if (turnCounter % 2 != 1 && isLockedB6 == false){
                        setMarkInBox6.setImageResource(R.drawable.o);
                        oBox6_check = true;}
                    isLockedB6 = true;
                    turnCounter++;
                    checkForPlayer();
                    checkWin();
                    break;
                case R.id.box7:
                    ImageButton setMarkInBox7 = (ImageButton) findViewById(R.id.box7);
                    if (turnCounter % 2 == 1 && isLockedB7 == false){
                        setMarkInBox7.setImageResource(R.drawable.x);
                        xBox7_check = true;}
                    else if (turnCounter % 2 != 1 && isLockedB7 == false) {
                        setMarkInBox7.setImageResource(R.drawable.o);
                        oBox7_check = true;}
                    isLockedB7 = true;
                    turnCounter++;
                    checkForPlayer();
                    checkWin();
                    break;
                case R.id.box8:
                    ImageButton setMarkInBox8 = (ImageButton) findViewById(R.id.box8);
                    if (turnCounter % 2 == 1 && isLockedB8 == false){
                        setMarkInBox8.setImageResource(R.drawable.x);
                        xBox8_check = true;}
                    else if (turnCounter % 2 != 1 && isLockedB8 == false) {
                        setMarkInBox8.setImageResource(R.drawable.o);
                        oBox8_check = true;}
                    isLockedB8 = true;
                    turnCounter++;
                    checkForPlayer();
                    checkWin();
                    break;
                case R.id.box9:
                    ImageButton setMarkInBox9 = (ImageButton) findViewById(R.id.box9);
                    if (turnCounter % 2 == 1 && isLockedB9 == false){
                        setMarkInBox9.setImageResource(R.drawable.x);
                        xBox9_check = true;}
                    else if (turnCounter % 2 != 1 && isLockedB9 == false) {
                        setMarkInBox9.setImageResource(R.drawable.o);
                        oBox9_check = true;}
                    isLockedB9 = true;
                    turnCounter++;
                    checkForPlayer();
                    checkWin();
                    break;
            }
            }

    /*function to check Winner */
            public void checkWin () {

                String winX = "PLayer X is the winner!";
                String winO = "Player O is the winner!";

                if ((xBox1_check && xBox2_check && xBox3_check) == true) {

                    View verticalView1 =  findViewById(R.id.winHorizontal03);
                    verticalView1.setVisibility(View.VISIBLE);

                    displayMessageWin(winX);

                } else if ((oBox1_check && oBox2_check && oBox3_check) == true) {

                    View verticalView1 =  findViewById(R.id.winHorizontal03);
                    verticalView1.setVisibility(View.VISIBLE);

                    displayMessageWin(winO);

                } else if ((xBox1_check && xBox4_check && xBox7_check) == true) {

                    displayMessageWin(winX);

                } else if ((oBox1_check && oBox4_check && oBox7_check) == true) {

                    displayMessageWin(winO);

                } else if ((xBox4_check && xBox5_check && xBox6_check) == true) {

                    View verticalView1 =  findViewById(R.id.winHorizontal02);
                    verticalView1.setVisibility(View.VISIBLE);

                    displayMessageWin(winX);
                } else if ((oBox4_check && oBox5_check && oBox6_check) == true) {

                    View verticalView1 =  findViewById(R.id.winHorizontal02);
                    verticalView1.setVisibility(View.VISIBLE);

                    displayMessageWin(winO);

                } else if ((xBox7_check && xBox8_check && oBox9_check) == true) {

                    View verticalView1 =  findViewById(R.id.winHorizontal01);
                    verticalView1.setVisibility(View.VISIBLE);

                    displayMessageWin(winX);

                } else if ((oBox7_check && oBox8_check && oBox9_check) == true) {

                    View verticalView1 =  findViewById(R.id.winHorizontal01);
                    verticalView1.setVisibility(View.VISIBLE);

                    displayMessageWin(winO);
                }
                else if ((xBox2_check && xBox5_check && xBox8_check) == true){

                   View verticalView1 =  findViewById(R.id.winVertical01);
                    verticalView1.setVisibility(View.VISIBLE);

                    displayMessageWin(winX);
                }
                else if ((oBox2_check && oBox5_check && oBox8_check) == true) {

                    View verticalView1 =  findViewById(R.id.winVertical01);
                    verticalView1.setVisibility(View.VISIBLE);

                    displayMessageWin(winO);
                }
                else if ((xBox3_check && xBox6_check && xBox9_check) == true) {

                    displayMessageWin(winX);
                }
                else if ((oBox3_check && oBox6_check && oBox9_check) == true) {

                    displayMessageWin(winO);
                }
                else if ((xBox1_check && xBox5_check && xBox9_check) == true) {

                    displayMessageWin(winX);
                }
                else if ((oBox1_check && oBox5_check && oBox9_check) == true) {

                    displayMessageWin(winO);
                }
                else if ((xBox3_check && xBox5_check && xBox7_check) == true) {

                    displayMessageWin(winX);

                }
                else if ((oBox3_check && oBox5_check && oBox7_check) == true) {

                    displayMessageWin(winO);
                }
            }

/*

    public void mark7(View view) {

        if (isLockedB7 == false) {
            checkForPlayer();

            ImageButton setMarkInBox = (ImageButton) findViewById(R.id.box7);
            if (turnCounter % 2 == 1) {
                setMarkInBox.setImageResource(R.drawable.x);
            } else {
                setMarkInBox.setImageResource(R.drawable.o);
            }
            isLockedB7 = true;
            turnCounter++;
            checkForPlayer();
        } else {
            checkForPlayer();
        }
    }

    public void mark8(View view) {

        if (isLockedB8 == false) {
            checkForPlayer();

            ImageButton setMarkInBox = (ImageButton) findViewById(R.id.box8);
            if (turnCounter % 2 == 1) {
                setMarkInBox.setImageResource(R.drawable.x);
            } else {
                setMarkInBox.setImageResource(R.drawable.o);
            }
            isLockedB8 = true;
            turnCounter++;
            checkForPlayer();
        } else {
            checkForPlayer();
        }
    }

    public void mark9(View view) {

        if (isLockedB9 == false) {
            checkForPlayer();

            ImageButton setMarkInBox = (ImageButton) findViewById(R.id.box9);
            if (turnCounter % 2 == 1) {
                setMarkInBox.setImageResource(R.drawable.x);
            } else {
                setMarkInBox.setImageResource(R.drawable.o);
            }
            isLockedB9 = true;
            turnCounter++;
            checkForPlayer();
        } else {
            checkForPlayer();
        }
    }

    public void mark4(View view) {

        if (isLockedB4 == false) {
            checkForPlayer();

            ImageButton setMarkInBox = (ImageButton) findViewById(R.id.box4);
            if (turnCounter % 2 == 1) {
                setMarkInBox.setImageResource(R.drawable.x);
            } else {
                setMarkInBox.setImageResource(R.drawable.o);
            }
            isLockedB4 = true;
            turnCounter++;
            checkForPlayer();
        } else {
            checkForPlayer();
        }
    }

    public void mark5(View view) {

        if (isLockedB5 == false) {
            checkForPlayer();

            ImageButton setMarkInBox = (ImageButton) findViewById(R.id.box5);
            if (turnCounter % 2 == 1) {
                setMarkInBox.setImageResource(R.drawable.x);
            } else {
                setMarkInBox.setImageResource(R.drawable.o);
            }
            isLockedB5 = true;
            turnCounter++;
            checkForPlayer();
        } else {
            checkForPlayer();
        }
    }

    public void mark6(View view) {

        if (isLockedB6 == false) {
            checkForPlayer();

            ImageButton setMarkInBox = (ImageButton) findViewById(R.id.box6);
            if (turnCounter % 2 == 1) {
                setMarkInBox.setImageResource(R.drawable.x);
            } else {
                setMarkInBox.setImageResource(R.drawable.o);
            }
            isLockedB6 = true;
            turnCounter++;
            checkForPlayer();
        } else {
            checkForPlayer();
        }
    }

    public void mark1(View view) {

        if (isLockedB1 == false) {
            checkForPlayer();

            ImageButton setMarkInBox = (ImageButton) findViewById(R.id.box1);
            if (turnCounter % 2 == 1) {
                setMarkInBox.setImageResource(R.drawable.x);
            } else {
                setMarkInBox.setImageResource(R.drawable.o);
            }
            isLockedB1 = true;
            turnCounter++;
            checkForPlayer();
        } else {
            checkForPlayer();
        }
    }

    public void mark2(View view) {

        if (isLockedB2 == false) {
            checkForPlayer();

            ImageButton setMarkInBox = (ImageButton) findViewById(R.id.box2);
            if (turnCounter % 2 == 1) {
                setMarkInBox.setImageResource(R.drawable.x);
            } else {
                setMarkInBox.setImageResource(R.drawable.o);
            }
            isLockedB2 = true;
            turnCounter++;
            checkForPlayer();
        } else {
            checkForPlayer();
        }
    }

    public void mark3(View view) {

        if (isLockedB3 == false) {
            checkForPlayer();

            ImageButton setMarkInBox = (ImageButton) findViewById(R.id.box3);
            if (turnCounter % 2 == 1) {
                setMarkInBox.setImageResource(R.drawable.x);
            } else {
                setMarkInBox.setImageResource(R.drawable.o);
            }
            isLockedB3 = true;
            turnCounter++;
            checkForPlayer();
        } else {
            checkForPlayer();
        }
    }

*/

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
        TextView orderSummaryTextView = (TextView) findViewById(R.id.winCheck);
        orderSummaryTextView.setText(message);
    }
}