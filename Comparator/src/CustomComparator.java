import java.util.*;

class Customer{
   private int customerId;
   private String Name;
   private int age;

    public Customer(int customerId, String name, int age) {
        this.customerId = customerId;
        Name = name;
        this.age = age;
    }

    public Customer() {
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }
}





public class CustomComparator {
    public static void main(String[] args) {
        List<Customer> customerList=new ArrayList<>();
        customerList.add(new Customer(1,"Rama",97));
        customerList.add(new Customer(4,"Rama",32));
        customerList.add(new Customer(17,"Rama",33));
        customerList.add(new Customer(7,"Rama",89));
        customerList.stream().forEach(i->System.out.println(i.toString()));
        Comparator<Customer> customerComparator=new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getAge()- o2.getAge();
            }
        };
        Collections.sort(customerList,customerComparator);
        System.out.println("After Sorting");
        customerList.stream().forEach(i->System.out.println(i.toString()));
    }
}