import java.util.Scanner; 
class sumaValores //declaracion de la clase
{
   public static void main(String args []) //declaracion del metodo main
   {
      Scanner input = new Scanner(System.in); //crea un objeto que la entrada se lee del teclado
      
      double valor1, //estas lineas son la declaracion de 3 variables
             valor2,
             suma;
             
      System.out.print("Entre valor 1: "); //imprime el mensaje en la consola
      valor1 = input.nextDouble(); //lee un valor y lo almacena en la variable valor1 
      System.out.print("Entre valor 2: "); //imprime el mensaje en la consola
      valor2 = input.nextDouble(); //lee un valor y lo almacena en la variable valor2
      
      suma = valor1 + valor2; //calcula la suma de valor1 y valor2, y la almacena en la variable suma
      
      System.out.println(valor1 + " + " + valor2 + " = " + suma); //imprime el rsultado de la suma en la consola          
   }
}