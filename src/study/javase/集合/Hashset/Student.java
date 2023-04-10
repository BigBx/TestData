package 集合.Hashset;

import java.util.Objects;


class Student {
        private String name;
        private int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void setName(String name1) {
            this.name = name1;
        }

        public String getName() {
            return name;
        }

        public void setAge(int age1) {
            this.age = age1;
        }

        public int getAge() {
            return age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            集合.Hashset.Student student1 = (集合.Hashset.Student) o;
            return age == student1.age && Objects.equals(name, student1.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
        public String toString(){

            return "name"+name+",age"+age;
        }
    }
