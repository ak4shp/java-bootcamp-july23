 public class Main {
  
    public static void main(String[] args) {
        Person person = new Person("HH", "Canadian", "01/01/1111", 5); 
        person.setName("Her");
        System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n" + "Date of Birth: " + person.getDateOfBirth()+ "\n" + "Seat Number: " + person.getSeatNumber() + "\n");

    }
  
  
}
