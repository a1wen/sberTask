import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import ru.sbt.homework.BaseSteps;
import ru.sbt.homework.BaseTest;

/**
 * Created by a1wen on 29.08.2017.
 */

@RunWith(SerenityRunner.class)
public class CheckRegionAndSocialButton extends BaseTest {
    @Steps
    BaseSteps steps;

    @Title("Переключение региона и поиск кнопок соц.сетей")
    @Test
    public void testSberbankru() throws Exception{
        steps.logoClick();
        steps.regionSelectorClick();
        steps.setRegion("ниж");

    }
}
