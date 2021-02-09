package animalKingdomApp;

public class Mammals extends AbstractAnimal
{
    //Contructor w/ use of super to bring in fields from abstract class (abstractanimal)
    public Mammals(String name, int yearNamed)
    {
        super(name, yearNamed);
    }

    // must have methods from abstract class

    @Override
    public String move()
    {
        return "walk";
    }

    @Override
    public String breath()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "live births";
    }

}
