package br.ce.wcaquino.taskbackend.utils;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

public class DateUtilsTest {
	
	@Test
	public void deveRetornarTrueDataFuruta( ) {
		LocalDate data = LocalDate.of(2023, 07, 04);
		boolean dataFutura = DateUtils.isEqualOrFutureDate(data);
		Assert.assertTrue(dataFutura);
		
	}
	
	@Test
	public void deveRetornarFalseDataPassada( ) {
		LocalDate data = LocalDate.of(2018, 07, 04);
		boolean dataPassada = DateUtils.isEqualOrFutureDate(data);
		Assert.assertFalse(dataPassada);
		
	}
	
	@Test
	public void deveRetornarTrueDataAgora( ) {
		LocalDate data = LocalDate.now();
		boolean dateNow = DateUtils.isEqualOrFutureDate(data);
		Assert.assertTrue(dateNow);
	}

}
