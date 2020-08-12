

// CREAR CARPETA
	File nuevaCarpeta = new File(Environment.getExternalStorageDirectory(), "carpeta/subcarpeta");
    if (!nuevaCarpeta.mkdirs()) {
        Log.e("DIRECTORIO:", "carpeta(s) no creado(s)");
    }

// OBTENER LOS ARCHIVOS DENTRO DE UNA CARPETA
	File nuevaCarpeta = new File(Environment.getExternalStorageDirectory(), "miCarpetaPrueba");
	File[] archivos = nuevaCarpeta.listFiles();
	String archivo1 = archivos[0].getName();
	String archivo2 = archivos[1].getName();
	Log.e("archivo 1", archivo1);

// TRABAJAR CON LA CARPETA RAIZ DE LA MEMORIA EXTERNA
	File tarjeta = Environment.getExternalStorageDirectory();

// TRABAJAR CON LA CARPETA DE LA APP DE LA MEMORIA EXTERNA
	File tarjeta = getExternalFilesDir(null);

