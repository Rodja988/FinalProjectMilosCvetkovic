package dataProviders;

import com.github.javafaker.Faker;

public class DataCreation {
    public static String generateFirstName(){
        return new Faker().name().firstName();
    }
    public static String generateLastName(){
        return new Faker().name().lastName();
    }
    public static String generatePostalCode(){
        return new Faker().address().zipCode();
    }
}
