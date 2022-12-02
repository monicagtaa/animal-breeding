


public class Hereford extends Cattle{

    public Hereford(int id, String name, CattleBreed breed, CattleSex sex, int age, float weight) {
        super(id, name, breed, sex, age, weight);
    }

    @Override
    public String getInformation() {
        return this.name + " (" + this.id + "), is an Hereford " +sex+ " years old, and wights " + this.weight;

    }
}