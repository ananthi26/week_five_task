package task_5;
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);  
    }
}
public class custom_exception_example {
    public static void main(String[] args) {
        try {
            validateAge(15);  
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older, provided: " + age);
        } else {
            System.out.println("Age is valid.");
        }
    }
}
