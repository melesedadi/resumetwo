import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String answer = " ";
        int counterNumber = 1;
        int jobNumber = 1;
        int jobDescriptionNumber = 1;
        String fullName = " ";
        String name = "";
        ArrayList<Resume> resumeList = new ArrayList<>();
        ArrayList<Resume> dates = new ArrayList<>();
        ArrayList<Resume> joblist = new ArrayList<>();
        ArrayList<String> jobDescription = new ArrayList<>();


        System.out.println("You are entering your resume");

        while (true) {
            Resume addResume = new Resume();

            System.out.println("Resume " + counterNumber);
            System.out.println("Please enter your name: ");
            name = key.nextLine();
            name = fullName;
            addResume.setFullName(name);
            System.out.println("Enter your email: ");
            answer = key.nextLine();
            addResume.setEmailAddress(answer);

            while (true) {
                System.out.println("Job lists:");
                ArrayList<String> jobList = new ArrayList<>();
                System.out.println("Job " + jobNumber);
                System.out.println("Please enter employer name: ");
                answer = key.nextLine();
                addResume.setJobList(jobList);




                System.out.println("Please enter job title: ");
                answer = key.nextLine();
                addResume.setJobList(jobList);


                System.out.println("Please enter job Start date: ");
                answer = key.nextLine();
                addResume.setJobList(jobList);
                resumeList.add(addResume);
                System.out.println("Please enter job end date: ");
                answer = key.nextLine();
                addResume.setJobList(jobList);




                while (true) {

                    System.out.println("job Description " + jobDescriptionNumber);
                    System.out.println("Please enter job description: ");
                    answer = key.nextLine();
                    addResume.setJobDescription(jobDescription);
                    resumeList.add(addResume);


                    System.out.println("Do you have addtional job description to add? Answer yes or no: ");
                    answer = key.nextLine();
                    if (answer.equalsIgnoreCase("no")) {
                        break;
                    }
                    jobDescriptionNumber = jobDescriptionNumber + 1;
                }

                jobDescriptionNumber = 1;
                System.out.println("Do you have addtional job to add? Answer yes or no : ");
                answer = key.nextLine();
                if (answer.equalsIgnoreCase("no")) {
                    break;
                }
                jobNumber = jobNumber + 1;


            }
            jobNumber = 1;
            resumeList.add(addResume);

//        resumeList.addAll(joblist);
//        resumeList.addAll(jobDescription);
//        resumeList.addAll(dates);

            System.out.println("Do you have another person resume to add? Answer yes or no: ");
            answer = key.nextLine();
            if (answer.equalsIgnoreCase("no")) {
                break;
            }
            counterNumber = counterNumber + 1;
        }


        counterNumber = 1;
        for (Resume resume : resumeList) {
            System.out.println(resume.getDisplyResume());



        }


    }
}

