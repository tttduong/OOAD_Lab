public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String name;
    private String id;
    public Student(String name, String id) {
        this. name = name;
        this.id = id ;

    }
    public boolean add_new_student(Student st){
        DatabaseConnection db = new DatabaseConnection();
        boolean rs = db.setdata(st);
        return rs;
    }

}