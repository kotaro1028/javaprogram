package kotaro1113;
	class Dog
	{
	    private String Name;
	    private int Age;
	    private String kind;
	    
	    public Dog( String kd) {
	     	kind = kd;
	    }

	    public void SetName( String nm )
	    {
	    		Name = nm;
	    }

	    public void ShowProfile()
	    {
	        System.out.println( "my dog is " +kind + "and name is "+ Name + "!! His age is " + Age+"!!");
	    }
	    
	   public void SetAge( int a ) {
		   Age = a;
	   }
	    
	}

	public class Task6 {
	    public static void main( String[] args )
	    {
	        Dog myDog = new Dog("Akita ken");
	 
	        myDog.SetName( " Mike" );
	        myDog.SetAge(4);
	        myDog.ShowProfile();
	        
	       
	    }
	}

	
