public class Airline {
    
    Person[] people; //array that stores Person objects...

    public Airline(){
        people = new Person[11];
    }


    public Person getPerson(int index){
        return people[index];                   //todo: Reference trap... 
        // return new Person(people[index]);    //? new object 
    }

    public void setPerson(Person person){
        int seat = person.getSeatNumber();
        people[seat-1] = person;                    //todo: Direct obj reference.
        // people[seat-1] = new Person(person);     //? new object 
    }



}
