public class Person {
    
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;

    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
    }
    
    public String getName(){
        return name;
    }

    public String getNationality(){
        return nationality;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public String[] getPassport(){
        return passport;
    }

    public int getSeatNumber(){
        return seatNumber;
    }

    
    public void setName(String name){
        this.name = name;
    }

    public void setNationality(String nationality){
        this.nationality = nationality;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public void setPassport(){
        this.passport = new String[]{this.name, this.nationality, this.dateOfBirth};
    }

    public void setSeatNumber(int seatNumber){
        this.seatNumber = seatNumber;
    }
 
}
