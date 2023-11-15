package Package_Cliente;

import Excepciones.IdentifiacionNoValida;
import Excepciones.PasswordMayor;

public abstract class Cliente  {
	
	public static final String PASSWORD_MAYOR = ("La contraseña tiene que ser de 6 o mas caracteres");
	public static final String CUATRO_CARACTERES = ("La contraseña tiene que ser de 4 caracteres");
	public static final String NUMEROS_Y_LETRAS = ("La contraseña tiene que contener numeros y letras");
	public static final String IDENTIFIACION_NO_VALIDA= ("La identificacion no es valida");
	public static final String NO_TIPO_EMPRESA = ("La empresa introducida no es valida");
	public static final String ESPACIO = ("\n");
	public static final String NUMERO_CLIENTE = ("Cliente numero: ");
	public static final String IDENTIFIACION = ("Identifiacion: ");
	public static final String FECHA_ALTA = ("Fecha de alta: ");
	public static final String PASSWORD = ("Password: ");
	public static final String EMAIL = ("Email: ");
	public static final String NOMBRE = ("Nombre del cliente: ");
	public static final String APELLIDO_1 = ("Primer apellido del cliente: ");
	public static final String APELLIDO_2 = ("Segundo apellido del cliente: ");
	public static final String FECHA_DE_NACIMIENTO = ("Fecha de nacimiento del cliente: ");
	public static final String RENTA_ANUAL = ("Renta anual del cliente: ");
	public static final String EDAD = ("Edad del cliente: ");
	public static final String RAZON_SOCIAL = ("Razon social de la empresa del cliente: ");
	public static final String DOMICILIO_SOCIAL = ("Domicilio social de la empresa del cliente: ");
	public static final String NOMBRE_EMPRESA = ("Nombre de la empresa del cliente: ");
	public static final String FECHA_DE_CREACION = ("Fecha de creacion de la empresa del cliente: ");
	public static final String TIPO_DE_EMPRESA = ("Tipo de empresa del cliente: ");
	public static final String FACTURACION_ANUAL = ("Facturacion anual de la empresa del cliente: ");
	
	
	protected static int contador = 1;
	protected int numCliente=1;//Hacer que cada cliente sea un numero distinto
	protected String identificacion;
	protected String fechaAlta;
	protected String password;
	protected String email;
	protected boolean resultado = false;
	
	/**
	 * Este es el metodo toString que utilizaremos para poder imprimir en el main los datos de los clientes.
	 * @return string nos decolvera la cadena string con todos los datos.
	 */
	public String toString()
	{
		String string;
		
		string = ESPACIO + NUMERO_CLIENTE + numCliente;
		string = string + ESPACIO + IDENTIFIACION + identificacion;
		string = string + ESPACIO + FECHA_ALTA + fechaAlta;
		string = string + ESPACIO + PASSWORD + password;
		string = string + ESPACIO + EMAIL + email;
		return string;
	}
	
	
	/**
	 * Este metodo tiene como finalidad comprobar si la contraseña es valida o no.
	 * 
	 * @param password Es la varaiable que se le pasa para que compruebe si es valida o no.
	 * @return En este caso el return nos devuelve verdadero o falso, verdadero si es valido y falso si no lo es.
	 * @throws Este metodo lanza una excepcion en el caso de que la contraseña introducida tenga una longitud menor que 6.
	 */
	protected boolean ValidarPassword(String password) throws Exception
	{
		int longitud = 0;
		longitud = password.length();
		
		if(longitud<6)
			{
				
				throw new PasswordMayor (PASSWORD_MAYOR);
			}
		else
			{
				resultado=true;
			}
			
			return resultado;
	}
	
	/**
	 * Este es un metodo que el padre obliga a que sus hijos lo implementen.
	 * 
	 * @param Identificaciones es la variable que se le pasa a identificacion en el caso de que la identifiacion de los hijos sea correcta.
	 * @return
	 */
	protected abstract boolean ValidarIdentificacion(String Identificaciones);
	
	/**
	 * Este es un contructor tiene un contador dentro por cada objeto cliente que se cree.
	 */
	public Cliente()
	{
		numCliente = contador;
		contador+=1;	
	}

	/**
	 * Este metodo devuelve la fecha.
	 * @return El return nos devuelve la fehca cuando llamemos al metodo.
	 */
	public String getFechaAlta() {
		return fechaAlta;
	}
	
	/**
	 * Este metodo sirve para asignar un valor a la variable.
	 * @param fechaAlta es el parametro que le pasamos para que nos lo asigne a las variable global
	 */
	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	
	/**
	 * Este metodo devuelve la contraseña cuando lo llamamos.
	 * @return El return nos devuelve la contraseña.
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * Este metodo sirve para asignarle un valor a la variable password
	 * @param password es el parametro que se le pasa para que posteriormente compruebe si es valido o no
	 * @throws Exception es la excepcion que salta cuando el parametro que se le ha pasado no es valido
	 */
	public void setPassword(String password) throws Exception {
			if(ValidarPassword(password))
			{
				this.password = password;
			}
	}

	/**
	 * Este metodo sirve para devolver el email.
	 * @return nos devuelve el email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * Este metodo sirve para asignarle un string al email.
	 * @param email es el parametro que se le pasa para que lo asigne al email global.
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * Este metodo nos devuelve lo que tenga asignado la variable identificacion.
	 * @return Nos devuelva la variable idfentificacion cuando lo llamamos.
	 */
	public String getIdentificacion() {
		return identificacion;
	}
	/**
	 * Este metodo sirve para aignarle un valor a la variable identficacion, aparte dentro del mismo hay un if que comprueba si la identificacion es valida o no. 
	 * @param identificacion es el parametro que se le pasa para asignarlo a la variable identificacion.
	 * @throws Exception Lanza una excepcion en el caso de que no sea una identifiacion correcta.
	 */
	public void setIdentificacion(String identificacion) throws Exception {
		if(ValidarIdentificacion(identificacion))
		{
			this.identificacion = identificacion;
		}
		else
		{
			throw new IdentifiacionNoValida(IDENTIFIACION_NO_VALIDA);
		}
		
	}

}
