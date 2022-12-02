# Selective Breeding

## Brief

Develop a command line program which models selective breeding on a farm.

<i>Selective breeding is a process used in farming, where animals/crops with desirable traits are bred together, to increase the chances of their offspring having good traits.</i>

This project should use a lot of elements we used in the Zooology project.

The program should have a list of animals/crops. Each animal/crop should have randomly generated values, (eg. for cows: milk quality, muscle density). These don't have to be realistic. You can use a fantasy creature instead (eg dragons: scale quality, egg size, flying speed).

The main function of the program should allow the user to choose 2 animals from the list, and 'breed' them together. This should create a new animal in the list, with values influenced by the parents' values.

You can make the randomiser as simple or complex as you like. A simple but decently effective calculation would be<br> (parentA.getValue() + parentB.getValue + randomNumber) / 3.

The program should only allow breeding between a male and female animal.

User commands:

- List all the individuals on the farm
- Add an individual with random values, and give it a name
- Search for an individual by name, in order to see its trait values
- Breed two individuals together, and then give a name to the offspring

---



Add to the user commands a command to view the top 5 animals in a certain trait (eg. the 5 cows with the best milk).

Allow for multiple species of animal/crop. Make the Animal class abstract, and have all your animals extend it. Only allow breeding between animals of the same species.

Include some traits which aren't based on a number, (eg. furColour). How will you model the (biological) inheritance of that trait? Research punnett squares and dominant/recessive genes if you're interested in the actual science behind this.

When an animal is created through breeding, give data of its parents' names/ids. Then disallow breeding of an individual with its own parent.

---
## Breeding notes:
https://www.britannica.com/science/animal-breeding
https://www.farmanddairy.com/top-stories/how-to-identify-common-breeds-of-beef-cattle/424963.html
https://www.iowabeefcenter.org/bch/CrossbreedingGeneticsPrinciples.pdf

- Production & Quality traits
- Pedigree
- Cows: 
  - Production traits: milk yield, milk composition
  - Functional/Quality  traits: fertility, health, longevity and calving ability
    For example, one might decide to use only bulls with PTAs that are at least:
    - +35 for protein yield, +4.5 for productive life, and +2.8 for daughter pregnancy rate.

* seven breeds: Ayrshire, Brown Swiss, Guernsey, Holstein, Milking Shorthorn, Jersey, or red and white. 
  - black Angus: beef production, marbling yields flavorful beef, and they require very little maintenance throughout the year.
  - Charolais Cattle: heavier cows with larger frames. It was a bonus that they could also withstand some of our harsher winters in northern regions because their coat is short in the summer and long and thick in the winter.
  - Hereford Cattle
 
* sorts of breeding:
  - Cross-breeding: individuals of different breeds or lines are used to mate.
  - Pure breeding: the same breed or lines are used to mate.
  - Inbreeding: two close relatives mate. The closer the relation, the higher the inbreeding.

* Traits related to production have intermediate heritabilities:
  - amount of milk a cow produces
  - rates of weight gain in steers and pigs
  - number of eggs laid by chickens
* Quality traits tend to have higher heritabilities
    - amount of fat a pig has over its back 
    - amount of protein in a cow’s milk
    - quality of meet
*


---


<details open>
<summary>Possible Component Tree</summary>

![Component Tree](../Mini-Challenges/ComponentTrees/SelectingBreedingComponentTree.png "Component Tree")

</details>

---

