package factory;

public class DeliveryByTruck implements PackageDelivery {

  @Override
  public String deliveryWay(PackageInfo packageInfo) {
    return "Package delivering using truck for " + packageInfo.getSize()
        + " and weight " + packageInfo.getWeight();
  }
}
