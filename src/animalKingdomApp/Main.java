package animalKingdomApp;

import java.util.ArrayList;
import java.util.List;

public class Main
{

    public static List<AbstractAnimal> filteredAnimals(List<AbstractAnimal> myList, CheckAnimalInterface tester)
    {
        // when we call this, myList becomes AbstractAnimals from the main method
        
        List<AbstractAnimal> filteredList = new ArrayList<>();

        for(AbstractAnimal v : myList){
            if(tester.test(v)){
                filteredList.add(v);
            }
        }
        return filteredList;
    }



    private static void workingWithData()
    {
        System.out.println("Animal Kingdom program is running... \n");

        // Instantiate Mammals 
        Mammals panda = new Mammals("Panda", 1896);
        Mammals zebra = new Mammals("Zebra", 1778);
        Mammals koala = new Mammals("Koala", 1816);
        Mammals sloth = new Mammals("Sloth", 1804);
        Mammals armadillo = new Mammals("Armadillo", 1758);
        Mammals raccoon = new Mammals("Raccoon", 1758);
        Mammals bigfoot = new Mammals("Bigfoot", 2021);

        // Instantiate Birds
        Birds pigeon = new Birds("Pigeon", 1837);
        Birds peacock = new Birds("Peacock", 1821);
        Birds toucan = new Birds("Toucan", 1758);
        Birds parrot = new Birds("Parrot", 1824);
        Birds swan = new Birds("Swan", 1758);

        //Instantiate Fish
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        // add all animals to an arraylist
        List<AbstractAnimal> animalArrList = new ArrayList<>();     // create an array list
        animalArrList.add(panda);                                   // add animals to array list
        animalArrList.add(zebra);
        animalArrList.add(koala);
        animalArrList.add(sloth);
        animalArrList.add(armadillo);
        animalArrList.add(raccoon);
        animalArrList.add(bigfoot);

        animalArrList.add(pigeon);
        animalArrList.add(peacock);
        animalArrList.add(toucan);
        animalArrList.add(parrot);
        animalArrList.add(swan);

        animalArrList.add(salmon);
        animalArrList.add(catfish);
        animalArrList.add(perch);

        System.out.println("***List all animals in Descending order by year named***");
        animalArrList.sort((v1, v2) -> v2.getYearNamed() - v1.getYearNamed());
        System.out.println(animalArrList.toString());
        System.out.println();

        System.out.println("***List all the animals alphabetically***\n");
        animalArrList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        System.out.println(animalArrList.toString());
        System.out.println();

        System.out.println("***List all the animals order by how they move***");
        animalArrList.sort((v1, v2) -> v1.move().compareTo(v2.move()));
        System.out.println(animalArrList.toString());
        System.out.println();

        System.out.println("***List only those animals that breath with lungs***");
        List<String> animalListLungs = new ArrayList<>();
        for(AbstractAnimal animal : animalArrList){
            if (animal.breath() == "lungs"){
                animalListLungs.add(animal.getName() + " " + animal.reproduce() + " " + animal.move() + " " + animal.getYearNamed());
            }
        }
        animalListLungs.forEach(item -> System.out.println(item));
        System.out.println();

        System.out.println("***List only those animals that breath with lungs and were named in 1758***");
        List<String> animalListLungsAndYear = new ArrayList<>();
        for(AbstractAnimal animal : animalArrList){
            if (animal.breath() == "lungs" && animal.getYearNamed() == 1758){
                animalListLungsAndYear.add(animal.getName() + " " + animal.reproduce() + " " + animal.move() + " " + animal.getYearNamed());
            }
        }
        animalListLungsAndYear.forEach(item -> System.out.println(item));
        System.out.println();

        System.out.println("***List only those animals that lay eggs and breath with lungs***");
        List<String> animalEggsAndLungs = new ArrayList<>();
        for(AbstractAnimal animal : animalArrList){
            if (animal.breath() == "lungs" && animal.reproduce() == "eggs"){
                animalEggsAndLungs.add(animal.getName() + " " + animal.reproduce() + " " + animal.move() + " " + animal.getYearNamed());
            }
        }
        animalEggsAndLungs.forEach(item -> System.out.println(item));
        System.out.println();

        System.out.println("***List alphabetically only those animals that were named in 1758***\n");   // using filter method created
        List<AbstractAnimal> animalsList1758 = filteredAnimals(animalArrList, v -> v.getYearNamed() == 1758);
        animalsList1758.sort((v1,v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        animalsList1758.forEach(item -> System.out.println(item.toFormat()));
        

    }

    public static void main(String[] arg)
    {
        workingWithData();
    }
}