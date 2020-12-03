/* testSelectionSort.java
 *  To change this template, choose Tools | Template Manager
 *   and open the template in the editor.
*/

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort
{
	@Test
	public void test()
	{
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

	  public testSelectionSort()
	  {

	  }

	  public void testPositive()
	  {
		  int[] arr = new int[5];
		  arr[0] = 8;
		  arr[1] = 9;
		  arr[2] = 7;
		  arr[3] = 10;
		  arr[4] = 2;

		  int[] Sortedarr = new int[5];
		  Sortedarr[0] = 2;
		  Sortedarr[1] = 7;
		  Sortedarr[2] = 8;
		  Sortedarr[3] = 9;
		  Sortedarr[4] = 10;

		  /** add tests to check for this unit test **/

		  SelectionSort temp = new SelectionSort();
		  int[] report = temp.basicSelectionSort(arr);

		  for(int i = 0; i < Sortedarr.length;i++)
		  {
			  assertEquals("TestPositive Fail", Sortedarr[i], report[i]);
		  }
	  }

	  public void testNegative()
	  {
		  /** Test data contains negative values only **/

		  int[] arr = new int[5];
		  arr[0] = -7;
		  arr[1] = -4;
		  arr[2] = -3;
		  arr[3] = -10;
		  arr[4] = -2;

		  int[] Sortedarr = new int[5];
		  Sortedarr[0] = -10;
		  Sortedarr[1] = -7;
		  Sortedarr[2] = -4;
		  Sortedarr[3] = -3;
		  Sortedarr[4] = -2;

		  /** add tests to check for this unit test **/

		  SelectionSort temp = new SelectionSort();
		  int[] report = temp.basicSelectionSort(arr);

		  for(int i = 0; i < Sortedarr.length;i++)
		  {
			  assertEquals("TestPositive Fail", Sortedarr[i], report[i]);
		  }
	  }

	  public void testMixed()
	  {
		  /** Test data contains with both positive, negative and zeros **/

		  int[] arr = new int[5];
		  arr[0] = 2;
		  arr[1] = 3;
		  arr[2] = -5;
		  arr[3] = 11;
		  arr[4] = -2;

		  int[] Sortedarr = new int[5];
		  Sortedarr[0] = -5;
		  Sortedarr[1] = -2;
		  Sortedarr[2] = 2;
		  Sortedarr[3] = 3;
		  Sortedarr[4] = 11;

		  /** add tests to check for this unit test **/

		  SelectionSort temp = new SelectionSort();
		  int[] report = temp.basicSelectionSort(arr);

		  for(int i = 0; i < Sortedarr.length;i++)
		  {
			  assertEquals("TestPositive Fail", Sortedarr[i], report[i]);
		  }
	  }

	  public void testDuplicates()
	  {
		  /** Test data contains duplicates **/

		  int[] arr = new int[5];
		  arr[0] = 8;
		  arr[1] = 8;
		  arr[2] = 7;
		  arr[3] = -3;
		  arr[4] = -6;

		  int[] Sortedarr = new int[5];
		  Sortedarr[0] = -6;
		  Sortedarr[1] = -3;
		  Sortedarr[2] = 7;
		  Sortedarr[3] = 8;
		  Sortedarr[4] = 8;

		  /** add tests to check for this unit test **/

		  SelectionSort temp = new SelectionSort();
		  int[] report = temp.basicSelectionSort(arr);

		  for(int i = 0; i < Sortedarr.length;i++)
		  {
			  assertEquals("TestPositive Fail", Sortedarr[i], report[i]);
		  }
	  }
}
