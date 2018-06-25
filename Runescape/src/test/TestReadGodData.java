/**
 * 
 */
package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import business.God;
import business.Manage;
import data.ReadGodData;

/**
 * @author scotrhodesjunior
 *
 */
public class TestReadGodData {

	@Test
	public void test() {
		ReadGodData godData = new ReadGodData();
		
		ArrayList<God> data = godData.getGods();
		assertNotNull(data);
		
		Manage manage = new Manage();
		godData.getGod();
		assertNotNull(manage);
	}
}
