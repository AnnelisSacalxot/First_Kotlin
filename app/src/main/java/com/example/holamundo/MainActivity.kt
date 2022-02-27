package com.example.holamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //llamando a la funcion
        variablesYConstantes();
        tiposDatos();
    }

    //Empieza a programar
    private fun variablesYConstantes(){
        var cadena = "Hola uwu";
        //imprimir
        println(cadena);
        //cambiando la cadena de la variable
        cadena = "jejej no se que escribir"
        println(cadena);

        var cadena2 = "otra cade mas";
        println(cadena2);

        //asignamos la segunda variable a la primera
        cadena2 = cadena;
        println(cadena2);

        //CONSTANTE

        val texto = "constante";
        println(texto);

    }

    //tipos de datos basicos y principales

    private fun tiposDatos(){
        //Cadena (String)
        val myString = "Hola a todos";
        val myString2 = "ya se que escribir jajaja";

        val juntar = myString+" "+myString2;
        println(juntar)

        //Entero (int, byte, short, long)
        val myInt = 1;
        val myInt2 = 3;

        val sum = myInt+myInt2;
        println(sum);

        //Decimal (float, double)
        val myDouble = 1.7;
        val myDouble1 = 2.6;
        val myDouble3 = 5.5;
        val myFloat = 2.3f;

        val op = myDouble + myDouble1 + myDouble3
        println(op);

        //Boolean (verdadero/falso)
        val myBool = true;
        val myBool2 = false;

        println(myBool == myBool2);
        println(myBool && myBool2);
    }
}