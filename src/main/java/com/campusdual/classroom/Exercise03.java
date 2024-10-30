package com.campusdual.classroom;

public class Exercise03 {

    // Esto es una funcion, ya que devuelve un valor
    // Tiene que devolver el siguiente mensaje: "Hola. Bienvenido " y la cadena de textos que se le pasa por parámetro.
    public static String greetings(String name) {
       return "Hola. Bienvenido "+ name;
    }

    // Esto es una funcion, ya que devuelve un valor
    // Tiene que devolver el siguiente mensaje: "Ups. No pudimos validar tus datos.
    // Tu nombre de usuario no es " y la cadena de texto que se le pasa por parámetro
    public static String error(String name) {
        return "Ups. No pudimos validar tus datos. Tu nombre de usuario no es " + name;

    }

    //Esto es un procedimiento, ya que no devuelve un valor
    //Tiene que comprobar si el usuario que recibe por parámetro es "Sebas" y su contraseña es "sebas01".
    // Si es correcto, que muestre el mensaje de la función greetings() y si no que muestre el mensaje de la función error()
    public static void checkUser(String name, String pass) {
        if(name.equals("Sebas") && pass.equals("sebas01")) {
            System.out.println(greetings(name));
        }else {
                System.out.println(error("Sebas"));
        }

    }


    public static void main(String[] args) {
       checkUser("Sebas", "sebas01"); //caso de éxito
       checkUser("javi", "quePasa"); //caso de error
    }
}
