public class Controller {


    public Controller() {

    }

    public boolean send_enrollment_request(String name, String id) {

        Student st = new Student(name, id);
        if(st.add_new_student(st)) {
            return true;
        }else {
            return false;
        }

    }

}