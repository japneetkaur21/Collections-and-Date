import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Score_name_comparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int ans = (int) (o2.getScore() - o1.getScore());
        return ans == 0 ? o1.getName().compareTo(o2.getName()) : (int) (o2.getScore() - o1.getScore());
    }
}

    class Student {
        String name;
        Double score;
        Double age;

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", score=" + score +
                    ", age=" + age +
                    '}';
        }

        Student(String name, double score, double age) {
            this.name = name;
            this.age = age;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getScore() {
            return score;
        }

        public void setScore(Double score) {
            this.score = score;
        }

        public Double getAge() {
            return age;
        }

        public void setAge(Double age) {
            this.age = age;
        }


        static void CompareScore() {

            Set<Student> set = new TreeSet<>(new Score_name_comparator());
            set.add(new Student("HAL", 90, 19));
            set.add(new Student("XYZ", 80, 21));
            set.add(new Student("IJK", 70, 21));
            set.add(new Student("ABC", 70, 22));
            set.add(new Student("LMN", 95, 20));
            set.add(new Student("EFG", 60, 20));
            System.out.println(set);
        }



        public static void main(String[] args) {
            CompareScore();
        }
    }
