
public void onPause() {
	super.onPause();
	SharedPreferences datos = PreferenceManager.getDefaultSharedPreferences(this);
	SharedPreferences.Editor mieditor = datos.edit();

	mieditor.putString("clave", output.getText().toString());
	mieditor.apply();
}
public void onResume() {
	super.onResume();
	SharedPreferences datos = PreferenceManager.getDefaultSharedPreferences(this);
	output.setText(datos.getString("clave", "no data"));
}