package com.meme.order;

public interface OrderService {

  Order createOrder(Long memberId, String itemName, int itemPrice);

}
