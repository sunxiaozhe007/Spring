package xml.d_spel;

public class Customer {
    private String cname = "sun";
    private Double pi ;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Double getPi() {
        return pi;
    }

    public void setPi(Double pi) {
        this.pi = pi;
    }

    @Override
    public String toString() {
        return "CollData{" +
                "cname='" + cname + '\'' +
                ", pi=" + pi +
                '}';
    }
}
