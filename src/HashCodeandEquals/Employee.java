package HashCodeandEquals;

public class Employee {
    int id ;
    String name ;
    Employee(int id,String name){
        this.id=id ;
        this.name=name ;
    }

    @Override
    public boolean equals(Object obj) {
        Employee temp = (Employee)obj ;
//        return super.equals(obj);
        boolean isitequal = this.id==temp.id && this.name.equals(temp.name) ;
        return isitequal ;
    }

    @Override
    public int hashCode() {
//        return super.hashCode();
        return id+this.name.hashCode() ;
    }
}
