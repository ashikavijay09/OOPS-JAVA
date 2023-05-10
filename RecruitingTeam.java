public class RecruitingTeam{
    public double calculateFinalMarks(Candidate candidate) {
  
            double ugCgpa = candidate.getUgCgpa();
            double pgCgpa = candidate.getPgCgpa();
            int projectsDone = candidate.getProjectsDone();
            double interviewMarks = candidate.getInterviewMarks();
  
            double totalMarks = (ugCgpa * 0.3) + (pgCgpa * 0.3) + (projectsDone * 0.1) + (interviewMarks * 0.1);
  
            return totalMarks;
        }
  
  
  
  }
  