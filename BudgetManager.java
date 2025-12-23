package expenso;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class BudgetManager {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BudgetFrame().setVisible(true);
            }
        });
    }
}

class BudgetFrame extends JFrame {
    private JTextField budgetField;
    private JTable expenseTable;
    private DefaultTableModel tableModel;
    private double budgetLimit = 0.0;
    private double totalExpenses = 0.0;

    public BudgetFrame() {
        setTitle("Budget Manager");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel budgetPanel = new JPanel(new FlowLayout());
        JLabel budgetLabel = new JLabel("Set Budget: ");
        budgetField = new JTextField(10);
        JButton setBudgetButton = new JButton("Set Budget");

        setBudgetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    budgetLimit = Double.parseDouble(budgetField.getText());
                    JOptionPane.showMessageDialog(BudgetFrame.this, "Budget set to: " + budgetLimit);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(BudgetFrame.this, "Please enter a valid number", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        budgetPanel.add(budgetLabel);
        budgetPanel.add(budgetField);
        budgetPanel.add(setBudgetButton);

        String[] columnNames = {"Date", "Category", "Description", "Amount"};
        tableModel = new DefaultTableModel(columnNames, 0);
        expenseTable = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(expenseTable);

        JPanel addExpensePanel = new JPanel(new GridLayout(5, 2));
        JLabel dateLabel = new JLabel("Date (YYYY-MM-DD):");
        JTextField dateField = new JTextField();
        JLabel categoryLabel = new JLabel("Category:");
        JTextField categoryField = new JTextField();
        JLabel descriptionLabel = new JLabel("Description:");
        JTextField descriptionField = new JTextField();
        JLabel amountLabel = new JLabel("Amount:");
        JTextField amountField = new JTextField();
        JButton addExpenseButton = new JButton("Add Expense");

        addExpenseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String date = dateField.getText();
                    String category = categoryField.getText();
                    String description = descriptionField.getText();
                    double amount = Double.parseDouble(amountField.getText());

                    tableModel.addRow(new Object[]{date, category, description, amount});
                    totalExpenses += amount;

                    if (totalExpenses > budgetLimit) {
                        JOptionPane.showMessageDialog(BudgetFrame.this, "Warning: You have exceeded your budget!", "Budget Exceeded", JOptionPane.WARNING_MESSAGE);
                    }

                    dateField.setText("");
                    categoryField.setText("");
                    descriptionField.setText("");
                    amountField.setText("");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(BudgetFrame.this, "Please enter valid data", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        addExpensePanel.add(dateLabel);
        addExpensePanel.add(dateField);
        addExpensePanel.add(categoryLabel);
        addExpensePanel.add(categoryField);
        addExpensePanel.add(descriptionLabel);
        addExpensePanel.add(descriptionField);
        addExpensePanel.add(amountLabel);
        addExpensePanel.add(amountField);
        addExpensePanel.add(new JLabel());
        addExpensePanel.add(addExpenseButton);

        setLayout(new BorderLayout());
        add(budgetPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(addExpensePanel, BorderLayout.SOUTH);
    }
}