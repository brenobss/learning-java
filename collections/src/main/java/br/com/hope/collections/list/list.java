package br.com.hope.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class list {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Joao");
        nomes.add("Ana");
        nomes.add("Gus");
        nomes.add("Amara");

        System.out.println(nomes);

        //Ordena os valores por ordem alfabética
        Collections.sort(nomes);

        System.out.println(nomes);

        nomes.set(1, "Breno");

        System.out.println(nomes);

        nomes.remove(1);

        System.out.println(nomes);

        Iterator<String> it = nomes.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
