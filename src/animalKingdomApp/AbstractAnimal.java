package animalKingdomApp;

abstract class AbstractAnimal 
{

    //fields for abstract class 
    protected static int maxId = 0;
    protected int id;
    protected String name;
    protected int yearNamed; // this feild is the same as year discovered


    // Constructor w/ parameters with name and yearNamed
    public AbstractAnimal(String name, int yearNamed)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.yearNamed = yearNamed;
    }


    // Methods for all animals

    // Getters
    public String getName()
    {
        return name;
    }

    public int getYearNamed()
    {
        return yearNamed;
    }

    // Setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void setYearNamed(int year)
    {
        this.yearNamed = year;
    }

    // Animal Action methods
    public String consumeFood()     // same method for all animals
    {
        return "nom...nom...nom";
    }

    abstract String move();         // abstract method
    abstract String breath();       // abstract method
    abstract String reproduce();    // abstract method

    
    // allows us to print object string w/details not just where object is in memory
    public String toString()
    {
        String str = "Animals{id=" + id + ", name=" + name + ", yearNamed=" + yearNamed + "}\n";
        return str;
    }

    public String toFormat(){
        String string = getName() + " "+ reproduce() + " "+ move() + " "+ breath() + " " + getYearNamed();
        return string;
    }
}
