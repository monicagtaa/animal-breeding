public class BreedCalc {

    private int breedAWeight;
    private int breedBWeight;
//    Purebred Average = 1⁄2 (460) + 1⁄2 (480) = 470 lb
//    Individual Heterosis = .047(470) = 22.09 lb
//    Expected Crossbred Average = Purebred Average + Individual
//            Heterosis
//    Expected Crossbred Performance = 470 + 22.09 = 492.09 lb
//

public float purebredAverage(int breedAWeight,int breedBWeight ) {
    return (float)(0.5 * breedAWeight + 0.5 * breedBWeight);
}
}
