
package co.edu.unicauca.openmarket.main;

import co.edu.unicauca.openmarket.access.Factory;
import co.edu.unicauca.openmarket.access.IProductRepository;
import co.edu.unicauca.openmarket.domain.service.ProductService;
import co.edu.unicauca.openmarket.presentation.GUIProducts;
import co.edu.unicauca.openmarket.access.ICategoryRepository;
import co.edu.unicauca.openmarket.domain.service.CategoryService;
import co.edu.unicauca.openmarket.presentation.GUICategories;

/**
 *
 * @author Libardo Pantoja
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IProductRepository repositoryProduct = Factory.getInstance().getProductRepository("default");
        ProductService productService = new ProductService(repositoryProduct);
        
        GUIProducts instanceProduct = new GUIProducts(productService);
        instanceProduct.setVisible(true);
        
        ICategoryRepository repositoryCategory = Factory.getInstance().getCategoryRepository("default");
        CategoryService categoryService = new CategoryService(repositoryCategory);
        
        GUICategories instanceCategory = new GUICategories(categoryService);
        instanceCategory.setVisible(true);
    }
    
}
