package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.FuncoesRecebemF;
import services.ProductFuncoesRecebeF;

public class ProgramFreecebeFcomoParametro {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<FuncoesRecebemF> list = new ArrayList<>();

        list.add(new FuncoesRecebemF("Tv", 900.00));
        list.add(new FuncoesRecebemF("Mouse", 50.00));
        list.add(new FuncoesRecebemF("Tablet", 350.50));
        list.add(new FuncoesRecebemF("HD Case", 80.90));

        ProductFuncoesRecebeF ps = new ProductFuncoesRecebeF();

        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');

        System.out.println("Sum = " + String.format("%.2f", sum));
    }
}
