public class Human {
    private String name = "human";
    private int age = 30;
    private int weight = 60;
    private String address = null;
    private String work = null;


    public Human(int age, int weight, String address, String work) {
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.work = work;
    }

    public Human(String name, int age, String work) {
        this.name = name;
        this.age = age;
        this.work = work;
    }

    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Human(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getAddress() {
        return address;
    }

    public String getWork() {
        return work;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
