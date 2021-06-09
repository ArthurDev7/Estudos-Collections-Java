package EstudoCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class estudoList {
    public static void main(String[] args) {

        /* Start with List<type> name = new ArrayList<type again>();
        then, add all elements with: name.add(elements); */
        System.out.println("crie uma lista com sete notas: ");
        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
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

        // "name.get(index);" return the element from index
        System.out.println(notas);
        System.out.println("Comando get retornando um elemento pelo índece: " + notas.get(2)+ "\n");

        // This class consists exclusively of static methods that operate on or return collections
        // In this case: return the minimum and the maximum of the list
        System.out.println("O MENOR elemento: " + Collections.min(notas));
        System.out.println("O MAIOR elemento: " + Collections.max(notas)+ "\n");

        // Print the sum of all elements
        System.out.println("Imprimir a soma de todos os elementos");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        //Double next;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Total da soma: "+soma+ "\n");

        // element average
        System.out.println("Média de todos as notas: "+ soma/notas.size() + "\n");

        // Remove element
        System.out.println("Remover a nota 0.0");
        notas.remove(0.0);
        System.out.println("Removendo... "+ notas + "\n");

        // Erase all elements smaller than 7
        System.out.println("Apagar todos os elementos menores que 7");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas + "\n");

        // Erase all elements

        notas.clear();
        System.out.println("Apagando todos os elementos... done!!!!!" + "\n");

        System.out.println("Verificando se está vazia... " + notas.isEmpty());
    }
}
