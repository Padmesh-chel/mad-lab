package com.example.progress;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button onebutton = findViewById(R.id.one);
        final Button twobutton = findViewById(R.id.two);
        final Button threebutton = findViewById(R.id.three);
        final Button fourbutton = findViewById(R.id.four);
        final Button fivebutton = findViewById(R.id.five);
        final Button sixbutton = findViewById(R.id.six);
        final Button sevenbutton = findViewById(R.id.seven);
        final Button eightbutton = findViewById(R.id.eight);
        final Button ninebutton = findViewById(R.id.nine);
        final Button zerobutton = findViewById(R.id.zero);
        final Button plusbutton = findViewById(R.id.plus);
        final Button minusbutton = findViewById(R.id.minus);
        final Button multiplybutton = findViewById(R.id.multiply);
        final Button dividebutton = findViewById(R.id.divide);
        final TextView answertext = findViewById(R.id.answer);
        final TextView resultbutton = findViewById(R.id.result);
        final TextView clearbutton = findViewById(R.id.clear);
        final Button inten=findViewById(R.id.b1);
        final Button disp=findViewById(R.id.d1);
        final TextView t1=findViewById(R.id.tex1);
        clearbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                answertext.setText("");
            }
        });

        disp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=answertext.getText().toString();
                t1.setText(a);
            }
        });

        inten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(getApplication(),MainActivity.class);
                in.putExtra("asd",answertext.getText().toString());
                startActivity(in);
            }
        });
        onebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = answertext.getText().toString();
                s=s+"1";
                answertext.setText(s);
            }
        });

        twobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = answertext.getText().toString();
                s=s+"2";
                answertext.setText(s);
            }
        });

        threebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = answertext.getText().toString();
                s=s+"3";
                answertext.setText(s);
            }
        });

        fourbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = answertext.getText().toString();
                s=s+"4";
                answertext.setText(s);
            }
        });

        fivebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = answertext.getText().toString();
                s=s+"5";
                answertext.setText(s);
            }
        });

        sixbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = answertext.getText().toString();
                s=s+"6";
                answertext.setText(s);
            }
        });

        sevenbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = answertext.getText().toString();
                s=s+"7";
                answertext.setText(s);
            }
        });

        eightbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = answertext.getText().toString();
                s=s+"8";
                answertext.setText(s);
            }
        });

        ninebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = answertext.getText().toString();
                s=s+"9";
                answertext.setText(s);
            }
        });

        zerobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = answertext.getText().toString();
                s=s+"0";
                answertext.setText(s);
            }
        });

        plusbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = answertext.getText().toString();
                s=s+"+";
                answertext.setText(s);
//                int num = Integer.parseInt(answertext.getText().toString());
//                opr[0] = '+';
//                answertext.setText("");
            }
        });

        minusbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = answertext.getText().toString();
                s=s+"-";
                answertext.setText(s);
            }
        });

        multiplybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = answertext.getText().toString();
                s=s+"*";
                answertext.setText(s);
            }
        });

        dividebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = answertext.getText().toString();
                s=s+"/";
                answertext.setText(s);
            }
        });

        resultbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String answer = answertext.getText().toString();
                String num1 = "";
                String num2 = "";
                int i;
                for(i=0;i<answer.length();i++)
                {
                    Boolean flag = Character.isDigit(answer.charAt(i));
                    if(flag)
                    {
                        num1 +=answer.charAt(i);
                    }
                    else
                        break;
                }

                char opr = answer.charAt(i);
                for(i = i+1;i<answer.length();i++)
                {
                    num2 +=answer.charAt(i);
                }

//
                float n1 = Float.parseFloat(num1);
                float n2 = Float.parseFloat(num2);
                int ans =0;
                String res = "";

                switch(opr)
                {
                    case '+': res = n1+n2+"";
                        break;
                    case '-': res = n1-n2+"";
                        break;
                    case '*': res = n1*n2+"";
                        break;
                    case '/': res = n1/n2+"";
                }
                answertext.setText(res);

            }
        });


    }
}