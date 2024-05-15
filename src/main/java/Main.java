import java.io.IOException;
import java.util.Scanner;
import java.util.Collection;

public class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      Scanner scanner = new Scanner(System.in);

      System.out.println("Wybierz opcje:");
      System.out.println("1 - Dodaj");
      System.out.println("2 - Wypisz studentów");
      System.out.println("3 - Wyjście");
      System.out.println("4 - Wyszukaj po nazwisku");

      int choice = scanner.nextInt();
      switch (choice) {
        case 1:
          System.out.print("Imie: ");
          String name = scanner.next();
          System.out.print("Nazwisko:");
          String nazwisko = scanner.next();
          System.out.print("Wiek: ");
          int age = scanner.nextInt();
          System.out.print("Pesel: ");
          String pesel = scanner.next();
          System.out.print("Rok studiowania: ");
          int rok_studiowania = scanner.nextInt();
          s.addStudent(new Student(name, age, pesel, rok_studiowania, nazwisko));
          break;
        case 2:
          System.out.println("Lista studentów:");
          Collection<Student> students = s.getStudents();
          for (Student current : students) {
            System.out.println(current.toString());
          }
          break;
        case 3:
          System.out.println("Wyjście z programu.");
          System.exit(0);
          break;
        case 4:
          System.out.print("Podaj nazwisko do wyszukania: ");
          String NazwiskoToSearch = scanner.next();
          Student foundStudent = s.findStudentByLastName(NazwiskoToSearch);
          if (foundStudent != null) {
            System.out.println("Znaleziono studenta: " + foundStudent.toString());
          } else {
            System.out.println("Nie znaleziono studenta o podanym nazwisku.");
          }
          break;
        default:
          System.out.println("Zły wybór.");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}