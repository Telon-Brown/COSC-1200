import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class PatientForm extends JFrame {
    private JTextField patientNameField, ownerNameField, emailField, addressField;
    private JRadioButton vet1RadioButton, vet2RadioButton;
    private JLabel messageLabel;

    public PatientForm() {
        // Set up the frame
        setTitle("New Patient Record");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); 
        setResizable(false);
        setLayout(new GridLayout(0, 2, 10, 10));

        // Initialize components
        JLabel patientNameLabel = new JLabel("Patient Name:");
        patientNameField = new JTextField();
        JLabel ownerNameLabel = new JLabel("Owner:");
        ownerNameField = new JTextField();
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        JLabel vetLabel = new JLabel("Vet:");
        vet1RadioButton = new JRadioButton("Dr. Smith");
        vet2RadioButton = new JRadioButton("Dr. Johnson");
        ButtonGroup vetButtonGroup = new ButtonGroup();
        vetButtonGroup.add(vet1RadioButton);
        vetButtonGroup.add(vet2RadioButton);
        vet1RadioButton.setSelected(true); 
        JLabel dateLabel = new JLabel("Date:");
        JTextField dateField = new JTextField(LocalDate.now().toString());
        dateField.setEditable(false);
        JLabel addressLabel = new JLabel("Address:");
        addressField = new JTextField();

        // Buttons
        JButton registerButton = new JButton("Register");
        JButton clearButton = new JButton("Clear");
        JButton exitButton = new JButton("Exit");

        // Message label
        messageLabel = new JLabel("");
        messageLabel.setForeground(Color.RED);

        // Add components to the frame
        add(patientNameLabel);
        add(patientNameField);
        add(ownerNameLabel);
        add(ownerNameField);
        add(emailLabel);
        add(emailField);
        add(vetLabel);
        add(vet1RadioButton);
        add(dateLabel);
        add(dateField);
        add(addressLabel);
        add(addressField);
        add(registerButton);
        add(clearButton);
        add(exitButton);
        add(messageLabel);

        // Register button action
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerPatient();
            }
        });

        // Clear button action
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearForm();
            }
        });

        // Exit button action
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the form
            }
        });
    }

    private void registerPatient() {
        // Validation logic
        String patientName = patientNameField.getText();
        String ownerName = ownerNameField.getText();
        String email = emailField.getText();
        String address = addressField.getText();
        String vetAssigned = vet1RadioButton.isSelected() ? "Dr. Smith" : "Dr. Johnson";

        if (patientName.isEmpty() || ownerName.isEmpty() || email.isEmpty()) {
            messageLabel.setText("Please fill in all required fields.");
            return;
        }

        // Writing to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("newpatientfile.txt"))) {
            writer.write("**Patient Registration Document**\n");
            writer.write("Patient Name: " + patientName + "\n");
            writer.write("Owner Name: " + ownerName + "\n");
            writer.write("Email: " + email + "\n");
            writer.write("Address: " + address + "\n");
            writer.write("Vet Assigned: " + vetAssigned + "\n");
            writer.write("Date: " + LocalDate.now().toString() + "\n");
            messageLabel.setText("Write successful.");
        } catch (IOException e) {
            messageLabel.setText("Error writing to file.");
            e.printStackTrace();
        }
    }

    private void clearForm() {
        // Clear the form and reset focus
        patientNameField.setText("");
        ownerNameField.setText("");
        emailField.setText("");
        addressField.setText("");
        vet1RadioButton.setSelected(true);
        messageLabel.setText("");
        patientNameField.requestFocus();
    }

    public static void main(String[] args) {
        // Run the application
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PatientForm().setVisible(true);
            }
        });
    }
}
