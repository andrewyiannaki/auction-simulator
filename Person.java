/**
 * Maintain details of someone who participates in an auction.
 * @author Andrew Yiannaki
 * @version 2014.07.31
 */
public class Person
{
    // The name of this person.
    private final String name;

    /**
     * Create a new person with the given name.
     * @param name The person's name.
     */
    public Person(String name)
    {
        this.name = name;
    }

    /**
     * @return The person's name.
     */
    public String getName()
    {
        return name;
    }
}
