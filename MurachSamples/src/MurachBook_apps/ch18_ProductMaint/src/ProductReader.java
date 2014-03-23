package MurachBook_apps.ch18_ProductMaint.src;

import java.util.ArrayList;

public interface ProductReader
{
    Product getProduct(String code);
    ArrayList<Product> getProducts();
}