// OBTENER DIMENCIONES DE LA PANTALLA

// Forma Popular

	DisplayMetrics metrics = new DisplayMetrics();
	getWindowManager().getDefaultDisplay().getMetrics(metrics);
	int width = metrics.widthPixels; // ancho absoluto en pixels 
	int height = metrics.heightPixels; // alto absoluto en pixels

// Forma Rapida

	int widthPixels = getResources().getDisplayMetrics().widthPixels;
	int heightPixels = getResources().getDisplayMetrics().heightPixels; 

// Forma Recomendada

	Display display = getWindowManager().getDefaultDisplay();    
    if (Build.VERSION.SDK_INT > Build.VERSION_CODES.HONEYCOMB_MR1) {  // > API 12
        Point size = new Point();
        display.getSize(size);
        width = size.x;
        height = size.y;
    } else {
        width   = display.getWidth();
        height  = display.getHeight();
    }