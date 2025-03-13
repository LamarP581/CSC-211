import java.awt.*;
import java.awt.event.*;
public class EmployeeInfoForm extends Frame implements ActionListener {
Label nameLabel, idLabel, depLabel;
TextField nameField, idField, depField;
Button submitButton;
TextArea outputArea;

public EmployeeInfoForm() {
    setTitle("Employee Information Form");
    setLayout(new GridLayout(5,2,5,5));
    
    nameLabel = new Label("Name:");
    idLabel = new Label("Employee ID:");
    depLabel = new Label ("Department:");
    
    nameField = new TextField(10);
    idField = new TextField(10);
    depField = new TextField(10);
    
    submitButton = new Button("Submit");
    outputArea = new TextArea(6, 25);
    add(nameLabel);
    add(nameField);
    add(idField);
    add(idLabel);
    add(depLabel);
    add(depField);
    add(submitButton);
    add(outputArea);
    submitButton.addActionListener(this);
    
    setSize(400,400);
    setVisible(true);
}

@Override
public void actionPerformed(ActionEvent e){
    String name = nameField.getText();
    String empId = idField.getText();
    String department = depField.getText();
    
    
    outputArea.setText("Employee Information: \n");
    outputArea.append("Name: " + name + "\n");
    outputArea.append("Employee ID: " + empId + "\n");
    outputArea.append("Department: " + department + "\n");
}

    public static void main(String[] args) {
     new EmployeeInfoForm();
    }
    
}
