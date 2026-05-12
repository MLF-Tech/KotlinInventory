# Kotlin Inventory Engine: From Java to Kotlin

This project is the evolution of my first Java Inventory Engine. After graduating from CodeFactory Vienna with a perfect score (360/360), I challenged myself to translate the warehouse management logic into Kotlin.

**Troubleshooting & Technical Journey**
This wasn't just a "copy-paste" exercise. Building this project required navigating several technical challenges that tested my Project Management skills applied to software development:

**Compatibility Matrix Management**
I resolved a version conflict between the cutting-edge Java 26 and the Kotlin 2.0 compiler by manually installing and configuring a stable LTS (Java 21) environment.

**Environment Configuration on macOS 12**
I bypassed Homebrew limitations on Monterey by manually setting up the compiler binaries and managing terminal PATHs to ensure a smooth build process.

**Why Kotlin?**
Given my background in ERP infrastructure (managing JTL-Wawi), I immediately appreciated how Kotlin enhances code safety and readability. In this implementation, I focused on:

Data Classes: Reducing boilerplate code significantly (one line of Kotlin vs. dozens in Java).

Null Safety: Using safe calls and Elvis operators to prevent system crashes during stock lookups, ensuring the engine is resilient.

**How to Run**
Compilation:
/Users/marialaurafagioli/Downloads/kotlinc/bin/kotlinc Inventory.kt -include-runtime -d inventory.jar

**Execution:**
java -jar inventory.jar

### Key Features Implemented:

- **Case-insensitive Search**: Users can look up products without worrying about uppercase/lowercase mismatches.
- **Resilient Error Handling**: Implemented Kotlin's safe calls (`?.`) to ensure the system never crashes when a product is missing.
