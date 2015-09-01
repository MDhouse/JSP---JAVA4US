
import javax.servlet.http.HttpServletRequest;

public class AssignmentOfParticipantData 
{
    ParticipantDataIsReceived participantDataIsReceived = new ParticipantDataIsReceived();
    
    public void participantInfo(String info)
    {
        int i = Integer.parseInt(info);
        
        switch(i)
        {
            case 1:
                participantDataIsReceived.setInfo("Ogłoszenie w pracy");
                break;
            case 2:
                participantDataIsReceived.setInfo("Ogłoszenie na uczelni");
                break;
            case 3:
                participantDataIsReceived.setInfo("Facebook");
                break;
            case 4:
                participantDataIsReceived.setInfo("Znajomi");
                break;
            case 5:
                participantDataIsReceived.setInfo("Inne");
                break;
            default:
                break;
        }
        
    }
	
    public void participantInne(HttpServletRequest request)
    {
        if("Inne".equals(participantDataIsReceived.getInfo()))
        {
            participantDataIsReceived.setInne(request.getParameter("inne"));
        }
        else
        {
            participantDataIsReceived.setInne("");
        }   
    }
}