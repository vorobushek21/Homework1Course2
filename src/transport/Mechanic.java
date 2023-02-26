package transport;

public class Mechanic {

    private String name;
    private String company;

    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public void maintenance(Transport transport) {
        System.out.println("Проведено техобслуживание " + transport.getBrand());
    }

    public void fixTheCar(Transport transport) {
        System.out.println("Проведена починка " + transport.getBrand());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
