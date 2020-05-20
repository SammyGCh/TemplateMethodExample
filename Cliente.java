public class Cliente {
    private String nombre, rfc, direccion;
    private float saldo;

    public Cliente(String nombre, String rfc, String direccion, float saldo){
        this.nombre = nombre;
        this.rfc = rfc;
        this.direccion = direccion;
        this.saldo = saldo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setRfc(String rfc){
        this.rfc = rfc;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public String getNombre(){
        return this.nombre;
    }
    
    public String toString(){
        return "\nNombre: " + this.nombre + "\nRFC: " + this.rfc + "\nDirección: " + this.direccion +
        "\nSaldo: " + this.saldo; 
    }
}