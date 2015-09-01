import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddTheParticipant 
{
    private ArrayList<Participant> participants = new ArrayList<Participant>();    
    String sessionId=null;

    void save(Participant p) 
    {
       participants.add(p);
    }
    
    public int getParticipantSize()
    {
        return participants.size();
    }

    boolean participantNew(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        HttpSession session = request.getSession();
        
        if(getParticipantSize() < 5)
            if(sessionId!=session.getId()) //Poprawić parametr sesji
            {
               // response.sendRedirect("Formularz.jsp");
                return true;
            }
            else
            {
                response.sendRedirect("doubleRegistred.jsp");
                return false;
            }
        else 
        {
            response.sendRedirect("noRegistred.jsp");
            return false;
        }
    }
  
    public void setSessionId(HttpServletRequest request)
	{
		HttpSession session = request.getSession();		
		sessionId=session.getId();
	}
}