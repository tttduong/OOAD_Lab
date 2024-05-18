public class DatabaseConnection {

    public DatabaseConnection() {

    }
    public boolean setdata (Student st){
        System.out.println("Successful adding student: "+ st.getName()+ " - "+st.getId());
        boolean rs = true;
        return rs;
    }
}






