package hotelspage;

import java.util.List;

import org.testng.annotations.Test;

import setup.Assertions;
import setup.SetupTest;
import ui.hotelspage.HotelsPage;
import ui.hotelspage.StarGrades;

public class TestHotelsPageFilterSection extends SetupTest {

	@Test(dataProviderClass = HotelsPageDataProvider.class, dataProvider = "starGrades")
	public void testStarGradesFilter(StarGrades starGrade) {
		System.out.println("testing filtering by " + starGrade.getValue() + " stars...");
		HotelsPage hotelsPage = new HotelsPage(getDriver()).navigateTo();

		List<Integer> starGradesList = hotelsPage.getStarGradeOfAllResultsGridItems(starGrade);
		
		for(Integer stars : starGradesList) {
			System.out.println(stars.intValue());
			Assertions.assertTrue(stars.intValue() >= starGrade.getValue());
		}
	}
}
