import com.github.javafaker.Faker;

public class DemoFaker {

    public static void main(String[] args) {


        Faker faker = new Faker();

        System.out.println(faker.name().fullName());
        System.out.println(faker.address().city());
        System.out.println(faker.address().country());
        System.out.println(faker.phoneNumber().phoneNumber());
        System.out.println(faker.internet().emailAddress());
        System.out.println(faker.internet().password());
    }
}
