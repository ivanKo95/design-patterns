package factory;

public class DeliveryByBicycle implements PackageDelivery {

  @Override
  public String deliveryWay(PackageInfo packageInfo) {
    return "Package delivering using bicycle for " + packageInfo.getSize()
        + " and weight " + packageInfo.getWeight();
  }
}
