public class Cattle {
    int id;
    String name; //random from list
    CattleBreed breed;
    CattleSex sex; // only cow or bull
    int milk;
    Float weight;
    int calvingInterval;
    int age;




    public Cattle(int id, String name, CattleBreed breed, CattleSex sex, int age, float weight) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
    }


    public String getInformation() {
        return this.name + " (" + this.id + "), is a " + breed + " " + sex + ", it is " + this.age + " years old, and wights " + this.weight;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CattleBreed getBreed() {
        return breed;
    }

    public void setBreed(CattleBreed breed) {
        this.breed = breed;
    }

    public CattleSex getSex() {
        return sex;
    }

    public void setSex(CattleSex sex) {
        this.sex = sex;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cattle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", breed=" + breed +
                ", sex=" + sex +
                ", milk=" + milk +
                ", weight=" + weight +
                ", calvingInterval=" + calvingInterval +
                ", age=" + age +
                '}';
    }


}

