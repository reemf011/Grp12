/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rminewserver;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import rmi.GradeInterface;

/**
 *
 * 
 */
public class RMINewServer {

    static Student s1;
    static Student s2;
    static Car c1;
    static Car c2;

    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        
        
     Admin a = new Admin();
     Customer cust1 = new Customer("Omar Samy","OmarSa_20@gmail.com", "male","20/1/1988","5452 2121 21211 5465",null,null,"Omar7863", "23212245");
     
     a.registerObserver(cust1);
     
     a.SendingOffers("there is 20% off vouchers on luxuries hotels in Monaco ");
     
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);
        
        //Calling the class for the database 
        DB db = new DB();
        
        // Here we create our remote object
        //GradeInterface g = new Grade();
        
        // An RMI Registry initialized on port 1099
        Registry r = LocateRegistry.createRegistry(1099);
        
        // Our remote object g is binded to the name "grade"
      //  r.bind("grade", g);
        
        // Outputs that the server is ready
        System.out.println("The server is ready");
        
        
        s1 = new Student ("Meriam", 123, "Meriam12@yahoo.com");
        s2 = new Student ("Alaa", 1234, "Alaa19@yahoo.com");
        
        c1 = new Car (1, 1 ,"Cairo","Private Car", 15000);
        c2 = new Car (2, 3 ,"Tagmoa","Taxi", 100);
        
        db.insertStudent(s1);
        db.insertStudent(s2);
       
          db.insertCar(c1);
          db.insertCar(c2);
       
          db.deleteCar(1);
         db.deleteCar(2);
         db.close();
        } 


         
    
    
}