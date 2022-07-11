package com.utgard.behavioralPatterns.template;

public abstract class Task {
    private AuditTrail auditTrail;

//  SOLUTION IF I WANT TO SKIP CONSTRUCTORS IN EVERY CHILD CLASS, BUT CREATES NEW OBJECTS OF AUDITTRAIL - MIGHT BE IMPORTANT, NOT IN THIS CASE THOUGH
    public Task() {
        auditTrail = new AuditTrail();
    }

    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        auditTrail.record();

        doExecute();
    }

    protected abstract void doExecute();
}
