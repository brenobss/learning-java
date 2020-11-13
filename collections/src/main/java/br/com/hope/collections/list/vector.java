package br.com.hope.collections.list;

import java.util.List;
import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        List<String> esportes = new Vector<>();

        esportes.add("Futsal");
        esportes.add("Dardos");
        esportes.add("Boxe");
        esportes.add("Volei");

        System.out.println(esportes);

        esportes.set(1, "Futebol");

        System.out.println(esportes);

        esportes.remove(1);

        System.out.println(esportes);

        System.out.println(esportes.size());

        System.out.println(esportes.get(0));
    }
}
