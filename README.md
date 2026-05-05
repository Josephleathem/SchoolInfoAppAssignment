# School Info App — Week 1 Hands-On Exercise

**Course:** Android Development  

---

## Course Objectives Covered

- **CO1** — Describe the Android platform's role and development environment in the mobile market, including its applications, features, development tools, and marketplace.
- **CO2** — Design and implement a functional Android user interface, incorporating essential UI components, layouts, and activities, while handling events, managing code, and debugging in an emulator environment.

---

## Project Overview

This app provides information about schools in your country. It allows users to select a school from a list and view detailed information about the selected school across two screens.

---

## Screens

### Screen 1 — Main Screen (School Selection)

- Displays a list of schools, each with a name and picture.
- Each school entry has a **Button** component to navigate to that school's details.
- Layout is customized for easy navigation with a scrollable list to support future expansion.

### Screen 2 — Details Screen (School Information)

- Displays detailed information for the selected school:
  - School Name
  - School Logo
  - School Address
  - Phone Number
- Layout is customized to clearly present each detail in organized sections.

---

## Schools Included

| School | Activity Class |
|--------|----------------|
| CIAT   | `Info.java`    |
| Edison | `EdisonInfo.java` |
| Unity  | `unityInfo.java` |

---

## Data Per School Entry

| Field          | Description                   |
|----------------|-------------------------------|
| School Name    | Full name of the school       |
| School Picture | Photo representing the school |
| Logo           | Official school logo image    |
| Address        | Street address of the school  |
| Phone Number   | Contact phone number          |

---

## Assignment Submission Requirements

1. **MS Word file** — Copy/paste your code and output screenshots.
2. **Source files** — Attach the project source files.

---

## Tech Stack

- **Platform:** Android
- **Language:** Java
- **IDE:** Android Studio
- **Min SDK:** As configured in `app/build.gradle.kts`
