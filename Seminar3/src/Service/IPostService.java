package Service;

import Model.PostType;

public interface IPostService {

	public abstract void publishPost(String title, String msg, PostType type) throws Exception;
	
}