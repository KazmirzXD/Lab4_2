import java.util.Collection;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Service {

  public void addStudent(Student student) throws IOException {
    var f = new FileWriter("db.txt", true);
    var b = new BufferedWriter(f);
    b.append(
        student.getName() + " " + student.getAge() + " " + student.getPesel() + " " + student.getRok_studiowania());
    b.newLine();
    b.close();

  }

  public Collection<Student> getStudents() throws IOException {
    var ret = new ArrayList<Student>();
    var f = new FileReader("db.txt");
    var reader = new BufferedReader(f);
    String line;
    while ((line = reader.readLine()) != null) {
      ret.add(Student.parse(line));
    }
    reader.close();
    return ret;
  }

  public Student findStudentByName(String name) {

    return null;
  }

  public Student findStudentByPesel(String pesel) {

    return null;
  }
}