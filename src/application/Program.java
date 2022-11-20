package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Individual;
import entities.TaxPayer;
import entities.Company;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of tax payers: ");
		int n=sc.nextInt();
		List<TaxPayer> list=new ArrayList<TaxPayer>();
		for(int i=0;i<n;i++) {
			System.out.printf("Tax payer #%d data: \n",i+1);
			System.out.print("Individual or company (i/c)? ");
			sc.nextLine();
			char type=sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.print("Anual Income: ");
			double anualSalary=sc.nextDouble();
			if(type=='i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures=sc.nextDouble();
				list.add(new Individual(name,anualSalary,healthExpenditures));	
			}
			else {
				System.out.print("Number of Employees: ");
				int employees=sc.nextInt();
				list.add(new Company(name,anualSalary,employees));
			}
		}
     System.out.println();
     System.out.println("Taxes Paids:");
     double totaltax=0;
     for(TaxPayer i:list) {
    	 totaltax+=i.tax();
    	 System.out.println(i.toString());
     }
     System.out.println(totaltax);
     

	}

}
