package basic.class1;

public class ClassStart2 {

    public static void main(String[] args) {
        String[] studentNames = {"1", "2"};
        int[] studentAge = {15, 16};
        int[] studentGrade = {90, 80};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println(studentNames[i] + ", " + studentAge[i] + ", " + studentGrade[i]);
        }
    }
}
