package j125_Interfaces_Challenge_Part_1;

import java.util.List;

public interface ISaveable {
	List<String> write();
	void read(List<String> savedvalues);

}
