package fr.declaration.variable;

public class DeclarationApp {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4L;
        float f = 5.0f;
        double d = 6.0;
        char c = 'A';
        boolean bool = true;
        String str = "Hello, World!";

        // Afficher les valeurs des variables
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(bool);
        System.out.println(str);

        // Déclarer la variable randomString
        String randomString = "Here is the result of a calculation: 1+5=6";
        System.out.println(randomString);

        // Modifier la variable randomString pour inclure un retour à la ligne
        randomString = "Here is the result of a calculation:\n1+5=6";
        System.out.println(randomString);
    }
}
