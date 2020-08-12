/* PERSISTENCIA POR BUNDLE
	Cuando el usuario cambia la aplicacion y se vuelve otra vez a nuestra aplicacion,
	o incluso cuando se cambia la orientacion del dispositivo se reinicia los datos de 
	un textview, edittext u otros view. Para evitar la perdida de datos se usa bundle
	que guarda la informacion en ram. Para guardar se usa el metodo clave valor, pero 
	esto gracias a dos eventos onSaveInstanceState para guardar datos, onRestoreInstanceState
	para recuperar datos. Para entender mejor es necesario ver el ciclo vital de una activity
	TEMAS:
		- onSaveInstanceState >>> evento que escucha cuando la aplicacion se para y destruye la actividad
		- onRestoreInstanceState >>> evento que escucha cuando la aplicaion reinicia y vuelve a crear la actividad
	FORMA:
	
	HERENCIA:
		Esta hereda de Activity
*/


public class NumberRandomActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_random);
    }

// como heredade de activity hacemos sobre escritura
    // en esta almacenamos los datos deseado
	public void onSaveInstanceState(Bundle almacen) {

        almacen.putString("de", de.toString()); // almacenamos datos

        super.onSaveInstanceState(almacen);
    }
    // en esta recuperamos los datos deseado
    public void onRestoreInstanceState(Bundle almacen) {
        super.onRestoreInstanceState(almacen);

        String x = almacen.getString("de"); // recuperamos datos

    }
}