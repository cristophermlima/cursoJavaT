package services;

import java.util.List;
import java.util.function.Predicate;

import model.FuncoesRecebemF;

public class ProductFuncoesRecebeF {

    public double filteredSum(List<FuncoesRecebemF> list, Predicate<FuncoesRecebemF> criteria) {
        double sum = 0.0;
        for (FuncoesRecebemF p : list) {
            if (criteria.test(p)) {
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
