package dto;

public class Account {

    private String name;
    private String phone;
    private String fax;
    private String website;
    private String email_address;
    boolean  optedOut;
    private String street1;
    private String street2;
    private String city1;
    private String city2;
    private String state1;
    private String state2;
    private String postal_code1;
    private String postal_code2;
    private String country1;
    private String country2;
    private String description;
    private String type;
    private String industry;

    public Account(String name, String phone, String fax, String website, String email_address, boolean optedOut, String street1, String street2, String city1, String state1, String city2, String state2, String postal_code1, String postal_code2, String country1, String country2, String description, String type, String industry) {
        this.name = name;
        this.phone = phone;
        this.fax = fax;
        this.website = website;
        this.email_address = email_address;
        this.optedOut = optedOut;
        this.street1 = street1;
        this.street2 = street2;
        this.city1 = city1;
        this.state1 = state1;
        this.city2 = city2;
        this.state2 = state2;
        this.postal_code1 = postal_code1;
        this.postal_code2 = postal_code2;
        this.country1 = country1;
        this.country2 = country2;
        this.description = description;
        this.type = type;
        this.industry = industry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public boolean isOptedOut() {
        return optedOut;
    }

    public void setOptedOut(boolean optedOut) {
        this.optedOut = optedOut;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getCity1() {
        return city1;
    }

    public void setCity1(String city1) {
        this.city1 = city1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getCity2() {
        return city2;
    }

    public void setCity2(String city2) {
        this.city2 = city2;
    }

    public String getState1() {
        return state1;
    }

    public void setState1(String state1) {
        this.state1 = state1;
    }

    public String getState2() {
        return state2;
    }

    public void setState2(String state2) {
        this.state2 = state2;
    }

    public String getPostal_code1() {
        return postal_code1;
    }

    public void setPostal_code1(String postal_code1) {
        this.postal_code1 = postal_code1;
    }

    public String getPostal_code2() {
        return postal_code2;
    }

    public void setPostal_code2(String postal_code2) {
        this.postal_code2 = postal_code2;
    }

    public String getCountry1() {
        return country1;
    }

    public void setCountry1(String country1) {
        this.country1 = country1;
    }

    public String getCountry2() {
        return country2;
    }

    public void setCountry2(String country2) {
        this.country2 = country2;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }
}
