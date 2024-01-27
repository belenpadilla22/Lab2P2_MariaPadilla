
package lab2p2_maria_padilla;

import java.util.ArrayList;
import java.util.Scanner;


public class Lab2P2_Maria_Padilla {
    static Scanner leer=new Scanner (System.in);
    static ArrayList<Usuario>usuarios=new ArrayList();
    static ArrayList<Libro>Libros=new ArrayList();
    static ArrayList<Articulo>articulos=new ArrayList();
    static ArrayList<CursoEnLinea>cursos=new ArrayList();
    static ArrayList<ConferenciaVirtual>conferencias=new ArrayList();

    
    public static void main(String[] args) {
        //int option=0;
        boolean salida=true;
        Usuario usario1=new Usuario("Pedro","1231","Estudiante");
        usuarios.add(usario1);
        Usuario usario2=new Usuario("Maria","2310","Profesor");
        usuarios.add(usario2);
        Usuario usario3=new Usuario("Antonio","3245","Bibliotecano");
        usuarios.add(usario3);
      
        System.out.println(" M E N U ");
        System.out.println(" 1. Ingresar: ");
        System.out.println(" 2. Salir ");
        int op=leer.nextInt();
        while (op>0 && op<2){
            switch (op){
                case 1: 
                     login();
                    break;
               
            
            
            }
        
        System.out.println(" M E N U ");
        System.out.println(" 1. Ingresar: ");
        System.out.println(" 2. Salir ");
         op=leer.nextInt();
        }
        
        
       

        
       
       
  
    }
    public static void login (){
        System.out.println(" Ingrese su nombre: ");
        String name=leer.next();
        System.out.println(" Ingrese la contraseña: ");
        String contra=leer.next();
            
        Usuario user=new Usuario () ;
        for (Usuario comp : usuarios) {
            if (comp.getNombre().equals(name) && comp.getContra().equals(contra)){
                if (comp.getTipoUsuario().equals("Estudiante")){
                     System.out.println("---------------------------------------------------");
                     System.out.println(" SISTEMA DE INVETARIO DE BIBLIOTECA VIRTUAL");
                     System.out.println("1. Listar recursos: ");
                     System.out.println(" Ingrese la opcion");
                     int option=leer.nextInt();
                     if (option==1){
                         listar();
                     }
                     
                   
                
                
                }
                if (comp.getTipoUsuario().equals("Profesor")){
                 System.out.println("---------------------------------------------------");
                 System.out.println(" SISTEMA DE INVETARIO DE BIBLIOTECA VIRTUAL");
                 System.out.println("1. Listar recursos: ");
                 System.out.println("2.Crear recursos: ");
                 System.out.println(" Ingrese la opcion");
                 int option=leer.nextInt();
                 while (option>0 && option<3){
                     switch (option){
                         case 1:
                             listar();
                             break;
                         case 2:
                             crear();
                             break;
                     
                     
                     
                     }
                 System.out.println("---------------------------------------------------");
                 System.out.println(" SISTEMA DE INVETARIO DE BIBLIOTECA VIRTUAL");
                 System.out.println("1. Listar recursos: ");
                 System.out.println("2.Crear recursos: ");
                 System.out.println(" Ingrese la opcion");
                 option=leer.nextInt();
                 }
                }
                if (comp.getTipoUsuario().equals("Bibliotecano")){
                   System.out.println("---------------------------------------------------");
                   System.out.println(" SISTEMA DE INVETARIO DE BIBLIOTECA VIRTUAL");
                   System.out.println("1. Listar recursos: ");
                   System.out.println("2.Crear recursos: ");
                   System.out.println("3.Eliminar recursos: ");
                   System.out.println("4. Modificar recurso: ");
                   System.out.println("5. Salir: ");
                   System.out.println("Ingrese una opcion: ");
                   int option=leer.nextInt();
                   while (option>0 && option<5){
                     switch (option){
                         case 1:
                             listar();
                             break;
                         case 2:
                             crear();
                             break;
                         case 3:
                             eliminar();
                             break;
                         case 4:
                             Modificar();
                             break;
                     
                     
                     
                     }
                 System.out.println("---------------------------------------------------");
                 System.out.println(" SISTEMA DE INVETARIO DE BIBLIOTECA VIRTUAL");
                 System.out.println("1. Listar recursos: ");
                 System.out.println("2.Crear recursos: ");
                 System.out.println("3.Eliminar recursos: ");
                 System.out.println("4. Modificar recurso: ");
                 System.out.println("5. Salir: ");
                 System.out.println(" Ingrese la opcion");
                 option=leer.nextInt();
                 }

                
                }
            

            }
        }
        
        
    
    
    
    }
    public static void listar (){
        System.out.println(" Ingrese lo que desea listar ");
        System.out.println("1. Libro ");
        System.out.println("2. Articulo ");
        System.out.println("3. Cursos en linea ");
        System.out.println("4. Conferencias virtuales ");
        int op=leer.nextInt();
        if (op==1){
            listarLibros();
        }
        if (op==2){
            listarArticulos();
        
        }
        if (op==3){
            listarcurso();
        }
        if (op==4){
            listarConferencia();
        
        }
    
    }
    
    
    
    
    public static void crear (){
        
        System.out.println(" Ingrese una opcion:  ");
        System.out.println("1. Libro ");
        System.out.println("2. Articulo ");
        System.out.println("3. Cursos en linea ");
        System.out.println("4. Conferencias virtuales ");
        int op=leer.nextInt();
        if (op==1){
            System.out.println(" Ingrese un titulo; ");
            String titulo=leer.next();
            System.out.println(" Ingrese el autor:");
            String autor=leer.next();
            System.out.println(" Ingrese el genero: ");
            String genero=leer.next();
            System.out.println(" Ingrese año de publicacion: ");
            String an=leer.next();
            System.out.println(" Disponiblidad [si/no]: ");
            String dispo=leer.next();
            boolean existe=false;
            if (dispo=="si"){
               existe=true;
            }else{
                existe=false;
            }
            Libro li=new Libro (titulo,autor,genero,an,dispo);
            Libros.add(li);
        
        }
        if (op==2){
            System.out.println(" Ingrese un titulo; ");
            String titulo=leer.next();
            System.out.println(" Ingrese el autor:");
            String autor=leer.next();
            System.out.println(" Ingrese el tema : ");
            String tema=leer.next();
            System.out.println(" Ingrese la fecha publicacion: ");
            String fecha=leer.next();
            System.out.println(" Ingrese el acceso en linea:[si/no] ");
            String acceso=leer.next();
             boolean existe=false;
            if (acceso=="si"){
               existe=true;
            }else{
                existe=false;
            }
            Articulo arti=new Articulo (titulo,autor,tema,fecha,acceso);
            articulos.add(arti);
           
        }
        if (op==3){
            System.out.println(" Ingrese un titulo; ");
            String titulo=leer.next();
            System.out.println(" Ingrese el instructor:");
            String instru=leer.next();
            System.out.println(" Ingrese la duracion en semanas : ");
            String tema=leer.next();
            System.out.println(" Ingrese la plataforma de enseñanza ");
            String plataforma=leer.next();
            CursoEnLinea curso=new CursoEnLinea(titulo,instru,tema,plataforma);
            cursos.add(curso);
        }
        if (op==4){
            System.out.println(" Ingrese un titulo; ");
            String titulo=leer.next();
            System.out.println(" Ingrese el conferencista:");
            String confe=leer.next();
            System.out.println(" Ingrese la fecha : ");
            String fecha=leer.next();
            System.out.println(" Ingrese la duracion: ");
            String duracion=leer.next();
            System.out.println(" Ingrese el enlace de acceso ");
            String acceso=leer.next();
            ConferenciaVirtual conferencia=new ConferenciaVirtual (titulo,confe,fecha,duracion,acceso);
            conferencias.add(conferencia);
         
        }
        
   
    }
    public static void listarLibros(){
        for (Libro l : Libros) {
            System.out.println(l.toString());
        }
    
    }
    public static void listarArticulos(){
        for (Articulo l : articulos) {
            System.out.println(l);
        }
    
    }
    public static void listarcurso(){
        for (CursoEnLinea l : cursos) {
            System.out.println(l);
        }
    
    }
    public static void listarConferencia(){
        for (ConferenciaVirtual l : conferencias) {
            System.out.println(l);
        }
    
    }
    public static void eliminar (){
       
        System.out.println(" Ingrese lo que desea eliminar ");
        System.out.println("1. Libro ");
        System.out.println("2. Articulo ");
        System.out.println("3. Cursos en linea ");
        System.out.println("4. Conferencias virtuales ");
        int op=leer.nextInt();
        while (op>0 && op<5){
            switch (op){
                case 1:
                    System.out.println(" Ingrese lo que desea eliminar ");
                    String titulo=leer.next();
                    eliminarLibro(titulo);
                    break;
                case 2:
                    System.out.println(" Ingrese lo que desea eliminar ");
                    String titulo2=leer.next();
                    eliminarArticulo(titulo2);
                    
                    break;
                case 3:
                    System.out.println(" Ingrese lo que desea eliminar ");
                    String titulo3=leer.next();
                    eliminarCurso(titulo3);
                    
                    break;
                case 4:
                    System.out.println(" Ingrese lo que desea eliminar ");
                    String titulo4=leer.next();
                    eliminarConferencia(titulo4);
                    break;
            }
        System.out.println(" Ingrese lo que desea eliminar ");
        System.out.println("1. Libro ");
        System.out.println("2. Articulo ");
        System.out.println("3. Cursos en linea ");
        System.out.println("4. Conferencias virtuales ");
         op=leer.nextInt();
        }
        
    }
    
    public static void eliminarLibro (String titulo){
          boolean existe=false;
            for (int i = 0; i < Libros.size(); i++) {
                if (Libros.get(i).getTitulo().equals(titulo)){
                    existe=true;
                    Libros.remove(i);
                    System.out.println(titulo);
                }
    }
    
       
    }
     public static void eliminarArticulo (String titulo){
          boolean existe=false;
            for (int i = 0; i < articulos.size(); i++) {
                if (articulos.get(i).getTitulo().equals(titulo)){
                    existe=true;
                    articulos.remove(i);
                    System.out.println(titulo);
                }
    }
    
       
    }
     public static void eliminarCurso (String titulo){
          boolean existe=false;
            for (int i = 0; i < cursos.size(); i++) {
                if (cursos.get(i).getTitulo().equals(titulo)){
                    existe=true;
                    cursos.remove(i);
                    System.out.println(titulo);
                }
    }
    
       
    }
     public static void eliminarConferencia (String titulo){
          boolean existe=false;
            for (int i = 0; i < conferencias.size(); i++) {
                if (conferencias.get(i).getTitulo().equals(titulo)){
                    existe=true;
                    conferencias.remove(i);
                    System.out.println(titulo);
                }
    }
    
       
    }
     
     public static void Modificar (){
        System.out.println(" Ingrese lo que desea modificar ");
        System.out.println("1. Libro ");
        System.out.println("2. Articulo ");
        System.out.println("3. Cursos en linea ");
        System.out.println("4. Conferencias virtuales ");
        int op=leer.nextInt();
        while (op>0 && op<5){
            switch (op){
                case 1:
                    System.out.println(" Ingrese el titulo ");
                    String name=leer.next();
                    System.out.println(" Ingrese la nueva informacion: ");
                     String nuevo=leer.next();
                     modiLibro(name, nuevo);
                    break;
                case 2:
                     System.out.println(" Ingrese el titulo ");
                     name=leer.next();
                    System.out.println(" Ingrese la nueva informacion: ");
                     nuevo=leer.next();
                     modiArti(name, nuevo);
                    break;
                case 3:
                     System.out.println(" Ingrese el titulo ");
                     name=leer.next();
                    System.out.println(" Ingrese la nueva informacion: ");
                     nuevo=leer.next();
                     modicurso(name, nuevo);
                    break;
                case 4:
                     System.out.println(" Ingrese el titulo ");
                     name=leer.next();
                     System.out.println(" Ingrese la nueva informacion: ");
                     nuevo=leer.next();
                     modiConfe(name, nuevo);
                    break;
                    
            
            
            }
        System.out.println(" Ingrese lo que desea modificar ");
        System.out.println("1. Libro ");
        System.out.println("2. Articulo ");
        System.out.println("3. Cursos en linea ");
        System.out.println("4. Conferencias virtuales ");
        op=leer.nextInt();
        
        }
        
        
     
     
     
     }
     public static void modiLibro(String busquedad, String nueva){
        
        for (int i = 0; i < Libros.size(); i++) {
        if (Libros.get(i).getTitulo().equalsIgnoreCase(busquedad)) {
            Libros.get(i).setTitulo(nueva);
            System.out.println( Libros.get(i));
            
        }
    }

     
     }
      public static void modiArti(String busquedad, String nueva){
        
        for (int i = 0; i < articulos.size(); i++) {
        if (articulos.get(i).getTitulo().equalsIgnoreCase(busquedad)) {
            articulos.get(i).setTitulo(nueva);
            System.out.println( articulos.get(i));
            
        }
    }

     
     }
       public static void modicurso(String busquedad, String nueva){
        
        for (int i = 0; i < cursos.size(); i++) {
        if (cursos.get(i).getTitulo().equalsIgnoreCase(busquedad)) {
            cursos.get(i).setTitulo(nueva);
            System.out.println( cursos.get(i));
            
        }
    }

     
     }
        public static void modiConfe(String busquedad, String nueva){
        
        for (int i = 0; i < conferencias.size(); i++) {
        if (conferencias.get(i).getTitulo().equalsIgnoreCase(busquedad)) {
            conferencias.get(i).setTitulo(nueva);
            System.out.println( conferencias.get(i));
            
        }
    }

     
     }
      
    
}
