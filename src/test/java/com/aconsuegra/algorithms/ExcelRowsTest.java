package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ExcelRowsTest {

    ExcelRows excelRows;

    @Before
    public void setUp() {
        excelRows = new ExcelRows();
    }

    @Test
    public void test1Char() {
        assertThat(excelRows.titleToNumber("A"), is(1));
    }

    @Test
    public void test2Chars() {
        assertThat(excelRows.titleToNumber("CB"), is(80));
    }

    @Test
    public void test3Chars() {
        assertThat(excelRows.titleToNumber("AAA"), is(703));
    }

}