public class MemexternaActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memexterna);
    }

    public void leerArchivo2(View view) {
        String mi_archivo = "mi_archivo.txt";

        File tarjeta = Environment.getExternalStorageDirectory();
        File path = new File(tarjeta.getAbsolutePath(), mi_archivo);
        if(path.exists()) {
            try {
                FileInputStream fin = new FileInputStream(path);
                InputStreamReader file = new InputStreamReader(fin);
                BufferedReader br = new BufferedReader(file);
                String linea_leida = br.readLine();
                String texto = "";
                Log.d("CONSOLE", linea_leida);
                while (linea_leida != null) {
                    texto += linea_leida + "\n";
                    linea_leida = br.readLine();
                }
                br.close();
                file.close();
                
                Log.d("CONTENIDO DEL ARCHIVO:", texto);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            Log.d("CONSOLE", "El arvhivo no existe");
            Toast.makeText(this, "El archivo no existe", Toast.LENGTH_SHORT).show();
        }
    }
}
