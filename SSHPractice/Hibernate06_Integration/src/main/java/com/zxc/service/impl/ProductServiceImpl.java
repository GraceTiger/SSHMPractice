package com.zxc.service.impl;

import com.zxc.model.Category;
import com.zxc.model.Product;
import com.zxc.service.IProductService;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("productService")
@Transactional
public class ProductServiceImpl implements IProductService {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(int categoryNo, String name, double price, int qty) throws Exception {
        Product product = new Product(null,name,price,qty,new Category(categoryNo,null,null));
        sessionFactory.getCurrentSession().save(product);
    }

    @Override
    public void modify(int no, String name, int categoryNo, double price, int qty) throws Exception {
        Product product = new Product(no,name,price,qty,new Category(categoryNo,null,null));
        sessionFactory.getCurrentSession().update(product);
    }

    @Override
    public void changePrice(int productNo, double price) throws Exception {
        Product product = this.getProduct(productNo);
        product.setPrice(price);
    }

    @Override
    public double getPriceByProduct(int productNo) throws Exception {
        return this.getProduct(productNo).getPrice();
    }

    @Override
    public void delete(int no) throws Exception {
        sessionFactory.getCurrentSession().delete(new Product(no,null,null,null,null));
    }

    @Override
    public Product getProduct(int no) throws Exception {
        return sessionFactory.getCurrentSession().get(Product.class,no);
    }

    @Override
    public double getAmountByProduct(int productNo) throws Exception {
        Product product = this.getProduct(productNo);
        return product.getPrice() * product.getQty();
    }

    @Override
    public Double getTotalQTYByCategory(int categoryNo) throws Exception {
        Query<Double> query = sessionFactory.getCurrentSession().
                createQuery("select sum(p.price * p.qty) from Product as p where p.category.no = :categoryNo",Double.class);
        query.setParameter("categoryNo", categoryNo);
        return query.uniqueResult();
    }

    @Override
    public boolean checkProductInCategory(int productNo, int categoryNo) throws Exception {
        return getProduct(productNo).getCategory().getNo().equals(categoryNo);
    }
}
