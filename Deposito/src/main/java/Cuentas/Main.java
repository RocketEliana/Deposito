
package Cuentas;

/**
 *
 * @author bicho
 */
public class Main {

    public static void main(String[] args) {
    /**Se ha cambiado micuenta por cuenta1 para tener mejor legibilidad de codigo mediante refactorizacion, 
         instanciamos objeto de la clase CCuenta*/
        CCuenta cuenta1;
    /**declaramos la variable saldoActual, que invoca al estado de la cuenta1*/
                
        double saldoActual;

        operativa_cuenta(null);
    }
/**Incluimos el metodo operativa_cuenta que englobe las sentencias de la clase Main que operan con el objeto cuenta1*/
    private static void operativa_cuenta(java.lang.Float cantidad) {
        CCuenta cuenta1;
        double saldoActual;
 /**Constructor con atributos asignados
  * @param nombre
  * @param cuenta
  * @param saldo
  */

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
/**Se imprime el saldo actual
 * @param saldo cuenta
 */
        System.out.println("El saldo actual es"+ saldoActual );
        
/**Llamada a las excepciones creadas en la clase CCuenta para informarnos de que no tenemos suficiente saldo
 * o en el caso de que hayamos ingresado una cantidad negativa
 * @excepcion nos imprime fallo al retirar cuando la cantidad es superior al saldo disponible
 */
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        
/**Devuelve excepcion cuando el ingreso es negativo
 * @excepcion el ingreso es negativo, imprime el fallo
 */
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}