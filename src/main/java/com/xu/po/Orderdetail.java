package com.xu.po;


public class Orderdetail {

  private long id;
  private long ordersId;
  private long itemsId;
  private long itemsNum;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getOrdersId() {
    return ordersId;
  }

  public void setOrdersId(long ordersId) {
    this.ordersId = ordersId;
  }


  public long getItemsId() {
    return itemsId;
  }

  public void setItemsId(long itemsId) {
    this.itemsId = itemsId;
  }


  public long getItemsNum() {
    return itemsNum;
  }

  public void setItemsNum(long itemsNum) {
    this.itemsNum = itemsNum;
  }

}
