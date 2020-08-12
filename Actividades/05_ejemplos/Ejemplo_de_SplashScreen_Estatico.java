/* CAMBIANDO DE ACTIVIDADES
    TEMAS:
        - finish >>> metodo que finaliza una actividad

        - TimerTask >>> Una tarea que puede ser programada para una sola vez o ejecución repetida
        por un temporizador.
        - Intent >>> Es un objeto de acción que puedes usar para solicitar una acción de otro 
        componente de la aplicación. Aunque las intents facilitan la comunicación entre los 
        componentes de muchas maneras, existen tres casos de uso fundamentales:
            -Para comenzar una actividad: Una Activity representa una única pantalla en una 
            aplicación. Puedes iniciar una nueva instancia de una Activity pasando una Intent
             a startActivity(). La Intent describe la actividad que se debe iniciar y contiene 
             los datos necesarios para ello. 
                Si deseas recibir un resultado de la actividad cuando finalice, llama a 
                startActivityForResult(). La actividad recibe el resultado como un objeto Intent 
                separado en el callback de onActivityResult() de la actividad. Para obtener más 
                información, consulta la guía Actividades.
            -Para iniciar un servicio: Un Service es un componente que realiza operaciones en 
            segundo plano sin una interfaz de usuario. Puede iniciar un servicio para realizar 
            una operación única (como descargar un archivo) pasando una Intent a startService(). 
            La Intent describe el servicio que se debe iniciar y contiene los datos necesarios para ello.
                Si el servicio está diseñado con una interfaz cliente-servidor, puedes establecer
                un enlace con el servicio de otro componente pasando una Intent a bindService(). 
                Para obtener más información, consulte la guía Servicios.
            -Para entregar un mensaje: Un mensaje es un aviso que cualquier aplicación puede recibir.
            El sistema entrega varios mensajes de eventos del sistema, como cuando el sistema arranca 
            o el dispositivo comienza a cargarse. Puedes enviar un mensaje a otras apps pasando una 
            Intent a sendBroadcast(), sendOrderedBroadcast() o sendStickyBroadcast().
        - Timer >>> Un recurso para subprocesos para programar tareas para la ejecución futura en un 
        subproceso en segundo plano. Las tareas pueden programarse para ejecución única o para 
        ejecución repetida a intervalos regulares.
*/
    TimerTask tarea = new TimerTask() {// este solo es una tarea
        public void run() {
            // cambiando de activities en este caso "Intent" sera el responsable para cambiar de actividades
            Intent cambiarActivity = new Intent(splashActivity.this, MainActivity.class);
            startActivity(cambiarActivity);
            // Finalizar la actividad (si no se hace esta accion, con el boton de atras del celular volvera)
            finish();
        }
    };
    // contador para ejecutar una tarea
    Timer tiempo= new Timer();
    tiempo.schedule(tarea, 2000);

/*
    ANEXO:
        - Si se desea un ejemplo de un splash screen dinamico, es decir un splashscreen que carga otra
        activity. Esta se encutra en los ejemplo de Hilos.
*/