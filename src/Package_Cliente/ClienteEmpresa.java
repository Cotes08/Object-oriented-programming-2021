package Package_Cliente;

import Excepciones.NumerosyLetras;
import Excepciones.PasswordMenor;

public class ClienteEmpresa extends Cliente{
	
	
	
	protected String razonSocial; // Sociedad limitada. sociedad anonima....
	protected String domicilioSocial;
	protected String nombreEmpresa;//Nombre empresa
	protected String fechaCreacion;//Fecha cualquiera
	protected String tipoEmpresa; //Pyme, Gran empresa....
	protected double facturacionAnual;
	
	/**
	 * Este es el metodo toString que utilizaremos para poder imprimir en el main los datos de los clientes.
	 * @return string nos decolvera la cadena string con todos los datos.
	 */
	public String toString()
	{
		
		String string;
		
		string = super.toString();
		string = string + ESPACIO + RAZON_SOCIAL + razonSocial;
		string = string + ESPACIO + DOMICILIO_SOCIAL + domicilioSocial;
		string = string + ESPACIO + NOMBRE_EMPRESA+ nombreEmpresa;
		string = string + ESPACIO + FECHA_DE_CREACION + fechaCreacion;
		string = string + ESPACIO + TIPO_DE_EMPRESA + tipoEmpresa;
		string = string + ESPACIO + FACTURACION_ANUAL + facturacionAnual;
		return string;
	}
	
	/**
	 * Este metodo de validar identificacion sirve para validar si el dni del usuario es valido o no.
	 * @param dni es el parametro que se le pasa donde dentro contendra el dni a validar.
	 * @return nos devuelve el dni validado
	 */
	protected boolean ValidarIdentificacion(String cif) {
				ValiadorCIF validador = new ValiadorCIF();
				return validador.isvalido(cif);
	}
	
	/**
	 * Este metodo validar password tiene la funcion de coger la contraseña que recibe y ver si es valida. 
	 * @param contrasena es la variable que tiene almacenada la contraseña que se quiere validar
	 * @return resultado, nos devuelve veradero o falso en el caso de que la validacion sea correcta o erronea.
	 */
	public boolean ValidarPassword(String contrasena) throws Exception
	{
		int longitud = 0;
		int numascii = 0;
		int num_letras = 0;
		int num_numeros = 0;
		int num_total= 0;
		
		longitud = contrasena.length();
	
			if(!super.ValidarPassword(contrasena))
			{
				throw new PasswordMenor (PASSWORD_MAYOR);	
			}
			else
			{
				for(int i=0; i<longitud; i++)
				{
					char caracter= contrasena.charAt(i);
					numascii = (int) caracter;

					if( numascii>=65 && numascii<=90 ||numascii>=97 && numascii<=122 )
					{
						num_letras = 1;	
					}
					else if( numascii>=48 && numascii<=57)
					{
						num_numeros=1;
					}
				}	
				
				num_total = num_numeros + num_letras;
				
				if(num_total ==2)
				{
					resultado = true;
				}
				else
				{ 
					throw new NumerosyLetras (NUMEROS_Y_LETRAS);
				}
						
			}
			return resultado;
	}
	
	
	
	
	/**
	 * Este getter lo que hace es  devolvernos el string que tiene dentro la variable razonSocial.
	 * @return Este return sirve para cuando llamemos al getRazonSocial que nos retorne el valor de la variable.
	 */
	public String getRazonSocial() {
		return razonSocial;
	}
	
	/**
	 * Este metodo sirve para establecer el valor de la variable razonSocial.
	 * @param razonSocial es el parametro que se le pasa para que sea asignado a la variable.
	 */
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	
	/**
	 * Este getter lo que hace es devolvernos el string que tiene dentro la variable domicilioSocial.
	 * @return Este return sirve para cuando llamemos al getDomicilioSocial que nos retorne el valor de la variable.
	 */
	public String getDomicilioSocial() {
		return domicilioSocial;
	}
	
	/**
	 * Este metodo sirve para establecer el valor de la variable domicilioSocial.
	 * @param domicilioSocial es el parametro que se le pasa para que sea asignado a la variable.
	 */
	public void setDomicilioSocial(String domicilioSocial) {
		this.domicilioSocial = domicilioSocial;
	}
	
	/**
	 * Este getter lo que hace es devolvernos el string que tiene dentro la variable nombreEmpresa.
	 * @return Este return sirve para cuando llamemos al getNombreEmpresa que nos retorne lo que lleve dentro la variable.
	 */
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	
	/**
	 * Este metodo sirve para establecer el valor de la variable nombreEmpresa.
	 * @param nombreEmpresa es el parametro que se le pasa para que sea asignado a la variable.
	 */
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
	/**
	 * Este getter lo que hace es devolvernos el string que tiene dentro la variable fechaCreacion.
	 * @return Este return sirve para cuando llamemos al getFechaCreacion nos retorne lo que lleve dentro la variable.
	 */
	public String getFechaCreacion() {
		return fechaCreacion;
	}
	
	/**
	 * Este metodo sirve para establecer el valor de la variable fechaCreacion.
	 * @param fechaCreacion es el parametro que se le pasa para que sea asignado a la variable.
	 */
	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	/**
	 * Este getter lo que hace es devolvernos el string que tiene dentro la variable tipoEmpresa.
	 * @return Este return sirve para cuando llamemos al getTipoEmpresa nos retorne lo que lleve dentro la variable.
	 */
	public String getTipoEmpresa() {
		return tipoEmpresa;
	}
	
	/**
	 * Este metodo sirve para establecer el valor de la variable tipoEmpresa.
	 * @param tipoEmpresa es el parametro que se le pasa para que sea asignado a la variable.
	 */
	public void setTipoEmpresa(String tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}
	
	/**
	 * Este getter lo que hace es devolvernos el double que tiene dentro la variable facturacionAnual.
	 * @return Este return sirve para cuando llamemos al getFacturacionAnual nos retorne lo que lleve dentro la variable.
	 */
	public double getFacturacionAnual() {
		return facturacionAnual;
	}
	/**
	 * Este metodo sirve para establecer el valor de la variable facturacionAnual.
	 * @param facturacionAnual es el parametro que se le pasa para que sea asignado a la variable.
	 */
	public void setFacturacionAnual(double facturacionAnual) {
		this.facturacionAnual = facturacionAnual;
	}
}
