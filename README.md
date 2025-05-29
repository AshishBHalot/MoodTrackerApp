# MoodTrackerApp
# Mood Tracker Console Application 

A Java console application for tracking daily moods and emotions with timestamps and notes.

## ✨ Features

- **Add Moods** - Record mood with date, time, and notes
- **Edit/Delete** - Modify notes or remove entries
- **Search** - Find moods by date or specific details
- **Export** - Save all data to `moodtracker.txt`
- **Validation** - Prevents duplicate entries for same date/time

## 🛠️ Tech Stack

- Java 8+
- Java Time API (`LocalDate`, `LocalTime`)
- File I/O for data persistence
- OOP principles and exception handling

## 🚀 Quick Start

```bash
# Clone repository
git clone https://github.com/yourusername/mood-tracker.git
cd mood-tracker

# Compile
javac Mood.java MoodTracker.java

# Run
java MoodTracker
```

## 📋 Usage

```
=== MOOD TRACKER MENU ===
A - Add new mood
E - Edit mood notes
D - Delete mood
S - Search mood
G - Get all moods
W - Write moods to file
EXIT - Exit application
```

### Example
```
Enter your choice: A
Enter mood name: Happy
Enter date (MM/DD/YYYY): 12/25/2023
Enter time (HH:MM): 14:30
Enter notes: Great Christmas lunch!
Mood added successfully!
```

## 📁 Project Structure

```
mood-tracker/
├── Mood.java           # Mood entity class
├── MoodTracker.java    # Main application
└── moodtracker.txt     # Generated data file
```

## 🔮 Future Enhancements

- GUI interface
- Database integration
- Mood analytics and trends
- Multi-user support

## 📄 License

MIT License

## 👤 Contact

- GitHub: [@yourusername](https://github.com/yourusername)
- Email: your.email@example.com

---

⭐ **Star this repo if you find it helpful!**
