package EstudoCollections;

import java.util.ArrayList;
import java.util.List;

public class estudoList {
    public static void main(String[] args) {

        /* Start with List<type> name = new ArrayList<type again>();
        then, add all elements with: name.add(elements); */
        System.out.println("crie uma lista com sete notas: ");
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(7.0);
        notas.add(3.6);
        System.out.println(notas + "\n");

        // Use the "name.indexOf(name of element)" to show the index
        System.out.println("O index do elemento 5.0 é: "+notas.indexOf(5.0) + "\n");

        // To add more elements = name.add(index: position, element: item);
        System.out.println("Adicionar no index '4' o elemento '8.0'");
        notas.add(4,8.0);
        System.out.println("Elemento adicionado: " + notas + "\n");

        // To replace a element: name.set(index: position, element: item);
        System.out.println("Substituir um elemento");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println("Substituindo '5.0' por '6.0': " + notas+ "\n");

        // notas.contains(element) = to check the element
        System.out.println("Conferindo se a nota '5.0' está na lista: " + notas.contains(5.0)+ "\n");
    }
}
