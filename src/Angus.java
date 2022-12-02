public class Angus extends Cattle{

    public Angus(int id, String name, CattleBreed breed, CattleSex sex, int age, float weight) {
        super(id, name, breed, sex, age, weight);
    }

@Override
    public String getInformation() {
        return this.name + " (" + this.id + "), is a " + breed + " " +sex+ " years old, and wights " + this.weight;


}
}
