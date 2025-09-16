package entities;

public class TreeSetProduct {
	
	 private String name;
	 private Double price;
	 public TreeSetProduct(String name, Double price) {
	 this.name = name;
	 this.price = price;
	 }
	 // (... get / set / hashCode / equals)
	 @Override
	 public String toString() {
	 return "Product [name=" + name + ", price=" + price + "]";
	 }
	 @Override
	 public int compareTo(TreeSetProduct other) {
	 return name.toUpperCase().compareTo(other.getName().toUpperCase());
	 }
}
