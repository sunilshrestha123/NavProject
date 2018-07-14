//package java.org.nav.solution.pojo;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.nav.solution.model.Student;
//
//public class PrimaryKeyDemo {
//    public static void main(String[] args) {
//        SessionFactory factory=new Configuration()
//                .configure("hibernate.cfg.xml")
//                .addAnnotatedClass(Student.class)
//                .buildSessionFactory();
//        //create seassion
//        Session session=factory.getCurrentSession();
//        try{
//
//
//Student tempstudent=new Student("sunil","shrestha","sunil@gmail.com");
//
//Student tempstudent2=new Student("kabita","shrestha","sunil@gmail.com");
//
//Student tempstudent3=new Student("rahul","shrestha","sunil@gmail.com");
//
//session.beginTransaction();
//session.save(tempstudent);
//session.save(tempstudent2);
//session.save(tempstudent3);
//session.getTransaction().commit();
//        }
//
//finally {
//            factory.close();
//
//            }
//        }
//
//    }
////    if(request.getParameter("action").equalsIgnoreCase("save")){
////            String pass =PasswordEncryption.encryptPassword(password);
////
