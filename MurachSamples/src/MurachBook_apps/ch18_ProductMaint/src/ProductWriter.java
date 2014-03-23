package MurachBook_apps.ch18_ProductMaint.src;

public interface ProductWriter
{
    boolean addProduct(Product p);
    boolean updateProduct(Product p);
    boolean deleteProduct(Product p);
}