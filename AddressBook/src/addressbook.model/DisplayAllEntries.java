package addressbook.model;
public class DisplayAllEntries implements Option
{
    
    @Override
    public String doOption(String s, AddressBook a)
    {
        return a.display();
    }
    
    @Override
    public boolean requiresText()
    {
        return false;
    }



}
