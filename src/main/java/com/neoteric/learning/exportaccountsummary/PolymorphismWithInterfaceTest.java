package com.neoteric.learning.exportaccountsummary;

public class PolymorphismWithInterfaceTest {
    public static void main(String[] args) {
        ExportAccountSummary exportAccountSummary=new ExcelExportAccountSummary();
        exportAccountSummary.export(new AccountSummary());
        ExportAccountSummary pdfExportSummary=new PdfExportAccountSummary();
        pdfExportSummary.export(new AccountSummary());


    }
}
