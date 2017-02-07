package hibernate;

public class hibernate_class_28 {
	public class UserGetTransaction implements TransactionCallback{

		 public List users;

		 protected ApplicationContext context;

		 public UserGetTransaction (ApplicationContext context) {
		  this.context = context;
		 }

		 @Override
		 public Boolean doInTransaction(TransactionStatus arg0) {
		  UserDao udao = (UserDao) ac.getBean("myUserDAO");
		  users = udao.listUserWithEvent();
		  return null;
		 }

		}
}
