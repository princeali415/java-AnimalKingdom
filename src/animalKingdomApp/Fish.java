package animalKingdomApp;

public class Fish extends AbstractAnimal
{
    //Contructor w/ use of super to bring in fields from abstract class (abstractanimal)
    public Fish(String name, int yearNamed)
    {
        super(name, yearNamed);
    }

    // must have methods from abstract class
    @Override
    public String move()
    {
        return "swim";
    }

    @Override
    public String breath()
    {
        return "gills";
    }

    @Override
    public String reproduce()
    {
        return "eggs";
    }
}
