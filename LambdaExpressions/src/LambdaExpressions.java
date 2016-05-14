import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExpressions {

	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<MovieFan> fans = new ArrayList <MovieFan>();
		fans.add(new MovieFan("Kamil","Drama",1000,false));
		fans.add(new MovieFan("Romek","Comedy",689,true));
		fans.add(new MovieFan("Tomek","Thriller",150,true));
		fans.add(new MovieFan("Atomek","Drama",250,false));
		fans.add(new MovieFan("Germania","Drama",1250,false));
		
		printHollywoodLovers(fans, new HollywoodLovers());  //without LambdaExpression
		printHollywoodLovers(fans, f ->f.isHollywoodMoviefan() );  //with LambdaExpression, we don't need to create an object
		
		
		for(MovieFan fan:fans)
		{
			System.out.print(fan.getName() + " "); //traditional loop 
		}
		System.out.println();
		fans.forEach((fan) -> System.out.print(fan.getName() + " ")); //loop with using LabdaExpression
		
		System.out.println();
		new Thread(new Runnable() {										//making classic thread
		    @Override
		    public void run() {
		        System.out.println( Thread.currentThread().getName());
		    }
		}).start();

	
		new Thread(() -> System.out.println(Thread.currentThread().getName())).start(); //making thread with LambdaExpression
		
		
	
	}
	
	private static void printHollywoodLovers(List<MovieFan> fans,HollywoodFan lovers ){
		for(MovieFan fan:fans){
			if(lovers.HollywoodFanChecker(fan)==true)
				System.out.print(fan.getName()+ " ");
		}
		System.out.println();
		}

}
