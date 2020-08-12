public class MeminternaActivity extends AppCompatActivity {
    private String contenido;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meminterna);

        contenido = "Este es el contenido deseado";
    }
    private  boolean existeArchivo(String[] archivos, String archivo) {
        for (int i=0; i<archivos.length; i++)
            if (archivo.equals(archivos[i])) return true; return false;
    }
    public void escribirArchivo(View view) {
        String archivo = "mipruebaja";
        try {
            OutputStreamWriter file = new OutputStreamWriter(openFileOutput(archivo, MODE_PRIVATE)); // Abrimos el archivo o se crea si no existe
            file.write("[{\"pregunta\":\"que es la materia\", \"respuesta\":\"Es todo aquello que ocupa un lugar en el escpacio\"}]"); // escribimos en el archivo
            file.flush();
            file.close(); // cerramos el archivo
        } catch (IOException e) {
            Log.d("ESCRIBIRARCHIVO", e.toString());
        }
        Toast.makeText(this, "Archivo Escrito", Toast.LENGTH_SHORT);
    }
}