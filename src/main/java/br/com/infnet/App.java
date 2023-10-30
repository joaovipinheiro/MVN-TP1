package br.com.infnet;

import br.com.infnet.package1.*;
import br.com.infnet.package2.*;
import br.com.infnet.package3.*;


public class App {
    public static void main(String[] args) {
        System.out.println("Exemplo de um projeto Java com pacotes.");
        // Criando objetos das classes de diferentes pacotes
        Classe1 objeto1 = new Classe1();
        Classe2 objeto2 = new Classe2();
        Classe3 objeto3 = new Classe3();

        objeto1.metodo1();
        objeto2.metodo2();
        objeto3.metodo3();


    }
}

