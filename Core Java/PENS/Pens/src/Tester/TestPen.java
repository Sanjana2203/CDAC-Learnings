package Tester;

import java.nio.channels.NonWritableChannelException;
import java.time.LocalDate;
import java.time.Period;
import java.time.Period.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import static utils.penutils.populateMap;

import com.app.core.Brand;
import com.app.core.Colour;
import com.app.core.InkColor;
import com.app.core.Pen;

import exceptions.customexceptions;

import static utils.penutils.*;

public class TestPen {
public static void main(String[] args) {
	try(Scanner sc = new Scanner(System.in)){
		HashMap<Integer, Pen>pens= populateMap();
		boolean exit =false;
		
		while(!exit) {
			System.out.println("Folowing is the menu :\n 1. Add new Pen\r\n"
					+ " 2. Update stock of aPen\r\n"
					+ " 3. Set discount of 20% for all the pens which are not at all sold in last 3 months\r\n"
					+ " 4. Remove Pens which arenever sold once listed in 9 months\r\n "
					+ " 5. Display\r\n "
					+ " 0. Exit\r\n");
          try {
        	  
        	  switch (sc.nextInt()) {
			case 1://add pen
				System.out.println("Enter id, Brand, Colour, InkColor,Material, Stock,\r\n"
						+ "			UpdateDate, StockListingDate and Discount");
				Pen pen = ValidateAllInputs(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(),sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(),sc.nextDouble(), pens);
				   pens.put(pen.getId(), pen);
				   System.out.println("Pen added sucessfully!!");
				   
				break;

			case 2://update stock
				System.out.println("Enter the Id and stock to be updated");
				int tempId =sc.nextInt();
				int stk =sc.nextInt();
				if(pens.containsKey(tempId)) {
					pen = pens.get(tempId);
					pen.setStock(stk);
					System.out.println(pen);
				}
				else throw new customexceptions("Invalid ID!!!");
				break;
			case 3://Set discount of 20% for all the pens which are not at all sold in last 3 months
				System.out.println("Discounted pens are:");
				for(Pen p: pens.values()) {
					LocalDate startDate = p.getStockListingDate();
				    LocalDate endDate = LocalDate.now();
					Period pd=Period.between(startDate,endDate);
				int months = pd.getMonths();
				int years = pd.getYears();
				if(months>3|| years>0) {
					p.setDiscount(20);
					System.out.println(p);
				}	
				}
				
				
				break;
			case 4://  Remove Pens which arenever sold once listed in 9 months\r\n "
				Collection<Pen> pset = pens.values();
					Iterator<Pen> iterator = pset.iterator();
					while(iterator.hasNext()) {
						Period pd = Period.between(iterator.next().getStockListingDate(), LocalDate.now());
								int months = pd.getMonths();
						int years = pd.getYears();
						if(months>9|| years>0) {
							iterator.remove();	
						}	
					}
					System.out.println("Remaining Pens are:");
					for(Pen p1: pens.values())
						System.out.println(p1);
				break;
			case 5:
				for(Pen p1: pens.values())
					System.out.println(p1);
				
				break;
				
			case 0:
				break;
			}
        	  
        	  
        	  
          }catch(Exception e) {
        	  e.printStackTrace();
        	  sc.nextLine();
          }
			
		}
		
		
	}
	
}
}
