package com.zxc.service;

import com.zxc.model.Product;
import org.hibernate.query.Query;

public interface IProductService {
    public void add(int categoryNo,String name,double price,int qty) throws Exception;
    public void modify(int no,String name,int categoryNo,double price,int qty) throws Exception;
    public void changePrice(int productNo, double price) throws Exception;
    public double getPriceByProduct(int productNo) throws Exception;
    public void delete(int no) throws Exception;
    public Product getProduct(int no) throws Exception;
    public double getAmountByProduct(int productNo) throws Exception;
    public Double getTotalQTYByCategory(int categoryNo) throws Exception;
    public boolean checkProductInCategory(int productNo, int categoryNo) throws Exception;
}
