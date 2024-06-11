import java.util.*;

class Node
{
	String name , number;
	Node next;
	Node(String name, String number)
	{
		this.name=name;
		this.number=number;
		next=null;
	}
 }
 class Phonebook11
 {
	 Node head;
	 
	void add_Contact(String name, String number)
	{
		Node newNode = new Node(name,number);
		Node temp=head;
		if(head == null)
		{
			head = newNode;
		}
		else
		{
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next= newNode;
		}
		System.out.println("\t\t\t"+newNode.number+" & "+newNode.name+" added successfully....!");
	}

	void display ()
	{
		int len =0;
		Node temp = head ;
		if(temp ==null)
		{
			System.out.println("\t\t\tContact list is Empty ");
		}
		else
		{
			while (temp != null)
			{
				
				System.out.println("\t\t\tFull Name : "+temp.name);
				System.out.println("\t\t\tPhone Number: "+temp.number);
	
				temp= temp.next;
				len++;
			}
			System.out.println("\t\t\tTotal contacts in the list = "+len);
			
		}
	}
	void search_By_Number(String data)
	{
		Node temp = head;
		int count =1;
		while(temp!=null && !(temp.number.equals(data)))
		{
				count++;
				temp = temp.next;
		}
		if(temp==null)
			System.out.println("\t\t\t"+data+" Not found");
		else
			System.out.println("\t\t\tContact found at "+count+".Name: "+temp.name+" Number : "+temp.number);
			
	}
	void search_By_Name(String data)
	{
		Node temp = head;
		int count =1;
		while(temp!=null && !(temp.name.equals(data)))
		{
			count++;
			temp = temp.next;
		}
		if(temp==null)
			System.out.println("\t\t\t"+data+" Not found...!");
		else
			System.out.println("\t\t\tContact found at "+count+".Name: "+temp.name+" Number : "+temp.number);
	}
	void edit_Contact(String name, String number)
	{
		Node temp = head;
		while(temp!=null && !(temp.name.equals(name)))
		{
			temp=temp.next;
		}
		if(temp==null)
			System.out.println("\t\t\t"+name+" not found...!");
		else
		{		
			temp.number=number;
			System.out.println("\t\t\t"+name+" --> "+number+" updated successfully...!");
		}
	}
	void delete_Contact(String data)
	{
		Node temp=head;
		Node temp2=null;
		 if (temp != null && (temp.number.equals(data) || temp.name.equals(data)))
			 {
            head = temp.next;
			System.out.println("\t\t\t Contact "+data+" deleted successfully..!");
            return;
			 }
		while(temp.next!=null && (!temp.name.equals(data) || !(temp.number.equals(data))))
		{
			temp2=temp;
			temp=temp.next;
		}
		if(temp==null)
			System.out.println("\t\t\t Contact not found...!");
		else
		{
			if(temp.next==null)
				temp2.next=null;
			else{
			temp2.next=temp.next;
			System.out.println("\t\t\t Contact "+data+" deleted successfully...!");
			}
		}
	}
	void clear_all()
	{
		if(head == null)
		{
			System.out.println("\t\t\tList is Empty...! ");
		}
		else
		{
			while (head != null)
			{
				head = head.next;
			  
			}
			System.out.println("\t\t\tALL contact list has been deleted ...!");
		}
	}
	static boolean check_Number(String check_number)
	{
		String validate_regex = "(91)?[7-9][0-9]{9}";
		boolean matched=check_number.matches(validate_regex);
		if(matched)
			return true;
		else
			return false;
	}
	void menu()
	{
		System.out.println("1.Add contact ");
		System.out.println("2.Display all contacts ");
		System.out.println("3.Search contact(By number) ");
		System.out.println("4.Search contact(By name) ");
		System.out.println("5.Edit contact");
		System.out.println("6.Delete contact");
		System.out.println("7.Clear all record ");
		System.out.println("8.Terminate");
		System.out.println("Enter choice: ");
	}
	public static void main(String args[])
	{
		Scanner sc1 = new Scanner(System.in);
		Phonebook11 phoneObj= new Phonebook11();
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("\n\t\t\t\tPHONE DIRECTORY");
		System.out.println("\n--------------------------------------------------------------------------------");
		
		int ch;
		while (true )
		{
			phoneObj.menu();
			 ch=sc1.nextInt();
			switch (ch)
			{
				case 1:
					System.out.println("Enter Name :");
						String name =sc1.next();
					System.out.println("Enter number :");
					String number = sc1.next();
					boolean matched_complete = check_Number(number);
					if(matched_complete)
						phoneObj.add_Contact(name,number);
					else
						System.out.println("\t\t\tNumber not valid..!\n\t\t\tTry again...!");
					break;
				case 2:
		 
					phoneObj.display();
					break;
				case 3:
					System.out.println("Enter number to find: ");
					String data_Number= sc1.next();
					phoneObj.search_By_Number(data_Number);
					break;
				case 4:
					System.out.println("Enter name to find: ");
					String data_Name= sc1.next();
					phoneObj.search_By_Name(data_Name);
					break;
				case 5:
					System.out.println("Enter name to edit contact number:");
					String name_edit=sc1.next();
					System.out.println("Enter number to update:");
					String number_update=sc1.next();
					boolean isMatched = check_Number(number_update);
					if(isMatched)
						phoneObj.edit_Contact(name_edit,number_update);
					else
						System.out.println("\t\t\tNumber not valid..!\n\t\t\tTry again...!");
					break;
				case 6:
					System.out.println("Enter the contact name or number to delete:");
					String delete_data=sc1.next();
					phoneObj.delete_Contact(delete_data);
					break;
				case 7:
				   phoneObj.clear_all();
					break;
				case 8 :
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Option....! ");
			}
		}
	}
 }