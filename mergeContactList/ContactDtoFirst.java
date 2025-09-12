package camo.ultramain.mergeContactList;

import java.util.Objects;

/**
 * Place to Store the first employee contact details.
 * 
 * @author siravi
 * @version 1.0
 * @since 11, 2025
 */
public class ContactDtoFirst {
	private String contactName;
	private long contactNumber;
	/**
	 * @param contactName
	 * @param contactNumber
	 */
	public ContactDtoFirst(String contactName, long contactNumber) {
		this.contactName = contactName;
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "ContactDtoFirst [contactName=" + contactName + ", contactNumber=" + contactNumber + "]";
	}
	/**
	 * @return the contactName
	 */
	public String getContactName() {
		return contactName;
	}
	/**
	 * @param contactName the contactName to set
	 */
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	/**
	 * @return the contactNumber
	 */
	public long getContactNumber() {
		return contactNumber;
	}
	/**
	 * @param contactNumber the contactNumber to set
	 */
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(contactNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContactDtoFirst other = (ContactDtoFirst) obj;
		return contactNumber == other.contactNumber;
	}
	

}