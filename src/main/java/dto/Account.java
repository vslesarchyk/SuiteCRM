package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
@Builder
public class Account {

    @Builder.Default
    private String name = "Test";
    @Builder.Default
    private String phone = "+375295551111";
    @Builder.Default
    private String fax = "+375295551111";
    @Builder.Default
    private String website = "https://demo.suiteondemand.com/";
    @Builder.Default
    private String email_address = "test@test.com";
    @Builder.Default
    private boolean optedOut = true;
    @Builder.Default
    private String street1 = "Street1";
    @Builder.Default
    private String street2 = "Street2";
    @Builder.Default
    private String city1 = "City1";
    @Builder.Default
    private String city2 = "City2";
    @Builder.Default
    private String state1 = "State1";
    @Builder.Default
    private String state2 = "State2";
    @Builder.Default
    private String postal_code1 = "12345";
    @Builder.Default
    private String postal_code2 = "54321";
    @Builder.Default
    private String country1 = "Country1";
    @Builder.Default
    private String country2 = "Country2";
    @Builder.Default
    private String description = "Test";
    @Builder.Default
    private String type = "Customer";
    @Builder.Default
    private String industry = "Banking";
}
