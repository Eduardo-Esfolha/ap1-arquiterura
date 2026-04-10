import domain.Product;
import service.ProductService;
import utils.GenerateValue;

import java.math.BigDecimal;

void main() {
    ProductService productService = new ProductService();

    productService.create(new Product(
            GenerateValue.uuid(),
            "SKU",
            "esfolhadiparis",
            (7))
    );

    productService.listAll();


}