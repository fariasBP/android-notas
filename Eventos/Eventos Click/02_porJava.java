/* EVENTOS CLICK DESDE JAVA
	veremos como se puede crear un escuchador de eventos desde el codigo java
	TEMAS:
		- setOnClickListener
	FORMA:
		[view].setOnClickListener
*/
public class MainActivity extends AppCompatActivity {
	private Button btn;

	protected void onCreate(Bundle savedInstanceState) {
		btn.findViewById(R.id.btn1); //Selector de view

		btn.setOnClickListener(new View.OnClickListener() { //agregando al view el evento click
            public void onClick(View v) {
                // Codigo a ejecutar si se da el evento
                Log.d("onclick", "Se hizo click en"+v.getId());
            }
        });
	}
}
