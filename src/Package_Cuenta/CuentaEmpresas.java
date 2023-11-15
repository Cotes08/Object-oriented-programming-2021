package Package_Cuenta;

import Excepciones.CuentaEmpresa;
import Excepciones.FacturaAnual;
import Excepciones.NoAsignar;
import Package_Cliente.Cliente;
import Package_Cliente.ClienteEmpresa;

public class CuentaEmpresas extends Cuenta{
	
	/**
	 * Este constructor añade la cadena cuenta a los objetos de cuenta empresa que se creen.
	 */
	public CuentaEmpresas()
	{
		cadenaCuenta = "E00000000" + numeroCuenta;
	}
	

	/**
	 * Este metodo sirve para validar que el cliente que recoja es un cliente empresa, es decir, que el objeto que reciba sea un objeto de cliente empresa.
	 * Posteriormente se hace una conversion de tipos para que poder comprobar si el cliente empresa cumple las restricciones de una cuenta empresa.
	 * @param client es donde estara almacenado el cliente que se quiera validar.
	 * @return verdadero o falso en el caso de que el cliente sea empresa o no lo sea.
	 * @throws Exception saltara en el caso de que el cliente no sea un cliente empresa.
	 */
	protected boolean validarCliente(Cliente client) throws Exception
	{
		if(client instanceof ClienteEmpresa)
		{	
			
			resultado = true;
		}
		else
		{
			resultado = false;
			throw new CuentaEmpresa(CUENTA_EMPRESA);		
		}
		return resultado;
	}
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
	 * Este metodo IngresarDinero es una especificacion del ingresar dinero del padre, donde en este caso cumplira las restricciones especificas de la cuenta empresas.
	 * Una vez hecho eso se llamara al super del padre para que haga la opreacion de ingresar el dinero. 
	 * @param dineroIngresar es el parametro que recogera el dinero que se quiera ingresar para sumarselo al saldo.
	 * @throws Exception saltara en el caso de que no se cumpla alguna de la restricciones establecidas por la cuenta empresas.
	 */
	public void IngresarDinero(double dineroIngresar) throws Exception 
	{
			super.IngresarDinero(dineroIngresar);
	}
	/**
	 * Este metodo retirarDinero es una especificacion del retirar dinero del padre, donde en este caso cumplira las restricciones especificas de la cuenta empresas.
	 * Una vez hecho eso se llamara al super del padre para que haga la opreacion de retirar el dinero. 
	 * @param dineroRetirar es el parametro que recogera el dinero que se quiera retirar para restarselo al saldo.
	 * @throws Exception saltara en el caso de que no se cumpla alguna de la restricciones establecidas por la cuenta empresas.
	 */
	public void retirarDinero(double dineroRetirar) throws Exception
	{
		ClienteEmpresa Empr = (ClienteEmpresa) cliente;
		double FacturaAnual = 0;
		FacturaAnual = Empr.getFacturacionAnual();
		
		if(Empr.getTipoEmpresa()==PYME)
		{
			if(dineroRetirar<=(FacturaAnual*0.1))
			{
				if(saldo<5000)
				{
					super.retirarDinero((dineroRetirar*0.1)+dineroRetirar);
				}
				else
				{
					super.retirarDinero(dineroRetirar);
				}
			}
			else
			{
				throw new FacturaAnual(FACTURA_ANUAL);
			}
		}
		else if(Empr.getTipoEmpresa()==GRAN_EMPRESA)
		{
			if(saldo<5000)
			{
				super.retirarDinero((dineroRetirar*0.1)+dineroRetirar);
			}
			else
			{
				super.retirarDinero(dineroRetirar);
			}
		}
	}
	
	
	
}
