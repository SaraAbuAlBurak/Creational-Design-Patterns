
public class Student {
    private int id;
    private String Name;
    private double gpa ;
    private String Email;

    
    public Student(){
    
    }
    
    
    public Student(int id,String Name,double gpa,String Email){
 
        setId(id);
        setName(Name);
        setGpa(gpa);
        setEmail(Email);
        

}
    
    
    public Student withId(int id ){
        setId(id);
        return this;
    
    }
    
    public Student withName(String Name ){
        setName(Name);
        return this;
    
    }
    
    public Student withGpa(double gpa ){
        setGpa(gpa);
        return this;
    
    }
    
    public Student withEmail(String Email ){
        setEmail(Email);
        return this;
    
    }
    
    
    
    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public double getGpa() {
        return gpa;
    }

    public String getEmail() {
        return Email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
    
}
