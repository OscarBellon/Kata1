package kata1;

import java.util.Date;

public class Person {
    private final String Name;
    private final Date birthdate;

    public Person(String Name, Date birthDate) {
        this.Name = Name;
        this.birthdate = birthDate;
    }

    public String getName() {
        return Name;
    }

    public Date getBirthdate() {
        return birthdate;
    }
    
    public int getAge() {
        return(int) ((new  Date().getTime() - birthdate.getTime())/32536000000L);
    }
}
