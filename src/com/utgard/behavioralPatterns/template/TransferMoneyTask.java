package com.utgard.behavioralPatterns.template;

public class TransferMoneyTask extends Task {
    public TransferMoneyTask(AuditTrail auditTrail) {
        super(auditTrail);
    }

    @Override
    protected void doExecute() {
        System.out.println("Transfering Money");
    }
}

////  ORIGINAL WRONG IMPLEMENTATION
//package com.utgard.behavioralPatterns.template;
//
//public class TransferMoneyTask {
//    private AuditTrail auditTrail;
//
//    public TransferMoneyTask(AuditTrail auditTrail) {
//        this.auditTrail = auditTrail;
//    }
//
//    public void execute() {
//        auditTrail.record();
//
//        System.out.println("Transfer money");
//    }
//}