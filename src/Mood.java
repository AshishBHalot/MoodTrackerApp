import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Mood {
    // Attributes
    private String name;
    private LocalDate date;
    private LocalTime time;
    private String notes;
    
    // Date and Time formatters for toString
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm");
    
    // Default constructor
    public Mood() {
        this.date = LocalDate.now();
        this.time = LocalTime.MIDNIGHT;
        this.notes = "";
    }
    
    // Overloaded constructors
    
    // Mood(String name)
    public Mood(String name) {
        this();
        this.name = name;
    }
    
    // Mood(String name, LocalDate date)
    public Mood(String name, LocalDate date) {
        this();
        this.name = name;
        this.date = date;
    }
    
    // Mood(String name, LocalDate date, LocalTime time)
    public Mood(String name, LocalDate date, LocalTime time) {
        this();
        this.name = name;
        this.date = date;
        this.time = time;
    }
    
    // Mood(String name, String notes)
    public Mood(String name, String notes) {
        this();
        this.name = name;
        this.notes = notes;
    }
    
    // Mood(String name, LocalDate date, String notes)
    public Mood(String name, LocalDate date, String notes) {
        this();
        this.name = name;
        this.date = date;
        this.notes = notes;
    }
    
    // Mood(String name, LocalDate date, LocalTime time, String notes)
    public Mood(String name, LocalDate date, LocalTime time, String notes) {
        this.name = name;
        this.date = date;
        this.time = time;
        this.notes = notes;
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public LocalDate getDate() {
        return date;
    }
    
    public LocalTime getTime() {
        return time;
    }
    
    public String getNotes() {
        return notes;
    }
    
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    public void setTime(LocalTime time) {
        this.time = time;
    }
    
    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    // toString method
    @Override
    public String toString() {
        return String.format("Mood{name='%s', date=%s, time=%s, notes='%s'}",
                name,
                date.format(DATE_FORMATTER),
                time.format(TIME_FORMATTER),
                notes);
    }
    
    // equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        
        Mood mood = (Mood) obj;
        
        return Objects.equals(name, mood.name) &&
               Objects.equals(date, mood.date) &&
               Objects.equals(time, mood.time) &&
               Objects.equals(notes, mood.notes);
    }
    
    // hashCode method (recommended when overriding equals)
    @Override
    public int hashCode() {
        return Objects.hash(name, date, time, notes);
    }
}