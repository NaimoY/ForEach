public class ForEach {
    public static void main(String[] args) {

        String[] students = {"Asad", "Daud", "Ismail", "Naima"};
        for (int i = 0;  i < students.length ; i ++) {
            System.out.println(students[i]);
            int newStudentsLocation= (int) Math.floor(Math.random() * students.length);
            students[newStudentsLocation] = students[0];

        }
         for (String student : students){
             System.out.println(student);
  //hi
         }
        }
}
