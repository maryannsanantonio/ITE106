// Create the input panel with fields for adding or searching contacts
private JPanel createInputPanel() {
    JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 15)); 
    inputPanel.setBackground(new Color(173, 216, 230)); // Soft teal background
    inputPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY), "Add or Search Contact", 
    TitledBorder.LEFT, TitledBorder.TOP, 
    new Font("Arial", Font.BOLD, 16), Color.DARK_GRAY));

    nameField = new JTextField(15);
    phoneField = new JTextField(15);
    JLabel nameLabel = new JLabel("Name:");
    JLabel phoneLabel = new JLabel("Phone:");

    nameLabel.setFont(new Font("Arial", Font.BOLD, 14));
    phoneLabel.setFont(new Font("Arial", Font.BOLD, 14));

    inputPanel.add(nameLabel);
    inputPanel.add(nameField);
    inputPanel.add(phoneLabel);
    inputPanel.add(phoneField);

    return inputPanel;
}

// Create a button panel with buttons for various actions
private JPanel createButtonPanel() {
    JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10)); 
    buttonPanel.setBackground(new Color(240, 128, 128)); // Light coral background
    buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

    addButton = createStyledButton("Add");
    deleteButton = createStyledButton("Delete");
    searchButton = createStyledButton("Search");
    updateButton = createStyledButton("Update");
    displayButton = createStyledButton("Display");

    buttonPanel.add(addButton);
    buttonPanel.add(deleteButton);
    buttonPanel.add(searchButton);
    buttonPanel.add(updateButton);
    buttonPanel.add(displayButton);

    return buttonPanel;
}

// Create a text area panel for displaying contact information
private JPanel createTextAreaPanel() {
    JPanel textAreaPanel = new JPanel(new BorderLayout());
    textAreaPanel.setBackground(new Color(152, 251, 152)); // Pale green background
    textAreaPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY), "Contacts", 
                                                            TitledBorder.LEFT, TitledBorder.TOP, 
                                                            new Font("Arial", Font.BOLD, 16), Color.DARK_GRAY));

    contactArea = new JTextArea(12, 20);
    contactArea.setEditable(false);
    contactArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
    contactArea.setBackground(new Color(245, 245, 220)); // Light beige for text area background
    contactArea.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));

    // Adding padding for text area
    contactArea.setMargin(new Insets(10, 10, 10, 10));

    JScrollPane scrollPane = new JScrollPane(contactArea);
    textAreaPanel.add(scrollPane, BorderLayout.CENTER);

    return textAreaPanel;
}

// Method to create styled buttons with common properties
private JButton createStyledButton(String text) {
    JButton button = new JButton(text);
    button.setFont(new Font("Arial", Font.BOLD, 14));
    button.setBackground(new Color(70, 130, 180)); // Steel blue background
    button.setForeground(Color.WHITE);
    button.setFocusPainted(false);
    button.setPreferredSize(new Dimension(100, 40)); // Set a consistent size for buttons
    button.addActionListener(this); // Add action listener
    button.addMouseListener(new MouseAdapter() { // Add hover effect
        @Override
        public void mouseEntered(MouseEvent e) {
            button.setBackground(new Color(100, 149, 237)); // Lighter blue on hover
        }
        @Override
        public void mouseExited(MouseEvent e) {
            button.setBackground(new Color(70, 130, 180)); // Original background color
        }
    });
    return button;
}
