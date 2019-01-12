package com.kodilla.good.patterns.challenges;

public class ProductOrderProcessor {
    private InformationService informationService;
    private ProductOrderService productOrderService;
    private ProductOrderRepository productOrderRepository;

    public ProductOrderProcessor(final InformationService informationService,
                                 final ProductOrderService productOrderService,
                                 final ProductOrderRepository productOrderRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.productOrderRepository = productOrderRepository;
    }

    public ProductOrderDto process(final ProductOrder productOrder) {
        boolean isOrdered = productOrderService.order(productOrder.getUser(), productOrder.getProducts(),
                productOrder.getOrderDate(), productOrder.getDeliveryMethod());

        if(isOrdered) {
            informationService.inform(productOrder.getUser());
            productOrderRepository.createOrder(productOrder.getUser(), productOrder.getProducts(),
                    productOrder.getOrderDate(), productOrder.getDeliveryMethod());
            return new ProductOrderDto(productOrder.getUser(), productOrder.getProducts(), true);
        } else {
            return new ProductOrderDto(productOrder.getUser(), productOrder.getProducts(), false);
        }
    }
}
