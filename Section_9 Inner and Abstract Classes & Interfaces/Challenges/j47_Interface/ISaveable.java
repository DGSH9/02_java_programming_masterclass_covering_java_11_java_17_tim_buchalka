package j47_Interface;

import java.util.List;

public interface ISaveable {
	List<String> write();
	void read(List<String> savedvalues);

}
