package kata1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private final String Name;
    private final LocalDate birthdate;

    public Person(String Name, LocalDate birthDate) {
        this.Name = Name;
        this.birthdate = birthDate;
    }

    public String getName() {
        return Name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
    
    public int getAge() {
        LocalDate today = LocalDate.now();
        return Period.between(birthdate, today).getYears();
    }
    
    
}
