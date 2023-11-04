package Seminars.Seminar_03.Products;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*=========================================
* Даны сведения о товарах:
* - наименование товара,
* - страна экспорта,
* - объем поставляемой партии
* Найти страны, которые экспортируют товар,
* введенный с клав-ы, и их объм.
=========================================*/
public class Main {
    public static void main(String[] args) {
        Product product01 = new Product("ford", "UA", 5);
        Product product02 = new Product("subaru", "JP", 4);
        Product product03 = new Product("subaru", "JP", 4);
        Product product04 = new Product("subaru", "CN", 7);
        Product product05 = new Product("vaz", "RU", 3);

        List<Product> productList = new ArrayList<>();
        productList.add(product01);
        productList.add(product02);
        productList.add(product03);
        productList.add(product04);
        productList.add(product05);

        System.out.println(productList);

        Scanner scanner = new Scanner(System.in);
        String searchNameProduct = scanner.nextLine();
        Integer exportVolume = 0;
        List<String> countryList = new ArrayList<>();

        for (Product product : productList) {
            if (searchNameProduct.equals(product.nameProduct)) {
                exportVolume += product.volumeProduct;
                if (!countryList.contains(product.countryExport)) {
                    countryList.add(product.countryExport);
                }
            }
        }
        System.out.println("countryList = " + countryList);
        System.out.println("exportVolume = " + exportVolume);
    }

}
