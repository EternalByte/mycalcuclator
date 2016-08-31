package com.witworks.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,
            buttonAdd,buttonSub,buttonMul,buttonDiv,buttonC,buttonEqual;
    TextView textView_status,textView_result;
    float mValueOne,mValueTwo;
    static float result=0;
    boolean mAddition,mSubtract,mMultiplication,mDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button) findViewById(R.id.button_num_0);
        button1 = (Button) findViewById(R.id.button_num_1);
        button2 = (Button) findViewById(R.id.button_num_2);
        button3 = (Button) findViewById(R.id.button_num_3);
        button4 = (Button) findViewById(R.id.button_num_4);
        button5 = (Button) findViewById(R.id.button_num_5);
        button6 = (Button) findViewById(R.id.button_num_6);
        button7 = (Button) findViewById(R.id.button_num_7);
        button8 = (Button) findViewById(R.id.button_num_8);
        button9 = (Button) findViewById(R.id.button_num_9);
        buttonAdd = (Button) findViewById(R.id.button_add);
        buttonSub = (Button) findViewById(R.id.button_sub);
        buttonMul = (Button) findViewById(R.id.button_mul);
        buttonDiv = (Button) findViewById(R.id.button_div);
        buttonC = (Button) findViewById(R.id.button_action_c);
        buttonEqual = (Button) findViewById(R.id.button_action_equals);
        textView_status = (TextView) findViewById(R.id.textView_status);
        textView_result = (TextView) findViewById(R.id.textView_result);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //textView_status.setText(textView_status.getText() + "0");
                textView_status.append("0");
                textView_result.append("0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //textView_status.setText(textView_status.getText() + "1");

                textView_status.append("1");
                textView_result.append("1");


            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //textView_status.setText(textView_status.getText() + "2");
                textView_status.append("2");
                textView_result.append("2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //textView_status.setText(textView_status.getText() + "3");
                textView_status.append("3");
                textView_result.append("3");

            }
        });




        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //textView_status.setText(textView_status.getText() + "4");
                textView_status.append("4");
                textView_result.append("4");

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //.setText(textView_status.getText() + "5");
                textView_status.append("5");
                textView_result.append("5");

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //textView_status.setText(textView_status.getText() + "6");
                textView_status.append("6");
                textView_result.append("6");

            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // textView_status.setText(textView_status.getText() + "7");
                textView_status.append("7");
                textView_result.append("7");

            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // textView_status.setText(textView_status.getText() + "8");
                textView_status.append("8");
                textView_result.append("8");

            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //textView_status.setText(textView_status.getText() + "9");
                textView_status.append("9");
                textView_result.append("9");

            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textView_result.getText().length()>0)
                result= result+Float.parseFloat(textView_result.getText().toString().replace("= "," ").trim());
                mAddition = true;
                mDivision=mSubtract=mMultiplication=false;
                Log.e("Add"," "+result);
                /*if (textView_status == null) {
                    textView_status.setText("");

                } else {
                    mValueOne = Float.parseFloat(textView_status.getText() + "");
                    mAddition = true;
                    textView_status.setText("");*/
                if (textView_status.getText().length()>0)
                {
                    textView_status.append("+");
                }
                textView_result.setText(" ");
            }
        });


        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textView_result.getText().length()>0)
                result=  result-Float.parseFloat(textView_result.getText().toString().replace("= "," ").trim());
                mSubtract = true;
                mAddition=mDivision=mMultiplication=false;
                Log.e("Sub"," "+result);
               /* mValueOne = Float.parseFloat(textView_status.getText() + "");
                mSubtract = true;
                textView_status.setText(null);
                textView_status.append("-");*/
                if (textView_status.getText().length()>0)
                {
                    textView_status.append("-");
                }
                textView_result.setText(" ");
            }


        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(result==0)
                {
                    result=1;
                }
                if (textView_result.getText().length()>0)
                result= result*Float.parseFloat(textView_result.getText().toString().replace("= "," ").trim());
                mMultiplication = true;
                mAddition=mSubtract=mDivision=false;
                Log.e("Mul"," "+result);
               /* mValueOne = Float.parseFloat(textView_status.getText() + "");
                mMultiplication = true;
                textView_status.setText(null);
                textView_status.append("*");*/
                if (textView_status.getText().length()>0)
                {
                    textView_status.append("*");
                }

                textView_result.setText(" ");
            }


        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (textView_result.getText().length()>0)
                if( Float.parseFloat(textView_result.getText().toString().replace("= "," ").trim())>0) {
                    result = result/ Float.parseFloat(textView_result.getText().toString().replace("= "," ").trim());
                    mDivision = true;
                    mAddition=mSubtract=mMultiplication=false;
                    Log.e("Div"," "+result);
                }
                else {
                    textView_result.setText("DIVIDED BY ZERO");
                    result=0;
                    return;
                }

                /*mValueOne = Float.parseFloat(textView_status.getText() + "");

                textView_status.setText(null);
                textView_status.append("/");*/
                if (textView_status.getText().length()>0)
                {
                    textView_status.append("/");
                }
                textView_result.setText(" ");
            }


        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mDivision){
                    result=result/Float.parseFloat(textView_result.getText().toString().replace("= "," ").trim());

                    Log.e("EQ / "," "+result);
                }
                else if(mMultiplication){

                    result=result*Float.parseFloat(textView_result.getText().toString().replace("= "," ").trim());

                    Log.e("EQ X "," "+result);
                }
                else if(mAddition){

                    result=result+Float.parseFloat(textView_result.getText().toString().replace("= "," ").trim());

                    Log.e("EQ + "," "+result);
                }
                else if(mSubtract){

                    result=result-Float.parseFloat(textView_result.getText().toString().replace("= "," ").trim());

                    Log.e("EQ - "," "+result);
                }


                Log.e("EQ"," "+result);


                textView_result.setText("= "+result);
                textView_status.append("= "+result);
                result=0;

//                if (mAddition == true) {
//                    textView_result.setText(mValueOne + mValueTwo + "");
//                    mAddition = false;
//
//
//                }
//
//                if (mSubtract == true) {
//                    textView_result.setText(mValueOne - mValueTwo + "");
//                    mSubtract = false;
//                }
//                if (mMultiplication == true) {
//                    textView_result.setText(mValueOne * mValueTwo + "");
//                    mMultiplication = false;
//                }
//                if (mDivision == true) {
//                    textView_result.setText(mValueOne / mValueTwo + "");
//
//                    mDivision = false;
//                }

            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textView_status.setText(" ");
                textView_result.setText(" ");
                result=0;
            }


        });

      }
}
