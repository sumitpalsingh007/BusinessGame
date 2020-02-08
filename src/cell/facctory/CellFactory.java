package cell.facctory;

import cell.Cell;
import cell.celltypes.EmptyCell;
import cell.celltypes.HotelCell;
import cell.celltypes.JailCell;
import cell.celltypes.LotteryCell;

public class CellFactory {

    static Cell getCell(final String type) {
        Cell cell = new EmptyCell();
        if ("Hotel".equalsIgnoreCase(type)) {
            cell = new HotelCell();
        }else if ("Jail".equalsIgnoreCase(type)) {
            cell = new JailCell();
        }else if ("Lottery".equalsIgnoreCase(type)) {
            cell = new LotteryCell();
        }
        return cell;
    }
}
