package scrap.heap.refactor;

public class Customer {
    private String firstName;
    private String lastName;
    private String phone;
    
    public Customer(String fn, String ln, String phone) {
        firstName = fn;
        lastName = ln;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone + "]";
    }
}
