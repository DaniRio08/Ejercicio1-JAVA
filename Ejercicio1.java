import java.util.*;
/* 1. Prepara un menú que seleccione la ejecución de los diferentes ejercicios que se piden a continuación. 
Este menú se debe realizar con un switch. */

/* 2. Crea un método para todos y cada uno de los siguientes ejercicios. El método debe incorporar el calificador de 
acceso “public static'' y tener un nombre adecuado a lo que se solicita. La llamada al método se debe realizar 
desde el switch codificado en el ejercicio anterior */

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char opción = 'x';
        do {
        System.out.println("");
        System.out.println("*************************************");
        System.out.println("*                                   *");
        System.out.println("*          MENÚ PRÁCTICA 1          *");
        System.out.println("*                                   *");
        System.out.println("*************************************");
        System.out.println("*                                   *");
        System.out.println("* a) 5 números                      *");
        System.out.println("* b) 5 números invertido            *");
        System.out.println("* c) Media + o - y zeros            *");
        System.out.println("* d) Contar caracteres de un texto  *");
        System.out.println("* e) Texto invertido                *");
        System.out.println("* f) Quitar espacios a un texto     *");
        System.out.println("* g) Concatenar dos cadenas         *");
        System.out.println("* h) Cadena con una sola vocal      *");
        System.out.println("* i) Código ASCII de una cadena     *");
        System.out.println("* x) Salir                          *");
        System.out.println("*                                   *");
        System.out.println("*************************************");
        System.out.println("");

        System.out.print("¿Que opción eliges?: ");
        opción = scan.next().charAt(0);

        //Esto sirve para hacer lo mismo que el comando cls, es decir, limpia la pantalla
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
        
        //Switch para manejar las diferentes opciones
        Scanner sc = new Scanner(System.in);
        switch (opción) {
            case('a'):
                System.out.println("5 números");
                System.out.println("");
                cinco_números();
                break;
            case('b'):
                System.out.println("5 números invertido");
                System.out.println("");
                números_inverso();
                break;
            case('c'):
                System.out.println("Media + o - y zeros");
                System.out.println("");
                mediaPos_mediaNeg_Ceros();
                break;
            case('d'):
                System.out.println("Contar caracteres de un texto");
                System.out.println("");
                System.out.print("Escribe un texto del tamaño que quieras: ");
                String textoCaracteres = sc.nextLine();
                System.out.println("");
                System.out.println("Tu texto tiene " + contarCaracteres(textoCaracteres) + " caracteres contando los espacios.");
                break;
            case('e'):
                System.out.println("Texto invertido");
                System.out.println("");
                System.out.print("Escribe lo que quieras y lo verás escrito al revés: ");
                String textoInvertido = sc.nextLine();
                System.out.println("");
                System.out.println("Tu texto invertido es: " + textoInvertido(textoInvertido));
                break;
            case('f'):
                System.out.println("Quitar espacios a un texto");
                System.out.println("");
                System.out.print("Escribe un texto y verás como queda sin espacios: ");
                String textoEspacios = sc.nextLine();
                System.out.println("");
                System.out.println("Tu texto sin espacios: " + quitarEspacios(textoEspacios));
                break;
            case('g'):
                System.out.println("Concatenar dos cadenas");
                System.out.println("");
                System.out.print("Escribe un texto: ");
                String primerTexto = sc.nextLine();
                System.out.println("");
                System.out.print("Escribe otro texto para ver como queda concatenado con el anterior: ");
                String segundoTexto = sc.nextLine();
                System.out.println("");
                System.out.println("La cadena concatenada es:" + concatenarDosCadenas(primerTexto, segundoTexto));
                break;
            case('h'):
                System.out.println("Cadena con una sola vocal");
                System.out.println("");
                System.out.print("Escribe un texto: ");
                String textoVocal = sc.nextLine();
                System.out.println("");
                System.out.print("Escribe una vocal para que sea la única vocal de la frase anterior: ");
                String vocalUsuario = sc.nextLine();
                System.out.println("");
                cambioVocales(textoVocal, vocalUsuario);
                break;
            case('i'):
                System.out.println("Código ASCII de una cadena");
                System.out.println("");
                System.out.print("Escribe un texto: ");
                String textoASCII = sc.nextLine();
                System.out.println("");
                códigoASCII(textoASCII);
                break;
            case('x'):
                System.out.println("Hasta la próxima");
                break;
            default:
                System.out.println("Esa opción no existe, vuelve a intentarlo: ");
                break;
            }
        }while (opción != 'x');
    }

    //Ejercicio a: Leer 5 números y mostrarlos en el mismo orden introducido. Los 5 números se deben almacenar en un array
    public static void cinco_números() {
        Scanner scan = new Scanner(System.in);
        int[] números = new int[5];
        //Bucle que pide 5 números al usuario y los va añadiendo a la lista
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el " + (i + 1) + "º número: ");
            int numUsuario = scan.nextInt();
            números[i] = numUsuario;
        }
        //Se recorre la lista creada y se muestran los números en el orden introducido
        System.out.println("");
        System.out.print("Estos son los números que has introducido: ");
        for (int num : números) {
            System.out.print(num + " ");
        }
        System.out.println("");
    }

    //Ejercicio b: Leer 5 números y mostrarlos en orden inverso al introducido.
    public static void números_inverso() {
        Scanner scan = new Scanner(System.in);
        int[] inversos = new int[5];
        //Bucle que pide 5 números al usuario y los va añadiendo a la lista
        for (int i = 0; i < 5; i++ ) {
            System.out.print("Introduce el " + (i+1) + "º número: ");
            int numUsuario = scan.nextInt();
            inversos[i] = numUsuario;
        }
        //Se recorre la lista creada pero en orden inverso, par imprimir los números empezando por el último
        System.out.println("");
        System.out.print("Estos son los números que has introducido pero en orden inverso: ");
        for (int i = inversos.length - 1; i >= 0; i--) {
            System.out.print(inversos[i] + " ");
        }
        System.out.println("");
    }

    /*Ejercicio c: Leer 5 números por teclado y a continuación realizar la media de los números positivos, 
    la media de los negativos y contar el número de ceros que se han introducido por teclado. */
    public static void mediaPos_mediaNeg_Ceros() {
        Scanner scan = new Scanner(System.in);
        int[] medias = new int[5];
        //Variables necesarias para hacer la media
        int contNegativos = 0;
        int contPositivos = 0;
        int contCeros = 0;
        float sumaNegativos = 0;
        float sumaPositivos = 0;
        //Bucle que pide 5 números al usuario y los va añadiendo a la lista
        for (int i = 0; i < 5; i++ ) {
            System.out.print("Introduce el " + (i+1) + "º número: ");
            int numUsuario = scan.nextInt();
            if (numUsuario < 0) {
                contNegativos +=1;
                sumaNegativos +=numUsuario;
            }
            else if (numUsuario > 0) {
                contPositivos +=1;
                sumaPositivos +=numUsuario;
            }
            else {
                contCeros +=1;
            }
            medias[i] = numUsuario;
        }
        System.out.println("");
        System.out.println("Esta es la lista que has de números que has introducido: " + Arrays.toString(medias));
        System.out.println("La media de los números positivos introducidos es: " + (sumaPositivos/contPositivos));
        System.out.println("La media de los números negativos introducidos es: " + (sumaNegativos/contNegativos));
        System.out.println("Has introducido un total de " + contCeros + " ceros");
    }

    //Ejercicio d: Reciba como parámetro un texto y devuelva la cantidad de caracteres que incorpora el texto.
    public static Integer contarCaracteres(String texto) {
        return texto.length();
    }

    //Ejercicio e: Reciba como parámetro un texto y devuelva el texto invertido.
    public static String textoInvertido(String texto) {
        String textoInvertido = "";
        //Bucle para generar el texto invertido
        for (int i = texto.length() - 1; i >= 0; i--) {
            char letra = texto.charAt(i);
            textoInvertido += letra;
        }
        return textoInvertido;
    }

    //Ejercicio f: Reciba como parámetro un texto y lo devuelva sin espacios en blanco.
    public static String quitarEspacios(String texto) {
        String textoSinEspacios = "";
        //Bucle para generar quitar los espacios al texto
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (letra != ' ') {textoSinEspacios += letra;}
        }
        return textoSinEspacios;
    }

    //Ejercicio g: Reciba como parámetro dos cadenas y las devuelva concatenadas.
    public static String concatenarDosCadenas(String texto1, String texto2) {
        return texto1 + " " + texto2;
    }

    /*Ejercicio h: Reciba como parámetro una cadena y una vocal, el método sustituye todas las vocales de la 
    cadena por la vocal que se ha pasado como parámetro (no devuelve nada).*/
    public static void cambioVocales(String texto, String vocal) {
        String cambioVocal = "";
        //Bucle que sustituye todas las vocales por la introducida por el usuario
        for (int i = 0; i < texto.length(); i++) {
            if ((texto.charAt(i) == 'a') || ((texto.charAt(i) == 'e')) || ((texto.charAt(i) == 'i')) || ((texto.charAt(i) == 'o'))
            || ((texto.charAt(i) == 'u')) || ((texto.charAt(i) == 'A')) || ((texto.charAt(i) == 'E')) || ((texto.charAt(i) == 'I'))
            || ((texto.charAt(i) == 'O')) || ((texto.charAt(i) == 'U'))) {
                cambioVocal +=vocal;
            }
            else {
                cambioVocal +=texto.charAt(i);
            }
        }
        System.out.println("Esta es la frase con las vocales reemplazadas por la que has elegido: ");
        System.out.println(cambioVocal);
    }

    /*Ejercicio i: Reciba como parámetro una cadena, y muestre el código ASCII de cada uno de los caracteres de la 
    cadena (no devuelve nada el método).*/
    public static void códigoASCII(String texto) {
        String cadenaASCII = "";
        //Bucle que cambia cada carácter del texto por su correspondiente valor ASCII
        for (int i = 0; i < texto.length(); i++) {
            int valorASCII = texto.charAt(i);
            cadenaASCII += valorASCII + " ";
        }
        System.out.println("Tu texto en ASCII es: " + cadenaASCII);
    }
}