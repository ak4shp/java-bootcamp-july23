 public class Main {
  
    public static void main(String[] args) {
        Person person = new Person("Sharan", "Canadian", "01/01/1111", 5); 
        person.setSeatNumber(10);
        System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n" + "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: " + person.getSeatNumber() + "\n");

        //* without copy constructor use */

        Person twins = person;
        twins.setName("Charan");
        System.out.println(person.getName());
        System.out.println(twins.getName());

        //* With copy constructor */
        Person twins2Person = new Person(person);
        twins2Person.setName("Karan");
        System.out.println(person.getName());
        System.out.println(twins2Person.getName());
    }
  
}
