package com.kodilla.good.patterns.challenges;

public class ProductOrderingServiceMain {
    public static void main(String[] args) {
        ProductOrderRetriever productOrderRetriever = new ProductOrderRetriever();
        ProductOrder productOrder = productOrderRetriever.retrieve();

        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new MailService(), new ProductOrderService(), new ProductOrderDatabase());
        productOrderProcessor.process(productOrder);
    }


}
