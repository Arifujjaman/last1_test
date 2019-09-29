package com.example.arif.last_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity {
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,bteq,btdot,btac,btadd,btsub,btmul,btdiv,btmod,btsq,btdel;
    TextView ans1,ans2;
    double v1,v2;
    boolean add,sub,mul,div,mod;
    String del;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1=findViewById(R.id.b1);
        bt2=findViewById(R.id.b2);
        bt3=findViewById(R.id.b3);
        bt4=findViewById(R.id.b4);
        bt5=findViewById(R.id.b5);
        bt6=findViewById(R.id.b6);
        bt7=findViewById(R.id.b7);
        bt8=findViewById(R.id.b8);
        bt9=findViewById(R.id.b9);
        bt0=findViewById(R.id.b0);
        btac=findViewById(R.id.bac);
        btdot=findViewById(R.id.bdot);
        bteq=findViewById(R.id.beq);
        btmod=findViewById(R.id.bmod);
        btadd=findViewById(R.id.badd);
        btsub=findViewById(R.id.bsub);
        btmul=findViewById(R.id.bmul);
        btdiv=findViewById(R.id.bdiv);
        btsq=findViewById(R.id.bsq);
        btdel=findViewById(R.id.bdel);
        ans1=findViewById(R.id.text1);
        ans2=findViewById(R.id.text2);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans2.setText(ans2.getText()+"1");
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans2.setText(ans2.getText()+"2");
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans2.setText(ans2.getText()+"3");
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans2.setText(ans2.getText()+"4");
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans2.setText(ans2.getText()+"5");
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans2.setText(ans2.getText()+"6");
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans2.setText(ans2.getText()+"7");
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans2.setText(ans2.getText()+"8");
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans2.setText(ans2.getText()+"9");
            }
        });
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans2.setText(ans2.getText()+"0");
            }
        });
        btdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans2.setText(ans2.getText()+".");
            }
        });
        btac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans1.setText(null);
                ans2.setText(null);
            }
        });
        btdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                del=ans2.getText().toString();
                del=del.substring(0,del.length()-1);
                ans2.setText(del+"");
            }
        });
        btadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ans2==null){
                    ans2.setText("");
                }
                else{
                    v1=Double.parseDouble(ans2.getText()+"");
                    add=true;
                    ans2.setText(null);
                }
            }
        });
        btsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ans2==null){
                    ans2.setText("");
                }
                else{
                    v1=Double.parseDouble(ans2.getText()+"");
                    sub=true;
                    ans2.setText(null);
                }
            }
        });

        btmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ans2==null){
                    ans2.setText("");
                }
                else{
                    v1=Double.parseDouble(ans2.getText()+"");
                    mul=true;
                    ans2.setText(null);
                }
            }
        });

        btdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ans2==null){
                    ans2.setText("");
                }
                else{
                    v1=Double.parseDouble(ans2.getText()+"");
                    div=true;
                    ans2.setText(null);
                }
            }
        });

        btmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ans2==null){
                    ans2.setText("");
                }
                else{
                    v1=Double.parseDouble(ans2.getText()+"");
                    mod=true;
                    ans2.setText(null);
                }
            }
        });

        btsq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ans2==null){
                    ans2.setText("");
                }
                else {
                    v1 = Double.parseDouble(ans2.getText() + "");
                    v2=sqrt(v1);
                    ans1.setText(v2+"");
                }
            }
        });

        bteq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v2=Double.parseDouble(ans2.getText()+"");
                if(add==true){
                    ans1.setText(v1+v2+"");
                    add=false;
                }

                if(sub==true){
                    ans1.setText(v1-v2+"");
                    sub=false;
                }

                if(mul==true){
                    ans1.setText(v1*v2+"");
                    mul=false;
                }

                if(div==true){
                    ans1.setText(v1+v2+"");
                    div=false;
                }

                if(mod==true){
                    if(v2==0){
                        ans1.setText("error");
                    }
                    else{
                        ans1.setText(v1%v2+"");
                        mod=false;
                    }
                }
            }
        });




    }
}

