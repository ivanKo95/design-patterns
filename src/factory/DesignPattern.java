package factory;

public class DesignPattern {

  public static void main(String[] args) {
    System.out.println("***** Delivery Manager Process Started *****");

    DeliveryManager deliveryManager = new DeliveryManager();

    PackageInfo packageInfoSmall = new PackageInfo("Small", "5");
    System.out.println(deliveryManager.deliveryManagerFactory(packageInfoSmall));

    PackageInfo packageInfoMedium = new PackageInfo("Medium", "10");
    System.out.println(deliveryManager.deliveryManagerFactory(packageInfoMedium));

    PackageInfo packageInfoLarge = new PackageInfo("Large", "20");
    System.out.println(deliveryManager.deliveryManagerFactory(packageInfoLarge));
  }
}
