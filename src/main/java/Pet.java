//Create a Pet class
public class Pet {

    // These are the instance variables
    private String name;
    private Integer age;
    private String location;
    private String type;


    //Constructor with all attributes
    public Pet(String name, Integer age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }

    //Constructor with no attributes
    public Pet() {
    }

    //Get Methods
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    //Set Methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
