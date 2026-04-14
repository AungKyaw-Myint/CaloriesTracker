1. Project Overview

The application is a Java CLI calorie tracker that allows users to record daily food intake, monitor calorie consumption, track basic macronutrients, and compare intake against personal goals.

2. Purpose

The purpose of the app is to help users track food-related calorie intake, review daily and weekly totals, and stay aware of whether they are meeting, exceeding, or falling short of their calorie goals.

3. Target Platform

The system must run as a Java Command Line Interface application.

4. Core Functional Requirements
   4.1 User Goal Setup

The system must allow the user to:

Set a daily calorie goal
Set a weekly calorie goal
Choose a fitness goal:
Lose weight
Maintain weight
Gain weight
Cut
Bulk
4.2 Calorie Entry

The system must allow the user to:

Enter calorie values for food items
Enter calorie values for drink items
Save multiple entries per day
View the sum of all calorie entries for a day
4.3 Macronutrient Tracking

The system must allow the user to record:

Protein
Carbohydrates
Fats

The system must store macro values alongside food entries where applicable.

4.4 Daily Tracking

The system must:

Store daily calorie totals
Display daily calorie intake
Compare daily intake against the user’s daily goal
Alert the user when the daily intake goal is not met
4.5 Weekly Tracking

The system must:

Store calorie totals for each day of the week
Calculate the full weekly calorie total
Display weekly calorie intake at the end of the week
Compare weekly intake against the user’s weekly goal
4.6 Progress Feedback

The system must:

Show whether the user is under, over, or on target for calorie goals
Provide simple alerts or messages when goals are not met
5. Data Management Requirements

The system must support CRUD operations for calorie-related information.

5.1 Create

The system must allow users to create:

Food entries
Drink entries
Daily calorie records
Macro records
Goal settings
5.2 Read

The system must allow users to view:

All entries for a selected day
Daily calorie totals
Weekly calorie totals
Current daily and weekly goals
Stored macro information
5.3 Update

The system must allow users to:

Edit an existing food or drink entry
Change calorie values
Change macro values
Update daily or weekly calorie goals
Update fitness goal type
5.4 Delete

The system must allow users to:

Delete a food entry
Delete a drink entry
Remove incorrect calorie or macro records
6. Information to Be Stored

The application must store the following information:

Entry name
Entry type (food or drink)
Calories
Protein
Carbohydrates
Fats
Entry date
Daily calorie total
Weekly calorie total
Daily calorie goal
Weekly calorie goal
User fitness goal
7. Must-Have Features

The minimum required features are:

Calorie input
Food tracking
Sum of calorie entries
Daily calorie tracking
Weekly calorie display
Daily or weekly calorie goal setting
Alerts when intake goal is not met
Basic macro tracking for protein, carbs, and fats
Ability to store, update, read, and delete entries
8. Nice-to-Have Features

The following features are optional enhancements:

Calorie recommendations based on whether the user wants to lose, maintain, or gain weight
Support for cut and bulk modes
Progress chart
Graph-based UI in a future version
9. Non-Functional Requirements

The system should:

Be easy to use from the command line
Display clear prompts and outputs
Store data in a structured and maintainable way
Be organized using good Java programming practices
Be designed so future GUI or graph features can be added later
10. Constraints
    The application must be developed in Java
    The application must use a CLI interface
    Graphical charting is not required for the initial version
11. Success Criteria

The application is successful if a user can:

Record food and drink calorie intake
Track macros
Set calorie goals
View daily totals
View weekly totals
Receive feedback on goal progress
Manage entries through create, read, update, and delete operations