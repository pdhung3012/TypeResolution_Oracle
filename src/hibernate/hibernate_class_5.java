package hibernate;

public class hibernate_class_5 {
	public class CharityTransferDAO extends HibernateDaoSupport implements ICharityTransfer {

		   public void delete(CharityTransfer charityTransfer) throws IMADataException {
		       try {
		         getSessionFactory()
		                 .getCurrentSession()
		                 .delete(charityTransfer);
		      }
		      catch (HibernateException e) {
		        throw new IMADataException("failed to delete charity shipping information", e);
		      }    
		}
}
