package com.vicentearmenta.androidcetysiccexamen01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.switchmaterial.SwitchMaterial;
import com.vicentearmenta.androidcetysiccexamen01.databinding.ActivityMainBinding;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    /*
    * Examen 01
    *
    * Rúbrica para evaluar
    *
    * Examen Teorico	20	20 Reactivos de lo visto en clase
    * Examen Practico	10	La aplicación trabaja sin errores y los componentes son visiblemente funcionales (por ejemplo: no texto incompleto, clic sin responder).
    *                   20	La aplicación valida que se ingrese datos necesarios y se valida que sean correctos usando try catch.
	                    20	La aplicación realiza los cálculos correspondientes y arroja los resultados esperados.
	                    10	El código esta separado por funcionalidades usando la filosofía separación de intereses.
	                    10	El código del Layout está seccionado de acuerdo a el tipo de recurso (styles, strings, dimentions, colors)
	                    10	La aplicación utiliza las mejores prácticas y convenciones expuestas y debatidas en clase (Se emplea criterio del docente evaluando la efectividad del código y la aplicación).
    *
    * */


    // tip: puedes usar view binding o findview

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // tip: aqui puedes vincular las vistas xml con su respectiva clase en java



        // tip: recuerda hacer el onClickListener


        // tip: los RadioButton se pueden usar individualmente, pero es mejor usar el RadioGroup
        // revisa este articulo
        //  https://developer.android.com/guide/topics/ui/controls/radiobutton?hl=es-419

    }

    // tip: recuerda separar logica del metodo onCreate ( cof cof ... func ... cof...)
}