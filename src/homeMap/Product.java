package homeMap;

import java.util.Objects;

public class Product {
    public String name;
    public String objectToy;

    public Product(String name, String objectToy) {
        this.name = name;
        this.objectToy = objectToy;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(objectToy, product.objectToy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, objectToy);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", objectToy='" + objectToy + '\'' +
                '}';
    }
}
