import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.List;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Map<String,Integer> hscMarks = new HashMap<>();
    System.out.println("Enter marks in Maths:");
    int mathsMarks = scanner.nextInt();
    hscMarks.put("Maths", mathsMarks);
    System.out.println("Enter marks in Physics:");
    int physicsMarks = scanner.nextInt();
    hscMarks.put("Physics", physicsMarks);
    System.out.println("Enter marks in Chemistry:");
    int chemistryMarks = scanner.nextInt();
    hscMarks.put("Chemistry", chemistryMarks);

    Candidate candidate1 = new Candidate("Ashika V","09/09/2001",hscMarks,8.5,9.3,6,90,"Indian");
    Candidate candidate2 = new Candidate("Vijay","12/09/2002",hscMarks,8.1,6.1,3,82,"Indian");
    Candidate candidate3 = new Candidate("Reka","25/06/1996",hscMarks,7.1,8.1,5,85,"Indian");
    Candidate candidate4 = new Candidate("Amutha","12/05/2001",hscMarks,8.2,9.0,5,86,"Indian");
    List<Candidate> candidates = List.of(candidate1,candidate2,candidate3,candidate4);
    
    HRTeam hrTeam = new HRTeam();
    List<Candidate> eligibleCandidates = hrTeam.getEligibleCandidates(candidates);
    System.out.println("\n\n");
    hrTeam.notifyCandidates(candidates);
    System.out.println("\n\nDetails of the selected candidate: \n");
    hrTeam.printEligibleCandidatesDetails(eligibleCandidates);
  }
}

