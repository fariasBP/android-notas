public class MemexternaActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memexterna);
    }

    public void escribirArchivo2(View view) {
        String archivo = "mi_archivo.txt";
        String contenido = "Este es el contenido \nde mi archivo";
        try {
            File tarjeta = Environment.getExternalStorageDirectory();
            File path = new File(tarjeta.getAbsolutePath(), archivo);
            OutputStreamWriter file = new OutputStreamWriter(new FileOutputStream(path));
            file.write(contenido);
            file.flush();
            file.close();

            Log.d("CONSOLE", "archivo escrito");
            Toast.makeText(this, "Archivo Escrito", Toast.LENGTH_SHORT);
        } catch (IOException e) {
            Log.d("CONSOLE", "Error al escribir archivo: " + e.toString());
            Toast.makeText(this, "Error al escribir archivo", Toast.LENGTH_SHORT);
        }

    }
}
