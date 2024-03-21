package Service;

import Model.Post;
import Model.PostType;

public interface IPostService {

	public abstract Post publishPost(String title, String msg, PostType type) throws Exception;
	
}