import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import Package_Cliente.Cliente;
import Package_Cliente.ClienteEmpresa;
import Package_Cliente.ClienteParticular;
import Package_Cuenta.CuentaEmpresas;
import Package_Cuenta.CuentaJoven;
import Package_Cuenta.CuentaParticulares;
import Package_Cuenta.CuentaTerceraEdad;



/**
 * @author Cotes
 *
 */
public class Main {
	
	private static ArrayList<Cliente> arrayClientes= new ArrayList<Cliente>();
	static ClienteParticular ClienteP_1 = new ClienteParticular();
	static ClienteParticular ClienteP_2 = new ClienteParticular();
	static ClienteParticular ClienteP_3 = new ClienteParticular();
	static ClienteEmpresa ClienteE_1 = new ClienteEmpresa();
	static ClienteEmpresa ClienteE_2 = new ClienteEmpresa();
	static CuentaJoven Cuenta_1 = new CuentaJoven();
	static CuentaTerceraEdad Cuenta_2 = new CuentaTerceraEdad();
	static CuentaParticulares Cuenta_3 = new CuentaParticulares();
	static CuentaEmpresas Cuenta_4 = new CuentaEmpresas();
	static CuentaEmpresas Cuenta_5 = new CuentaEmpresas();
	public static void main(String[] args) throws Exception {
		
		
		
		ClienteParticular_PRUEBAS();
		ClienteParticularJoven_PRUEBAS();
		ClienteParticularTerceraEdad_PRUEBAS();
		ClienteEmpresaPyme_PRUEBAS();
		ClienteEmpresaGranEmpresa_PRUEBAS();
		CuentaJoven_PRUEBAS();
		CuentaTerceraEdad_PRUEBAS();
		CuentaParticulares_PRUEBAS(); 
		CuentaEmpresaPyme_PRUEBAS();
		CuentaEmpresaGranEmpresa_PRUEBAS();
		ImprimirCliente();
		
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	private static void ClienteParticular_PRUEBAS() throws Exception
	{
		//Cliente particular == 50 años
		
		//PRUEBAS CORRECTAS
		try
		{
			ClienteP_1.setIdentificacion("65004204V");
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		try
		{
			ClienteP_1.setPassword("R2D2");
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		ClienteP_1.setFechaAlta("22 de diciembre del 2000");
		ClienteP_1.setEmail("antonioBailen.32@gmail.com");
		ClienteP_1.setNombre("Antonio");
		ClienteP_1.setApellido_1("Bailen");
		ClienteP_1.setApellido_2("Sevilla");
		ClienteP_1.setFechaNacimiento("02-04-1970");
		ClienteP_1.setRentaAnual(40000);
		arrayClientes.add(ClienteP_1);
		
		//PRUEBAS ERRONEAS
		System.out.println("****Pruebas erroneas Cliente Particular****");
		try
		{
			ClienteP_1.setIdentificacion("650042043V");
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		try
		{
			ClienteP_1.setPassword("R2D2DHTR4");
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		try
		{
			ClienteP_1.setPassword("RDDD");
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage()+"\n");
		}	
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	private static void ClienteParticularJoven_PRUEBAS() throws Exception
	{
		//Cliente Particular Joven == 20 
		
		
		//PRUEBAS CORRECTAS
		try
		{
			ClienteP_2.setIdentificacion("74379632R");
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		try
		{
			ClienteP_2.setPassword("JN66");
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		ClienteP_2.setFechaAlta("12 de diciembre del 2001");
		ClienteP_2.setEmail("manuelcoi8@gmail.com");
		ClienteP_2.setNombre("Manuel");
		ClienteP_2.setApellido_1("Garcia");
		ClienteP_2.setApellido_2("Cotes");
		ClienteP_2.setFechaNacimiento("07-09-2000");
		ClienteP_2.setRentaAnual(24000);
		arrayClientes.add(ClienteP_2);
		
		//PRUEBAS ERRONEAS
		System.out.println("****Pruebas erroneas Cliente Joven****");
		try
		{
			ClienteP_2.setIdentificacion("743796323R");
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		try
		{
			ClienteP_2.setPassword("JN66E");
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		try
		{
			ClienteP_2.setPassword("4586");
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage()+"\n");
		}
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	private static void ClienteParticularTerceraEdad_PRUEBAS() throws Exception
	{
		//Cliente Particular Tercera Edad == 67 
		
		
		//PRUEBAS CORRECTAS
		try
		{
			ClienteP_3.setIdentificacion("49707754Q");
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		try
		{
			ClienteP_3.setPassword("BD08");
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		ClienteP_3.setFechaAlta("3 de enero del 1989");
		ClienteP_3.setEmail("JuanAlbertoGE@gmail.com");
		ClienteP_3.setNombre("Juan Alberto");
		ClienteP_3.setApellido_1("Gonzalez");
		ClienteP_3.setApellido_2("Espinosa");
		ClienteP_3.setFechaNacimiento("16-05-1953");
		ClienteP_3.setRentaAnual(9600);
		arrayClientes.add(ClienteP_3);
		
		//PRUEBAS ERRONEAS
		System.out.println("****Pruebas erroneas Cliente Tercera Edad****");
		try
		{
			ClienteP_3.setIdentificacion("497077544Q");
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		try
		{
			ClienteP_3.setPassword("BD08WQ");
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		try
		{
			ClienteP_3.setPassword("8886");
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage()+"\n");
		}	
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	private static void ClienteEmpresaPyme_PRUEBAS() throws Exception
	{
		//Cliente Empresa == Pyme 
		
		
		//PRUEBAS CORRECTAS
		try
		{
			ClienteE_1.setIdentificacion("C22414239");
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		try
		{
			ClienteE_1.setPassword("EMPRESA23");
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		ClienteE_1.setFechaAlta("7 de Mayo de 1998");
		ClienteE_1.setEmail("empresaJaime@gmail.com");
		ClienteE_1.setRazonSocial("Autonomo");
		ClienteE_1.setDomicilioSocial("Elche");
		ClienteE_1.setNombreEmpresa("Empresa Jaime");
		ClienteE_1.setFechaCreacion("10 de Abril de 1998");
		ClienteE_1.setTipoEmpresa("Pyme");
		ClienteE_1.setFacturacionAnual(30000);
		arrayClientes.add(ClienteE_1);
		
		//PRUEBAS ERRONEAS
		System.out.println("****Pruebas erroneas Cliente Empresa Pyme****");
		try
		{
			ClienteE_1.setIdentificacion("C224142394");
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		try
		{
			ClienteE_1.setPassword("EMP23");
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		try
		{
			ClienteE_1.setPassword("EMPRESAS");
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage()+"\n");
		}
		
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
	private static void ClienteEmpresaGranEmpresa_PRUEBAS() throws Exception
	{
		//Cliente Empresa == Pyme 
				
		//PRUEBAS CORRECTAS
		try
		{
			ClienteE_2.setIdentificacion("H06938849");
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		try
		{
			ClienteE_2.setPassword("Curtidos1989");
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		ClienteE_2.setFechaAlta("20 de Febrero de 1989");
		ClienteE_2.setEmail("CurtidosElche@gmail.com");
		ClienteE_2.setRazonSocial("Sociedad Anonima");
		ClienteE_2.setDomicilioSocial("Elche");
		ClienteE_2.setNombreEmpresa("Curtidos Elche");
		ClienteE_2.setFechaCreacion("14 de Enero de 1989");
		ClienteE_2.setTipoEmpresa("Gran Empresa");
		ClienteE_2.setFacturacionAnual(50000);
		arrayClientes.add(ClienteE_2);
		Collections.shuffle(arrayClientes);
		
		//PRUEBAS ERRONEAS
		System.out.println("****Pruebas erroneas Cliente Empresa Gran Empresa****");
		try
		{
			ClienteE_2.setIdentificacion("H069388498");
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		try
		{
			ClienteE_2.setPassword("Cu48");
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		try
		{
			ClienteE_2.setPassword("CurtidosElche");
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage()+"\n");
		}
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void CuentaJoven_PRUEBAS() throws Exception 
	{
		System.out.println("\n****Cuenta de cliente joven****");
		ClienteParticular Asigna_Cliente = null;
		
		for(int i=0; i<arrayClientes.size(); i++)
		{
			if(arrayClientes.get(i) instanceof ClienteParticular) 
			{
			Asigna_Cliente = (ClienteParticular) arrayClientes.get(i);
			try
			{
				Cuenta_1.setCliente(Asigna_Cliente);
			}
			catch(Exception e)
			{
				System.out.println( e.getMessage());
			}
			}
			
			else
			{
				try
				{
					Cuenta_1.setCliente(Asigna_Cliente);
				}
				catch(Exception e)
				{
					System.out.println( e.getMessage());
				}
			}
		}
		
		//PRUEBAS CORRECTAS
		try
		{
		Cuenta_1.setSaldo(800);
		}
		catch (Exception e )
		{
			System.out.println( e.getMessage());
		}
		try
		{
			Cuenta_1.IngresarDinero(200);
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		try
		{
			Cuenta_1.retirarDinero(200);
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		
		//PRUEBAS ERRONEAS
		System.out.println("\n****Pruebas erroneas de los movimientos de la Cuenta Joven****");
		try
		{
		Cuenta_1.setSaldo(16000);
		}
		catch (Exception e )
		{
			System.out.println( e.getMessage());
		}
		try
		{
			Cuenta_1.IngresarDinero(1500);
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		
		try
		{
			Cuenta_1.retirarDinero(600);
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		try
		{
			Cuenta_1.retirarDinero(1200);
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage()+"\n");
		}
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void CuentaTerceraEdad_PRUEBAS() throws Exception 
	{
		System.out.println("\n****Cuenta de cliente tercera edad****");
		ClienteParticular Asigna_Cliente = null;
		
		for(int i=0; i<arrayClientes.size(); i++)
		{
			if(arrayClientes.get(i) instanceof ClienteParticular) 
			{
			Asigna_Cliente = (ClienteParticular) arrayClientes.get(i);
				try
				{
					Cuenta_2.setCliente(Asigna_Cliente);
				}
				catch(Exception e)
				{
					System.out.println( e.getMessage());
				}
			}
			else
			{
				try
				{
					Cuenta_2.setCliente(Asigna_Cliente);
				}
				catch(Exception e)
				{
					System.out.println( e.getMessage());
				}
			}
		}
		
		//PRUEBAS CORRECTAS
		try
		{
			Cuenta_2.setSaldo(50);
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		try
		{
			Cuenta_2.IngresarDinero(50);
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		try
		{
			Cuenta_2.retirarDinero(20);
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		
		//PRUEBAS ERRONEAS
		System.out.println("\n****Pruebas erroneas de los movimientos de la cuenta tercera edad****");
		try
		{
			Cuenta_2.setSaldo(-1500);
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		try
		{
			Cuenta_2.IngresarDinero(1500);
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		try
		{
			Cuenta_2.retirarDinero(1500);
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}	
		try
		{
			Cuenta_2.retirarDinero(200);
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage()+"\n");
		}
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void CuentaParticulares_PRUEBAS() throws Exception 
	{

		System.out.println("\n****Cuenta de cliente particular****");
		ClienteParticular Asigna_Cliente = null;
		
		for(int i=0; i<arrayClientes.size(); i++)
		{
			if(arrayClientes.get(i) instanceof ClienteParticular) 
			{
			Asigna_Cliente = (ClienteParticular) arrayClientes.get(i);
				if(Asigna_Cliente.getEdad()>34 || Asigna_Cliente.getEdad()<65)
				{
					try
					{	
						Cuenta_3.setCliente(Asigna_Cliente);
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
					}
				}
			}
			else
			{
				try
				{
					Cuenta_3.setCliente(Asigna_Cliente);
				}
				catch(Exception e)
				{
					System.out.println( e.getMessage());
				}
			}
		}
		
		//PRUEBAS CORRECTAS
			try
			{
				Cuenta_3.setSaldo(3000);
			}
			catch(Exception e)
			{
				System.out.println( e.getMessage());
			}
			try
			{
				Cuenta_3.IngresarDinero(400);
			}
			catch(Exception e)
			{
				System.out.println( e.getMessage());
			}
			try
			{
				Cuenta_3.retirarDinero(600);
			}
			catch(Exception e)
			{
				System.out.println( e.getMessage());
			}
		
		//PRUEBAS ERRONEAS
			System.out.println("\n****Pruebas erroneas de los movimientos de la cuenta particular****");
			try
			{
				Cuenta_3.IngresarDinero(5);
			}
			catch(Exception e)
			{
				System.out.println( e.getMessage());
			}
			try
			{
				Cuenta_3.IngresarDinero(1500);
			}
			catch(Exception e)
			{
				System.out.println( e.getMessage());
			}
			try
			{
				Cuenta_3.retirarDinero(1500);
			}
			catch(Exception e)
			{
				System.out.println( e.getMessage()+"\n");
			}
	}
	
	public static void CuentaEmpresaPyme_PRUEBAS() throws Exception
	{
	////Cuenta Empresa numero 1////
		System.out.println("\n****Cuenta de cliente Empresa: Pyme****");
		ClienteEmpresa Asigna_Cliente = null;
		
		for(int i=0; i<arrayClientes.size(); i++)
		{
			if(arrayClientes.get(i) instanceof ClienteEmpresa) 
			{
			Asigna_Cliente = (ClienteEmpresa) arrayClientes.get(i);
				if(Asigna_Cliente.getTipoEmpresa()=="Pyme")
				{
					try
					{	
						Cuenta_4.setCliente(Asigna_Cliente);
					}
					catch(Exception e)
					{
						System.out.println( e.getMessage());
					}	
				}		
			}
			else
			{
				try
				{
					Cuenta_4.setCliente(Asigna_Cliente);
				}
				catch(Exception e)
				{
					System.out.println( e.getMessage());
				}
			}
		}
		
		//PRUEBAS CORRECTAS
		try
		{
			Cuenta_4.setSaldo(4000);
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		try
		{
			Cuenta_4.IngresarDinero(300);
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		try
		{
			Cuenta_4.retirarDinero(200);
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		
		//PRUEBAS ERRONEAS
		System.out.println("\n****Pruebas erroneas de los movimientos de la cuenta Empresa Pyme****");
		try
		{
			Cuenta_4.retirarDinero(3900);
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage()+"\n");
		}	
	}
	public static void CuentaEmpresaGranEmpresa_PRUEBAS() throws Exception
	{
	////Cuenta Empresa numero 1////
		System.out.println("\n****Cuenta de cliente Empresa: Gran Empresa****");
		ClienteEmpresa Asigna_Cliente = null;
		
		for(int i=0; i<arrayClientes.size(); i++)
		{
			if(arrayClientes.get(i) instanceof ClienteEmpresa) 
			{
			Asigna_Cliente = (ClienteEmpresa) arrayClientes.get(i);
				if(Asigna_Cliente.getTipoEmpresa()=="Pyme")
				{
					try
					{	
						Cuenta_5.setCliente(Asigna_Cliente);
					}
					catch(Exception e)
					{
						System.out.println( e.getMessage());
					}	
				}		
			}
			else
			{
				try
				{
					Cuenta_5.setCliente(Asigna_Cliente);
				}
				catch(Exception e)
				{
					System.out.println( e.getMessage());
				}
			}
		}
		
		//PRUEBAS CORRECTAS
		try
		{
			Cuenta_5.setSaldo(4000);
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		try
		{
			Cuenta_5.IngresarDinero(300);
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		try
		{
			Cuenta_5.retirarDinero(200);
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		System.out.println("\n \nAl no haber restricciones en la cuenta no hay errores al ingresar o retirar.");
		System.out.println("\n \n");
	}
	
	public static void ImprimirCliente()
	{
		try
		{
			Document doc = new Document(PageSize.A4);
			PdfWriter.getInstance(doc,new FileOutputStream("Operaciones.pdf"));
			doc.open();
			doc.add(new Paragraph("********Clientes********\n"));
			
			doc.add(new Paragraph("++++++ Cliente Particular:  ++++++"));
			doc.add(new Paragraph(ClienteP_1.toString()));
			doc.add(new Paragraph("++++++ Movimientos realizados:  ++++++"));
			doc.add(new Paragraph(Cuenta_1.toString()+"\n \n \n \n \n \n \n \n "));
			
			
			doc.add(new Paragraph("++++++ Cliente Particular Joven:  ++++++"));
			doc.add(new Paragraph(ClienteP_2.toString()+"\n"));
			doc.add(new Paragraph("++++++ Movimientos realizados:  ++++++"));
			doc.add(new Paragraph(Cuenta_2.toString()+"\n \n \n \n \n \n \n \n \n "));
			
			
			doc.add(new Paragraph("++++++ Cliente Particular Tercera Edad:  ++++++"));
			doc.add(new Paragraph(ClienteP_3.toString()+"\n"));
			doc.add(new Paragraph("++++++ Movimientos realizados:  ++++++"));
			doc.add(new Paragraph(Cuenta_3.toString()+"\n \n \n \n \n \n \n \n \n "));
			
			
			doc.add(new Paragraph("++++++ Cliente Empresa Pyme:  ++++++"));
			doc.add(new Paragraph(ClienteE_1.toString()+"\n"));
			doc.add(new Paragraph("++++++ Movimientos realizados:  ++++++"));
			doc.add(new Paragraph(Cuenta_4.toString()+"\n \n \n \n \n \n \n \n \n "));
			
			
			doc.add(new Paragraph("++++++ Cliente Empresa Gran Empresa:  ++++++"));
			doc.add(new Paragraph(ClienteE_2.toString()+"\n"));
			doc.add(new Paragraph("++++++ Movimientos realizados:  ++++++"));
			doc.add(new Paragraph(Cuenta_5.toString()+"\n \n \n \n \n \n \n \n \n"));
			
			doc.close();
		}
		catch(Exception e)
		{
			System.out.println("No se ha podido crear el documento");
		}
		
		
		System.out.println("********Clientes********\n");
		
		System.out.println("++++++ Cliente Particular:  ++++++");
		System.out.println(ClienteP_1.toString()+"\n");
		System.out.println("++++++ Movimientos realizados:  ++++++");
		System.out.println(Cuenta_1.toString()+"\n");
		
		System.out.println("++++++ Cliente Particular Joven:  ++++++");
		System.out.println(ClienteP_2.toString()+"\n");
		System.out.println("++++++ Movimientos realizados:  ++++++");
		System.out.println(Cuenta_2.toString()+"\n");
		
		System.out.println("++++++ Cliente Particular Tercera Edad:  ++++++");
		System.out.println(ClienteP_3.toString()+"\n");
		System.out.println("++++++ Movimientos realizados:  ++++++");
		System.out.println(Cuenta_3.toString()+"\n");
		
		System.out.println("++++++ Cliente Empresa Pyme:  ++++++");
		System.out.println(ClienteE_1.toString()+"\n");
		System.out.println("++++++ Movimientos realizados:  ++++++");
		System.out.println(Cuenta_4.toString()+"\n");
		
		System.out.println("++++++ Cliente Empresa Gran Empresa:  ++++++");
		System.out.println(ClienteE_2.toString()+"\n");
		System.out.println("++++++ Movimientos realizados:  ++++++");
		System.out.println(Cuenta_5.toString()+"\n");
	}	
	
}
