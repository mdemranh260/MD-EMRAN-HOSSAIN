class IDCard {     String name;     int id; 
    String department; 
    String institution; 
    IDCard(String name, int id, String department, String institution) {         this.name = name;         this.id = id; 
        this.department = department;         this.institution = institution; 
    } 
    void showID() { 
        System.out.println("ID Card Information:"); 
        System.out.println("Name: " + name); 
        System.out.println("ID: " + id); 
        System.out.println("Department: " + department); 
        System.out.println("Institution: " + institution); 
    } 
} 
 
public class Main { 
    public static void main(String[] args) { 
        IDCard student1 = new IDCard("Emran", 101, "CSE", "IIUC");         student1.showID(); 
    } 
} 
