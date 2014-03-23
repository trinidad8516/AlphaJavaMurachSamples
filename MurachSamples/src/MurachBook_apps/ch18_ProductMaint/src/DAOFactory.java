package MurachBook_apps.ch18_ProductMaint.src;

public class DAOFactory
{
    // this method maps the ProductDAO interface
    // to the appropriate data storage mechanism
    public static ProductDAO getProductDAO()
    {
        ProductDAO pDAO = new ProductTextFile();
        return pDAO;
    }
}