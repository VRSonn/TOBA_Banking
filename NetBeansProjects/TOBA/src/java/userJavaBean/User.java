/*
Let's begin by creating a JavaBean. Create a User JavaBean. The User bean should
have all the attributes collected from the new customer form. Also give it a 
username and password property.
 */
package userJavaBean;

// Java Bean must be serializable
import java.io.Serializable;
        
public class User implements Serializable {
    
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String email;
    private String username;
    private String password;
    
    //Java Beans need a zero argument constructor
    public User() {
     firstName = "";
     lastName = "";
     phone = "";
     address = "";
     city = "";
     state = "";
     zip = "";
     email = "";
     username = "";
     password = "";
    }
    
    //Assign the strings to this instance of the variable
    public User(String firstName, String lastName, String phone, String address, 
            String city, String state, String zip, String email, String username,
            String password){
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email; 
        this.username = username;
        this.password = password;

       
    }

    //automated for newcustomer servlet??? needed for user object would not connect to above
    //public User(String firstName, String lastName, String phone, String address, String city, String state, String zip, String email) {
      //  throw new UnsupportedOperationException("Not supported yet."); 
    //}
    
    //Java Beans need to have get and set methods
    
    //get first name
    public String getFirstName() {
        return firstName;
    }
    // set first name
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    //get last name
    public String getLastName() {
        return lastName;
    }
    // set last name
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    //get address
    public String getAddress() {
        return address;
    }
    // set address
    public void setAddress(String address){
        this.address = address;
    }
    //get city
    public String getCity() {
        return city;
    }
    // set city
    public void setCity(String city){
        this.city = city;
    }
       //get state
    public String getState() {
        return state;
    }
    // set state
    public void setState(String state){
        this.state = state;
    }
     //get zip
    public String getZip() {
        return zip;
    }
    // set zip
    public void setZip(String zip){
        this.zip = zip;
    }
    //get phone
    public String getPhone() {
        return phone;
    }
    // set phone
    public void setPhone(String phone){
        this.phone = phone;
    }
    //get email
    public String getEmail() {
        return email;
    }
    // set email
    public void setEmail(String email){
        this.email = email;
    }
     //get username
    public String getUserName() {
        return username;
    }
    // set username
    public void setUsername(String username){
        this.username = username;
    }
     //get password
    public String getPassword() {
        return password;
    }
    // set password
    public void setPassword(String password){
        this.password = password;
    }
    
    }
    
    
