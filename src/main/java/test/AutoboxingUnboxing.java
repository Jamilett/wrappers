package test;

/**
 * Esta clase contiene un metodo main que permite poner a prueba el proceso de
 * Autoboxing y Autounboxing para convertir datos de tipo primitivo a Object y
 * viceversa
 *
 * @author jamsr
 */
public class AutoboxingUnboxing {

    public static void main(String[] args) {
        // No se hace ningun tipo de conversión, automaticamente lo ejecuta el compilador

        // Autoboxing, envuelve tipos primitivos en clases wrapper
        Integer enteroObj = 10;
        System.out.println("enteroObj = " + enteroObj);
        // Al ser un objeto podemos acceder a los métodos correspondientes a la Clase 
        System.out.println("enteroObj float value = " + enteroObj.floatValue());

        //Unboxing, extrae el tipo primitivo del objeto envolvente (wrapper)
        int entero = enteroObj;
        System.out.println("entero = " + entero);

        //
        Float floatObj = 15.4F;
        System.out.println("floatObj = " + floatObj);
        System.out.println("floatObj entero = " + floatObj.intValue());
        float flotante = floatObj;
        System.out.println("flotante = " + flotante);

        //Listado de wrappers
        // boolean - Boolean
        // byte - Byte
        // char - Character
        // float - Float
        // long - Long
        // int - Integer
        // short - Short
        // double - Double
    }

}
