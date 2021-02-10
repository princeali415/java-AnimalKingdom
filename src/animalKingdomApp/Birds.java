package animalKingdomApp;

public class Birds extends AbstractAnimal
{
    //Contructor w/ use of super to bring in fields from abstract class (abstractanimal)
    public Birds(String name, int yearNamed)
    {
        super(name, yearNamed);
    }

    // must have methods from abstract class

    @Override
    public String move()
    {
        return "fly";
    }

    @Override
    public String breath()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "eggs";
    }
}
