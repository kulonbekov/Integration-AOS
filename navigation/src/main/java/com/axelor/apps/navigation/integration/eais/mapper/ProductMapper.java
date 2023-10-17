package com.axelor.apps.navigation.integration.eais.mapper;

import com.axelor.apps.base.db.Product;
import com.axelor.apps.ens.db.repo.TnvedPositionCodeRepository;
import com.axelor.apps.navigation.integration.eais.Good;
import com.google.inject.Inject;

import java.util.ArrayList;
import java.util.List;

public class ProductMapper {

    @Inject
    private TnvedPositionCodeRepository tnvedPositionCodeRepository;

    public List<Product> toProducts(List<Good> goods) {

        List<Product> products = new ArrayList<>();
        for (Good item : goods) {
            Product product = new Product();
            product.setName(item.getGoodsName());
            product.setDescription(item.getGoodsName());
            product.setGrossWeight(item.getGrossWeight());
            product.setTnvedPositionCode(tnvedPositionCodeRepository.findByCode(item.getHSCode()));
            product.setProductNumber((int) item.getItemNum());
            products.add(product);
        }

        return products;
    }
}
