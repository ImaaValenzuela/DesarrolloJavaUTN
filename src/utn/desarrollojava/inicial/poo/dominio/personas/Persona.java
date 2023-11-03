package utn.desarrollojava.inicial.poo.dominio.personas;

public class Persona {
    private String nombre;
    private String apellido;
    private String numeroDocumento;      // No se realiza operaciones con este numero, es preferible hacerlo String
    private TipoDocumento tipoDocumento;
    private int cantDiasPresente;

    public Persona(String nombre, String apellido, String numeroDocumento, TipoDocumento tipoDocumento, int cantDiasPresente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
        this.tipoDocumento = tipoDocumento;
        this.cantDiasPresente = cantDiasPresente;
    }

    public String presentate(){
        return "Mi nombre es " + this.nombre + " " + this.apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getCantDiasPresente() {
        return cantDiasPresente;
    }

    public void setCantDiasPresente(int cantDiasPresente) {
        this.cantDiasPresente = cantDiasPresente;
    }
}
