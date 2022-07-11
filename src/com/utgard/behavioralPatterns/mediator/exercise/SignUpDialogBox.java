package com.utgard.behavioralPatterns.mediator.exercise;

public class SignUpDialogBox {
    private TextBox textBoxName = new TextBox("");
    private TextBox textBoxPassword = new TextBox("123456");
    private CheckBox termsAndConditions = new CheckBox();
    private Button signIn = new Button();

    public SignUpDialogBox() {
        textBoxName.add(() -> {
            System.out.println("Name changed");
            enableSignInButton();
        });
        textBoxPassword.add(() -> {
            System.out.println("Password changed");
            enableSignInButton();
        });
        termsAndConditions.add(() -> {
            System.out.println("Terms and conditions un/checked");
            enableSignInButton();
        });
    }

    public void simulateUserInteraction() {
        termsAndConditions.setChecked(true);
        textBoxName.setContent("Paul");
    }

    public void showStatus() {
        System.out.println("Name entered: \"" + textBoxName.getContent() + "\" - " + nameCorrect());
        System.out.println("Password is correct: \"" + textBoxPassword.getContent() + "\" - " + passwordCorrect());
        System.out.println("Terms and Conditions are checked: " + termsAndConditionsAgreed());
        System.out.println("Sign in enabled: " + signIn.isEnabled());
    }

    private void enableSignInButton() {
        if (nameCorrect() && passwordCorrect() && termsAndConditionsAgreed())
            signIn.setEnabled(true);
    }

    private boolean nameCorrect() {
        if (textBoxName == null || textBoxName.getContent().isEmpty())
            return false;
        return true;
    }

    private boolean passwordCorrect() {
        if (textBoxPassword == null || textBoxPassword.getContent().isEmpty())
            return false;
        return true;
    }

    private boolean termsAndConditionsAgreed() {
        return termsAndConditions.isChecked();
    }

}
