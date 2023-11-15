package Package_Cuenta;

import Excepciones.AñadirDinero;
import Excepciones.DineroDescubierto;
import Excepciones.DineroDescubiertoRetirar;
import Excepciones.NoClienteParticular;
import Excepciones.NoEdadValidaTerceraEdad;
import Excepciones.RetirarReintegro;
import Package_Cliente.Cliente;
import Package_Cliente.ClienteParticular;

public class CuentaTerceraEdad extends CuentaParticulares {
	
	/**
	 * Este constructor añade la cadena cuenta a los objetos de cuenta tercera edad que se creen.
	 */
	public CuentaTerceraEdad()
	{
		cadenaCuenta = "J00000000" + numeroCuenta;	
	}
	

	/**
	 * Este metodo sirve para validar que el cliente que recoja es un cliente particular, es decir, que el objeto que reciba sea un objeto de cliente particular.
	 * Posteriormente se hace una conversion de tipos para que poder comprobar si el cliente particular cumple las restricciones de una cuenta de terecra edad.
	 * @param client es donde estara almacenado el cliente que se quiera validar.
	 * @return verdadero o falso en el caso de que el cliente sea particular y de tercera edad o no lo sea.
	 * @throws Exception saltara en el caso de que el cliente no sea un cliente particular de terecera edad.
	 */
	protected boolean validarCliente(Cliente client) throws Exception
	{
		if(super.validarCliente(client))
		{
			ClienteParticular part = (ClienteParticular) client; 
			if(part.getEdad()>=65)
			{
				
				resultado = true;
				
			}
			else
			{
				throw new NoEdadValidaTerceraEdad(NO_EDAD_VALIDA_TERCERA_EDAD);
			}
		}
		else
		{
			throw new NoClienteParticular(NO_CLIENTE_PARTICULAR);
		}
		return resultado;
	}
	/**
	 * Este metodo en este caso es una especificacion del metodo setSaldo del padre, ya que en este hay que aplicarle ciertas restricciones de la cuenta tercera edad.
	 * @param saldo es el parametro que recoge lo que se le haya introducido al setSaldo.
	 * @throws Exception en el caso de que el saldo introducido no cumpla las restricciones.
	 */
	public void setSaldo(double saldo) throws Exception {
		if(saldo>=-1000)
		{
			this.saldo = saldo;
			saldoInicial=saldo;
			
		}
		else
		{
			throw new DineroDescubierto(DINERO_DESCUBIERTO);
		}
		
	}
	/**
	 * Este metodo IngresarDinero es una especificacion del ingresar dinero del padre, donde en este caso cumplira las restricciones especificas de la cuenta tercera edad.
	 * Una vez hecho eso se llamara al super del padre para que haga la opreacion de ingresar el dinero. 
	 * @param dineroIngresar es el parametro que recogera el dinero que se quiera ingresar para sumarselo al saldo.
	 * @throws Exception saltara en el caso de que no se cumpla alguna de la restricciones establecidas por la cuenta tercera edad.
	 */
	public void IngresarDinero(double dineroIngresar) throws Exception 
	{
		if(dineroIngresar<maximoImporte)
		{
			super.IngresarDinero(dineroIngresar);
		}
		else
		{
			throw new AñadirDinero(AÑADIR_DINERO);
		}
	}
	/**
	 * Este metodo retirarDinero es una especificacion del retirar dinero del padre, donde en este caso cumplira las restricciones especificas de la cuenta tercera edad.
	 * Una vez hecho eso se llamara al super del padre para que haga la opreacion de retirar el dinero. 
	 * @param dineroRetirar es el parametro que recogera el dinero que se quiera retirar para restarselo al saldo.
	 * @throws Exception saltara en el caso de que no se cumpla alguna de la restricciones establecidas por la cuenta tercera edad.
	 */
	public void retirarDinero(double dineroRetirar) throws Exception
	{
		
		if(dineroRetirar<maximoImporte)
		{
			if((saldo - dineroRetirar)>=-1000)
			{
				super.retirarDinero(dineroRetirar);
			}
			else
			{
				throw new DineroDescubiertoRetirar(DINERO_DESCUBIERTO_RETIRAR);
			}
			
		}
		else
		{
			throw new RetirarReintegro(RETIRAR_REINTEGRO);
		}	
	}
	

}
