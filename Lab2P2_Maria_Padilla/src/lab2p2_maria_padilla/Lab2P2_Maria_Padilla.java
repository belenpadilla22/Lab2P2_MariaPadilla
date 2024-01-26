
package lab2p2_maria_padilla;

import java.util.ArrayList;
import java.util.Scanner;


public class Lab2P2_Maria_Padilla {
    static Scanner leer=new Scanner (System.in);
    static ArrayList<Usuario>usuarios=new ArrayList();

    
    public static void main(String[] args) {
        //int option=0;
        Usuario usario1=new Usuario("Pedro","1231","Estudiante");
        usuarios.add(usario1);
        Usuario usario2=new Usuario("Maria","2310","Profesor");
        usuarios.add(usario2);
        Usuario usario3=new Usuario("Antonio","3245","Bbliotecano");
        usuarios.add(usario3);
         System.out.println(" Ingrese su nombre: ");
        String name=leer.next();
        System.out.println(" Ingrese la contraseña: ");
        String contra=leer.next();
        Usuario user=new Usuario () ;
        for (Usuario comp : usuarios) {
            if (comp.getNombre().equals(name) && comp.getContra().equals(contra)){
                if (comp.getTipoUsuario().equals("Estudiante")){
                    System.out.println("si");
                   
                
                
                }
                if (comp.getTipoUsuario().equals("Profesor")){
                  
                
                
                }
                if (comp.getTipoUsuario().equals("Bibliotecano")){
                   
                
                }
//                 System.out.println("---------------------------------------------------");
//                 System.out.println(" SISTEMA DE INVETARIO DE BIBLIOTECA VIRTUAL");
//                 System.out.println("1. Listar recursos: ");
//                 System.out.println("2.Crear recursos: ");
//                 System.out.println("3.Eliminar recursos: ");
//                 System.out.println("4. Modificar recurso: ");
//                 System.out.println("5. Salir: ");
//                 System.out.println("Ingrese una opcion: ");
//                 int option=leer.nextInt();
//
//
//
//
//
//
//                while (option>0 && option<5){
//                    switch (option){
//                        case 1:
//
//                            break;
//                        case 2:
//                            break;
//                        case 3:
//                            break;
//                        case 4:
//                            break;
//
//
//                    }//fin switch
//                
//
//                    System.out.println(" SISTEMA DE INVETARIO DE BIBLIOTECA VIRTUAL");
//                    System.out.println("1. Listar recursos: ");
//                    System.out.println("2. Crear recursos: ");
//                    System.out.println("3. Eliminar recursos: ");
//                    System.out.println("4. Modificar recurso: ");
//                    System.out.println("5. Salir: ");
//                    System.out.println("Ingrese una opcion: ");
//                    option=leer.nextInt();
//
//                }// while


            }
        }
        
        
        
    
        
       
     
       
    }
    public void login (){
       
    }
    
    
}
