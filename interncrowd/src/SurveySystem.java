import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SurveySystem {

    // Creating Question set
    private static Map<String, List<String>> surveyResponses = new HashMap<>();

    // Get registered customers
    private static List<String> registeredCustomers = new ArrayList<>();

    public static void main(String[] args) {
        // Questions for survey
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Enter the survey questions (one per line, type 'done' when finished):");
        String question = scanner.nextLine();
        while (!question.equalsIgnoreCase("done")) {
            surveyResponses.put(question, new ArrayList<>());
            question = scanner.nextLine();
        }

        // mail registration
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Enter the registered customers (one email address per line, type 'done' when finished):");
        String customerEmail = scanner.nextLine();
        while (!customerEmail.equalsIgnoreCase("done")) {
            registeredCustomers.add(customerEmail);
            customerEmail = scanner.nextLine();
        }

        // Question & Answer process
        for (String surveyQuestion : surveyResponses.keySet()) {
            System.out.println(surveyQuestion);
            System.out.println(" ");
            List<String> responses = surveyResponses.get(surveyQuestion);
            for (String customer : registeredCustomers) {
                System.out.print(customer + ": ");
                String response = scanner.nextLine();
                responses.add(response);
            }
        }

        // Send promotional emails to the target audience
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Sending promotional emails to the target audience...");
        for (String customer : registeredCustomers) {
            System.out.println("Sent promotional email to " + customer);
        }

        // Run the "Online Survey"
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Running the online survey...");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (String surveyQuestion : surveyResponses.keySet()) {
            List<String> responses = surveyResponses.get(surveyQuestion);
            System.out.println(surveyQuestion);
            for (String response : responses) {
                System.out.println("- " + response);
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");

            }
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");

    }
}
/*
How did you hear about us?
Were your expectations met, unmet, or exceeded?
Did our employees or customer service staff help you?
What, if any, products, services, or features are we missing?
What did you enjoy most about your experience?

zxcv@gmail.com
prasad@gmail.com
qwer@gmail.com
asdf@gmail.com
*/