package camo.ultramain.mergeContactList;

/**
 * Class second to store the contact details.
 * 
 * @author siravi
 * @version 1.0
 * @since Sep 11, 2025
 */
public class ContactDtoSecond {
	private String contactNameSecond;
	private long contactNumberSecond;
	public ContactDtoSecond(String contactNameSecond, long contactNumberSecond) {
		super();
		this.contactNameSecond = contactNameSecond;
		this.contactNumberSecond = contactNumberSecond;
	}
	/**
	 * @return the contactNameSecond
	 */
	public String getContactNameSecond() {
		return contactNameSecond;
	}
	/**
	 * @param contactNameSecond the contactNameSecond to set
	 */
	public void setContactNameSecond(String contactNameSecond) {
		this.contactNameSecond = contactNameSecond;
	}
	/**
	 * @return the contactNumberSecond
	 */
	public long getContactNumberSecond() {
		return contactNumberSecond;
	}
	/**
	 * @param contactNumberSecond the contactNumberSecond to set
	 */
	public void setContactNumberSecond(long contactNumberSecond) {
		this.contactNumberSecond = contactNumberSecond;
	}
	

}
