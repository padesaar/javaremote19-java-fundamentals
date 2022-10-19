package quiz;

import shopping.Product;

import java.util.Objects;
import java.util.Scanner;

/**
 * write a quiz and give the final score
 *
 * 1. quiz should be minimum of 5 questions
 * for each right answer = 1 point
 * negative answer = 0
 * finally display the correct answer and the total score
 * display the result: pass or fail
 *
 * Quiz example:
 * display the question to user like this
 * 1. what is the capital of estonia
 * a) tallinn
 * b) pärnu
 * c) viljandi
 * enter your answer
 * 2. the next question
 *
 * invalid answer, please enter the given option (stringi ja suurema numbri puhul eraldi message)
 * the if the all questions are finished, give the total score
 * the correct answers
 * a. tallinn
 * b...
 *
 */

public class Quiz {
    public static void main(String[] args) {


        System.out.println("Welcome to the quiz!");
        System.out.println("--------------------");

        int totalScore = 0;
        boolean hasPassed;
        int rightAnswer = 1;
        int wrongAnswer = 0;


        Question[] questions = getRandomQuestions();
        Answer[] userAnswers = new Answer[questions.length];

        for (int j = 0; j < questions.length; j++) {
            Question question = questions[j];
            System.out.println(question.getDescription());

            for(int i = 0; i < question.getOptions().length; i++ ) {
                System.out.println(i+ ". " + question.getOptions()[i]);
            }
            System.out.println("Choose an option from above");

            //creating a user answer object and assign it to the userAnswer array
            Answer answer = new Answer();
            answer.setQuestionId(question.getId());
            answer.setCorrectOptionIndex(getAnswerOption(question.getOptions().length - 1));
            userAnswers[j] = answer;

            System.out.println();
        }

    Answer[] correctAnswers = getAnswers();

        //total score calculation: compare answer options of correctanswer and the useranswer
        for (Answer userAnswer : userAnswers) {
            for (Answer correctAnswer : correctAnswers) {
                if (Objects.equals(correctAnswer.getQuestionId(), userAnswer.getQuestionId())) {

                    totalScore += correctAnswer.getCorrectOptionIndex() == userAnswer.getCorrectOptionIndex() ? rightAnswer : wrongAnswer;
                    break;
                }
            }

        }
        // pass score is 50%
        System.out.println("Total score: " + totalScore);

        hasPassed = totalScore >= (double) questions.length / 2;
        System.out.println(hasPassed ? "PASSED!" : "FAILED!");

        printCorrectAnswers(questions, correctAnswers);

    }

    private static Question[] getRandomQuestions() {

            Question question1 = new Question();
            question1.setId(10000L);
            question1.setDescription("What is the capital of Estonia?");
            question1.setOptions(new String[]{"Tallinn", "Tartu", "Parnu"});

            Question question2 = new Question();
            question2.setId(100001L);
            question2.setDescription("How many wonders in the world?");
            question2.setOptions(new String[]{"3", "8", "7"});

            Question question3 = new Question();
            question3.setId(100002L);
            question3.setDescription("What is the favourite car of Estonia?");
            question3.setOptions(new String[]{"Skoda", "Toyota", "Lexus"});

            return new Question[]{question2, question1, question3};

    }

    private static Answer[] getAnswers() {

            Answer answer1 = new Answer();
            answer1.setId(20000L);
            answer1.setQuestionId(10000L);
            answer1.setCorrectOptionIndex(0);

            Answer answer2 = new Answer();
            answer2.setId(20001L);
            answer2.setQuestionId(100001L);
            answer2.setCorrectOptionIndex(2);

            Answer answer3 = new Answer();
            answer3.setId(20002L);
            answer3.setQuestionId(100002L);
            answer3.setCorrectOptionIndex(1);

            return new Answer[]{answer1, answer2, answer3};

    }

    private static int getAnswerOption(int limit){
        Scanner scanner = new Scanner(System.in);
        String errorMessage = "Incorrect option. Please enter again:";

        int option = limit + 1;

        do {

            if (!scanner.hasNextInt()) {
                System.out.println(errorMessage);
                scanner.next();
            } else {
                option = scanner.nextInt();

                if(option > limit){
                    System.out.println(errorMessage);
                }
            }

        } while(option > limit);
        return option;
    }

    private static void printCorrectAnswers(Question[] questions, Answer[] correctAnswers){
        System.out.println("CORRECT ANSWERS:");
        for (int i = 0; i < questions.length; i++) {
            System.out.println((i + 1)  + ". " + questions[i].getDescription());

            for(Answer answer: correctAnswers) {
                if(Objects.equals(questions[i].getId(), answer.getQuestionId())) {
                    System.out.println("Answer: " + questions[i].getOptions()[answer.getCorrectOptionIndex()]);
                    break;
                }
            }
            System.out.println();
        }
    }
}
