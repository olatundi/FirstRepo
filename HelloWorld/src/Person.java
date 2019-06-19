import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {

    public static void main(String[] args){
        Person per1 = new Person("Isaac", 21, "Trainee");
        Person per2 = new Person("Pierre", 23, "Trainee");
        Person per3 = new Person("Jordan", 25, "Core Trainer");
        List<Person> listA = new ArrayList<Person>();
        listA.add(per1);
        listA.add(per2);
        listA.add(per3);
        List<Person> perStream =  listA.stream()
                .collect(Collectors.toList());
        System.out.println(perStream);
        System.out.println(per1);
        per1.findPerson("Pierre", perStream);

//        System.out.println(num.stringInt(7));

    }


    public Person(String name, int age, String jobTitle) {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
    }

    private String name;
    private int age;
    private String jobTitle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Name: '" + this.name + "', Age: '" + this.age + "', JobTitle: '" + this.jobTitle;
    }

    public Person findPerson( String name, List<Person> persons) {

        for (Person person : persons) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

}


