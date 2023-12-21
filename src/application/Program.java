package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> set = new HashSet<>();
		
		System.out.print("How many students for course English?: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("ID: ");
			int id = sc.nextInt();
			set.add(id);
		}
		
		System.out.print("How many students for course Portuguese?: ");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("ID: ");
			int id = sc.nextInt();
			set.add(id);
		}
		
		System.out.println(set);
		
		sc.close();

	}

}
