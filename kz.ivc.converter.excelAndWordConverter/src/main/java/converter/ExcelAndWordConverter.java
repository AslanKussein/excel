package converter;

import noNamespace.*;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xwpf.usermodel.*;

import java.io.*;
import java.util.Iterator;
import java.util.List;

/*Created by a.zhumatay on 03.09.2015.*/


public class ExcelAndWordConverter {
    // Excel документ

    public static File convertWorkspaceToExcel(WorkspaceDocument workspaceDocument) throws IOException {

        WorkspaceDocument xml = workspaceDocument;
        WorkspaceType workspaceType = xml.getWorkspace();
        XSSFWorkbook wb = new XSSFWorkbook();

        SheetType[] sheetArray = workspaceType.getSheetArray();

        for (SheetType sa : sheetArray) {

            XSSFSheet spreadsheet = wb.createSheet("Отчет");

            spreadsheet.getPrintSetup().setLandscape(sa.getLandScape());

            //ширина столбцов
            for (int i = 0; i < sa.getRowArray(0).getCellArray().length; i++) {
                spreadsheet.setColumnWidth(i, (int) (sa.getRowArray(0).getCellArray(i).getWidth() * 1380));
            }

            RowType[] rowArray = sa.getRowArray();
            for (RowType ra : rowArray) {
                XSSFRow row = spreadsheet.createRow(ra.getRowIndex());
                row.setHeightInPoints((float) (ra.getHeight() * 28.34645669291));

                CellsType[] cellArray = ra.getCellArray();
                //Массив cells
                for (CellsType ca : cellArray) {
                    XSSFCell cell = row.createCell(ca.getIndex());
                    XSSFFont font = wb.createFont();
                    font.setBold(ca.getBold());
                    font.setItalic(ca.getItalic());
                    font.setUnderline(ca.getUnderline());

                    XSSFCellStyle style = wb.createCellStyle();
                    style.setBorderTop(ca.getBorderTop());
                    style.setBorderRight(ca.getBorderRight());
                    style.setBorderBottom(ca.getBorderBottom());
                    style.setBorderLeft(ca.getBorderLeft());
                    style.setAlignment(ca.getTextAlign());
                    style.setFont(font);

                    cell.setCellValue(ca.getValue());
                    //cell.setCellStyle(style);
                }
            }
        }

        File file = new File("NewExcel.xlsx");
        FileOutputStream fos = new FileOutputStream(file);
        wb.write(fos);
        fos.close();

        return file;
    }

    public static File convertWorkspaceToWord(WorkspaceDocument workspaceDocument) throws IOException {
        //Создать xml документ
        WorkspaceDocument xml = workspaceDocument;
        XWPFDocument document = new XWPFDocument();
        document.getNumbering();
        WorkspaceType workspaceType = xml.getWorkspace();

        SheetType[] sheetArray = workspaceType.getSheetArray();

        for (SheetType sa : sheetArray) {

            RowType[] rowArray = sa.getRowArray();

            XWPFTable table = document.createTable(rowArray.length, sa.getRowArray(0).getCellArray().length);

            Iterator<IBodyElement> bodyElementIterator = document.getBodyElementsIterator();
            while (bodyElementIterator.hasNext()) {
                IBodyElement element = bodyElementIterator.next();
                if ("TABLE".equalsIgnoreCase(element.getElementType().name())) {
                    List<XWPFTable> tableList = element.getBody().getTables();
                    for (XWPFTable listOfTables : tableList) {
                        for (RowType ra : rowArray) {
                            CellsType[] cellArray = ra.getCellArray();
                            List<XWPFTableRow> tableRows = listOfTables.getRows();
                            XWPFTableRow rowsArray = tableRows.get(ra.getRowIndex());
                            rowsArray.setHeight((int) ra.getHeight() * 565);

                            for (CellsType ca : cellArray) {
                                List<XWPFTableCell> listOfCells = rowsArray.getTableCells();
                                XWPFTableCell cell = listOfCells.get(ca.getIndex());

                                XWPFParagraph paragraph = cell.addParagraph();
                                XWPFRun run = paragraph.createRun();
                                run.setItalic(ca.getItalic());
                                run.setBold(ca.getBold());
                                run.setText(ca.getValue());
                                paragraph.setAlignment(ParagraphAlignment.valueOf(ca.getTextAlign()));
                            }
                        }

                    }
                }
            }
        }

        File file = new File("NewWord.docx");
        FileOutputStream fos = new FileOutputStream(file);
        document.write(fos);
        fos.close();

        return file;
    }

    /*public static File convertWorkspaceToPdf(WorkspaceDocument workspaceDocument) throws ParserConfigurationException, IOException, DocumentException, DocumentException {
        //Создать xml документ
        //step1
        Document doc = new  Document(PageSize.A4);

        //step2
        File file = new File("NewPDF.pdf");
        FileOutputStream out = new FileOutputStream(file);
        PdfWriter writer = PdfWriter.getInstance(doc, out);

        WorkspaceDocument xml = workspaceDocument;

        WorkspaceType workspaceType = xml.getWorkspace();
        SheetType[] sheetArray = workspaceType.getSheetArray();

        //step3
        doc.open();

        //step4
        PdfPTable table;
        writer.getDirectContent();

        for (SheetType listOfSheets:sheetArray) {
            table=new PdfPTable(listOfSheets.getRowArray(0).getCellArray().length);
            RowType[] rowArray = listOfSheets.getRowArray();

            for (RowType listOfRows:rowArray) {

                CellsType[] cellArray = listOfRows.getCellArray();
                for (CellsType listOfCells:cellArray) {

                    final String fontName = "c:/windows/fonts/arial.ttf";
                    BaseFont baseFont = BaseFont.createFont(fontName, BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
                    Font font = new Font(baseFont);
                    PdfPCell cell;
                    cell = new PdfPCell(new Phrase(listOfCells.getValue(), font));
                    table.addCell(cell);
                }
            }

            table.completeRow();
            doc.newPage();
            doc.add(table);
        }

        doc.close();

        return file;
    }*/

    /*public static File convertWorkspaceToPdf(WorkspaceDocument workspaceDocument) throws ParserConfigurationException, IOException, DocumentException, DocumentException {
        //Создать xml документ
        WorkspaceDocument xml = workspaceDocument;

        File file = new File("NewPDF.pdf");
        FileOutputStream out = new FileOutputStream(file);
        Document doc = new  Document(PageSize.A4.rotate());

        WorkspaceType workspaceType = xml.getWorkspace();
        SheetType[] sheetArray = workspaceType.getSheetArray();
        for (SheetType sa : sheetArray) {
            //doc = ;
            PdfWriter writer = PdfWriter.getInstance(doc, out);
            doc.open();
            PdfPTable table = new PdfPTable(8);
//                doc.open();
            RowType[] rowArray = sa.getRowArray();
            for (RowType ra : rowArray) {

                CellsType[] cellArray = ra.getCellArray();
                //Массив cells
                for (CellsType ca : cellArray) {
                    PdfPCell cell;
                    //Массив values
                    final String FONT = "c:/windows/fonts/arialbd.ttf";
                    BaseFont baseFont = BaseFont.createFont(FONT, BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
                    *//*Font font = new Font(baseFont);
                    font.setSize(15);*//*
                    cell = new PdfPCell(new Phrase(ca.getValue()));
                    cell.setColspan(cellArray.length);
                    table.addCell(cell);
                    doc.addCreationDate();
                }
            } doc.add(table);
        }

        doc.close();
        return file;
    }*/

    public static byte[] convertFileToBytes(File file) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream(file);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[(int) file.length()];
        try {
            for (int readNum; (readNum = fis.read(buf)) != -1; ) {
                bos.write(buf, 0, readNum);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return bos.toByteArray();
    }

    public static void convertBytesToExcel(byte[] bytes) throws IOException {
        File newFileForTest = new File("NewFileForTest2.xlsx");
        FileOutputStream fos = new FileOutputStream(newFileForTest);
        fos.write(bytes);
        fos.flush();
        fos.close();
    }

    public static void convertBytesToWord(byte[] bytes) throws IOException {
        File newFileForTest = new File("NewWordForTest2.docx");
        FileOutputStream fos = new FileOutputStream(newFileForTest);
        fos.write(bytes);
        fos.flush();
        fos.close();
    }

    public static void convertBytesToPdf(byte[] bytes) throws IOException {
        File newFileForTest = new File("NewPDFTest2.pdf");
        FileOutputStream fos = new FileOutputStream(newFileForTest);
        fos.write(bytes);
        fos.flush();
        fos.close();
    }

    public static File convertBytesToWordFile(byte[] bytes) throws IOException {
        File newFileForTest = new File("NewWordForTest2.docx");
        FileOutputStream fos = new FileOutputStream(newFileForTest);
        fos.write(bytes);
        fos.flush();
        fos.close();

        return newFileForTest;
    }

    public static File convertBytesToExcelFile(byte[] bytes) throws IOException {
        File newFileForTest = new File("NewWordForTest2.xlsx");
        FileOutputStream fos = new FileOutputStream(newFileForTest);
        fos.write(bytes);
        fos.flush();
        fos.close();

        return newFileForTest;
    }

    /*public static void main(String[] args) throws Exception {
        ArrayList<String> columns = new ArrayList<String>();
        columns.add("ИД");
        columns.add("Код");
        columns.add("наименование на казахском");
        columns.add("наименование на русском");
        columns.add("краткое имя");

        List<Subject> values = new ArrayList<Subject>();
        for (int i=0;i<65000;i++){
            Subject su=new Subject();
            su.setId((long) i);
            su.setNameKz("наименование на каз" + i);
            su.setNameRu("наименование на рус" + i);
            su.setCode("код" + i);
            su.setShortName("краткое описание" + i);
            values.add(su);
        }

        WorkspaceDocument workspaceDocument = WorkspaceDocument.Factory.newInstance();
        WorkspaceType workspaceType = workspaceDocument.addNewWorkspace();
        SheetType sheetType = workspaceType.addNewSheet();

            int rownum=0;
            for (Subject listOfValues:values) {
            RowType newRow = sheetType.addNewRow();

            newRow.setHeight(1);
            newRow.setRowIndex(rownum++);

            int cellnum=0;

            CellsType newCell = newRow.addNewCell();
            newCell.setValue(String.valueOf(listOfValues.getId()));
            newCell.setIndex(cellnum++);

            newCell=newRow.addNewCell();
            newCell.setValue(listOfValues.getCode());
            newCell.setIndex(cellnum++);

            newCell=newRow.addNewCell();
            newCell.setValue(listOfValues.getNameKz());
            newCell.setIndex(cellnum++);

            newCell= newRow.addNewCell();
            newCell.setValue(listOfValues.getNameRu());
            newCell.setIndex(cellnum++);
        }

        File wordFile = convertWorkspaceToWord(workspaceDocument);
        *//*byte[] bytesOfWord = convertFileToBytes(wordFile);


        File wordFle = convertBytesToWordFile(bytesOfWord);*//*



        File excelFile=convertWorkspaceToExcel(workspaceDocument);
        *//*byte[] bytesOfExcell=convertFileToBytes(excelFile);

        File newExcelFile=convertBytesToExcelFile(bytesOfExcell);*//*
    }*/


}
