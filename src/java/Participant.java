public class Participant 
{
    private String firstName;
    private String lastName;
    private String email;
    private String emailAuthenticate;
    private String superior;
    private String info;
    private String inne;
    private String text;

    public Participant(String firstName, String lastName, String email, String emailAuthenticate, String superior, String info, String inne, String text) 
    {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.emailAuthenticate = emailAuthenticate;
        this.superior = superior;
        this.info = info;
        this.inne = inne;
        this.text = text;
    }

    public String getFirstName() 
    {
        return firstName;
    }

    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }

    public String getLastName() 
    {
        return lastName;
    }

    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmailAuthenticate() 
    {
        return emailAuthenticate;
    }

    public void setEmailAuthenticate(String emailAuthenticate) 
    {
        this.emailAuthenticate = emailAuthenticate;
    }

    public String getSuperior() 
    {
        return superior;
    }

    public void setSuperior(String superior) 
    {
        this.superior = superior;
    }

    public String getInfo() 
    {
        return info;
    }

    public void setInfo(String info) 
    {
        this.info = info;
    }

    public String getInne() 
    {
        return inne;
    }

    public void setInne(String inne) 
    {
        this.inne = inne;
    }

    public String getText() 
    {
        return text;
    }

    public void setText(String text) 
    {
        this.text = text;
    }   
}