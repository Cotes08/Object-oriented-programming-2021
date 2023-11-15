package Package_Cuenta;
import Excepciones.AñadirDinero;
import Excepciones.IngresoJoven;
import Excepciones.NoClienteParticular;
import Excepciones.NoEdadValidaJoven;
import Excepciones.RetirarMitad;
import Excepciones.RetirarReintegro;
import Excepciones.SaldoMaxJoven;
import Package_Cliente.Cliente;
import Package_Cliente.ClienteParticular;

public class CuentaJoven extends CuentaParticulares{
	
	
	/**
	 * Este constructor añade la cadena cuenta a los objetos de cuenta joven que se creen.
	 */
	public CuentaJoven()
	{
		cadenaCuenta = "P00000000" + numeroCuenta;
	}
	
	/**
	 * Este metodo sirve para validar que el cliente que recoja es un cliente particular, es decir, que el objeto que reciba sea un objeto de cliente particular.
	 * Posteriormente se hace una conversion de tipos para que poder comprobar si el cliente particular cumple las restricciones de una cuenta joven.
	 * @param client es donde estara almacenado el cliente que se quiera validar.
	 * @return verdadero o falso en el caso de que el cliente sea particular y joven o no lo sea.
	 * @throws Exception saltara en el caso de que el cliente no sea un cliente particular joven.
	 */
	protected boolean validarCliente(Cliente client) throws Exception
	{
		if(super.validarCliente(client))
		{
			ClienteParticular part = (ClienteParticular) client; 
			if(part.getEdad()>=18 && part.getEdad()<=34)
			{
				
				resultado = true;
				
			}
			else
			{
				throw new NoEdadValidaJoven(NO_EDAD_VALIDA_JOVEN);
			}
		}
		else
		{	resultado = false;
			throw new NoClienteParticular(NO_CLIENTE_PARTICULAR);
		}
		return resultado;
	}
	
	/**
	 * Este metodo en este caso es una especificacion del metodo setSaldo del padre, ya que en este hay que aplicarle ciertas restricciones de la cuenta joven.
	 * @param saldo es el parametro que recoge lo que se le haya introducido al setSaldo.
	 * @throws Exception en el caso de que el saldo introducido no cumpla las restricciones.
	 */
	public void setSaldo(double saldo) throws Exception {
		if(saldo<=15000)
		{
			this.saldo = saldo;
			saldoInicial=saldo;
			
		}
		else
		{
			throw new SaldoMaxJoven(SALDO_MAX_JOVEN);
		}
		
	}
	/**
	 * Este metodo IngresarDinero es una especificacion del ingresar dinero del padre, donde en este caso cumplira las restricciones especificas de la cuenta joven.
	 * Una vez hecho eso se llamara al super del padre para que haga la opreacion de ingresar el dinero. 
	 * @param dineroIngresar es el parametro que recogera el dinero que se quiera ingresar para sumarselo al saldo.
	 * @throws Exception saltara en el caso de que no se cumpla alguna de la restricciones establecidas por la cuenta particular.
	 */
	public void IngresarDinero(double dineroIngresar) throws Exception 
	{
		if(dineroIngresar<maximoImporte)
		{
			if((dineroIngresar+saldo)<=15000)
			{
				super.IngresarDinero(dineroIngresar);
			}
			else
			{
				throw new IngresoJoven(INGRESO_JOVEN);
			}
		}
		else
		{
			throw new AñadirDinero(AÑADIR_DINERO);
		}
	}
	
	/**
	 * Este metodo retirarDinero es una especificacion del retirar dinero del padre, donde en este caso cumplira las restricciones especificas de la cuenta joven.
	 * Una vez hecho eso se llamara al super del padre para que haga la opreacion de retirar el dinero. 
	 * @param dineroRetirar es el parametro que recogera el dinero que se quiera retirar para restarselo al saldo.
	 * @throws Exception saltara en el caso de que no se cumpla alguna de la restricciones establecidas por la cuenta joven.
	 */
	public void retirarDinero(double dineroRetirar) throws Exception
	{	
		if(dineroRetirar<maximoImporte)
		{
			if(dineroRetirar<=(saldo*0.5))
			{
				super.retirarDinero((dineroRetirar*0.02)+dineroRetirar);
			}
			else
			{
				throw new RetirarMitad(RETIRAR_MITAD);
			}
		}
		else
		{
			throw new RetirarReintegro(RETIRAR_REINTEGRO);
		}
	}
	

		
}	




