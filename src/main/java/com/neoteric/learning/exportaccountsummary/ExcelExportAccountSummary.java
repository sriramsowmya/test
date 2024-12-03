package com.neoteric.learning.exportaccountsummary;

public class ExcelExportAccountSummary implements ExportAccountSummary {
    @Override
    public String export (AccountSummary accountSummary){

        System.out.println("Export to excel is done");
        return "Data exported to excel is done";
    }
     public void test() {
     }

    public void edit (AccountSummary accountSummary){
         System.out.println("edit is possible");
     }
}
