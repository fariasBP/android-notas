/*PUTEXTRA - PASANDO INFORMACION DE UNA ACTIVIDAD A OTRA
	Veremos como pasar informacion de una acitvidad a otra
	TEMAS:
		- putExtra(<String clave>, <Any valor>) >>> Añadir datos extendidos a la intención.
*/

// PARA ENVIAR DATOS a la actividad que se cambiara
	Intent i = new Intent(this, CategoriesActivity.class);
    i.putExtra("Nombre_o_clave", "datos");

// PARA RECIBIR DATOS de la actividad que se cambio
    Bundle datos = getIntent().getExtras();
    int mis_datos = datos.getInt("Nombre_o_clave");