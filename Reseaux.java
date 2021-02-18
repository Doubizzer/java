import java.util.ArrayList;
public class Reseaux { 
      Arraylist tablist = new Arraylist();   
      public Reseaux() {
        
      }
      public void addEqClient (EqClient pNom){
          tablist.add("EqClient =>" + pNom);
      }
      public void addEqSwitch (EqSwitch pNom){
          tablist.add("EqSwitch =>" + pNom);
      }
  
      public void affiche() {
        System.out.println(tablist);
    }
}
