
interface SensitiveData {}

class UserCredentials implements SensitiveData {
    String username;
    String password;

    UserCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

public class DataEncryptor {
    public static void main(String[] args) {
        UserCredentials user = new UserCredentials("drishti", "mySecret123");

        if (user instanceof SensitiveData) {
            System.out.println("Encrypting sensitive data before storage...");
        } else {
            System.out.println("No encryption needed.");
        }
    }
}
