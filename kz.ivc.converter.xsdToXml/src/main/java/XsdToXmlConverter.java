import noNamespace.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by a.zhumatay on 04.09.2015.
 */
public class XsdToXmlConverter {
    public static void main(String[] args) {

        WorkspaceDocument workspaceDocument = WorkspaceDocument.Factory.newInstance();
        WorkspaceType workspaceType = workspaceDocument.addNewWorkspace();
        SheetType sheetType = workspaceType.addNewSheet();

        List<Subject> values = new ArrayList<Subject>();
        for (int i = 0; i < 16; i++) {
            Subject su = new Subject();
            su.setId((long) i);
            su.setNameKz("namekz" + i);
            su.setNameRu("nameRu" + i);
            su.setCode("code" + i);
            su.setShortName("shortname" + i);
            values.add(su);
        }

        for (Subject listOfValues : values) {
            RowType newRow = sheetType.addNewRow();


            CellsType newCell = newRow.addNewCell();
            newCell.setValue(String.valueOf(listOfValues.getId()));

            newCell = newRow.addNewCell();
            newCell.setValue(listOfValues.getCode());

            newCell = newRow.addNewCell();
            newCell.setValue(listOfValues.getNameKz());

            newCell = newRow.addNewCell();
            newCell.setValue(listOfValues.getNameRu());
        }

        System.out.println(workspaceDocument.getClass());
    }
}