package main;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejecutable {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader dato= new BufferedReader(new InputStreamReader(System.in));

		int salir= 1;
		do{
			System.out.println("\n1. Obtener la suma de dos polinomios");
			System.out.println("2. Obtener el producto");
			System.out.println("3. Obtener la resta de dos polinomios");
			System.out.println("4. Salir");
			System.out.print("Ingrese opcion: ");
			int opcion=Integer.parseInt(dato.readLine());
			switch(opcion){
			case 1:
				ListaSE poli1=new ListaSE();
				ListaSE poli2=new ListaSE();
				System.out.print("Incialmente ingrese cuantos terminos posee el 1 primer Polinomio: ");
				int cantidad=Integer.parseInt(dato.readLine());
				for (int i = 1; i <= cantidad; i++) {
					System.out.print("Termino: "+i+"\n");
					System.out.print("Ingrese coeficiente: ");
					int coeficiente=Integer.parseInt(dato.readLine());
					System.out.print("Ingrese exponente: ");
					int exponente=Integer.parseInt(dato.readLine());
					if(exponente==0)
						exponente=-1;
					Polinomio poli= new Polinomio(coeficiente,exponente);
					poli1.insertarAlFrente(poli);	
				}
				System.out.print("Incialmente ingrese cuantos terminos posee el 2 segundo Polinomio: ");
				int cantidad2=Integer.parseInt(dato.readLine());
				for (int i = 1; i <= cantidad2; i++) {
					System.out.print("Termino: "+i+"\n");
					System.out.print("Ingrese coeficiente: ");
					int coeficiente=Integer.parseInt(dato.readLine());
					System.out.print("Ingrese exponente: ");
					int exponente=Integer.parseInt(dato.readLine());
					if(exponente==0)
						exponente=-1;
					Polinomio poli= new Polinomio(coeficiente,exponente);
					poli2.insertarAlFrente(poli);
				}		
				System.out.println();
				System.out.print("RESPUESTA SUMA:  ");
				sumaPolinomios(poli1.primerNodo,poli2.primerNodo,cantidad,cantidad2);
				System.out.println();
				break;
			
			case 2:
				poli1=new ListaSE();
				poli2=new ListaSE();
				System.out.print("Incialmente ingrese cuantos terminos posee el 1 primer Polinomio: ");
				cantidad=Integer.parseInt(dato.readLine());
				for (int i = 1; i <= cantidad; i++) {
					System.out.print("Termino: "+i+"\n");
					System.out.print("Ingrese coeficiente: ");
					int coeficiente=Integer.parseInt(dato.readLine());
					System.out.print("Ingrese exponente: ");
					int exponente=Integer.parseInt(dato.readLine());
					Polinomio poli= new Polinomio(coeficiente,exponente);
					poli1.insertarAlFrente(poli);	
				}
				System.out.print("Incialmente ingrese cuantos terminos posee el 2 segundo Polinomio: ");
				cantidad2=Integer.parseInt(dato.readLine());
				for (int i = 1; i <= cantidad2; i++) {
					System.out.print("Termino: "+i+"\n");
					System.out.print("Ingrese coeficiente: ");
					int coeficiente=Integer.parseInt(dato.readLine());
					System.out.print("Ingrese exponente: ");
					int exponente=Integer.parseInt(dato.readLine());
					Polinomio poli= new Polinomio(coeficiente,exponente);
					poli2.insertarAlFrente(poli);
				}	
				System.out.println();
				System.out.print("RESPUESTA PRODUCTO:  ");
				producto(poli1.primerNodo,poli2.primerNodo,  cantidad,  cantidad2);
				System.out.println();
				break;
			case 3:
				ListaSE poli4=new ListaSE();
				ListaSE poli5=new ListaSE();
				System.out.print("Incialmente ingrese cuantos terminos posee el 1 primer Polinomio: ");
				int cantidad7=Integer.parseInt(dato.readLine());
				for (int i = 1; i <= cantidad7; i++) {
					System.out.print("Termino: "+i+"\n");
					System.out.print("Ingrese coeficiente: ");
					int coeficiente=Integer.parseInt(dato.readLine());
					System.out.print("Ingrese exponente: ");
					int exponente=Integer.parseInt(dato.readLine());
					if(exponente==0)
						exponente=-1;
					Polinomio npol= new Polinomio(coeficiente,exponente);
					poli4.insertarAlFrente(npol);	
				}
				System.out.print("Incialmente ingrese cuantos terminos posee el 2 segundo Polinomio: ");
				int cantidad8=Integer.parseInt(dato.readLine());
				for (int i = 1; i <= cantidad8; i++) {
					System.out.print("Termino: "+i+"\n");
					System.out.print("Ingrese coeficiente: ");
					int coeficiente=Integer.parseInt(dato.readLine());
					System.out.print("Ingrese exponente: ");
					int exponente=Integer.parseInt(dato.readLine());
					if(exponente==0)
						exponente=-1;
					Polinomio npol1= new Polinomio(-coeficiente,exponente);
					poli5.insertarAlFrente(npol1);
				}		
				System.out.println();
				System.out.print("RESPUESTA Resta:  ");
				sumaPolinomios(poli4.primerNodo,poli5.primerNodo,cantidad7,cantidad8);
				System.out.println();
				break;
                        case 4:
                            salir=0;
                            break;
			}
		}while(salir!=0);


	}


	public static void producto(Nodo poli1,Nodo poli2, int cantidad, int cantidad2){

		

		ListaSE guardap1= new ListaSE();
		Nodo a;
		Nodo b;

		if(cantidad>cantidad2){

			a=poli1;
			b=poli2;
		}else{

			a=poli2;
			b=poli1;
		}

		int cont=0;

		while(a!=null){

			while(b!=null){
				int coeficiente=a.poli.getCoeficiente()*b.poli.getCoeficiente();
				int exponente=a.poli.getExponente()+b.poli.getExponente();
				Polinomio poli= new Polinomio(coeficiente,exponente);
				guardap1.insertarAlFrente(poli);
				b=b.siguiente;
				cont++;
			}

			if(cantidad>cantidad2){
				b=poli2;
			}else{
				b=poli1;
			}
			a=a.siguiente;
		}
		ListaSE vacio= new ListaSE();

		Nodo ver=guardap1.primerNodo;

		while(ver!=null){

			if(ver.poli.getExponente()==0){
				ver.poli.setExponente(-1);
			}

			ver=ver.siguiente;
		}

		sumaPolinomios(guardap1.primerNodo,vacio.primerNodo, cont,  0);


	}







	public static void sumaPolinomios(Nodo poli1,Nodo poli2, int cantidad, int cantidad2){
		int [] numerosl1=new int[cantidad];
		int [] numerosl2=new int[cantidad2];
		//PRIMER POLINOMIO
		int acomp=0;
		Nodo p=poli1; 
		while(p!=null)
		{
			numerosl1[acomp]=p.poli.getExponente();
			acomp++;

			p=p.siguiente; 

		}
		
		int acomp2=0;
		Nodo q=poli2;
		while(q!=null)
		{
			numerosl2[acomp2]=q.poli.getExponente();
			acomp2++;

			q=q.siguiente; 

		}

		
		int [] mipoli=new int[100];
		int aux=0;
		int vueltas=cantidad+cantidad2;
		int cambios1=0, cambios2=0;

		for (int j = 0; j < cantidad; j++) {
			mipoli[j]=numerosl1[j];

		}
		for (int j = 0; j < cantidad2; j++) {
			mipoli[cantidad++]=numerosl2[j];
		}

		//HEMOS ELIMINADO LOS REPETIDOS
		int ver2=0;
		for (int i = 0; i < vueltas; i++) {
			for (int j = 0; j < vueltas; j++) {
				if(mipoli[i]==mipoli[j])
					ver2++;

				if(ver2==2){
					mipoli[j]=0;
					ver2--;
				}

			}
			ver2=0;

		}

		
		int ccero=0;
		for (int i = 0; i < vueltas; i++) {
			if(mipoli[i]==0){
				ccero++;
			}
		}
		int actual=vueltas-ccero;
		int [] vpolinomio=new int[actual];
		int cvpoli=0;
		for (int i = 0; i < vueltas; i++) {
			if(mipoli[i]!=0){
				vpolinomio[cvpoli]=mipoli[i];
				cvpoli++;
			}
		}
		

		ordBurbuja (vpolinomio, cvpoli);

		int d=0;
		acomp=vpolinomio.length;
		while(acomp!=0){
			int acum=0;
			Nodo a=poli1;
			Nodo b=poli2;	

			int ver=0;
			boolean pass=false;
			boolean pass2=false;

			while(ver<2)
			{	
				if(!pass){
					if(a!=null){
						if(vpolinomio[d]==a.poli.getExponente()){
							acum+=a.poli.getCoeficiente();
						}
						a=a.siguiente;
					}else{
						ver++;
						pass=true;
					}
				}

				if(!pass2){
					if(b!=null){
						if(vpolinomio[d]==b.poli.getExponente()){
							acum+=b.poli.getCoeficiente();	
						}
						b=b.siguiente;
					}else{
						ver++;
						pass2=true;
					}

				}

			}


			if(acomp!=0){
				if(d==0){
					if(vpolinomio[d]!=-1 && acum>0 ){
						System.out.print(acum+" X ^ "+ vpolinomio[d]+"    ");
					}else
						if(acum<0 && vpolinomio[d]!=-1){
							System.out.print(acum+" X ^ "+ vpolinomio[d]+"    ");
						}
					if(vpolinomio[d]==-1)
						System.out.print(acum+"    ");	
				}	else
					if(d>0){
						if(vpolinomio[d]!=-1 && acum>0 )
							System.out.print(" + "+acum+" X ^ "+ vpolinomio[d]+"    ");	
						else
							if(acum<0 && vpolinomio[d]!=-1)
								System.out.print(acum+" X ^ "+ vpolinomio[d]+"    ");
						if(vpolinomio[d]==-1 && acum>0)
							System.out.print(" + "+acum+"    ");
						else
							if(vpolinomio[d]==-1 && acum<0)
								System.out.print(acum+"    ");
					}
			}

			d++;
			acomp--;
		}

	}



	static void ordBurbuja (int a[], int n)
	{
		boolean interruptor = true;
		for (int pasada = 0; pasada < n-1 && interruptor; pasada++)
		{
			interruptor = false;
			for (int j = 0; j < n-pasada -1; j++)
				if(a[j] < a[j+1])
				{
					int aux;
					interruptor = true;
					aux = a[j];
					a[j] = a[j+1];
					a[j+1] = aux;
				}

		}
	}


}

