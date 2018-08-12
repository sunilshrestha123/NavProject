//package org.nav.solution.controller;
//
//import org.apache.poi.hssf.usermodel.HSSFFont;
//import org.apache.poi.hssf.usermodel.HSSFRow;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.hssf.util.HSSFColor;
//import org.apache.poi.ss.usermodel.CellStyle;
//import org.apache.poi.ss.usermodel.Font;
//import org.nav.solution.model.Employee;
//import org.springframework.web.servlet.view.document.AbstractExcelView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//        import java.util.List;
//        import java.util.Map;
//
//public class EmployeeExcelBuilder extends AbstractExcelView{
//
//
//    @Override
//    protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook hssfWorkbook, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
//    List<Employee> listEmployee=(List<Employee>)model.get("listEmployee");
//    //create a new Excel sheets
//        HSSFSheet sheet=hssfWorkbook.createSheet("Employee Details ");
//        sheet.setDefaultColumnWidth(50);
//        //create style for header cell;
//        CellStyle style =hssfWorkbook.createCellStyle();
//        Font font = hssfWorkbook.createFont();
//        font.setFontName("Arial");
//        style.setFillForegroundColor(HSSFColor.BLUE.index);
//        style.setFillPattern(CellStyle.SOLID_FOREGROUND);
//        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
//        font.setColor(HSSFColor.WHITE.index);
//        style.setFont(font);
//
//        // create header row
//        HSSFRow header = sheet.createRow(0);
//
//        header.createCell(0).setCellValue("full name");
//        header.getCell(0).setCellStyle(style);
//
//        header.createCell(1).setCellValue("");
//        header.getCell(1).setCellStyle(style);
//
//        header.createCell(2).setCellValue("ISBN");
//        header.getCell(2).setCellStyle(style);
//
//        header.createCell(3).setCellValue("Published Date");
//        header.getCell(3).setCellStyle(style);
//
//        header.createCell(4).setCellValue("Price");
//        header.getCell(4).setCellStyle(style);
//        header.createCell(5).setCellValue("Price");
//        header.getCell(5).setCellStyle(style);
//
//        header.createCell(6).setCellValue("Price");
//        header.getCell(6).setCellStyle(style);
//        header.createCell(7).setCellValue("Price");
//        header.getCell(7).setCellStyle(style);
//
//
//
//
//
//
//        // create data rows
//        int rowCount = 1;
//
//        for (Employee aEmployee : listEmployee) {
//            HSSFRow aRow = sheet.createRow(rowCount++);
//            aRow.createCell(0).setCellValue(aEmployee.getEmployeeFname());
//            aRow.createCell(1).setCellValue(aEmployee.getEmployeeEmail());
//            aRow.createCell(2).setCellValue(aEmployee.getEmployeeMobile());
//            aRow.createCell(3).setCellValue(aEmployee.getEmployeeBdate());
//            aRow.createCell(4).setCellValue(aEmployee.getEmployeeAbout());
//        }
//    }
//
//}
//
