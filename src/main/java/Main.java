import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      Scanner scanner = new Scanner(System.in);

      System.out.println("Wybierz opcje:");
      System.out.println("1 - Dodaj");
      System.out.println("2 - Wypisz studentów");
      System.out.println("3 - Wyjście");

      int choice = scanner.nextInt();
      switch (choice) {
        case 1:
          System.out.print("Imie: ");
          String name = scanner.next();
          System.out.print("Wiek: ");
          int age = scanner.nextInt();
          s.addStudent(new Student(name, age));
          break;
        case 2:
          var students = s.getStudents();
          for (Student current : students) {
            System.out.println(current.ToString());
          }
          break;
        case 3:
          System.out.println("Wyjście z programu.");
          System.exit(0);
          break;
        default:
          System.out.println("Zły wybór.");
      }
    } catch (IOException e) {

    }
  }
}