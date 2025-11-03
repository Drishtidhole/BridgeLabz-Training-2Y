import java.io.*;

interface BackupSerializable {}

class UserData implements BackupSerializable, Serializable {
    String name;
    int age;

    UserData(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class BackupSystem {
    public static void main(String[] args) {
        UserData user = new UserData("Drishti", 22);

        if (user instanceof BackupSerializable) {
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("backup.dat"))) {
                out.writeObject(user);
                System.out.println("✅ Data backed up successfully!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("⚠️ Object not eligible for backup.");
        }
    }
}

