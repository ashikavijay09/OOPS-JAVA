import java.util.*;
import java.util.List;
public class HRTeam{
  public void printEligibleCandidatesDetails(List<Candidate> candidates) {
        RecruitingTeam recruitingTeam = new RecruitingTeam();
        for (Candidate candidate : candidates) {
            if (candidate.isEligible()) {
                System.out.println("Name: " + candidate.getName());
                System.out.println("Date of birth: " + candidate.getDOB());
                System.out.println("HSC marks: " + candidate.getHscMarks());
                System.out.println("UG CGPA: " + candidate.getUgCgpa());
                System.out.println("PG CGPA: " + candidate.getPgCgpa());
                System.out.println("Number of projects done: " + candidate.getProjectsDone());
                System.out.println("Interview marks: " + candidate.getInterviewMarks());
                System.out.println("Final Interview Marks: "+recruitingTeam.calculateFinalMarks(candidate));
                System.out.println();
           }
        }
    }
    public void notifyCandidates(List<Candidate> candidates) {
        for (Candidate candidate : candidates) {
            if (candidate.isEligible()) {
                System.out.println(candidate.getName() + " has been selected for the next round of interviews.");
            } else {
                System.out.println(candidate.getName() + " did not meet the eligibility criteria.");
            }
        }
    }
    public List<Candidate> getEligibleCandidates(List<Candidate> candidates) {
        List<Candidate> eligibleCandidates = new ArrayList<>();

        for (Candidate candidate : candidates) {
            if (candidate.isEligible()) {
                eligibleCandidates.add(candidate);
            }
        }
        return eligibleCandidates;
    }
}
