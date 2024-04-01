package TaskCodeway;
// Task 4
import java.util.*;

class Question {
    String question;
    String[] options;
    int correctAnswer;

    Question(String question, String[] options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
}

class Quiz {
    List<Question> questions;
    int score;

    Quiz() {
        questions = new ArrayList<>();
        score = 0;
    }

    void addQuestion(Question q) {
        questions.add(q);
    }

    void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        for (Question q : questions) {
            System.out.println(q.question);
            for (int i = 0; i < q.options.length; i++) {
                System.out.println((i + 1) + ". " + q.options[i]);
            }
            System.out.println("Enter your answer (1-" + q.options.length + "):");
            int answer = scanner.nextInt();
            if (answer == q.correctAnswer) {
                score++;
            }
        }
        System.out.println("Your final score is: " + score + "\n" + "Questions we've asked: " + questions.size());
    }
}

public class task4 {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        String[] options1 = { "JDB", "JRE", "JVM", "JDK" };
        Question q1 = new Question("Question 1. _____ is used to find and fix bugs in the Java programs.", options1, 1);

        String[] options2 = { "Runnable Interface", "CharSequence Interface", "Abstract Interface",
                "Marker Interface" };
        Question q2 = new Question("Question 2. An interface with no fields or methods is known as a ______.", options2,
                4);

        String[] options3 = { "Stack", "String memory", "Heap memory", "Random storage space" };
        Question q3 = new Question(
                "Question 3. In which memory a String is stored, when we create a string using new operator?", options3,
                3);

        String[] options4 = { "object", "strictfp", "main", "system" };
        Question q4 = new Question("Question 4. Which of the following is a reserved keyword in Java?", options4, 2);

        String[] options5 = { "package", "import", "extends", "export" };
        Question q5 = new Question("Question 5. Which keyword is used for accessing the features of a package?",
                options5, 2);

        quiz.addQuestion(q1);
        quiz.addQuestion(q2);
        quiz.addQuestion(q3);
        quiz.addQuestion(q4);
        quiz.addQuestion(q5);

        quiz.startQuiz();
    }
}
