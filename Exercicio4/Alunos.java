import java.time.format.TextStyle;

public class Alunos {
    
    private String courseName;
    private int [][] grades;

    public Alunos(String courseName, int [] [] grades){
        this.courseName = courseName;
        this.grades = grades;
    }


    public void setCourseName (String courseName){
        this.courseName = courseName;
    }

    public String getCourseName(){
        return courseName;
    }

    public void processGrades(){
        outputGrades();

        System.out.printf("%n%s %d%n%s %d%n%n","Menor nota: ",getMinimum(),"Maior nota: ",getMaximum());

    }

    public int getMinimum(){
        int lowGrade = grades [0][0];

        for(int[] studentGrades : grades){
            for(int grade :studentGrades){
                if(grade < lowGrade)
                    lowGrade = grade;
            }
        }
        return lowGrade;
    }

    public int getMaximum(){
        int highGrade = grades [0][0];

        for(int [] studentGrades : grades){
            for(int grade : studentGrades){
                if(grade > highGrade)
                    highGrade = grade;
            }
        }
        return highGrade;
    }

    public double getAvarage(int [] setOfGrades){
        int total = 0;
        for(int grade : setOfGrades)
            total += grade;

        return (double) total / setOfGrades.length;
    }

    public void outputGrades(){
        System.out.printf("As notas: %n%n");
        System.out.printf("         ");

        for(int test = 0; test < grades[0].length; test++)
            System.out.printf("Prova %d  ",test+1);
        System.out.println("Media");

        for(int student = 0; student < grades[0].length; student++){
            System.out.printf("Aluno %2d",student+1);
            for(int test : grades[student])
                System.out.printf("%8d", test);

            double avarage = getAvarage(grades[student]);
            System.out.printf("%9.2f%n", avarage);
        }
    }
}
