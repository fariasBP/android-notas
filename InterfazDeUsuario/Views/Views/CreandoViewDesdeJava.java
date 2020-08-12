/* 	CREANDO COMPONENTES VIEW DESDE JAVA
	Sabemos que hay tres formas de crear una interfaz en android, en este caso vamos a crear
	desde java.
		TEMAS:
			- setContentView(View view_componente):bool >>> estable un contenido de vista
*/

package com.example.franco.numberrandom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        TextView mi_texto = new TextView(this);
        mi_texto.setText("hola");
        setContentView(mi_texto);

    }
}
