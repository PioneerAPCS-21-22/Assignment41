/**
 * Contacts is modelling a collection of people's information.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.io.File;

public class Contacts
{
    private List<Person> people;

    public Contacts()
    {
        people = new ArrayList<Person>();
        
        try
        {
            addFromFile("people.txt");
        }
        catch(IOException e)
        {
            System.out.println("Error reading Contacts from file.");
        }
    }

    /** 
     * Person with given name, number, and email are added to list and list is sorted.
     *
     * @param name - name of Person to be added
     * @param number - phone number of Person to be added
     * @param email - email of Person to be added
     */
    public void addPerson(String name, String number, String email)
    {
        // create a Person object and add it to the list (people)
        // sort list
    }

    /**
     * Reads lines from file to add to list.
     *
     * @param file - name of file to be read
     */
    private void addFromFile(String file) throws IOException
    {
        Scanner inFile = new Scanner(new File(file));

        while(inFile.hasNext())
        {
            String line = inFile.nextLine();
            people.add(new Person(grabName(line), grabNum(line), grabEmail(line)));
        }

        inFile.close();

        sortContacts();
    }

    /**
     * @param line - Info in the form "name, number, email" 
     * @return the name from the line (value before first comma) and null if nothing is found
     */
    public String grabName(String line)
    {

    }

    /**
     * @param line - Info in the form "name, number, email"
     * @return the phone number from the line (value between commas) and null if nothing is found
     */
    public String grabNum(String line)
    {

    }

    /**
     * @param line - Info in the form "name, number, email"
     * @return the email from the line (value after second comma) and null if nothing is found
     */
    public String grabEmail(String line)
    {

    }

    /** 
     * @param name - the name of the Person to be found
     * @return Person in the list with the name given using binary search and null if not found
     */
    public Person getContact(String name)
    {

    }

    /**
     * people is sorted in ascending order using insertion sort
     */
    public void sortContacts()
    {

    }

    @Override
    public String toString()
    {
        String list = "";

        // enhanced for-loop; for-each loop
        for(Person p: people)
        {
            list += p.getName() + ", " + p.getNumber() + ", " + p.getEmail() + "\n";
        }

        return list;
    }
}
