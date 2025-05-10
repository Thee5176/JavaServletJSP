import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String gender;
    private String[] hobby;

    //Constructor
    public User(){}

    //Getter-Setter
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }
}
