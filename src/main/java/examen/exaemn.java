
package examen;

import java.util.Random;
import java.util.Scanner;


public class exaemn {
    static int total=0;
    private static String[][] comisiones = new String[5][11];
    
    private static final int NOMBRE=0;
    private static final int ENERO=1;
    private static final int FEBRERO=2;
    private static final int MARZO=3;
    private static final int ABRIL=4;
    private static final int TOTALVENTAS=5;
    private static final int COMISION1=6;
    private static final int COMISION2=7;
    private static final int FINALVENTA=8;
    private static final int ISR=9;
    private static final int LI=10;
    
    public static void cargaInformacion(int fila){

        Scanner t= new Scanner(System.in);
         try{

            System.out.println("Ingrese Nombre"+(fila+1));
        comisiones[fila][NOMBRE]= t.nextLine();
        
        inicializar();

        }

        catch (Exception e) { System.out.println("error ingresa un numero");  }
        
        
       
    }
    public static void imprimirDecorado(){
        for (int x=0; x< comisiones.length;x++){
            System.out.print("|");
             for(int y=0;y < comisiones[x].length;y++){
                 System.out.print(comisiones[x][y]);
                 if (y != comisiones[x].length -1){
                     System.out.print("\t");
                 }
             }
             System.out.println("|");
        }
    }
      static void inicializar(){
         Random r = new Random();
        for(int i=0;i<5;i++){
            for(int j=1;j<5;j++){
                
                    int p = r.nextInt(50, 1000);
                    
                    comisiones[i][j] = String.valueOf(p); 
                
                }
                 
                
                    
 
                }
                
            }
        

    public static void Calculos(){
        int total=0;
        int m=0;
        for(int i=0; i<5; i++){
            total= Integer.parseInt(comisiones[i][ENERO]);
            total= total + Integer.parseInt(comisiones[i][FEBRERO]);
            total= total + Integer.parseInt(comisiones[i][MARZO]);
            total= total + Integer.parseInt(comisiones[i][ABRIL]);
            comisiones[i][TOTALVENTAS]= String.valueOf(total);
           
             if (total < 2001 ){
            
            comisiones[i][COMISION1]= String.valueOf((total*20)/100);
           
            comisiones[i][FINALVENTA]=String.valueOf( total-Integer.parseInt(comisiones[i][COMISION1]));
            comisiones[i][ISR]=String.valueOf((total*5)/100);
            comisiones[i][LI]=String.valueOf(Integer.parseInt(comisiones[i][FINALVENTA])-Integer.parseInt(comisiones[i][ISR]));
            
        
             }
             else {
             
             comisiones[i][COMISION2]=String.valueOf((total*35)/100);
             comisiones[i][FINALVENTA]=String.valueOf( total- Integer.parseInt(comisiones[i][COMISION2]));
             comisiones[i][ISR]=String.valueOf((total*5)/100);
             comisiones[i][LI]=String.valueOf(Integer.parseInt(comisiones[i][FINALVENTA])- Integer.parseInt(comisiones[i][ISR]));
               
             }
              if(comisiones[i][COMISION1]== null){
comisiones[i][COMISION1]="0";
        }
               if(comisiones[i][COMISION2]== null){
comisiones[i][COMISION2]="0";
          
} 
    }}
    public static void ingresoDatos(){
        for(int i=0; i<5; i++){
            cargaInformacion(i);
            
        }}
    
     public static void max() {
         String ven="", ven1="";
       int mayor=0, m=0;
       
for(int i=0; i<5; i++){
 
for(int j=0; j<5; j++){
 
if(Integer.parseInt(comisiones[i][COMISION1])>mayor){
mayor=Integer.parseInt(comisiones[i][COMISION1]); 
ven = comisiones[i][COMISION1-6];
} 
}


}
for(int i=0; i<5; i++){
 
for(int j=0; j<5; j++){
 
if(Integer.parseInt(comisiones[i][COMISION2])>m){
m=Integer.parseInt(comisiones[i][COMISION2]); 
ven1 = comisiones[i][COMISION2-7];
} 
}


}
if(m>mayor){
System.out.println("el mejor vendedor es  " + ven1 +  " y la cantidad de su comision es "+ m);
}
else
    {
System.out.println("el mejor vendedor es  " + ven +  " y la cantidad de su comision es "+ mayor);
}
}
  public static void menor() {
  String ven="", ven1="";
		
		int mayor = Integer.parseInt(comisiones[0][COMISION1]), menor = Integer.parseInt(comisiones[0][COMISION2]); // suponemos que ambos están en la primer posición

		
		for (int x = 0; x < comisiones.length; x++) {
			for (int y = 0; y < comisiones[x].length; y++) {
				int numeroActual = Integer.parseInt(comisiones[x][COMISION1]);
                                int numeroActua = Integer.parseInt(comisiones[x][COMISION2]);
                                
				if ( Integer.parseInt(comisiones[x][COMISION1])<menor && Integer.parseInt(comisiones[x][COMISION1]) != 0 || menor == 0) {
          menor = Integer.parseInt(comisiones[x][COMISION1]);
         
       }
                                
				if ( Integer.parseInt(comisiones[x][COMISION2])<mayor && Integer.parseInt(comisiones[x][COMISION2]) != 0 || mayor == 0) {
          mayor = Integer.parseInt(comisiones[x][COMISION2]);
        
       }
			}
                        ven = comisiones[x][COMISION1-6];
                         ven1 = comisiones[x][COMISION2-7];
		}
		
                if(menor<mayor){
System.out.println("el peor vendedor es  " + ven +  " y la cantidad de su comision es "+ menor );
}
else
    {
System.out.println("el peor vendedor es  " + ven1 +  " y la cantidad de su comision es "+ mayor);
}
               
  }
        
    
        
         public static void gg(){
         
       Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion; 
        
       while(!salir){
            
           System.out.println("1.  generar matriz ");
           System.out.println("2. vendedor mas alto");
           System.out.println("3. vendejor mas bajo ");
           System.out.println("4. resultados");
           System.out.println("5. Salir");
            
           System.out.println("Escribe una de las opciones");
           opcion = sn.nextInt();
            
           switch(opcion){
               case 1 -> {
                   ingresoDatos();
                   Calculos();
               }
               case 2 -> max();
                   
               
                case 3 -> menor();
                   case 4 -> imprimirDecorado();
                case 5 -> salir=true;
                default -> System.out.println("Solo números entre 1 y 4");
           }
            
       }
        
    }
        
    
    public static void main (String[] args){
        gg();
    }
}
    

