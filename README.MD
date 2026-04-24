# Calorie Tracker CLI (Java)
## 📸 Image Source
Calorie tracking image from Adobe Stock:  
https://stock.adobe.com/images/calorie-counting-and-food-with-labels-concept/107597944

## 📌 Project Overview

The **Calorie Tracker CLI** is a Java-based command-line application designed to help users monitor their daily and weekly calorie intake. It enables users to log food and drink entries, track macronutrients (protein, carbohydrates, and fats), and compare consumption against personalized fitness goals.

This application is lightweight, easy to use, and structured to allow future expansion (such as GUI integration or advanced analytics).

---

## 🎯 Purpose

The purpose of this application is to:

* Help users record food and drink consumption
* Track calorie intake over time
* Monitor macronutrient distribution
* Provide feedback on progress toward calorie goals
* Encourage healthier eating habits through awareness

---

## 💻 Target Platform

* Language: **Java**
* Interface: **Command Line Interface (CLI)**
* Environment: Any system capable of running Java (Windows, macOS, Linux)

---

## ⚙️ Features

### 🔧 Core Functionalities

#### 1. User Goal Setup

Users can configure personal fitness and calorie goals:

* Set **daily calorie goal**
* Set **weekly calorie goal**
* Select fitness goal:

  * Lose weight
  * Maintain weight
  * Gain weight
  * Cut
  * Bulk

---

#### 2. Calorie Entry

Users can log consumption details:

* Add **food entries**
* Add **drink entries**
* Input calorie values
* Record multiple entries per day
* Automatically calculate total daily calories

---

#### 3. Macronutrient Tracking

Each entry can include:

* Protein (grams)
* Carbohydrates (grams)
* Fats (grams)

All macro values are stored alongside calorie entries.

---

#### 4. Daily Tracking

The system:

* Stores daily calorie totals
* Displays total intake for a selected day
* Compares intake against the daily goal
* Alerts users if they are:

  * Under target
  * Over target
  * On target

---

#### 5. Weekly Tracking

The system:

* Stores calorie totals for each day
* Calculates weekly calorie totals
* Displays weekly summary
* Compares weekly intake against weekly goals

---

#### 6. Progress Feedback

Users receive:

* Status updates (under, over, on target)
* Alerts when goals are not met
* Simple CLI messages for progress tracking

---

## 🗂 Data Management (CRUD Operations)

### Create

Users can create:

* Food entries
* Drink entries
* Daily records
* Macronutrient records
* Goal settings

---

### Read

Users can view:

* Entries for a selected day
* Daily calorie totals
* Weekly calorie totals
* Current goals
* Macro breakdowns

---

### Update

Users can:

* Edit food or drink entries
* Modify calorie values
* Adjust macro values
* Update goals
* Change fitness goal type

---

### Delete

Users can:

* Remove food entries
* Remove drink entries
* Delete incorrect calorie or macro records

---

## 🧾 Data Storage

The application stores the following information:

* Entry name
* Entry type (food or drink)
* Calories
* Protein
* Carbohydrates
* Fats
* Entry date
* Daily calorie total
* Weekly calorie total
* Daily calorie goal
* Weekly calorie goal
* User fitness goal

---

## ✅ Must-Have Features

* Calorie input system
* Food & drink tracking
* Daily calorie summation
* Daily tracking system
* Weekly summary display
* Goal setting (daily & weekly)
* Alerts for unmet goals
* Basic macronutrient tracking
* Full CRUD functionality

---

## ✨ Nice-to-Have Features (Future Enhancements)

* Smart calorie recommendations based on goals
* Cut/Bulk optimization modes
* Progress visualization (charts/graphs)
* GUI-based version
* Data export (CSV/JSON)
* Meal categorization (breakfast, lunch, dinner)

---

## 🧩 Non-Functional Requirements

The system should:

* Be intuitive and easy to use via CLI
* Provide clear prompts and readable outputs
* Store data in a structured format
* Follow clean and maintainable Java coding practices
* Be designed for scalability and future feature additions

---

## ⚠️ Constraints

* Must be implemented in **Java**
* Must operate via **Command Line Interface**
* No graphical charts required in initial version

---

## 🏆 Success Criteria

The application is considered successful if users can:

* Record food and drink intake
* Track calories and macronutrients
* Set and modify calorie goals
* View daily and weekly summaries
* Receive meaningful feedback on progress
* Perform full CRUD operations on entries

---

## 🚀 Getting Started (Example)

```bash
# Compile
javac Main.java

# Run
java Main
```

---

## 📌 Example CLI Flow

```
Welcome to Calorie Tracker!

1. Set Goals
2. Add Entry
3. View Daily Summary
4. View Weekly Summary
5. Edit Entry
6. Delete Entry
7. Exit

Select an option:
```

## 📈 Future Vision

This CLI application is designed as a foundation for:

* A full-featured desktop or mobile app
* Integration with fitness APIs
* Advanced analytics and reporting tools

---

## 📄 License

This project is open-source and available for educational and personal use.

---
