package cl.corona.bbookvendor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bbook_proveedor")
public class BbookEnviaVendor {

    @Id
    @Column(name="idd" ,columnDefinition = "varchar2(100)")
    private String id;

    @Column(name="vendor_id" ,columnDefinition = "number(20)")
    private long vendorId;

    @Column(name="vendor_name" ,columnDefinition = "varchar2(50)")
    protected String vendorName;

    @Column(name="inactive" ,columnDefinition = "varchar2(10)")
    protected String inactive;

    @Column(name="country" ,columnDefinition = "varchar2(50)")
    protected String country;

    @Column(name="address_1" ,columnDefinition = "varchar2(50)")
    protected String address1;

    @Column(name="address_2" ,columnDefinition = "varchar2(50)")
    protected String address2;

    @Column(name="city" ,columnDefinition = "varchar2(50)")
    protected String city;

    @Column(name="area_code" ,columnDefinition = "number(10)")
    protected Long areaCode;

    @Column(name="phone" ,columnDefinition = "varchar2(50)")
    protected String phone;

    @Column(name="email" ,columnDefinition = "varchar2(50)")
    protected String email;

    @Column(name="contact_name" ,columnDefinition = "varchar2(50)")
    protected String contactName;

    @Column(name="payment_terms" ,columnDefinition = "varchar2(50)")
    protected String paymentTerms;

    @Column(name="effective_days" ,columnDefinition = "number(3)")
    protected Long effectiveDays;

    @Column(name="currency" ,columnDefinition = "varchar2(50)")
    protected String currency;

    @Column(name="tran_type" ,columnDefinition = "varchar2(1)")
    protected String tranType;

    public BbookEnviaVendor() {
        super();
    }

    public BbookEnviaVendor(String id, long vendorId, String vendorName, String inactive, String country, String address1, String address2, String city, Long areaCode, String phone, String email, String contactName, String paymentTerms, Long effectiveDays, String currency, String tranType) {
        super();
        this.id = id;
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.inactive = inactive;
        this.country = country;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.areaCode = areaCode;
        this.phone = phone;
        this.email = email;
        this.contactName = contactName;
        this.paymentTerms = paymentTerms;
        this.effectiveDays = effectiveDays;
        this.currency = currency;
        this.tranType = tranType;
    }

    @Override
    public String toString() {
        return "BbookEnviaVendor{" +
                "id='" + id + '\'' +
                ", vendorId=" + vendorId +
                ", vendorName='" + vendorName + '\'' +
                ", inactive='" + inactive + '\'' +
                ", country='" + country + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", city='" + city + '\'' +
                ", areaCode=" + areaCode +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", contactName='" + contactName + '\'' +
                ", paymentTerms='" + paymentTerms + '\'' +
                ", effectiveDays=" + effectiveDays +
                ", currency='" + currency + '\'' +
                ", tranType='" + tranType + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getVendorId() {
        return vendorId;
    }

    public void setVendorId(long vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public String getInactive() {
        return inactive;
    }

    public void setInactive(String inactive) {
        this.inactive = inactive;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(Long areaCode) {
        this.areaCode = areaCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPaymentTerms() {
        return paymentTerms;
    }

    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    public Long getEffectiveDays() {
        return effectiveDays;
    }

    public void setEffectiveDays(Long effectiveDays) {
        this.effectiveDays = effectiveDays;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getTranType() {
        return tranType;
    }

    public void setTranType(String tranType) {
        this.tranType = tranType;
    }
}
