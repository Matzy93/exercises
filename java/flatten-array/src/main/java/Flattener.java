import java.util.List;
import java.util.ArrayList;

class Flattener {

	List flatten(List toFlatten) {
		List<Object> list = new ArrayList<Object>();
		for(Object o:toFlatten) {
			if(o!=null) {
				if(o instanceof List) {
					List<Object> flattened = flatten((List)o);
					for(Object o1:flattened) {
						if(o1!=null) list.add(o1);
					}
				}
				else {
					list.add(o);
				}
			}
		}
		return list;
	}
}
