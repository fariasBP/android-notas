/* DESARROLLO ANDROID CON SOLO JAVA
	se mostrara un ejemplo creando una simple interfaz de usuacio (hola mundo)
	solo usando java. 
	TEMAS:
		- linearLayouy ---> es uno de los distintos layouts que existe en la
							parte de layouts se profundizara en esto, hasta 
							entonces solo veamoslo como un contenedor.
		- TextView ---> View que sirve para crear vista de texto.
			- [TextView].setText(string texto) ---> Crea Texto en el TextView.
		- [ViewGroup]addView ---> agrega una vista segundaria
		- setContentView

*/

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        TextView txt = new TextView(this);
        txt.setText("Hola a todos");

        LinearLayout lyt = new LinearLayout(this);

        LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(
                /*width*/ ViewGroup.LayoutParams.MATCH_PARENT,100,
                /*weight*/ 1.0f);

        lyt.setLayoutParams(param);
        lyt.addView(txt);
        setContentView(lyt);


    }
}