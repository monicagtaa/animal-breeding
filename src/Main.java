public class Main {


    public static void main(String[] args) {
        Angus angus = new Angus( CattleUtils.nextUniqueId(), CattleUtils.generateName(),
                CattleBreed.Angus, CattleSex.Cow, CattleUtils.generateAge(), 413);
        System.out.println(angus.getInformation());
        Hereford hereford = new Hereford( CattleUtils.nextUniqueId(), CattleUtils.generateName(),
                CattleBreed.Hereford, CattleSex.Bull, CattleUtils.generateAge(), 417);
        System.out.println(hereford.getInformation());
        Cattle blackBaldy = Farm.breedCow(angus, hereford);
          System.out.println(blackBaldy.getInformation());



    }
}