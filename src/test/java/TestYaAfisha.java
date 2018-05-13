

import org.junit.Test;
import step.*;



public class TestYaAfisha extends BaseStep
{
    @Test
    public void testAfisha()
    {
        YaMainStep yaMainStep= new YaMainStep();

        YaAfishaStep yaAfishaStep = new YaAfishaStep();

        YaAfishaFilmStep yaAfishaFilmStep = new YaAfishaFilmStep();

        YaFilmResultStep yaFilmResultStep = new YaFilmResultStep();

        FilmStep filmStep = new FilmStep();


        yaMainStep.clickLebel();
        yaAfishaStep.clickMenuFilm();
        yaAfishaFilmStep.clickReklama();
        yaAfishaFilmStep.aasertTitle();
        yaAfishaFilmStep.clickDate();
        yaFilmResultStep.closeRek();
        yaFilmResultStep.getFilm8();
        filmStep.assertT();
    }
}
