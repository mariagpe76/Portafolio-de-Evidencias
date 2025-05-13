public class UnidadBomberos extends UnidadEmergencia{
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;

    public UnidadBomberos(String nombre, String nombreOperador){
        super(nombre);
        this.gps = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador(nombreOperador);
    }
    public void iniciarOperacion(){
        ActivarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }
    @Override
    public void responder(){
        System.out.println("🔥 Unidad de bomberos respondiendo a incendio estructural.");
    }
}
