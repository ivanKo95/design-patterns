package factory;

public class DeliveryManager {

  public String deliveryManagerFactory(PackageInfo packageInfo) {
    if (packageInfo.getSize().equals("Small")) {
      return new DeliveryByBicycle().deliveryWay(packageInfo);
    }
    if (packageInfo.getSize().equals("Medium")) {
      return new DeliveryByCar().deliveryWay(packageInfo);
    }
    if (packageInfo.getSize().equals("Large")) {
      return new DeliveryByTruck().deliveryWay(packageInfo);
    }

    return "Failed to delivery";
  }
}
