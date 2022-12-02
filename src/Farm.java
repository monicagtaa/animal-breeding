public class Farm {


//your relay on data to comes as paramenter
    public static Cattle breedCow(Angus breedA, Hereford breedB) {
        Cattle cattleOffSpring = new Cattle(CattleUtils.nextUniqueId(), CattleUtils.generateName(),
                CattleBreed.BlackBaldy, CattleUtils.generateSex(), 0,
                CattleUtils.purebredAverage(breedA.getWeight(), breedB.getWeight()));
        return cattleOffSpring;
    }

}
