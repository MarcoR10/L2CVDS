package edu.eci.cvds.patterns.archetype;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        if (args.length > 0) {
            String saludo = args[0];
            if (args.length > 1) {
                for (int i = 1; i < args.length; i++) {
                    saludo += " " + args[i];
                }
            }
            System.out.println("Hello " + saludo + "!");
        } else {
            System.out.println("Hello World!");
        }
    }
}
