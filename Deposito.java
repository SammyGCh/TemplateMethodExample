import java.time.LocalDate;

public class Deposito extends Operacion{
    
	private float cantidadDespositado;

	public Deposito(float cantidadDepositado){
		this.cantidadDespositado = cantidadDepositado;
	}

	public void realizarOperacion(){
		float nuevoSaldo = cliente.getSaldo() + this.cantidadDespositado;
		cliente.setSaldo(nuevoSaldo);
	}

	public void generarRecibo(){
		System.out.println("\nBanco: SSRA\n Fecha: "+ LocalDate.now() + "\nOperacion: Desposito\nCantidad: " +
		cantidadDespositado + "\nConcepto: Se realizó un desposito a " + cliente.getNombre());
    }
}