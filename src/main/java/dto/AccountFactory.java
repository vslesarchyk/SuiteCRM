package dto;

import com.github.javafaker.Faker;

public class AccountFactory {

    public static Account getAccount(String type, String industry) {
        Faker faker = new Faker();
        boolean optedOut = faker.bool().bool();
        return new Account(faker.company().name(), faker.phoneNumber().phoneNumber(), faker.phoneNumber().phoneNumber(), faker.internet().domainName(), faker.internet().emailAddress(),optedOut, faker.address().streetAddress(), faker.address().city(), faker.address().state(), faker.address().zipCode(), faker.address().country(), faker.address().streetAddress(), faker.address().city(), faker.address().state(), faker.address().zipCode(), faker.address().country(),faker.lorem().paragraph(), type, industry);
          }
}
