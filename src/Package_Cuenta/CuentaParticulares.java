package Package_Cuenta;
import Excepciones.AñadirDinero;
import Excepciones.IngresoMinimo;
import Excepciones.NoAsignar;
import Excepciones.NoClienteParticular;
import Excepciones.RetirarReintegro;
import Package_Cliente.Cliente;
import Package_Cliente.ClienteParticular;

public class CuentaParticulares extends Cuenta{
	
	/**
	 * Este constructor añade la cadena cuenta a los objetos de cuenta particular que se creen.
	 */
	public CuentaParticulares()
	{
		cadenaCuenta = "T00000000" + numeroCuenta;
	}
	
	
	/**
	 * Este metodo sirve para validar que el cliente que recoja es un cliente particular, es decir, que el objeto que reciba sea un objeto de cliente particular
	 * @param client es donde estara almacenado el cliente que se quiera validar.
	 * @return verdadero o falso en el caso de que el cliente sea particular o no.
	 * @throws Exception saltara en el caso de que el cliente no sea particular.
	 */
	protected boolean validarCliente(Cliente client) throws Exception
	{
		if(client instanceof ClienteParticular)
		{
			resultado = true;
			
			
			
		}
		else
		{
			resultado = false;
			throw new NoClienteParticular(NO_CLIENTE_PARTICULAR);		
		}
		return resultado;	
	}
	
	/**
	 * Este metodo es igual que el setCliente de la clase cuenta, pere en este caso dentro tiene un if que valida si es cliente particular o no.
	 * @param client es donde se almacenara el cliente que se quiere establecer a la variable global cliente.
	 * @throws Exception saltara cuando el cliente no sea particular.
	 */
	public void setCliente(Cliente client) throws Exception 
	{
		if(validarCliente(client))
		{
			cliente=client;
		}
		else
		{
			throw new NoAsignar(NO_ASIGNAR);
		}
	}

	/**
	 * Este metodo IngresarDinero es una especificacion del ingresar dinero del padre, donde en este caso cumplira las restricciones especificas de la cuenta particular.
	 * Una vez hecho eso se llamara al super del padre para que haga la opreacion de ingresar el dinero. 
	 * @param dineroIngresar es el parametro que recogera el dinero que se quiera ingresar para sumarselo al saldo.
	 * @throws Exception saltara en el caso de que no se cumpla alguna de la restricciones establecidas por la cuenta particular.
	 */
	public void IngresarDinero(double dineroIngresar) throws Exception 
	{	
		if(dineroIngresar<10)
		{
			throw new IngresoMinimo(INGRESO_MINIMO);
		}
		else if(dineroIngresar<maximoImporte)
		{
			super.IngresarDinero(dineroIngresar);
		}
		else
		{
			throw new AñadirDinero(AñADIR_DINERO);
		}
	}

	/**
	 * Este metodo retirarDinero es una especificacion del retirar dinero del padre, donde en este caso cumplira las restricciones especificas del cliente particular.
	 * Una vez hecho eso se llamara al super del padre para que haga la opreacion de retirar el dinero. 
	 * @param dineroRetirar es el parametro que recogera el dinero que se quiera retirar para restarselo al saldo.
	 * @throws Exception saltara en el caso de que no se cumpla alguna de la restricciones establecidas por la cuenta particular.
	 */
	public void retirarDinero(double dineroRetirar) throws Exception
	{
		if(dineroRetirar<maximoImporte)
		{
			super.retirarDinero((dineroRetirar*0.05)+dineroRetirar);
		}
		else
		{
			throw new RetirarReintegro(RETIRAR_REINTEGRO);
		}
	}
}
