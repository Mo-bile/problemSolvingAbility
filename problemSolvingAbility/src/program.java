import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

import com.newlecture.web.entity.Menu;

public class program {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub

		Menu menu = new Menu();
		
		menu.setName("아메리카노");
		System.out.println(menu);
		
		
		
		
		
		
		FileInputStream fis = new FileInputStream("res/setting.txt");
		Scanner scan = new Scanner(fis);
		
		String clsName = scan.nextLine();
		
		
		
		//이렇게 해서도 객체를 만들수 있음 		
		Menu menu1 = (Menu) Class.forName(clsName).newInstance();
		
//		Menu menu1 = (Menu) Class.forName(clsName)
//				.getDeclaredConstructor()
//				.newInstance();
		
		menu1.setName("카페라떼");
		System.out.println(menu1);
		
		scan.close();
		fis.close();
		
				
		
	}
}
