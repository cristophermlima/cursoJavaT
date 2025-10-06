package util;

import java.util.function.Function;
import entities.ProductLambda;

public class UpperCaseName implements Function<ProductLambda, String> {

    @Override
    public String apply(ProductLambda p) {
        return p.getName().toUpperCase();
    }
}
