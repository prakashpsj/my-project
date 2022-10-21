package Collection;

import java.util.HashMap;
import java.util.Map;

public class map {

	public static void main(String[] args) {

		// HashMap: Here we store value in key value pair
		
		Map map=new HashMap();
		
		map.put("ID", 102);
		map.put("Roll NO", 1);
		map.put("Addrs", "Savkhed");0
		map.put("Pincode", 431116);
		map.put("pass", 1234);
		
		System.out.println(map.get("ID"));
		System.out.println(map.isEmpty());
		System.out.println(map);
		System.out.println(map.get("pass"));
		
	}

}
