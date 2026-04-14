package com.pluralsight;

import java.util.Scanner;

public class Main {

    // Create ONE Scanner for the whole application
    // This avoids creating multiple Scanner objects (good practice)
    static Scanner scanner = new Scanner(System.in);

    // These variables store data that we want to reuse across the app
    static int totalCalories = 0;
    static int dailyCalorieGoal = 0;

    // This variable controls the while loop (app running or not)
    static boolean running = true;

    public static void main(String[] args) {

        // This loop keeps the program running until the user exits
        while (running) {

            showMenu();          // Step 1: Show options to the user
            handleMenuChoice();  // Step 2: Handle what the user chooses
        }

        // This line runs AFTER the loop ends
        System.out.println("Program ended.");
    }

    // This method reads the user input and decides what to do
    private static void handleMenuChoice() {

        int option = scanner.nextInt(); // Read user choice

        // Switch statement = cleaner alternative to many if-else statements
        switch (option) {
            case 1:
                // Store result so we can reuse it later
                totalCalories = addCalories();
                break;

            case 2:
                showCalories();
                break;

            case 3:
                setDailyCalorieGoal();
                break;

            case 0:
                exit(); // Stop the loop
                break;

            default:
                System.out.println("Invalid option. Try again.");
        }
    }

    // This method stops the program
    private static void exit() {
        System.out.println("Goodbye!");
        running = false; // This will stop the while loop
    }

    // This method helps the user set a goal (weight loss, maintain, muscle gain)
    private static void setDailyCalorieGoal() {

        System.out.println("What is your goal?");
        System.out.println("1. Weight Loss");
        System.out.println("2. Maintain Weight");
        System.out.println("3. Build Muscle");
        System.out.print("Choose an option: ");

        int goalType = scanner.nextInt();

        System.out.print("Enter your current daily calorie intake: ");
        int currentCalories = scanner.nextInt();

        // Simple business logic based on the goal
        if (goalType == 1) {
            // Weight loss → eat less (calorie deficit)
            dailyCalorieGoal = currentCalories - 500;
            System.out.println("You selected Weight Loss.");

        } else if (goalType == 2) {
            // Maintain → keep the same calories
            dailyCalorieGoal = currentCalories;
            System.out.println("You selected Maintain Weight.");

        } else if (goalType == 3) {
            // Muscle gain → eat more (calorie surplus)
            dailyCalorieGoal = currentCalories + 300;
            System.out.println("You selected Build Muscle.");

        } else {
            System.out.println("Invalid choice.");
            return; // Stop this method early
        }

        System.out.println("Your daily calorie goal is: " + dailyCalorieGoal + " kcal");
    }

    // This method shows the current calories and compares with the goal
    private static void showCalories() {

        System.out.println("Total Calories: " + totalCalories + " kcal");

        // Only show goal comparison if goal is set
        if (dailyCalorieGoal > 0) {

            System.out.println("Daily Goal: " + dailyCalorieGoal + " kcal");

            // Simple comparison logic
            if (totalCalories > dailyCalorieGoal) {
                System.out.println("⚠ You are above your goal.");
            } else {
                System.out.println("✅ You are within your goal.");
            }
        }
    }

    // This method calculates calories based on macros
    private static int addCalories() {

        // Ask user for macronutrients
        System.out.print("Enter carbs (grams): ");
        int carbs = scanner.nextInt();

        System.out.print("Enter fats (grams): ");
        int fats = scanner.nextInt();

        System.out.print("Enter protein (grams): ");
        int protein = scanner.nextInt();

        // Calorie calculation formula:
        // Carbs = 4 kcal per gram
        // Protein = 4 kcal per gram
        // Fats = 9 kcal per gram
        int totalCalories = (carbs * 4) + (protein * 4) + (fats * 9);

        // Show a summary to the user
        System.out.println("\n=== Daily Intake Summary ===");
        System.out.println("Carbs: " + carbs + "g");
        System.out.println("Protein: " + protein + "g");
        System.out.println("Fats: " + fats + "g");
        System.out.println("Total Calories: " + totalCalories + " kcal");

        // Return the result so other methods can use it
        return totalCalories;
    }

    // This method displays the menu
    private static void showMenu() {

        System.out.println("\n=== Calorie Tracker Menu ===");
        System.out.println("1. Add Calorie Entry");
        System.out.println("2. View Total Calories");
        System.out.println("3. Set Daily Goal");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }
}