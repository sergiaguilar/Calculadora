package com.example.sergi.calculadora;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.NotificationCompat;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by sergi on 25/01/17.
 */

public class main extends AppCompatActivity implements View.OnClickListener {

    private TextView t;
    private Double result = 0.0;
    private Integer mida = 0;
    private String signe = "";

    @Override
    public void onClick(View v) {
        String ant = t.getText().toString();
        Double aux = 0.0;

        switch (v.getId()) {
            case R.id.buton1:
                t.setText(ant + "1");
                break;
            case R.id.buton2:
                t.setText(ant + "2");
                break;
            case R.id.buton3:
                t.setText(ant + "3");
                break;
            case R.id.buton4:
                t.setText(ant + "4");
                break;
            case R.id.buton5:
                t.setText(ant + "5");
                break;
            case R.id.buton6:
                t.setText(ant + "6");
                break;
            case R.id.buton7:
                t.setText(ant + "7");
                break;
            case R.id.buton8:
                t.setText(ant + "8");
                break;
            case R.id.buton9:
                t.setText(ant + "9");
                break;
            case R.id.butonAC:
                result = null;
                mida = null;
                signe = null;
                t.setText("");
                break;
            case R.id.butonCE:
                if(ant.length() == 0) {}
                else {
                    String aux1 = ant.substring(0,ant.length()-1);
                    t.setText(aux1);
                }
                break;
            case R.id.butonComa:
                t.setText(ant + ".");
                break;
            case R.id.butonIgual:
                if(result == 0.0) t.setText(ant);
                else {
                    if(signe == "suma") {
                        if(ant.length() == mida+1);
                        else {
                            aux = Double.parseDouble(ant.substring(mida+1, ant.length()));
                            result = result + aux;
                        }
                    }

                    else if(signe == "resta") {
                        if(ant.length() == mida+1);
                        else {
                            aux = Double.parseDouble(ant.substring(mida+1, ant.length()));
                            result = result - aux;
                        }
                    }
                    else if(signe == "mult") {
                        if(ant.length() == mida+1);
                        else {
                            aux = Double.parseDouble(ant.substring(mida+1, ant.length()));
                            result = result * aux;
                        }
                    }
                    else if(signe == "div") {
                        if(ant.length() == mida+1);
                        else {
                            aux = Double.parseDouble(ant.substring(mida+1, ant.length()));
                            result = result / aux;
                        }
                    }
                    else {}
                    if (result % 1 == 0) t.setText(result.toString().substring(0,result.toString().length()-2));
                    else {
                        t.setText(result.toString());
                    }
                    signe = null;
                    mida = result.toString().length();
                }

                break;

            case R.id.butonSuma:
                if(signe == "suma") {
                    aux = Double.parseDouble(ant.substring(mida+1, ant.length()));
                    result = result + aux;
                    if (result % 1 == 0) {
                        String r = result.toString().substring(0,result.toString().length()-2);
                        t.setText(r + "+");
                        mida = r.length();
                    }
                    else {
                        t.setText(result.toString() + "+");
                        mida = result.toString().length();
                    }
                    signe = "suma";
                }
                else if(signe == "resta") {
                    aux = Double.parseDouble(ant.substring(mida+1, ant.length()));
                    result = result - aux;
                    if (result % 1 == 0) {
                        String r = result.toString().substring(0,result.toString().length()-2);
                        t.setText(r + "+");
                        mida = r.length();
                    }
                    else {
                        t.setText(result.toString() + "+");
                        mida = result.toString().length();
                    }
                    signe = "suma";
                }
                else if(signe == "mult") {
                    aux = Double.parseDouble(ant.substring(mida+1, ant.length()));
                    result = result * aux;
                    if (result % 1 == 0) {
                        String r = result.toString().substring(0,result.toString().length()-2);
                        t.setText(r + "+");
                        mida = r.length();
                    }
                    else {
                        t.setText(result.toString() + "+");
                        mida = result.toString().length();
                    }
                    signe = "suma";
                }
                else if(signe == "div") {
                    aux = Double.parseDouble(ant.substring(mida+1, ant.length()));
                    result = result / aux;
                    if (result % 1 == 0) {
                        String r = result.toString().substring(0,result.toString().length()-2);
                        t.setText(r + "+");
                        mida = r.length();
                    }
                    else {
                        t.setText(result.toString() + "+");
                        mida = result.toString().length();
                    }
                    signe = "suma";
                }
                else {
                    result = Double.parseDouble(ant);
                    mida = ant.length();
                    signe = "suma";
                    t.setText(ant + "+");
                }
                break;

            case R.id.butonResta:
                if(signe == "suma") {
                    aux = Double.parseDouble(ant.substring(mida+1, ant.length()));
                    result = result + aux;
                    if (result % 1 == 0) {
                        String r = result.toString().substring(0,result.toString().length()-2);
                        t.setText(r + "-");
                        mida = r.length();
                    }
                    else {
                        t.setText(result.toString() + "-");
                        mida = result.toString().length();
                    }
                    signe = "resta";
                }
                else if(signe == "resta") {
                    aux = Double.parseDouble(ant.substring(mida+1, ant.length()));
                    result = result - aux;
                    if (result % 1 == 0) {
                        String r = result.toString().substring(0,result.toString().length()-2);
                        t.setText(r + "-");
                        mida = r.length();
                    }
                    else {
                        t.setText(result.toString() + "-");
                        mida = result.toString().length();
                    }
                    signe = "resta";
                }
                else if(signe == "mult") {
                    aux = Double.parseDouble(ant.substring(mida+1, ant.length()));
                    result = result * aux;
                    if (result % 1 == 0) {
                        String r = result.toString().substring(0,result.toString().length()-2);
                        t.setText(r + "-");
                        mida = r.length();
                    }
                    else {
                        t.setText(result.toString() + "-");
                        mida = result.toString().length();
                    }
                    signe = "resta";
                }
                else if(signe == "div") {
                    aux = Double.parseDouble(ant.substring(mida+1, ant.length()));
                    result = result / aux;
                    if (result % 1 == 0) {
                        String r = result.toString().substring(0,result.toString().length()-2);
                        t.setText(r + "-");
                        mida = r.length();
                    }
                    else {
                        t.setText(result.toString() + "-");
                        mida = result.toString().length();
                    }
                    signe = "resta";
                }
                else {
                    result = Double.parseDouble(ant);
                    mida = ant.length();
                    signe = "resta";
                    t.setText(ant + "-");
                }
                break;
            case R.id.butonMult:
                if(signe == "suma") {
                    aux = Double.parseDouble(ant.substring(mida+1, ant.length()));
                    result = result + aux;
                    if (result % 1 == 0) {
                        String r = result.toString().substring(0,result.toString().length()-2);
                        t.setText(r + "x");
                        mida = r.length();
                    }
                    else {
                        t.setText(result.toString() + "x");
                        mida = result.toString().length();
                    }
                    signe = "mult";
                }
                else if(signe == "resta") {
                    aux = Double.parseDouble(ant.substring(mida+1, ant.length()));
                    result = result - aux;
                    if (result % 1 == 0) {
                        String r = result.toString().substring(0,result.toString().length()-2);
                        t.setText(r + "x");
                        mida = r.length();
                    }
                    else {
                        t.setText(result.toString() + "x");
                        mida = result.toString().length();
                    }
                    signe = "mult";
                }
                else if(signe == "mult") {
                    aux = Double.parseDouble(ant.substring(mida+1, ant.length()));
                    result = result * aux;
                    if (result % 1 == 0) {
                        String r = result.toString().substring(0,result.toString().length()-2);
                        t.setText(r + "x");
                        mida = r.length();
                    }
                    else {
                        t.setText(result.toString() + "x");
                        mida = result.toString().length();
                    }
                    signe = "mult";
                }
                else if(signe == "div") {
                    aux = Double.parseDouble(ant.substring(mida+1, ant.length()));
                    result = result / aux;
                    if (result % 1 == 0) {
                        String r = result.toString().substring(0,result.toString().length()-2);
                        t.setText(r + "*");
                        mida = r.length();
                    }
                    else {
                        t.setText(result.toString() + "*");
                        mida = result.toString().length();
                    }
                    signe = "mult";
                }
                else {
                    result = Double.parseDouble(ant);
                    mida = ant.length();
                    signe = "mult";
                    t.setText(ant + "x");
                }
                break;

            case R.id.butonDiv:
                if(signe == "suma") {
                    aux = Double.parseDouble(ant.substring(mida+1, ant.length()));
                    result = result + aux;
                    if (result % 1 == 0) {
                        String r = result.toString().substring(0,result.toString().length()-2);
                        t.setText(r + "/");
                        mida = r.length();
                    }
                    else {
                        t.setText(result.toString() + "/");
                        mida = result.toString().length();
                    }
                    signe = "div";
                }
                else if(signe == "resta") {
                    aux = Double.parseDouble(ant.substring(mida+1, ant.length()));
                    result = result - aux;
                    if (result % 1 == 0) {
                        String r = result.toString().substring(0,result.toString().length()-2);
                        t.setText(r + "/");
                        mida = r.length();
                    }
                    else {
                        t.setText(result.toString() + "/");
                        mida = result.toString().length();
                    }
                    signe = "div";
                }
                else if(signe == "mult") {
                    aux = Double.parseDouble(ant.substring(mida+1, ant.length()));
                    result = result * aux;
                    if (result % 1 == 0) {
                        String r = result.toString().substring(0,result.toString().length()-2);
                        t.setText(r + "/");
                        mida = r.length();
                    }
                    else {
                        t.setText(result.toString() + "/");
                        mida = result.toString().length();
                    }
                    signe = "div";
                }
                else if(signe == "div") {
                    aux = Double.parseDouble(ant.substring(mida+1, ant.length()));
                    result = result / aux;
                    if (result % 1 == 0) {
                        String r = result.toString().substring(0,result.toString().length()-2);
                        t.setText(r + "/");
                        mida = r.length();
                    }
                    else {
                        t.setText(result.toString() + "/");
                        mida = result.toString().length();
                    }
                    signe = "div";
                }
                else {
                    result = Double.parseDouble(ant);
                    mida = ant.length();
                    signe = "div";
                    t.setText(ant + "/");
                }
                break;

            case R.id.cuadrado:
                if(signe == "suma") {
                    aux = Double.parseDouble(ant.substring(mida+1, ant.length()));
                    result = result + aux;
                    if (result % 1 == 0) {
                        result = result *result;
                        String r = result.toString().substring(0,result.toString().length()-2);
                        t.setText(r);
                        mida = r.length();
                    }
                    else {
                        result = result *result;
                        t.setText(result.toString());
                        mida = result.toString().length();
                    }
                    signe = null;
                }
                else if(signe == "resta") {
                    aux = Double.parseDouble(ant.substring(mida+1, ant.length()));
                    result = result - aux;
                    if (result % 1 == 0) {
                        result = result *result;
                        String r = result.toString().substring(0,result.toString().length()-2);
                        t.setText(r);
                        mida = r.length();
                    }
                    else {
                        result = result *result;
                        t.setText(result.toString());
                        mida = result.toString().length();
                    }
                    signe = null;
                }
                else if(signe == "mult") {
                    aux = Double.parseDouble(ant.substring(mida+1, ant.length()));
                    result = result * aux;
                    if (result % 1 == 0) {
                        result = result *result;
                        String r = result.toString().substring(0,result.toString().length()-2);
                        t.setText(r);
                        mida = r.length();
                    }
                    else {
                        result = result *result;
                        t.setText(result.toString());
                        mida = result.toString().length();
                    }
                    signe = null;
                }
                else if(signe == "div") {
                    aux = Double.parseDouble(ant.substring(mida+1, ant.length()));
                    result = result / aux;
                    if (result % 1 == 0) {
                        result = result *result;
                        String r = result.toString().substring(0,result.toString().length()-2);
                        t.setText(r);
                        mida = r.length();
                    }
                    else {
                        result = result *result;
                        t.setText(result.toString());
                        mida = result.toString().length();
                    }
                    signe = null;
                }
                else {
                    result = Double.parseDouble(ant);
                    result = result *result;
                    if (result % 1 == 0) {
                        String r = result.toString().substring(0,result.toString().length()-2);
                        t.setText(r);
                        mida = r.length();
                    }
                    else {
                        t.setText(result.toString());
                        mida = result.toString().length();
                    }
                    signe = null;
                }
                break;

            case R.id.percent:
                if(signe == "suma") {
                    aux = Double.parseDouble(ant.substring(mida+1, ant.length()));
                    result = result + aux;
                    if (result % 1 == 0) {
                        result = result / 100;
                        String r = result.toString().substring(0,result.toString().length()-2);
                        t.setText(r);
                        mida = r.length();
                    }
                    else {
                        result = result / 100;
                        t.setText(result.toString());
                        mida = result.toString().length();
                    }
                    signe = null;
                }
                else if(signe == "resta") {
                    aux = Double.parseDouble(ant.substring(mida+1, ant.length()));
                    result = result - aux;
                    if (result % 1 == 0) {
                        result = result / 100;
                        String r = result.toString().substring(0,result.toString().length()-2);
                        t.setText(r);
                        mida = r.length();
                    }
                    else {
                        result = result / 100;
                        t.setText(result.toString());
                        mida = result.toString().length();
                    }
                    signe = null;
                }
                else if(signe == "mult") {
                    aux = Double.parseDouble(ant.substring(mida+1, ant.length()));
                    result = result * aux;
                    if (result % 1 == 0) {
                        result = result / 100;
                        String r = result.toString().substring(0,result.toString().length()-2);
                        t.setText(r);
                        mida = r.length();
                    }
                    else {
                        result = result / 100;
                        t.setText(result.toString());
                        mida = result.toString().length();
                    }
                    signe = null;
                }
                else if(signe == "div") {
                    aux = Double.parseDouble(ant.substring(mida+1, ant.length()));
                    result = result / aux;
                    if (result % 1 == 0) {
                        result = result / 100;
                        String r = result.toString().substring(0,result.toString().length()-2);
                        t.setText(r);
                        mida = r.length();
                    }
                    else {
                        result = result / 100;
                        t.setText(result.toString());
                        mida = result.toString().length();
                    }
                    signe = null;
                }
                else {
                    result = Double.parseDouble(ant);
                    result = result / 100;
                    if (result % 1 == 0) {
                        String r = result.toString().substring(0,result.toString().length()-2);
                        t.setText(r);
                        mida = r.length();
                    }
                    else {
                        t.setText(result.toString());
                        mida = result.toString().length();
                    }
                    signe = null;
                }
                break;

            case R.id.raiz:
                if(signe == "suma") {
                    aux = Double.parseDouble(ant.substring(mida+1, ant.length()));
                    result = result + aux;
                    if (result % 1 == 0) {
                        result = Math.sqrt(result);
                        String r = result.toString().substring(0,result.toString().length()-2);
                        t.setText(r);
                        mida = r.length();
                    }
                    else {
                        result = Math.sqrt(result);
                        t.setText(result.toString());
                        mida = result.toString().length();
                    }
                    signe = null;
                }
                else if(signe == "resta") {
                    aux = Double.parseDouble(ant.substring(mida+1, ant.length()));
                    result = result - aux;
                    if (result % 1 == 0) {
                        result = Math.sqrt(result);
                        String r = result.toString().substring(0,result.toString().length()-2);
                        t.setText(r);
                        mida = r.length();
                    }
                    else {
                        result = Math.sqrt(result);
                        t.setText(result.toString());
                        mida = result.toString().length();
                    }
                    signe = null;
                }
                else if(signe == "mult") {
                    aux = Double.parseDouble(ant.substring(mida+1, ant.length()));
                    result = result * aux;
                    if (result % 1 == 0) {
                        result = Math.sqrt(result);
                        String r = result.toString().substring(0,result.toString().length()-2);
                        t.setText(r);
                        mida = r.length();
                    }
                    else {
                        result = Math.sqrt(result);
                        t.setText(result.toString());
                        mida = result.toString().length();
                    }
                    signe = null;
                }
                else if(signe == "div") {
                    aux = Double.parseDouble(ant.substring(mida+1, ant.length()));
                    result = result / aux;
                    if (result % 1 == 0) {
                        result = Math.sqrt(result);
                        String r = result.toString().substring(0,result.toString().length()-2);
                        t.setText(r);
                        mida = r.length();
                    }
                    else {
                        result = Math.sqrt(result);
                        t.setText(result.toString());
                        mida = result.toString().length();
                    }
                    signe = null;
                }
                else {
                    result = Double.parseDouble(ant);
                    result = Math.sqrt(result);
                    if (result % 1 == 0) {
                        String r = result.toString().substring(0,result.toString().length()-2);
                        t.setText(r);
                        mida = r.length();
                    }
                    else {
                        t.setText(result.toString());
                        mida = result.toString().length();
                    }
                    signe = null;
                }
                break;

        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        t = (TextView) findViewById(R.id.edit);
        Button button1 = (Button) findViewById(R.id.buton1);
        button1.setOnClickListener(this);
        Button button2 = (Button) findViewById(R.id.buton2);
        button2.setOnClickListener(this);
        Button button3 = (Button) findViewById(R.id.buton3);
        button3.setOnClickListener(this);
        Button button4 = (Button) findViewById(R.id.buton4);
        button4.setOnClickListener(this);
        Button button5 = (Button) findViewById(R.id.buton5);
        button5.setOnClickListener(this);
        Button button6 = (Button) findViewById(R.id.buton6);
        button6.setOnClickListener(this);
        Button button7 = (Button) findViewById(R.id.buton7);
        button7.setOnClickListener(this);
        Button button8 = (Button) findViewById(R.id.buton8);
        button8.setOnClickListener(this);
        Button button9 = (Button) findViewById(R.id.buton9);
        button9.setOnClickListener(this);
        Button buttonac = (Button) findViewById(R.id.butonAC);
        buttonac.setOnClickListener(this);
        Button buttonce = (Button) findViewById(R.id.butonCE);
        buttonce.setOnClickListener(this);
        Button buttoncoma = (Button) findViewById(R.id.butonComa);
        buttoncoma.setOnClickListener(this);
        Button buttonsuma = (Button) findViewById(R.id.butonSuma);
        buttonsuma.setOnClickListener(this);
        Button buttonresta = (Button) findViewById(R.id.butonResta);
        buttonresta.setOnClickListener(this);
        Button buttonigual = (Button) findViewById(R.id.butonIgual);
        buttonigual.setOnClickListener(this);
        Button buttonmult = (Button) findViewById(R.id.butonMult);
        buttonmult.setOnClickListener(this);
        Button buttondiv = (Button) findViewById(R.id.butonDiv);
        buttondiv.setOnClickListener(this);
        Button buttoncuadrado = (Button) findViewById(R.id.cuadrado);
        buttoncuadrado.setOnClickListener(this);
        Button buttonpercent = (Button) findViewById(R.id.percent);
        buttonpercent.setOnClickListener(this);
        Button raiz = (Button) findViewById(R.id.raiz);
        raiz.setOnClickListener(this);

    }




    @Override
    protected void onSaveInstanceState(Bundle outstate){
        super.onSaveInstanceState(outstate);
        TextView t = (TextView) findViewById(R.id.edit);
        outstate.putString("textview", t.getText().toString());
        outstate.putDouble("result",result);
        outstate.putInt("mida",mida);
        outstate.putString("signe",signe);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        TextView t = (TextView) findViewById(R.id.edit);
        t.setText(savedInstanceState.getString("textview"));
        mida = savedInstanceState.getInt("mida");
        result = savedInstanceState.getDouble("result");
        signe = savedInstanceState.getString("signe");
    }
}
