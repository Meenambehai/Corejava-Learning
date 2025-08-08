package practise;

public class LearnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] employeeID= {101,102,103,104};
		int emplength=employeeID.length;
		System.out.println("Total numbet of employees =" +emplength);
		System.out.println(employeeID[2]);
		System.out.println("The last employee id is : " +employeeID[emplength-1]);
		for(int i=0;i<emplength;i++)
		{
			if(i==1)
			{
				continue;
			}
			else
			{
				System.out.println("The id of employee no "+(i+1)+ "is :" +employeeID[i]);
			}
		}
		System.out.println("Instantiation way of initializing an array");
		String employeename[] = new String[4];
		employeename[0]="Meena";
		employeename[1]="Kavi";
		employeename[2]="Bhuvana";
		employeename[3]="Gomathi";
		for(int i=0;i<employeename.length;i++)
		System.out.println(employeename[i]);
		
		

	}

}
