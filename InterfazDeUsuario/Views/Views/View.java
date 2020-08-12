/* ANDROID.VIEW.VIEW
	Proporciona clases que exponen las clases básicas de la interfaz de usuario que manejan el diseño de la pantalla y la interacción con el usuario.
	
	FORMA DE LA CLASE
		public class TextView 
		extends View implements ViewTreeObserver.OnPreDrawListener

	HERENCIA
		java.lang.Object
   			L> android.view.View

	SUBCLASES DIRECTAS
   		Button 				>>> Un elemento de la interfaz de usuario que el usuario puede tocar o hacer clic para realizar una acción.
		CheckedTextView		>>> Una extensión para TextViewque soporte la Checkable interfaz y las pantallas
		Chronometer			>>> Clase que implementa un simple temporizador.
		DigitalClock		>>> Esta clase está en desuso en el nivel de API 17. Se recomienda que use TextClocken su lugar.  
		EditText 			>>> Un elemento de la interfaz de usuario para ingresar y modificar texto. 
		TextClock			>>> TextClock puede mostrar la fecha y / o la hora actual como una cadena formateada.

	SUBCLASES INDIRECTAS
		AutoCompleteTextView 		>>> Una vista de texto editable que muestra sugerencias de finalización automáticamente mientras el usuario está escribiendo. 
		CheckBox					>>> Una casilla de verificación es un tipo específico de botón de dos estados que se puede marcar o no. 
		CompoundButton				>>> Un botón con dos estados, marcado y sin marcar. 
		ExtractEditText				>>> Especialización EditTextpara mostrar e interactuar con el texto extraído en un método de entrada de pantalla completa. 
		MultiAutoCompleteTextView 	>>> Una vista de texto editable, ampliable AutoCompleteTextView, que puede mostrar sugerencias de finalización para la subcadena del texto donde el usuario está escribiendo en lugar de necesariamente para todo. 
		RadioButton	 				>>> Un botón de opción es un botón de dos estados que se puede marcar o no. 
		switch 						>>> Un conmutador es un widget de conmutador de conmutación de dos estados que puede seleccionar entre dos opciones. 
		ToggleButton				>>> Muestra los estados marcados / no marcados como un botón con un indicador de "luz" y por defecto acompañado con el texto "ON" o "OFF". 