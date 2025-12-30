📱 SIM-Based Mobile Phone Simulation using Java Interfaces:

📌 Project Overview:
-This Java mini project demonstrates the real-world use of Interfaces, Abstraction, Polymorphism, and Loose Coupling by simulating how a mobile phone works with different SIM
cards (Jio, Airtel, BSNL, Vi).
-The project follows clean Object-Oriented Programming (OOP) principles, where the mobile phone is independent of specific network providers and interacts with them through interfaces.

🎯 Objectives:
-Understand interface-driven development
-Implement runtime polymorphism
-Demonstrate loose coupling between components
-Simulate real-life mobile & SIM behavior using Java

🛠️ Technologies Used:
Language:
-Java (Core Java)

Concepts:
-Interfaces
-Abstraction
-Polymorphism
-Encapsulation

IDE: 
-Eclipse / IntelliJ IDEA
-Java Version: JDK 8+

📂 Project Structure:
com.interfaceproject
│
├── TestMobile.java          // Main test class
├── MobilePhone.java         // Mobile interface
├── SIMInterface.java        // SIM interface
│
├── Samsung.java             // Mobile implementation
│
├── Jio.java                 // SIM implementation
├── Airtel.java              // SIM implementation
├── BSNL.java                // SIM implementation
├── Vi.java                  // SIM implementation

⚙️ Features:
-Insert and remove SIM card dynamically
-Supports multiple network providers
-SIM activation & deactivation handling
-Make calls and send messages
-Random phone number generation
-Network provider identification during calls/messages

🔄 How It Works:
-A MobilePhone interface defines mobile actions.
-A SIMInterface defines SIM-related behavior.
-Each SIM provider implements SIMInterface.
-The Samsung class implements MobilePhone.
-At runtime, any SIM can be inserted into the phone.
-Mobile operations work without knowing SIM implementation details.

▶️ Sample Output:
-BSNL SIM activated
S-IM is inserted
-Your phone number is : 9189XXXXXXXX
-Network provider : BSNL
-Making a call to 6789567567
-Network provider : BSNL
-Sending Good Morning!! to 9090898989
-BSNL SIM deactivated
-SIM is removed.

💡 Key OOP Concepts Demonstrated:
-Interface-based Programming
-Loose Coupling
-Runtime Polymorphism
-Separation of Concerns
-Code Reusability & Scalability

🚀 How to Run:
-Clone the repository
-git clone https://github.com/your-username/your-repo-name.git
-Open the project in Eclipse or IntelliJ IDEA
-Run TestMobile.java

📈 Future Enhancements:
-Dual SIM support
-Call duration & balance tracking
-Internet data simulation
-Exception handling improvements
-Logging instead of System.out.println

👨‍💻 Author:
-Durgesh Tiwari
-Java Developer | Learning Backend & OOP Design
