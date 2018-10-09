package hotelspage;

import org.testng.annotations.DataProvider;

import ui.hotelspage.StarGrades;

public class HotelsPageDataProvider {


	@DataProvider(name = "starGrades")
	public static Object[][] provideStarGrades() {
		return new Object[][] {
			{StarGrades.ONE_STAR},
			{StarGrades.TWO_STAR},
			{StarGrades.THREE_STAR},
			{StarGrades.FOUR_STAR},
			{StarGrades.FIVE_STAR},
		};
	}
}
