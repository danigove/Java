package examen1eva;
import java.util.Scanner;

//Autor :  Daniel Gomez Vela

public class Calculadora {

    private int a;
    private int b;
    private int result;
    
    public Calculadora(){
        
    }
    public void menuCal(){
        Scanner sc = new Scanner(System.in);
        int a;
        do{
            System.out.println("**********************");
            System.out.println("*Calculadora avanzada*");
            System.out.println("**********************");
            System.out.println("1- Introducir valores.");
            System.out.println("2- Generar valores aleatorios.");
            System.out.println("3- Sumar valores.");
            System.out.println("4- Restar valores.");
            System.out.println("5- Multiplicar valores.");
            System.out.println("6- Dividir valores.");
            System.out.println("7- Potenciar A.");
            System.out.println("8- Raiz cuadrada de B.");
            System.out.println("9- Factorial recursivo de un numero.");
            System.out.println("10- Convertir a numeros romanos");
            System.out.println("11- Convertir euros");
            System.out.println("0- Salir.");
            System.out.print("Introduzca opcion deseada: ");
            a= sc.nextInt();
            evalOpcion(a);
        }while(a!=0);
        
    }
    
    public  void evalOpcion(int a){
        switch (a){
            case 1:introValores();
                    break;
            case 2:genAle();
                    break;
            case 3:sumarVal();
                    break;
            case 4:restarVal();
                    break;
            case 5:multiVal();
                    break;
            case 6:divVal();
                    break;
            case 7:potenciaA();
                    break;
            case 8:raizCuaB();
                    break;
            case 9:recursi();
                    break;
            case 10:convertirRomano();
                    break;
            case 11:enteroAEuros();
                    break;
            case 0: System.out.println("Saliendo...");
                    break;
            default: System.out.println("Opcion no disponible, por favor introduzca otro valor.");
                    break;
        }
    }
    //opcion 1 de la calculadora;
    public void introValores(){
        Scanner sc = new Scanner(System.in);
        int t,y;
        System.out.print("Introduzca primer valor: ");
        t = sc.nextInt();
        System.out.println("Introduzca segundo valor: ");
        y = sc.nextInt();
        a=t;
        b=y;
        System.out.println("a = " + this.a + "b = this.b");
      
    }
    
    //Opcion 2 de la calculadora
    public void genAle(){
        this.a = (int) (Math.random()*1000+1);
        this.b = (int) (Math.random()*1000+1);
        System.out.println("a = " + this.a + "b = this.b");

    }
    
    //Opcion 3 de la calculadora
    public void sumarVal(){
        result = a+b;
        System.out.println("El resultado de la suma es: " + result);

    }
    
    //Opcion 4 de la calculadora
    public void restarVal(){
        result = a-b;
        System.out.println("El resultado de la resta es: " + result);

    }
    
    //Opcion 5 de la calculadora
    public void multiVal(){
        result = a*b;
        System.out.println("El resultado de la multiplicacion es: " + result);
    }
    
    //Opcion 6 de la calculadora
    public void divVal(){
         result = (int) (a/b);
         System.out.println("El resultado de la division es: " + result);
    }
    
    //Opcion 7 de la calculadora
    public void potenciaA(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el valor por el cual quiere elevar A: ");
        int aux = sc.nextInt();
        result = (int) Math.pow(a, aux);
        System.out.println("La potencia de A a la " + aux + " es: " + result);
    }
    
    //Opcion 8 de la calculadora
    public void raizCuaB(){
        result =(int) Math.sqrt(b);
        System.out.println("La raiz cuadrada del valor b(" + b + ") es: " + result );
    }
    
    //Opcion 9 de la calculadora
    public void recursi(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero del cual quiere el factorial: ");
        int aux = sc.nextInt();
        System.out.println("El factorial de " + aux + " es ugual a " + factorial(aux));
    }
    
    //metodo de calcular factoriales para la opcion 9 de la calculadora; 
    private int factorial(int a){
        int aux=1;
        for (int i = 1; i <= a ; i++) {
            if(a==0){
                return 1;
            }
            if(a==1){
                return 1;
            }
            return a * factorial(a-1);
        }
        return aux;
    }
    
    //Opcion 10 de la calculadora
    public void convertirRomano(){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Introduzca lo que quiere pasar a numero decimal del romano: ");
        String aux = sc.next();
        char ante='I';
        result = 0;
        for (int i = 0; i < aux.length(); i++) {
            if(esRomano(aux.charAt(i))){
                System.out.println(aux.charAt(i) + " es un numero Romano");
                if(Character.toUpperCase(aux.charAt(i))=='I'&& ante!='I'){
                    result+=(/*valorRoma(aux.charAt(ante)) -*/ valorRoma(aux.charAt(i))) ;
                }else{
                    result+=valorRoma(aux.charAt(i));
                    ante=aux.charAt(i);
                    }
            }else{
                System.out.println(aux.charAt(i) + " NO es un numero Romano");
                break;
            }
        }
        System.out.println("El resultado es " + result);
        
    }

    //Operaciones de apoyo para la opcion 11 de la calculadora
    private boolean esRomano(char a){
        return (Character.toUpperCase(a)=='I' || Character.toUpperCase(a)=='V' || Character.toUpperCase(a)=='X' || Character.toUpperCase(a)=='L' || Character.toUpperCase(a)=='C' || Character.toUpperCase(a)=='D' || Character.toUpperCase(a)=='M');
    }
    private int valorRoma(char a){
        int aux=0;
        if(Character.toUpperCase(a)=='I'){
        aux = 1;
        }
        if(Character.toUpperCase(a)=='V'){
        aux = 5;
        }
        if(Character.toUpperCase(a)=='X'){
        aux = 10;
        }
        if(Character.toUpperCase(a)=='L'){
        aux = 50;
        }
        if(Character.toUpperCase(a)=='C'){
        aux = 100;
        }
        if(Character.toUpperCase(a)=='D'){
        aux = 500;
        }
        if(Character.toUpperCase(a)=='M'){
        aux = 1000;
        }
        return aux;
    }
    
    //Opcion 11 de la calculadora
    public void enteroAEuros(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Introduzca cantidad que quiere convertir a euros");
        int total = sc.nextInt();
        
        int aux500=0, aux200=0, aux100=0,aux50=0,aux10=0,aux5=0;       
        if(total>=0){
            do{
                if(total/500>=1){
                    aux500 = (int) (total/500);
                    System.out.println(total);
                    total = total%500;
                    System.out.println(total);
                }
                if(total/200>=1){
                    aux200 = (int) total/200;
                    total = total%200;
                }
                if(total/100>=1){
                    aux100 = (int) total/100;
                    total = total%100;
                }
                if(total/50>=1){
                    aux50 = (int) total/50;
                    total = total%50;
                }
                if(total/10>=1){
                    aux10 = (int) total/10;
                    total = total%10;
                }
                if(total/5>=1){
                    aux5 = (int) total/5;
                    total = total%5;
                }

            }while(total>5);
       
        System.out.println("De 500: " + aux500 + " de 200 " + aux200 + " de 100 " + aux100 + " de 50 " + aux50 + " de 10 " + aux10 + " de 5 " + aux5 + " lo que sobra que son " + total + " euros")  ;
        }else{
            System.out.println("Error, el numero tiene que ser mayor o igual que 0");
            enteroAEuros();
        }
    
    }
    
    //Comprobar si algo en su totalidad es un numero
    public static boolean comprobar(int a){
        String r = Integer.toString(a);
        boolean verda = true;
        for (int i = 0; i <=r.length(); i++) {
            if(Character.isDigit(r.charAt(i))){      
            }else{
                verda = false;
            } 
        }
        return verda;
    }
    
}
