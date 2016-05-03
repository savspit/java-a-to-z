import org.junit.*;
import ru.shestakov.models.*;
import ru.shestakov.start.*;

public class StartUITest {

    @Test
    public void testChangeCell() throws Exception {

        ChessBoard chessboard = new ChessBoard();

        chessboard.fill();

        // set Cell to Figure
        Cell cell1 = new Cell("d", 2, true);
        Figure figure = chessboard.findByCell(cell1);

        // change Figure`s Cell
        Cell cell2 = new Cell("d", 3, true);
        cell1.setInUse(false);
        figure.setCell(cell2);

        // test cell1 not in use
        Assert.assertEquals(cell1.getinUse(), false);

        // test cell2 in use
        Assert.assertEquals(cell2.getinUse(), true);

        // test Figure use Cell2
        Assert.assertEquals(figure.getCell(), cell2);

        // test Figure Not use Cell1
        Assert.assertNotEquals(figure.getCell(), cell1);
        
    }

}
