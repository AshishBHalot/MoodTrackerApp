/**
 * Custom exception class for handling invalid mood operations
 * in the Mood Tracker application.
 */
public class InvalidMoodException extends Exception {
    
    
    public InvalidMoodException() {
        super("Invalid mood operation");
    }
    

}