package com.utgard.behavioralPatterns.template;

public class GenerateReportTask extends Task {
    public GenerateReportTask(AuditTrail auditTrail) {
        super(auditTrail);
    }

    @Override
    protected void doExecute() {
        System.out.println("Generating report");
    }
}

////  ORIGINAL WRONG IMPLEMENTATION
//public class GenerateReportTask {
//    private AuditTrail auditTrail;
//
//    public GenerateReportTask(AuditTrail auditTrail) {
//        this.auditTrail = auditTrail;
//    }
//
//    public void execute() {
//        auditTrail.record();
//
//        System.out.println("Generate Report");
//    }
//}


