package factory;

public class DeliveryByCar implements PackageDelivery {

  @Override
  public String deliveryWay(PackageInfo packageInfo) {
    return "Package delivering using car for " + packageInfo.getSize()
        + " and weight " + packageInfo.getWeight();
  }
}
