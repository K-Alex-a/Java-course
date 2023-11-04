package Seminars.Seminar_03.Products;

public class Product {
    String nameProduct;
    String countryExport;
    Integer volumeProduct;

    public Product(String nameProduct, String countryExport, Integer volumeProduct) {
        this.nameProduct = nameProduct;
        this.countryExport = countryExport;
        this.volumeProduct = volumeProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", countryExport='" + countryExport + '\'' +
                ", volumeProduct=" + volumeProduct +
                '}' + '\n';
    }
}
