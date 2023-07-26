package Comparator_;

public class Student {
        private String id;
        private String name;

        public Student(String name, String id){
//            super();
            this.name = name;
            this.id = id;
        }
        public String getName(){
            return name;
        }
        public String getId(){
            return id;
        }
        public void setName(String name){
            this.name = name;
        }
        public void setId(String id){
            this.id = id;
        }
        @Override
        public String toString(){
            return "Student [id="+id+", name=" + name + "]";
        }
}
