# Factory Robot Hazard Analyzer 🚧🤖

A modular and extensible Java-based application that evaluates the hazard risk score of a factory robot based on arm precision, worker density, and machinery state.  
The system is developed incrementally using UC-wise refactoring and follows proper GitFlow and OOP design principles.

---

## 📌 Project Overview

The **Factory Robot Hazard Analyzer** is built step-by-step across multiple use cases (UC1 → UC8), progressively evolving from a simple console application to a fully modular and OOP-compliant hazard analysis system.

The final system:
- Collects robot safety inputs
- Validates inputs using custom exceptions
- Maps machinery states to risk factors
- Calculates hazard risk score using business rules
- Demonstrates clean modular and extensible architecture

---

## 🧩 Use Case Evolution (UC1 – UC8)

| UC | Feature |
|----|---------|
| UC1 | Display static hazard system message |
| UC2 | Accept robot hazard inputs |
| UC3 | Calculate hazard risk score (no validation) |
| UC4 | Introduce validation using conditional logic |
| UC5 | Refactor validation into a separate method |
| UC6 | Introduce custom exception `RobotSafetyException` |
| UC7 | Machinery state to risk factor mapping |
| UC8 | Fully modular & OOP-compliant hazard analyzer |

---
