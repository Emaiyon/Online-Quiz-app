import java.util.*;

class Question {
    String questionText;
    String[] options;
    int correctAnswer; // index of correct option

    Question(String questionText, String[] options, int correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    boolean isCorrect(int userAnswer) {
        return userAnswer == correctAnswer;
    }
}

class Quiz {
    ArrayList<Question> questions = new ArrayList<>();
    int score = 0;

    void addQuestion(Question q) {
        questions.add(q);
    }

    void start() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("\nQ" + (i + 1) + ". " + q.questionText);
            for (int j = 0; j < q.options.length; j++) {
                System.out.println((j + 1) + ". " + q.options[j]);
            }

            System.out.print("Your answer: ");
            int userAns = sc.nextInt();

            if (q.isCorrect(userAns - 1)) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer is: " + q.options[q.correctAnswer]);
            }
        }
        System.out.println("\n🎯 Final Score: " + score + "/" + questions.size());
        sc.close();
    }
}

public class OnlineQuizApp {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        // Adding questions
        quiz.addQuestion(new Question(
                "Which language is used for Android development?",
                new String[]{"Python", "Java", "C#", "Swift"}, 1));

        quiz.addQuestion(new Question(
                "Which company developed Java?",
                new String[]{"Microsoft", "Apple", "Sun Microsystems", "Google"}, 2));

        quiz.addQuestion(new Question(
                "What is the size of int in Java?",
                new String[]{"2 bytes", "4 bytes", "8 bytes", "16 bytes"}, 1));

        // Start quiz
        quiz.start();
    }
}
