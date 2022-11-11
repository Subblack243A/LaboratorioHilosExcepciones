package excepciones;

import java.util.Scanner;

public class TratadoExcepciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, res;
        String c, d;
        System.out.println("Ingrese un dividendo y un divisor");
        c = sc.next();
        d = sc.next();
        try {
            a = Integer.parseInt(c);
            b = Integer.parseInt(d);
            /*Como hereda de Runtime no hay que caprurarlo con un try catch
              pero si heredara de Exception u otro que herede de Exception si se tendria que capturar
              try{
                minNumber(a, b);
              }catch(Exception e){
                System.out.println("El numero es menor que 10")
              }*/
            minNumber(Integer.parseInt(c), Integer.parseInt(d));
            res = a / b;
        } catch (NumberFormatException nfE) {
            System.out.println("Formato Incorrecto" + nfE.getMessage());
        } catch (ArithmeticException aE) {
            System.out.println("No se puede dividir por cero." + aE.getMessage());
        }
        //Queria poner una excepcion si pasaba del tamaño de los enteros pero al parecer tambien es un NumberFormatException
    }

    public static void minNumber(int a, int b) throws MinNumberExpection{
        if(a<10 || b<10){
            throw new MinNumberExpection("El número es menor que 10");
        }
    }
}
