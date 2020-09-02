package com.example.tpp3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



import android.widget.TextView;

import com.faendir.rhino_android.RhinoAndroidHelper;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ast.Scope;

public class MainActivity extends AppCompatActivity {


    Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_Percent,btn_Plus,btn_Minus,btn_Multiply,btn_Division,btn_Equal,btn_Clear,btn_Dot,btn_Bracket1
     ,btn_sqrt ,btn_cos,btn_sin,btn_tan  , btn_Bracket2  , btn_modulo  ;

    TextView input,output;
    String process;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);

        btn_0 = findViewById(R.id.button0);
        btn_1 = findViewById(R.id.button1);
        btn_2 = findViewById(R.id.button2);
        btn_3 = findViewById(R.id.button3);
        btn_4 = findViewById(R.id.button4);
        btn_5 = findViewById(R.id.button5);
        btn_6 = findViewById(R.id.button6);
        btn_7 = findViewById(R.id.button7);
        btn_8 = findViewById(R.id.button8);
        btn_9 = findViewById(R.id.button9);

        btn_Plus = findViewById(R.id.buttonadd);
        btn_Minus = findViewById(R.id.buttonsub);
        btn_Division = findViewById(R.id.buttondiv);
        btn_Multiply = findViewById(R.id.buttonmul);

        btn_cos=findViewById(R.id.button_cos);
        btn_sin=findViewById(R.id.button_sin);
        btn_tan=findViewById(R.id.button_tan);

        btn_modulo=findViewById(R.id.button_mod);



        btn_Equal =  findViewById(R.id.buttoneql);

        btn_Clear = findViewById(R.id.buttonC);
        btn_Dot = findViewById(R.id.button10);
        btn_Percent = findViewById(R.id.btnPercent);

        btn_Bracket1 = findViewById(R.id.btnBracket1);
        btn_Bracket2 = findViewById(R.id.btnBracket2);

        btn_sqrt  = findViewById(R.id. button_racine);

        input = findViewById(R.id.input);
        output = findViewById(R.id.output);

        btn_Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                output.setText("");
            }
        });


        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input.setText(input.getText().toString() + "0");
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input.setText(input.getText().toString() + "1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input.setText(input.getText().toString() + "2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input.setText(input.getText().toString() + "3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input.setText(input.getText().toString() + "4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input.setText(input.getText().toString() + "5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input.setText(input.getText().toString() + "6");
            }
        });



        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input.setText(input.getText().toString() + "7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input.setText(input.getText().toString() + "8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input.setText(input.getText().toString() + "9");
            }
        });

        btn_Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input.setText(input.getText().toString() + "+");
            }
        });


        btn_Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input.setText(input.getText().toString() + "-");
            }
        });

        btn_Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input.setText(input.getText().toString() + "×");
            }
        });

        btn_Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input.setText(input.getText().toString() + "÷");
            }
        });

        btn_Dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input.setText(input.getText().toString() + ".");
            }
        });

        btn_Percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input.setText(input.getText().toString() + "%");
            }
        });


        btn_sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input.setText(input.getText().toString() + "sqrt");
            }
        });


        btn_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input.setText(input.getText().toString() + "cos" );
            }
        });

        btn_sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input.setText(input.getText().toString() + "sin" );
            }
        });


        btn_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input.setText(input.getText().toString() + "tan" );
            }
        });




        btn_Bracket1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input.setText(input.getText().toString() + "(" );
            }
        });



        btn_Bracket2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input.setText(input.getText().toString() + ")" );
            }
        });


        btn_modulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input.setText(input.getText().toString() + " mod " );
            }
        });






        btn_Equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               process = input.getText().toString() ;

                process = process.replaceAll("sqrt","Math.sqrt");
                process = process.replaceAll("×","*");
                process = process.replaceAll("%","/100");
                process = process.replaceAll("÷","/");
                process = process.replaceAll( "cos"  ,"Math.cos");
                process = process.replaceAll("sin","Math.sin");
                process =process.replaceAll("tan","Math.tan");
                process =process.replaceAll(" mod ","%");


                Context rhino = Context.enter();

                rhino.setOptimizationLevel(-1);

                String Result = "";

                try {
                    Scriptable scriptable = rhino.initStandardObjects();
                    Result = rhino.evaluateString(scriptable,process,"javascript",1,null).toString();
                }catch (Exception e){
                    Result="0";
                }

                output.setText(Result);
            }
        });


    }
}