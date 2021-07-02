public class Principal {
    

    public static void main(String[] args) {
        int [][] gradesArray = {{45,80,80,55},{82,64,78,100},{32,60,45,78},{98,78,34,75}};
        Alunos meusAlunos = new Alunos("Sala",gradesArray);
        System.out.printf("Bem vindo a lviro de notas:%n%s%n%n",meusAlunos.getCourseName());

        meusAlunos.processGrades();
    }
}