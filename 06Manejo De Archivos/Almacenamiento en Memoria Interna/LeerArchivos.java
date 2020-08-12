public class MeminternaActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meminterna);
    }
    private  boolean existeArchivo(String[] archivos, String archivo) {
        for (int i=0; i<archivos.length; i++)
            if (archivo.equals(archivos[i])) return true; return false;
    }
    public void leerArchivo(View view) {
        String[] archivos = fileList(); // fileList():String[] >>> devulve una lista de archivos de la carpeta de alamacenamiento por defecto de la app

        String mi_archivo = "miarchvio.txt";
        String mi_contenido = "Este el el contenido del archivo";
        
        if (existeArchivo(archivos, mi_archivo)) {
            // leer el archivo - inicio
            try {
                InputStreamReader file = new InputStreamReader(openFileInput(mi_archivo)); // Abrimos el archivo
                BufferedReader br = new BufferedReader(file); // creamos una memoria de almacenamiento temporal donde estara el archivo que abrimos
                String linea_leida = br.readLine(); // leemos y almacenamos linea por linea
                String texto = ""; // creamos una variable (texto) donde se almacenara todo lo leido
                while(linea_leida != null) { // con un bucle asignamos a la variable (texto)
                    texto += linea_leida + "\n";   // cada linea leida
                    linea_leida = br.readLine();
                }
                br.close(); // cerramos el buffer creado
                file.close(); // cerramos el archivo que abrimos

            } catch(IOExeption e) {
                Log.d("ERROR_LEER", e.toString());
            }
            // leer el archivo - final
        } else {
            Toast.makeText(this, "El archivo no existe", Toast.LENGTH_SHORT).show();
        }
    }
}