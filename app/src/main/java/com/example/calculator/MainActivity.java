package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button btnAC,btnC,btnBrac1,btnBrac2,btnSin,btnCos,btnTan,btnLog,btnLn,btnFact,
            btnSqr,btnSqrt,btnInverse,btnDivide,btn9,btn8,btn7,btn6,btn5,btn4,btn3,btn2
            ,btn1,btn0,
            btnMinus,btnAdd,btnpi,btnpoint,btnequal,btnMultiply;
    TextView tv1,tv2;
    String pi= "3.14159265";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAC =findViewById(R.id.btnAC);
        btnC =findViewById(R.id.btnC);
        btnBrac1 =findViewById(R.id.btnBrac1);
        btnBrac2 =findViewById(R.id.btnBrac2);
        btnSin =findViewById(R.id.btnSin);
        btnCos =findViewById(R.id.btnCos);
        btnTan =findViewById(R.id.btnTan);
        btnLog=findViewById(R.id.btnLog);
        btnLn=findViewById(R.id.btnLn);
        btnFact =findViewById(R.id.btnFact);
        btnSqr =findViewById(R.id.btnSqr);
        btnSqrt=findViewById(R.id.btnSqrt);
        btnInverse =findViewById(R.id.btnInverse);
        btnDivide =findViewById(R.id.btnDivide);
        btn9 =findViewById(R.id.btn9);
        btn8 =findViewById(R.id.btn8);
        btn7 =findViewById(R.id.btn7);
        btn6 =findViewById(R.id.btn6);
        btn5 =findViewById(R.id.btn5);
        btn4 =findViewById(R.id.btn4);
        btn3 =findViewById(R.id.btn3);
        btn2 =findViewById(R.id.btn2);
        btn1 =findViewById(R.id.btn1);
        btn0 =findViewById(R.id.btn0);
        btnMinus =findViewById(R.id.btnMinus);
        btnAdd =findViewById(R.id.btnAdd);
        btnpi =findViewById(R.id.btnpi);
        btnpoint=findViewById(R.id.btnpoint);
        btnequal =findViewById(R.id.btnequal);
        btnMultiply =findViewById(R.id.btnMultiply);

        tv1 =findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  tv1.setText(tv1.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"0");
            }
        });
        btnpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+".");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"0");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"+");
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"-");
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"×");
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"÷");
            }
        });
        btnBrac1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"(");
            }
        });
        btnBrac2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+")");
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"-");
            }
        });
        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"log");
            }
        });
        btnLn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText()+"ln");
            }
        });






        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText("");
                tv2.setText("");

            }
        });
        btnpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv2.setText(btnpi.getText());
                tv1.setText(tv2.getText()+pi);

            }
        });
        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv2.getText()+"sin");


            }
        });
        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv2.getText()+"cos");


            }
        });
        btnTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv2.getText()+"tan");


            }
        });
        btnInverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv2.getText()+"^"+"(-1)");


            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = tv1.getText().toString();
                val = val.substring(0,val.length()-1);
                tv1.setText(val);


            }
        });
        btnFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val = Integer.parseInt(tv1.getText().toString());
                int fact = factorial(val);
                tv1.setText((String.valueOf(fact)));
                tv2.setText(val+"!");



            }
        });
        btnSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = tv1.getText().toString();

                // Check if the value in tv1 is a valid number
                if (isValidNumber(val)) {
                    double r = Math.sqrt(Double.parseDouble(val));
                    tv1.setText(String.valueOf(r));
                    tv2.setText("sqrt(" + val + ")");
                } else {
                    // Handle the case where val is not a valid number
                    Toast toast=Toast.makeText (getApplicationContext (),"Please enter number first",Toast.LENGTH_SHORT);
                    toast.show();
                    tv2.setText("");
                }
            }
        });
        btnSqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double d = Double.parseDouble(tv1.getText().toString());
                double square = d*d;
                tv1.setText((String.valueOf(square)));
                tv2.setText(d+"²");



            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = tv1.getText().toString();
                String replacesString= val.replace('÷','/').replace('×','*');
                double result =eval(replacesString);
                tv1.setText((String.valueOf(result)));
                tv2.setText(val);



            }
        });




    }
    //factorial function
    int factorial(int n ){
        return (n==1 || n==0) ? 1: n*factorial(n-1);
    }

    // Validation method to check if a string is a valid number
    private boolean isValidNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    //eval function
    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
}


