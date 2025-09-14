# Notepad Application

A simple Java Swing-based text editor application with basic editing features and formatting options.

## Features

- **Edit Menu**: Cut, Copy, and Paste functionality
- **Help Menu**: About dialog with student information
- **Format Menu**: Font and Color chooser (optional feature)
- **Text Area**: Scrollable text editing area

## Setup Instructions

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Any Java IDE (Eclipse, IntelliJ IDEA, VS Code) or command line tools

### How to Run

#### Option 1: Using Command Line
1. Open Command Prompt or Terminal
2. Navigate to the project directory:
   ```bash
   cd "C:\Users\TUF\Desktop\IT3003\Notepad\Notepad"
   ```
3. Compile the Java file:
   ```bash
   javac src/Notepad.java
   ```
4. Run the application:
   ```bash
   java -cp src Notepad
   ```

#### Option 2: Using an IDE
1. Open your preferred Java IDE
2. Import the project from the `Notepad` folder
3. Locate the `Notepad.java` file in the `src` directory
4. Right-click on the file and select "Run" or use the IDE's run button

### Project Structure
```
Notepad/
├── src/
│   └── Notepad.java          # Main application file
├── Notepad.iml              # IntelliJ IDEA module file
└── README.md                # This file
```

## Assumptions and Special Notes

1. **Student Information**: The About dialog currently shows placeholder text "[Your Name]" and "[Your ID]". Please replace these with your actual name and student ID before submission.

2. **Java Version**: The application is compatible with Java 8 and higher versions.

3. **Operating System**: The application is cross-platform and should work on Windows, macOS, and Linux systems with Java installed.

4. **Dependencies**: No external libraries are required - the application uses only standard Java Swing components.

5. **Font Selection**: The font chooser displays all available system fonts. Font sizes are limited to common sizes (10-32pt).

6. **Color Selection**: The color chooser allows selection of any color for text foreground.

## Technical Details

- **Framework**: Java Swing
- **Main Class**: `Notepad.java`
- **GUI Components**: JFrame, JTextArea, JMenuBar, JMenu, JMenuItem, JDialog, JComboBox, JColorChooser
- **Event Handling**: ActionListeners for menu items

## Usage

1. **Text Editing**: Type directly in the text area
2. **Cut/Copy/Paste**: Use the Edit menu or standard keyboard shortcuts (Ctrl+X, Ctrl+C, Ctrl+V)
3. **Font Selection**: Go to Format → Font to change font family and size
4. **Color Selection**: Go to Format → Color to change text color
5. **About Information**: Go to Help → About to view application information

## Development Notes

This application demonstrates:
- Java Swing GUI programming
- Menu creation and event handling
- Dialog boxes and user interaction
- Font and color selection components
- Basic text editing functionality
