package People;
import java.io.Serializable;
public class PeopleClass implements Serializable{
    private String firstName;
    private String secondName;
    private Integer yearOfBirth;
    private String address;
    public PeopleClass(String firstName, String secondName, Integer yearOfBirth, String address){
        this.firstName = firstName;
        this.secondName = secondName;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {

        return secondName;
    }

    public void setSecondName(String secondName) {

        this.secondName = secondName;
    }

    public Integer getYearOfBirth() {

        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {

        this.yearOfBirth = yearOfBirth;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }
    @Override
    public String toString() {
        return  "\nfirstName" +" "+ firstName+
                "\nsecondName"+" "+secondName+
                "\nyearOfBirth"+" "+yearOfBirth+
                "\naddress"+" "+address;

    }
}
