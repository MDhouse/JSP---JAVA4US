public class ParticipantDataIsReceived 
{
    private String firstName;
    private String lastName;
    private String email;
    private String emailAuthenticate;
    private String superior;
    private String info;
    private String inne;
    private String text;

    public ParticipantDataIsReceived(String firstName, String lastName, String email, String emailAuthenticate, String superior, String info, String inne, String text) 
    {
        super();
        this.firstName              = firstName;
        this.lastName               = lastName;
        this.email                  = email;
        this.emailAuthenticate      = emailAuthenticate;
        this.superior               = superior;
        this.info                   = info;
        this.inne                   = inne;
        this.text                   = text;
    }

    public ParticipantDataIsReceived() 
    {
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getEmailAuthenticate() {
        return emailAuthenticate;
    }

    public String getSuperior() {
        return superior;
    }

    public String getInfo() {
        return info;
    }

    public String getInne() {
        return inne;
    }

    public String getText() {
        return text;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setInne(String inne) {
        this.inne = inne;
    }
}