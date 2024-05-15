
public class Student {

  private String Name;
  private int Age;
  private String Pesel;
  private int rok_studiowania;

  public Student(String name, int age, String pesel, int rok_studiowania) {
    Name = name;
    Age = age;
    Pesel = pesel;
    this.rok_studiowania = rok_studiowania;
  }

  public String getName() {
    return Name;
  }

  public int getAge() {
    return Age;
  }

  public String getPesel() {
    return Pesel;
  }

  public int getRok_studiowania() {
    return rok_studiowania;
  }

  public String toString() {
    return Name + " " + Integer.toString(rok_studiowania) + " " + Pesel;
  }

  public static Student parse(String str) {
    String[] data = str.split(" ");
    if (data.length != 4)
      return new Student("Parse Error", -1, "N/A", -1);
    return new Student(data[0], Integer.parseInt(data[3]), data[2], Integer.parseInt(data[1]));
  }
}