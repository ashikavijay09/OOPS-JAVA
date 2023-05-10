public class Eligibility{
    public static boolean isDateOfBirthEligible(Candidate candidate){
      String dob = candidate.getDOB();
      String[] parts = dob.split("/");
      String firstPart = parts[2];
      if(Integer.parseInt(firstPart)>1999)
        return true;
      else
        return false;
    }
    public static boolean isPcmPcbAverageEligible(Candidate candidate){
          Integer physicsMarks = candidate.getHscMarks().get("Physics");
          Integer chemistryMarks = candidate.getHscMarks().get("Chemistry");
          Integer mathsMarks = candidate.getHscMarks().get("Maths");
          if (physicsMarks == null || chemistryMarks == null || mathsMarks == null) {
              return false;
          }
          int pcmTotal = physicsMarks + chemistryMarks + mathsMarks;
          double pcmAverage = pcmTotal / 3.0;
          return pcmAverage >= 60.0;
    }
      public static boolean isUgCgpaEligible(Candidate candidate) {
          return candidate.getUgCgpa() >= 7.0;
      }
      public static boolean isPgCgpaEligible(Candidate candidate) {
          if (candidate.getPgCgpa() != 0.0) {
              return candidate.getPgCgpa() >= 7.0;
          }
          return true;
      }
      public static boolean isFullTimeEligible(Candidate candidate) {
          if (candidate.getUgCgpa() >=8.0 && candidate.getProjectsDone() >= 2) {
              return true;
          }
          if (candidate.getUgCgpa() >=8.0 && candidate.getInterviewMarks() >= 35) {
              return true;
          }
          return false;
      }
      public static boolean isCitizenEligible(Candidate candidate){
        if(candidate.isCitizen().equalsIgnoreCase("Indian"))
          return true;
        else
          return false;
      }
  }
  