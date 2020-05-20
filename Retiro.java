import java.time.LocalDate;
import java.util.Scanner;

public class Retiro extends Operacion{
    private float cantidadRetirada;

	public Retiro(float cantidadRetirada){
		this.cantidadRetirada = cantidadRetirada;
	}

	public void realizarOperacion(){
		float nuevoSaldo = cliente.getSaldo() - this.cantidadRetirada;
		cliente.setSaldo(nuevoSaldo);
	}

	public void generarRecibo(){
		System.out.println("\nBanco: SSRA\n Fecha: "+ LocalDate.now() + "\nOperacion: Retiro\nCantidad: " +
		this.cantidadRetirada + "\nConcepto: Se realizó un retiro a " + cliente.getNombre());
    }
    
    public boolean deseaDonar(){

        Scanner leer = new Scanner(System.in);
        String respuesta;
        boolean deseaDonar = false;

        System.out.println("\nDesea donar $20 a la fundacion contra la pobreza extrema? (Y/N)\n");
        System.out.println("Respuesta: ");
        respuesta = leer.nextLine();
        
        if(respuesta.equals("Y") || respuesta.equals("y")){
            deseaDonar = true;
        }

        return deseaDonar;
    }
}