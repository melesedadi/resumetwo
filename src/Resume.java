import java.util.ArrayList;

public class Resume {
    private String fullName;
    private String emailAddress;
    private ArrayList<String> jobList = new ArrayList<>();
    private ArrayList<String> jobDescription = new ArrayList<>();

    public Resume() {
    }

    public Resume(String fullName, String emailAddress, ArrayList<String> jobList, ArrayList<String> jobDescription) {
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.jobList = jobList;
        this.jobDescription = jobDescription;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public ArrayList<String> getJobList() {
        return jobList;
    }

    public void setJobList(ArrayList<String> jobList) {
        this.jobList = jobList;
    }

    public ArrayList<String> getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(ArrayList<String> jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getDisplyResume() {
        String joblistAll = "";
        for (String joblist : jobList) {
            joblistAll = joblistAll + joblist + " ";
            return joblistAll;
        }
        String jobDescriptionAll = "";
        for (String jobDescription : jobDescription) {
            jobDescriptionAll = jobDescriptionAll + jobDescription + " ";
            return jobDescriptionAll;}

            String display = "Full Name: " + getFullName() +
                    "\nEmail Address " + getEmailAddress() +
                    "\nJob Lists: " + joblistAll +
                    "\nJob Description: " + jobDescriptionAll;
            return display;
        }


    }


