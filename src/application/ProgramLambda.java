package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.ProductLambda;

public class ProgramLambda {

    public static void main(String[] args) {
        List<ProductLambda> list = new ArrayList<>();

        list.add(new ProductLambda("Tv", 900.00));
        list.add(new ProductLambda("Mouse", 50.00));
        list.add(new ProductLambda("Tablet", 350.50));
        list.add(new ProductLambda("HD Case", 80.90));

        List<String> names = list.stream()
                                 .map(p -> p.getName().toUpperCase())
                                 .collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}
