package Package_Cliente;

import Excepciones.CuatroCaracteres;
import Excepciones.NumerosyLetras;

public class ClienteParticular extends Cliente {
	
	protected String nombre;
	protected String apellido_1;
	protected String apellido_2;
	protected String fechaNacimiento;
	protected float rentaAnual;
	protected int edad;
	
	
	/**
	 * Este es el metodo toString que utilizaremos para poder imprimir en el main los datos de los clientes.
	 * @return string nos decolvera la cadena string con todos los datos.
	 */
	public String toString()
	{
		String string;
		
		string = super.toString();
		string = string + ESPACIO + NOMBRE + nombre;
		string = string + ESPACIO + APELLIDO_1 + apellido_1;
		string = string + ESPACIO + APELLIDO_2 + apellido_2;
		string = string + ESPACIO + FECHA_DE_NACIMIENTO + fechaNacimiento;
		string = string + ESPACIO + RENTA_ANUAL + rentaAnual;
		string = string + ESPACIO + EDAD + edad;
		return string;
	}

	/**
	 * Este metodo de validar identificacion sirve para validar si el dni del usuario es valido o no.
	 * @param dni es el parametro que se le pasa donde dentro contendra el dni a validar.
	 * @return nos devuelve el dni validado
	 */
	protected boolean ValidarIdentificacion(String dni) {
		// TODO Auto-generated method stub
		ValidadorDNI validador = new ValidadorDNI(dni);
		return validador.validar();
	}
	
	/**
	 * Este metodo validar fecha lo unico que hace es crear un objeto y calcular la edad del cliente en base a su fecha de nacimiento.
	 * Posteriormente se almacena en la variable edad.
	 */
	protected void ValidarFecha()						
	{
		CalculaFecha cal= new CalculaFecha();
		 edad = cal.calcularEdad(fechaNacimiento);
		//("01-01-1999")
	}
	
	/**
	 * Este metodo validar password tiene la funcion de coger la contraseña que recibe y ver si es valida. 
	 * @param contrasena es la variable que tiene almacenada la contraseña que se quiere validar
	 * @return resultado, nos devuelve veradero o falso en el caso de que la validacion sea correcta o erronea.
	 */
	 protected boolean ValidarPassword(String contrasena) throws Exception
	{
		int longitud = 0;
		int numascii = 0;
		int num_letras = 0;
		int num_numeros = 0;
		int num_total= 0;
		
		
		longitud = contrasena.length();
	
			if(longitud>4 || longitud<4)
			{
				throw new CuatroCaracteres (CUATRO_CARACTERES);
			}
			else if(longitud == 4)
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
	 * Este metodo getter nos devuelve lo que lleve dentro la variable nombre.
	 * @return Al llamar al getter nos retorna la variable que se le ha asignado.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Este metodo setter sirve para asignarle a la variable nombre lo que le introduzacamos.
	 * @param nombre es la variable que guarda la asignacion que le hemos introducido al setter.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Este metodo getter nos devuelve lo que lleve dentro la variable apellido_1.
	 * @return Al llamar al getter nos retorna la variable que se le ha asignado.
	 */
	public String getApellido_1() {
		return apellido_1;
	}
	
	/**
	 * Este metodo setter sirve para asignarle a la variable apellido_1 lo que le introduzacamos.
	 * @param apellido_1 es la variable que guarda la asignacion que le hemos introducido al setter.
	 */
	public void setApellido_1(String apellido_1) {
		this.apellido_1 = apellido_1;
	}
	
	/**
	 * Este metodo getter nos devuelve lo que lleve dentro la variable apellido_2.
	 * @return Al llamar al getter nos retorna la variable que se le ha asignado.
	 */
	public String getApellido_2() {
		return apellido_2;
	}
	
	/**
	 * Este metodo setter sirve para asignarle a la variable apellido_2 lo que le introduzacamos.
	 * @param apellido_2 es la variable que guarda la asignacion que le hemos introducido al setter.
	 */
	public void setApellido_2(String apellido_2) {
		this.apellido_2 = apellido_2;
	}
	
	/**
	 * Este metodo getter nos devuelve lo que lleve dentro la variable fechaNacimiento.
	 * @return Al llamar al getter nos retorna la variable que se le ha asignado.
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	/**
	 * Este metodo setter sirve para asignarle a la variable fechaNacimiento lo que le introduzacamos.
	 * Ademas se llama al metodo validar fecha para posteriormente sacar la edad.
	 * @param fechaNacimiento es la variable que guarda la asignacion que le hemos introducido al setter.
	 */
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
		ValidarFecha();
	}
	
	/**
	 * Este metodo getter nos devuelve lo que lleve dentro la variable edad.
	 * @return Al llamar al getter nos retorna la variable que se le ha asignado.
	 */
	public int getEdad() {
		return edad;
	}
	
	/**
	 * Este metodo getter nos devuelve lo que lleve dentro la variable rentaAnual.
	 * @return Al llamar al getter nos retorna la variable que se le ha asignado.
	 */
	public float getRentaAnual() {
		return rentaAnual;
	}
	
	/**
	 * Este metodo setter sirve para asignarle a la variable rentaAnual lo que le introduzacamos.
	 * @param rentaAnual es la variable que guarda la asignacion que le hemos introducido al setter.
	 */
	public void setRentaAnual(float rentaAnual) {
		this.rentaAnual = rentaAnual;
	}
}
