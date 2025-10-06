package entities;

public class ProductLambda {
	
    private String name;
    private Double price;

    public ProductLambda(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + ", " + price;
    }
}
