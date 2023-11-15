package Package_Cuenta;

import java.time.LocalDate;

public class Movimiento{
	
	public static final String ESPACIO = ("\n");
	public static final String SALDO_INICIAL = ("Saldo inicial: ");
	public static final String FECHA_MOVIMIENTO = ("Fecha del movimiento: ");
	public static final String CARGO = ("Operacion cargo o abono: ");
	public static final String IMPORTE_CARGO = ("Dinero retirado o abonado: ");
	public static final String SALDO_FINAL = ("Saldo restante tras la operacion: ");
	public static final String CONCEPTO = ("Concepto del movimiento: ");
	
	private LocalDate fecha;
	private double importeInicial=0;
	private String cargo;
	private double importeCargo=0;
	private double saldoFinal=0;
	private String concepto;
	
	
	/**
	 * Este es el constructor de la calse movimiento, es decir, cada vez que se cree un objeto pedira que se le pasen una serie de parametros, que estan instanciados en el constructor.
	 * Estos parametros instanciados asignaran la variable a las variables de la clase movimiento.
	 * @param importeInicial recibira el importe inicial de la cuenta en cuestion.
	 * @param cargo o abono, dependiendo de si se ingresa o retira dinero.
	 * @param importeCargo el dinero que se ha ingresado o retirado.
	 * @param saldoFinal el saldo restante tras la operacion.
	 * @param concepto es el mensaje que se quiera poner.
	 */
	public Movimiento(double importeInicial, String cargo, double importeCargo, double saldoFinal, String concepto)
	{
		fecha = LocalDate.now();
		this.importeInicial=importeInicial;
		this.cargo=cargo;
		this.importeCargo=importeCargo;
		this.saldoFinal=saldoFinal;
		this.concepto=concepto;
	}
	
	/**
	 * Este es el metodo toString que utilizaremos para poder imprimir en el main los datos de los clientes.
	 * @return string nos decolvera la cadena string con todos los datos.
	 */
	public String toString()
	{
		String string;
		
		string = ESPACIO + FECHA_MOVIMIENTO + fecha;
		string = string + ESPACIO + SALDO_INICIAL + importeInicial;
		string = string + ESPACIO + CARGO + cargo;
		string = string + ESPACIO + IMPORTE_CARGO + importeCargo;
		string = string + ESPACIO + SALDO_FINAL + saldoFinal;
		string = string + ESPACIO + CONCEPTO + concepto;
		 return string;
	}
	
	
	/**
	 * Este metodo devuelve la fecha cuando lo llamamos.
	 * @return la fecha que anteriormente fue introducida.
	 */
	public LocalDate getFecha() {
		return fecha;
	}
	/**
	 * Este metodo devuelve el importeInicial cuando lo llamamos.
	 * @return retorna el importeInicial que anteriormente fue introducido.
	 */
	public double getImporteInicial() {
		return importeInicial;
	}
	/**
	 * Este metodo sirve para asignar un valor a la variable importeInicial.
	 * @param importeInicial es el parametro que le pasamos para que nos lo asigne a las variable global
	 */
	public void setImporteInicial(double importeInicial) {
		this.importeInicial = importeInicial;
	}
	/**
	 * Este metodo devuelve el cargo cuando lo llamamos.
	 * @return retorna el cargo que anteriormente fue introducido.
	 */
	public String getCargo() {
		return cargo;
	}
	/**
	 * Este metodo sirve para asignar un valor a la variable cargo.
	 * @param cargo es el parametro que le pasamos para que nos lo asigne a las variable global
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	/**
	 * Este metodo devuelve el importeCargo cuando lo llamamos.
	 * @return retorna el importeCargo que anteriormente fue introducido.
	 */
	public double getImporteCargo() {
		return importeCargo;
	}
	/**
	 * Este metodo sirve para asignar un valor a la variable importeCargo.
	 * @param importeCargo es el parametro que le pasamos para que nos lo asigne a las variable global
	 */
	public void setImporteCargo(double importeCargo) {
		this.importeCargo = importeCargo;
	}
	/**
	 * Este metodo devuelve el saldoFinal cuando lo llamamos.
	 * @return retorna el saldoFinal que anteriormente fue introducido.
	 */
	public double getSaldoFinal() {
		return saldoFinal;
	}
	/**
	 * Este metodo sirve para asignar un valor a la variable saldoFinal.
	 * @param saldoFinal es el parametro que le pasamos para que nos lo asigne a las variable global
	 */
	public void setSaldoFinal(double saldoFinal) {
		this.saldoFinal = saldoFinal;
	}
	/**
	 * Este metodo devuelve el concepto cuando lo llamamos.
	 * @return retorna el concepto que anteriormente fue introducido.
	 */
	public String getConcepto() {
		return concepto;
	}
	/**
	 * Este metodo sirve para asignar un valor a la variable concepto.
	 * @param concepto es el parametro que le pasamos para que nos lo asigne a las variable global
	 */
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}	
}
