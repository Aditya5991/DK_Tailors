package database.table.customerDetails;

public class CustomerDetails
{
	private int myId;
	private String myFirstName;
	private String myLastName;
	private String myAddress;
	private String myEmail;

	public CustomerDetails(int id)
	{
		assert (id > 0) : "Invalid ID: Id should be greater than 0";

		myId = id;
	}

	public CustomerDetails(int id, String fname, String lname, String address, String email)
	{
		assert (id > 0) : "Invalid ID: Id should be greater than 0";

		myId = id;
		myFirstName = fname;
		myLastName = lname;
		myAddress = address;
		myEmail = email;
	}

	public int GetId()
	{
		return myId;
	}

	public String GetFirstName()
	{
		return myFirstName;
	}

	public String GetLastName()
	{
		return myLastName;
	}

	public String GetAddress()
	{
		return myAddress;
	}

	public String GetEmail()
	{
		return myEmail;
	}

	public void SetFirstName(String firstName)
	{
		myFirstName = firstName;
	}

	public void SetLastName(String lastName)
	{
		myLastName = lastName;
	}

	public void SetAddress(String address)
	{
		myAddress = address;
	}

	public void SetEmail(String email)
	{
		myEmail = email;
	}

}
