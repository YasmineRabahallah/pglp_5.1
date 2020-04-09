package fr.uvsq.exo5;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;



public class TestBuilder {
	@Test
	public void test1(){
		Personnel p2 = new Personnel.Builder("rabahallah", "yasmine","chargé de mission").build();
		assertEquals(p2.getFonction(),"chargé de mission") ;
		}
	@Test
	public void test2(){
		Personnel p2 = new Personnel.Builder("rabahallah", "yasmine","chargé de mission").date(LocalDate.of(1985, Month.DECEMBER, 9)).build();
		assertEquals(p2.getDateDeNaissance(),LocalDate.of(1985, Month.DECEMBER, 9)) ;
		}
	@Test
	public void test3(){
		Personnel p2 = new Personnel.Builder("rabahallah", "yasmine","chargé de mission").build();
		assertEquals(p2.getNom(),"rabahallah"); ;
		}
	@Test
	public void test4(){
		Personnel p2 = new Personnel.Builder("rabahallah", "yasmine","chargé de mission").build();
		assertEquals(p2.getPrenom(),"yasmine"); ;
		}
	@Test
	public void test5(){
		Personnel p2 = new Personnel.Builder("rabahallah", "yasmine","chargé de mission").build();
		assertEquals(p2.getFonction(),"chargé de mission"); ;
		}

	@Test
	public void test7(){
		Personnel p1 = new Personnel.Builder("rabahallah", "lamia","direct").date(LocalDate.of(1997, Month.DECEMBER, 12)).build();
		Personnel p2 = new Personnel.Builder("rabahallah", "yasmine","chargé de mission").telephone("0770662125").build();
		Personnelcomposite g = new Personnelcomposite(2);
		g.add(p1);
		g.add(p2);
		g.print();
		}
}
