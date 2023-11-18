package utils;

import java.time.LocalDate;

import java.util.HashMap;

import com.app.core.Brand;

import com.app.core.Colour;

import com.app.core.InkColor;

import com.app.core.Pen;
import exceptions.*;

public class penutils {
	public static int validatePens(int id, HashMap<Integer, Pen> pens) throws customexceptions {
		if (pens.containsKey(id))
			throw new customexceptions("Duplicate Pen Id");
		return id;
	}

	public static LocalDate parseAndValidateDate(String date) {
		return LocalDate.parse(date);
	}
	
	public static Brand parseBrand(String brand) {
		return Brand.valueOf(brand.toUpperCase());
	}
 
	public static Colour parseColor(String color) {
		return Colour.valueOf(color.toUpperCase());
	}
	
	public static InkColor parseInkColor(String inkColor) {
		return InkColor.valueOf(inkColor.toUpperCase());
	}
	public static Pen ValidateAllInputs(int id, String brand, String colour, String inkColor, String material, int stock,
			String updateDate, String stockListingDate,double price, double discount, HashMap<Integer, Pen> pens) {
		Brand brd = parseBrand(brand);
		Colour clr =parseColor(colour);		
		InkColor ikclr = parseInkColor(inkColor);
		LocalDate update = parseAndValidateDate(updateDate);
		LocalDate stdate = parseAndValidateDate(stockListingDate);
		return new Pen(id, brd, clr, ikclr, material, stock, update, stdate,price, discount);
	}

	public static HashMap<Integer, Pen> populateMap() {
		HashMap<Integer, Pen> pens = new HashMap<>();
		Pen p1 = new Pen(1, Brand.CELLO, Colour.BROWN, InkColor.BLACK, "Plastic", 15, LocalDate.parse("2023-06-01"),
				LocalDate.parse("2023-06-15"),10.00, 5.00);
		Pen p2 = new Pen(2, Brand.LINC, Colour.GREEN, InkColor.BLUE, "Metal", 20, LocalDate.parse("2023-05-01"),
				LocalDate.parse("2023-05-15"),20.00, 5.00);
		Pen p3 = new Pen(3, Brand.CELLO, Colour.GREY, InkColor.RED, "Steel", 25, LocalDate.parse("2023-07-01"),
				LocalDate.parse("2023-10-05"),15.00, 5.00);
		Pen p4 = new Pen(4, Brand.PARKER, Colour.ORANGE, InkColor.BLACK, "Alloy Steel", 30,
				LocalDate.parse("2023-05-01"), LocalDate.parse("2022-01-15"),15.00, 5.00);
		Pen p5 = new Pen(5, Brand.RENOLDS, Colour.BROWN, InkColor.BLUE, "Plastic", 27, LocalDate.parse("2022-02-01"),
				LocalDate.parse("2022-04-15"),10.00, 5.00);

		pens.put(p1.getId(), p1);
		pens.put(p2.getId(), p2);
		pens.put(p3.getId(), p3);
		pens.put(p4.getId(), p4);
		pens.put(p5.getId(), p5);

		return pens;
	}

}
