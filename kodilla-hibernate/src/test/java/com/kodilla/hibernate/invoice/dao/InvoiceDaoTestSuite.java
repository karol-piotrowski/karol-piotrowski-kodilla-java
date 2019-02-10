package com.kodilla.hibernate.invoice.dao;


import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    ProductDao productDao;

    @Autowired
    ItemDao itemDao;

    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product smartphone = new Product("Samsung Galaxy S9");
        Product laptop = new Product("Lenovo X1 Carbon");
        Product mouse = new Product("Logitech MX Master");

        Invoice invoice = new Invoice("TEST/2019/1");

        Item smartphones = new Item(smartphone, new BigDecimal(2500), 3);
        Item laptops = new Item(laptop, new BigDecimal(4000), 2);
        Item mice = new Item(mouse, new BigDecimal(200), 12);
        smartphone.getItems().add(smartphones);
        laptop.getItems().add(laptops);
        mouse.getItems().add(mice);

        invoice.getItems().add(smartphones);
        invoice.getItems().add(laptops);
        invoice.getItems().add(mice);
        smartphones.setInvoice(invoice);
        laptops.setInvoice(invoice);
        mice.setInvoice(invoice);

        //When
        productDao.save(smartphone);
        productDao.save(laptop);
        productDao.save(mouse);
        invoiceDao.save(invoice);
        itemDao.save(smartphones);
        itemDao.save(laptops);
        itemDao.save(mice);
        int invoiceId = invoice.getId();

        //Then
        Assert.assertNotEquals(0, invoiceId);

        //CleanUp
        try {
            itemDao.delete(smartphones.getId());
            itemDao.delete(laptops.getId());
            itemDao.delete(mice.getId());
            invoiceDao.delete(invoiceId);
            productDao.delete(smartphone.getId());
            productDao.delete(laptop.getId());
            productDao.delete(mouse.getId());
        } catch (Exception e) {
            //do nothing
        }


    }

}
