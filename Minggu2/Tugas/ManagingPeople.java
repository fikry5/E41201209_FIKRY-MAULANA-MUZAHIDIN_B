
package TugasMinggu2;

/**
 * @fikry
 */

    class Orang{
        String getName;
        int getAge;
        
        Orang(String getName, int getAge){
            this.getName = getName;
            this.getAge = getAge;
        }
        public String getName(){
            return getName;
        }
        public int getAge(){
            return getAge;
        }
    }

public class ManagingPeople {
    public static void main(String[] args) {
        Orang p1 = new Orang("Arial", 37);
        Orang p2 = new Orang("Joseph", 15);
       
        
        if(p1.getAge() == p2.getAge()) 
        {
            System.out.println(p1.getName() + " is the same age as " + p2.getName());
        }
        else
        {
            System.out.println(p1.getName() + " is NOT the same age as " + p2.getName());
        }     
    }
}