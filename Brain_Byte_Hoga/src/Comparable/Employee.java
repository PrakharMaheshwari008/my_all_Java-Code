package Comparable;

public class Employee{

    public String name;
    public String id;

    public Employee(String name, String id){
//        super();
        this.name = name;
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setId(){
        this.name = name;
    }
    public void setName(){
        this.id = id;
    }
    @Override
    public String toString(){
        return "Employee [name ="+name+ ", id="+id+"]";
    }
    @Ov erride
    public int compareTo(Employee employee){
        return this.name.compareTo(employee.name);
    }
}
