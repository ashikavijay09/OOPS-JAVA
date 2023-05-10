import java.util.Map;
public class Candidate{
    private String name;
    private String dob;
    private Map<String, Integer> hscMarks;
    private double ugCgpa;
    private double pgCgpa;
    private int projectsDone;
    private double interviewMarks;
    private String isCitizen;

    public Candidate(String name,String dob,Map<String,Integer> hscMarks,double ugCgpa,double pgCgpa,int projectsDone,double interviewMarks,String isCitizen)
    {
        this.name = name;
        this.dob = dob;
        this.hscMarks = hscMarks;
        this.ugCgpa = ugCgpa;
        this.pgCgpa = pgCgpa;
        this.projectsDone = projectsDone;
        this.interviewMarks = interviewMarks;
        this.isCitizen = isCitizen;
    }
   public boolean isEligible() {
            return Eligibility.isDateOfBirthEligible(this) &&
                   Eligibility.isPcmPcbAverageEligible(this)&&
                   Eligibility.isUgCgpaEligible(this)&&
                   Eligibility.isPgCgpaEligible(this) &&
                   Eligibility.isCitizenEligible(this) &&
                   Eligibility.isFullTimeEligible(this);
    }
   public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDOB() {
        return dob;
    }
    public void setDateOfBirth(String dob) {
        this.dob = dob;
    }
    public Map<String, Integer> getHscMarks() {
        return hscMarks;
    }
    public void setHscMarks(Map<String, Integer> hscMarks) {
        this.hscMarks = hscMarks;
    }
    public double getUgCgpa() {
        return ugCgpa;
    }
    public void setUgCgpa(double ugCgpa) {
        this.ugCgpa = ugCgpa;
    }
    public double getPgCgpa() {
        return pgCgpa;
    }
    public void setPgCgpa(double pgCgpa) {
        this.pgCgpa = pgCgpa;
    }
    public int getProjectsDone() {
        return projectsDone;
    }
    public void setProjectsDone(int projectsDone) {
        this.projectsDone = projectsDone;
    }
    public double getInterviewMarks() {
        return interviewMarks;
    }
    public void setInterviewMarks(double interviewMarks) {
        this.interviewMarks = interviewMarks;
    }
    public String isCitizen() {
        return isCitizen;
    }
    public void setCitizen(String isCitizen) {
        this.isCitizen = isCitizen;
    }
}
