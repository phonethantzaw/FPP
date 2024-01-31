package Assignment8.Prob3;

import java.util.Objects;

public class Marketing {
    private String employeename;
    private String productname;
    private double salesamount;

    public Marketing(String employeename, String productname, double salesamount) {
        this.employeename = employeename;
        this.productname = productname;
        this.salesamount = salesamount;
    }

    public String getEmployeename() {
        return employeename;
    }

    public String getProductname() {
        return productname;
    }

    public double getSalesamount() {
        return salesamount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Marketing marketing = (Marketing) o;
        return Double.compare(marketing.salesamount, salesamount) == 0 && Objects.equals(employeename, marketing.employeename) && Objects.equals(productname, marketing.productname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeename, productname, salesamount);
    }

    @Override
    public String toString() {
        return "{" +
                "employeename='" + employeename + '\'' +
                ", salesamount=" + salesamount +
                '}';
    }


}
