package xml.b_setter;

public class Address {

    private String address;
    private String tel;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
