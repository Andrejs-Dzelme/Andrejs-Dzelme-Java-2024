package Service;
import java.util.ArrayList;

import Model.Page;
import Model.user.RegisteredUser;

public interface IGuestUserService {
	
	public abstract ArrayList<RegisteredUser> findUsers(String keyText);
	public abstract ArrayList<Page> findPages(String keyText);
	//public abstract ArrayList<> find(String keyText);

}
