package com.neoteric.learning.exportaccountsummary;

public class PdfExportAccountSummary implements ExportAccountSummary {

    @Override
    public String export (AccountSummary accountSummary){
        System.out.println("Export to Pdf is done");
        return "Data exported to PDF is done";
    }

}
