package cl.corona.bbookvendor.model;

public class JsonDet {

    private String vendor_id;
    private String vendor_name;
    private String inactive;
    private String country;
    private String address_1;
    private String address_2;
    private String city;
    private String area_code;
    private String phone;
    private String email;
    private String contact_name;
    private String payment_terms;
    private String effective_days;
    private String currency;


    public JsonDet(String vendor_id, String vendor_name, String inactive, String country, String address_1, String address_2, String city, String area_code, String phone, String email, String contact_name, String payment_terms, String effective_days, String currency) {
        super();
        this.vendor_id = vendor_id;
        this.vendor_name = vendor_name;
        this.inactive = inactive;
        this.country = country;
        this.address_1 = address_1;
        this.address_2 = address_2;
        this.city = city;
        this.area_code = area_code;
        this.phone = phone;
        this.email = email;
        this.contact_name = contact_name;
        this.payment_terms = payment_terms;
        this.effective_days = effective_days;
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "JsonDet{" +
                "vendor_id=" + vendor_id +
                ", vendor_name='" + vendor_name + '\'' +
                ", inactive='" + inactive + '\'' +
                ", country='" + country + '\'' +
                ", address_1='" + address_1 + '\'' +
                ", address_2='" + address_2 + '\'' +
                ", city='" + city + '\'' +
                ", area_code=" + area_code +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", contact_name='" + contact_name + '\'' +
                ", payment_terms='" + payment_terms + '\'' +
                ", effective_days=" + effective_days +
                ", currency='" + currency + '\'' +
                '}';
    }

    public String getVendor_id() {
        return vendor_id;
    }

    public void setVendor_id(String vendor_id) {
        this.vendor_id = vendor_id;
    }

    public String getVendor_name() {
        return vendor_name;
    }

    public void setVendor_name(String vendor_name) {
        this.vendor_name = vendor_name;
    }

    public String getInactive() {
        return inactive;
    }

    public void setInactive(String inactive) {
        this.inactive = inactive;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress_1() {
        return address_1;
    }

    public void setAddress_1(String address_1) {
        this.address_1 = address_1;
    }

    public String getAddress_2() { return address_2; }

    public void setAddress_2(String address_2) {
        this.address_2 = address_2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea_code() {
        return area_code;
    }

    public void setArea_code(String area_code) {
        this.area_code = area_code;
    }

    public String getPhone() { return phone; }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact_name() { return contact_name; }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getPayment_terms() {
        return payment_terms;
    }

    public void setPayment_terms(String payment_terms) {
        this.payment_terms = payment_terms;
    }

    public String getEffective_days() {
        return effective_days;
    }

    public void setEffective_days(String effective_days) {
        this.effective_days = effective_days;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
