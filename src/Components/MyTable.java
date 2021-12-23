package Components;

import Components.MyFrame;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;

public class MyTable {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setSize(500,700);
        frame.setLayout(new BorderLayout());
//        String data[][] = {{"Ho Anh", "20190037"},
//                {"Tạ Hữu Bình", "20190094"},
//                {"Nguyễn Hải Dương", "20190044"},
//                {"Trịnh Tùng Dương", "20190045"},
//                {"Trần Trọng Hiệp", "20190051"},
//                {"Lê Huy Hoàng", "20190053"}
//        };
//        String column[] = { "Họ và tên", "MSSV"};
//        JTable table = new JTable(data, column);

        String[] columns = {"Column 1","Column 2"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        String[] rowData = {"mnp", "def"};
        String[] rowData1 = {"xyz", "abc"};
        String[] rowData2 = {"data1", "data2"};
        model.addRow(rowData);
        model.addRow(rowData1);
        model.addRow(rowData2);
        JTable table1 = new JTable(model);
        model.addRow(rowData);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for(int i = 0; i < 2; ++i) {
            table1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

//        table.setBounds(30, 40, 900, 900);
//        table.setFont(new Font("Helvetica", Font.PLAIN, 20));
//        table.setRowHeight(30);
//        table.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        //model.setRowCount(0);

        JTextField textField = new JTextField();
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(table1.getModel());
        String text = textField.getText();
        textField.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = textField.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = textField.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });
        table1.setRowSorter(rowSorter);
        JScrollPane scrollPane = new JScrollPane(table1);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(textField, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}

