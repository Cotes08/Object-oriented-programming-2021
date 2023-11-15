package Package_Cuenta;

import java.util.ArrayList;
import Excepciones.RetirarDinero;
import Package_Cliente.Cliente;

public abstract class Cuenta {
	
	
	public static final String AÑADIR_DINERO = ("No puedes ingresar mas de 1000 euros");
	public static final String RETIRAR_DINERO = ("No puedes retirar mas dinero del que hay en la cuenta");
	public static final String RETIRAR_REINTEGRO = ("No puedes retirar mas de 1000 euros");
	public static final String NO_ASIGNAR = ("No se puede asignar el cliente");
	public static final String INGRESO_MINIMO  = ("No se permiten ingresos de menos de 10 euros");
	public static final String NO_CLIENTE_PARTICULAR = ("El cliente ingresado no es un cliente particular");
	public static final String NO_EDAD_VALIDA_JOVEN = ("El cliente no tiene una edad entre 18 y 34 años");
	public static final String INGRESO_JOVEN = ("No se puede hacer un ingreso que haga que tu cuenta supere los 15000 euros");
	public static final String SALDO_MAX_JOVEN = ("La cuenta no puede tener mas de 15000 euros");
	public static final String RETIRAR_MITAD = ("No se pude retirar mas de la mitad del dinero de la cuenta");
	public static final String NO_EDAD_VALIDA_TERCERA_EDAD = ("El cliente no tiene una edad superior a 65 años");
	public static final String DINERO_DESCUBIERTO = ("No puede haber un descubierto de mas de 1000 euros");
	public static final String DINERO_DESCUBIERTO_RETIRAR = ("No puedes retiar mas dinero del que la cuenta te permite");
	public static final String CUENTA_EMPRESA = ("El cliente ingresado no es un cliente empresa");
	public static final String PYME = ("Pyme");
	public static final String GRAN_EMPRESA= ("Gran Empresa");
	public static final String FACTURA_ANUAL = ("En una empresa Pyme no se puede retirar mas de un 10% de la facturación anual");
	public static final String NO_DINERO = ("No puedes retirar mas dinero del que hay en la cuenta");
	public static final String CONCEPTO = ("Concepto");
	public static final String ABONO = ("ABONO");
	public static final String CARGO = ("CARGO");
	public static final String ESPACIO = ("\n");
	public static final String NUMERO_CUENTA = ("Numero de la cuenta: ");
	public static final String MOVIMIENTOS = ("Movimientos realizados: ");
	
	
	protected int numeroCuenta =1;
	protected static int contador_1 = 1;
	protected String cadenaCuenta;
	protected Cliente cliente;
	protected double saldo;
	protected double saldoInicial = 0;
	boolean resultado = false;
	protected static final int maximoImporte = 1000;
	private ArrayList<Movimiento> arrayMovimiento = new ArrayList<Movimiento>();
	
	/**
	 * Este constructor sirve para tener un contador global de todos los objetos que se creen.
	 */
	public Cuenta() 
	{
		numeroCuenta = contador_1;
		contador_1++;
	}
	
	/**
	 * Este es el metodo toString que utilizaremos para poder imprimir en el main los datos de los clientes.
	 * @return string nos decolvera la cadena string con todos los datos.
	 */
	public String toString()
	{
		String string;
		
		string = ESPACIO + "Numero de la cuenta: " + cadenaCuenta;
		for(int i = 0; i < arrayMovimiento.size(); i++)
		{
			string = string + ESPACIO + MOVIMIENTOS + (i+1) + arrayMovimiento.get(i).toString()+"\n";
		}
		return string;
	}
	
	
	
	/**
	 * Este es el metodo padre de IngresarDinero, donde dentro de el establecemos el saldo inicial y cada vez que se llame a este metodo se le pasara un parametro
	 * y ese parametro se sumara al saldo.
	 * @param dineroIngresar es el parametro que recogera el dinero que se quiera ingresar para sumarselo al saldo.
	 * @throws Exception en el caso de que en alguna cuenta haya un limite de ingreso saltara la excepcion.
	 */
	protected void IngresarDinero(double dineroIngresar) throws Exception 
	{
		
		
		saldo = saldoInicial + dineroIngresar;
		Movimiento Ingresar = new Movimiento(saldoInicial, ABONO, dineroIngresar, saldo, CONCEPTO);
		arrayMovimiento.add(Ingresar);
	}
	

	/**
	 * Este es el metodo padre de retirarDinero, donde dentro de el establecemos el saldo inicial y cada vez que se llame a este metodo se le pasara un parametro
	 * y ese parametro se restara al saldo.
	 * @param dineroRetirar es el parametro que recogera el dinero que se quiera retirar para restarselo al saldo.
	 * @throws Exception en el caso de que en alguna cuenta haya un limite de retirar dinero, saltara la excepcion.
	 */
	protected void retirarDinero(double dineroRetirar) throws Exception
	{
		
	
		if(dineroRetirar<saldo)
		{
			saldo = saldoInicial - dineroRetirar;
			Movimiento Retirar = new Movimiento(saldoInicial, CARGO, dineroRetirar, saldo, CONCEPTO);
			arrayMovimiento.add(Retirar);
		}
		else
		{
			throw new RetirarDinero(RETIRAR_DINERO);
		}	
	}
	/**
	 * Este metodo getSaldo lo que hace es devolvernos lo que haya dentro de la variable saldo.
	 * @return saldo hace que cuando llamemos al getSaldo nos retorne lo que haya dentro de saldo.
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * El metodo setSaldo es para establecer el valor de un parametro.
	 * @param saldo es el parametro que recoge lo que se le haya introducido al setSaldo.
	 * @throws Exception en el caso de que el saldo introducido no sea correcto.
	 */
	public void setSaldo(double saldo) throws Exception {
		
		this.saldo = saldo;
		saldoInicial=saldo;
	}
	/**
	 * Este metodo getCliente lo que hace es devolvernos lo que haya dentro de la variable cliente.
	 * @return cliente hace que cuando llamemos al getCliente nos retorne lo que haya dentro de cliente.
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * El metodo setCliente es para establecer el valor de un parametro.
	 * @param cliente es el parametro que recoge lo que se le haya introducido al setCliente.
	 * @throws Exception en el caso de que el cliente introducido no sea correcto.
	 */
	public void setCliente(Cliente cliente) throws Exception {
		this.cliente = cliente;
	}
}
