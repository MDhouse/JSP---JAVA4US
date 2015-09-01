import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/Formularz"})
public class Formularz extends HttpServlet {

    private static final long serialVersionUID = 1L;
    
    AddTheParticipant addTheParticipant = new AddTheParticipant();
    AssignmentOfParticipantData assignmentOfParticipantData = new AssignmentOfParticipantData();  
			
    public Formularz()
    {
        super();
    }
/*
    przerobić walidację, tak by można było dodać 5 użytkowników i by można było ich normalnie dodawać
    
    
    */
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        if(addTheParticipant.participantNew(request, response))
	{
            ParticipantDataIsReceived participantDataIsReceived = new ParticipantDataIsReceived(request.getParameter("firstName"), request.getParameter("lastName"), request.getParameter("email"), request.getParameter("emailAuthenticate"), request.getParameter("superior"),request.getParameter("info"), request.getParameter("inne"), request.getParameter("text"));
       
            assignmentOfParticipantData.participantInfo(request.getParameter("info"));
            assignmentOfParticipantData.participantInne(request);
		// assignmentOfParticipantData.participantInfo("1");
                 
            Participant p = new Participant(participantDataIsReceived.getFirstName(),participantDataIsReceived.getLastName(), participantDataIsReceived.getEmail(), participantDataIsReceived.getEmailAuthenticate(), participantDataIsReceived.getSuperior(), participantDataIsReceived.getInfo(), participantDataIsReceived.getInne(), participantDataIsReceived.getText());
            addTheParticipant.save(p);
          
            
            
            response.sendRedirect("Formularz.jsp");
            addTheParticipant.setSessionId(request);
            
            System.out.println("WYNIK:"+ addTheParticipant.getParticipantSize());
            System.out.println("WYNIK:"+ addTheParticipant.sessionId);
        }
	else
	{
            System.out.println("WYNIK: nie dobrze");
            //response.sendRedirect("index.jsp");
	}
        
              
    }   
}