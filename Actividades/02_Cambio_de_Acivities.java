/** CAMBIANDO DE UNA ACTIVIDAD A OTRA
		vemos un pequeno ejemplo de cambiar una actidad a otra
		TEMAS:
			- Intent >>> es un objeto que proporciona enlace de tiempo de ejecución entre componentes separados, como dos activity. representa la “intención de hacer algo” de una app
			- startActivity(<Intent intent>) >>> inicia una actividad
		FORMAS
			- Intent <name intent> = new Intent(<context clase_actual>, <class clase_a_iniciar>)
			- startActivity(<Intent intencion>)

**/


// CAMBIANDO DE ACTIVIDAD "X" A "Y"

public class X_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_X);

    }

    public void ejecutarActivitie(View view) {
    	// Intent (intencion) es la clase para cambiar de actividad
        Intent cambiarActivity = new Intent(this, Y_Activity.class);
        // empezamos la nueva acitividad
        startActivity(cambiarActivity);
    }
}