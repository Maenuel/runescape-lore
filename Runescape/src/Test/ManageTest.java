package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Test;

import business.God;
import business.Manage;
import business.Tier;
import data.ReadGodData;
import data.ReadTierData;

public class ManageTest {
	Manage manage = new Manage();
	ReadGodData readgod = new ReadGodData();
	ReadTierData readtier = new ReadTierData();
	Scanner scn = new Scanner(System.in);
	@Test
	/*
	public void test() {
		readgod.getGod();
		readtier.getTier();
		ArrayList<God> god = manage.printAllGod();
		for(God g:god) {
			System.out.println("Name: "+g.getName()+"\nAge: "+g.getAge()+"\nColors: "+g.getColors());
			System.out.println("------------------------------------------------------------");
		}
	}*/
	/*
	public void test2() {
		readgod.getGod();
		readtier.getTier();
		//String name = scn.next();
		God god = manage.searchGod("Saradomin"); 
		//God god = manage.searchGod(name); 
		if(god != null) {
		System.out.println("Name: "+god.getName()+"\nAge: "+god.getAge());
		}else {
			System.out.println("Gott nicht gefunden");
		}
	}*/
	/*
	public void test3() {
		readgod.getGod();
		readtier.getTier();
		Tier tier = manage.getTierData(1);
		if(tier != null) {
		System.out.println("Name: "+tier.getTierType()+"\nDescription: "+tier.getDescription());
		}else {
			System.out.println("Tier nicht gefunden");
		}
	}
	*/
	
	public void test4() {
		ArrayList<God> god = new ArrayList<God>();
		readgod.getGod();
		readtier.getTier();
		god = manage.filterGod(2);
		for(God g:god) {
			System.out.println("Name: "+g.getName()+"\n Age: "+g.getAge());
			System.out.println("--------------------------");;
		}
	}

}
