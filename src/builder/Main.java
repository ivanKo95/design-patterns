package builder;

public class Main {
  public static void main(String[] args) {
    Person person = new Person.Builder()
        .withName("Nick")
        .withSurname("Butt")
        .withAge(23)
        .withHeight(182)
        .withWeight(84)
        .build();

    System.out.println(person);
  }
}
