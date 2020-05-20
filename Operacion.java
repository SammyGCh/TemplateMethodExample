public abstract class Operacion {
    protected Cliente cliente;

	public Operacion(){

	}

	//Template Method
	public final void realizarOperacionBancaria(Cliente cliente){
		consultarDatosCliente(cliente);
		realizarOperacion();
		generarRecibo();
		if(deseaDonar()){
			donar();
		}
	}

	public void consultarDatosCliente(Cliente cliente){
		this.cliente = cliente;
	}

	public boolean deseaDonar(){
		return false;
	}

	public void donar(){
		float nuevoSaldo = cliente.getSaldo() - 20;
		cliente.setSaldo(nuevoSaldo);
	}

	//Métodos que van a implementar las subclases

	public abstract void generarRecibo();

	public abstract void realizarOperacion();
}