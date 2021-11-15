package hello.proxy.app.v1;

public class OrderServiceV1Imp implements OrderServiceV1{

    private final OrderRepositoryV1 orderRepository;

    public OrderServiceV1Imp(OrderRepositoryV1 orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void orderItem(String itemId) {
        orderRepository.save(itemId);
    }
}
