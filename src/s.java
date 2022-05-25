import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class s extends JFrame {

    JPanel mainPanel, panelIputpenj , paneltotal , paneldatapenj , panelatas;
    JLabel inppenj,tagihan,namabrg,harga,jumlah,datapenjualan,diskon,persentase,totharga,bayar,kembalian,getTagihan,getKembalian,lb1,icon,lb2;
    JSpinner jmlah;
    JButton tambahkan,hitung,clear,delete;
    JRadioButton k50,k100,k250;
    JTextField tfHarga ,tfDiskon ,tftotdiskon,tftotharga,tfbayar;
    JTable tabel;
    JComboBox<String> brg1;
    JScrollPane scrollPane;



    public s(){
        super.setTitle("Cashier APP");
        setSize(2000,1000);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();

        setVisible(true);
    }
    public void initComponents(){

// Deklarasi

        mainPanel = new JPanel();
        paneltotal = new JPanel();
        panelatas = new JPanel();
        panelIputpenj = new JPanel();
        inppenj = new JLabel("Input Penjualan");
        datapenjualan = new JLabel("Data Penjualan");
        tagihan = new JLabel("Total Tagihan");
        diskon = new JLabel("Diskon");
        persentase = new JLabel("% = Rp.");
        totharga = new JLabel("Total Harga");
        tftotdiskon = new JTextField();
        tfDiskon = new JTextField();
        tftotharga = new JTextField();
        kembalian = new JLabel("Kembalian");
        bayar = new JLabel("Bayar");
        k50 = new JRadioButton("50.000");
        hitung = new JButton("Hitung");
        k100 = new JRadioButton("100.000");
        clear = new JButton("Clear");
        k250 = new JRadioButton("250.000");
        getKembalian = new JLabel("Rp.");
        namabrg = new JLabel("Nama Barang");
        harga = new JLabel("Harga");
        jumlah = new JLabel("Jumlah");
        tfHarga = new JTextField();
        jmlah = new JSpinner();
        tambahkan = new JButton("Tambahkan");
        getTagihan = new JLabel("Rp.");
        paneldatapenj = new JPanel();
        brg1 = new JComboBox<>();
        tabel = new JTable(1400,300);
        delete = new JButton("Delete");
        ButtonGroup uang = new ButtonGroup();
        icon = new JLabel("");
        lb1 = new JLabel("Cashier App ");
        lb2 = new JLabel("Designed by Bass ");

        inppenj.setBounds(40,27,200,30);
        inppenj.setFont(new Font("Verdana",Font.PLAIN,12));
        inppenj.setForeground(Color.white);

        datapenjualan.setBounds(40,177,200,30);
        datapenjualan.setFont(new Font("Verdana",Font.PLAIN,12));
        datapenjualan.setForeground(Color.white);

        tagihan.setBounds(410,27,200,30);
        tagihan.setFont(new Font("Verdana",Font.PLAIN,12));
        tagihan.setForeground(Color.white);

        diskon.setBounds(30,440,200,30);
        diskon.setFont(new Font("Verdana",Font.PLAIN,10));
        diskon.setForeground(Color.white);

        persentase.setBounds(190,440,200,30);
        persentase.setFont(new Font("Verdana",Font.PLAIN,10));
        persentase.setForeground(Color.white);

        totharga.setBounds(30,495,200,30);
        totharga.setFont(new Font("Verdana",Font.PLAIN,10));
        totharga.setForeground(Color.white);

        tftotdiskon.setBounds(250,442,100,25);
        tftotdiskon.setBackground(Color.white);
        tftotdiskon.setEditable(false);
        tftotdiskon.setForeground(Color.BLACK);

        tfDiskon.setBounds(100,442,80,25);
        tfDiskon.setBackground(Color.white);
        tfDiskon.setEditable(false);
        tfDiskon.setForeground(Color.BLACK);

        tftotharga.setBounds(100,498,250,25);
        tftotharga.setBackground(Color.white);
        tftotharga.setEditable(false);
        tftotharga.setForeground(Color.BLACK);

        kembalian.setBounds(550,495,200,30);
        kembalian.setFont(new Font("Verdana",Font.PLAIN,10));
        kembalian.setForeground(Color.white);

        bayar.setBounds(550,440,200,30);
        bayar.setFont(new Font("Verdana",Font.PLAIN,10));
        bayar.setForeground(Color.white);

        delete.setFocusable(false);
        delete.setBounds(1080,452,100,25);
        delete.setBackground(Color.white);
        delete.setForeground(Color.BLACK);
        delete.setFont(new Font("Verdana",Font.PLAIN,11));

        hitung.setFocusable(false);
        hitung.setBounds(1080,492,100,25);
        hitung.setBackground(Color.white);
        hitung.setForeground(Color.BLACK);
        hitung.setFont(new Font("Verdana",Font.PLAIN,11));

        clear.setBounds(1080,535,100,25);
        clear.setFocusable(false);
        clear.setBackground(Color.white);
        clear.setForeground(Color.BLACK);
        clear.setFont(new Font("Verdana",Font.PLAIN,11));

        tfbayar = new JTextField();
        tfbayar.setBounds(630,442,400,25);
        tfbayar.setBackground(Color.white);
        tfbayar.setHorizontalAlignment(SwingConstants.CENTER);
        tfbayar.setForeground(Color.BLACK);

        k50.setBounds(630,470,80,25);
        k50.setBackground(new Color(52, 152, 219,255));
        k50.setFocusable(false);
        k50.setForeground(Color.white);

        k100.setBounds(720,470,80,25);
        k100.setBackground(new Color(52, 152, 219,255));
        k100.setFocusable(false);
        k100.setForeground(Color.white);

        k250.setBounds(810,470,80,25);
        k250.setBackground(new Color(52, 152, 219,255));
        k250.setFocusable(false);
        k250.setForeground(Color.white);

        getKembalian.setBounds(630,500,400,60);
        getKembalian.setHorizontalAlignment(JLabel.RIGHT);
        getKembalian.setBorder(new LineBorder(Color.white,1));
        getKembalian.setFont(new Font("Verdana",Font.PLAIN,40));
        getKembalian.setForeground(Color.white);

        namabrg.setBounds(10,10,200,30);
        namabrg.setFont(new Font("Verdana",Font.PLAIN,11));
        namabrg.setForeground(Color.white);

        harga.setBounds(10,40,200,30);
        harga.setFont(new Font("Verdana",Font.PLAIN,11));
        harga.setForeground(Color.white);

        jumlah.setBounds(10,70,200,30);
        jumlah.setFont(new Font("Verdana",Font.PLAIN,11));
        jumlah.setForeground(Color.white);

        tfHarga.setHorizontalAlignment(JLabel.LEFT);
        tfHarga.setEditable(false);
        tfHarga.setBounds(100,45,225,20);

        jmlah.setForeground(Color.white);
        jmlah.setFont(new Font("Verdana" , Font.PLAIN,11));
        jmlah.setBounds(100,75,60,20);

        tambahkan.setFont(new Font("Verdana",Font.PLAIN,11));
        tambahkan.setBounds(225,75,100,20);

        uang.add(k50);
        uang.add(k100);
        uang.add(k250);

        getTagihan.setBounds(10,10,980,100);
        getTagihan.setFont(new Font("Verdana",Font.PLAIN,60));
        getTagihan.setHorizontalAlignment(JLabel.RIGHT);
        getTagihan.setForeground(Color.white);

        paneltotal.add(getTagihan);
        paneltotal.setBounds(400,50,1000,120);
        paneltotal.setOpaque(false);
        paneltotal.setLayout(null);
        paneltotal.setBorder(new LineBorder(Color.white,1));
        paneltotal.setVisible(true);

        tabel.setBackground(Color.white);
        tabel.setForeground(Color.BLACK);
        tabel.setRowHeight(20);
        tabel.setFont(new Font("Verdana",Font.PLAIN,11));

        icon.setIcon(new ImageIcon("icons8-cashier-100.png"));
        icon.setBounds(20,25,100,100);

        lb1.setFont(new Font("Verdana",Font.PLAIN,24));
        lb1.setForeground(Color.BLACK);
        lb1.setBounds(140,35,200,40);

        lb2.setFont(new Font("Verdana",Font.PLAIN,20));
        lb2.setForeground(Color.BLACK);
        lb2.setBounds(260,90,400,40);

        DefaultTableModel tabelmodel = new DefaultTableModel(0, 0){

            final boolean[] canEdit = new boolean [] {false, false, false, false, false};

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        };


//Nama barang dan harga

        String []Val = new String[50];
        ArrayList<String>namaBarang= new ArrayList<>();

        namaBarang.add("Minyak Bimoli"); Val[0]= "100000";
        namaBarang.add("Pasta gigi");    Val[1] = "20000";
        namaBarang.add("Sabun");         Val[2] = "31222";
        namaBarang.add("Iphone 11 max"); Val[3] = "4345";
        namaBarang.add("Sampoerna kretek"); Val[4] = "9878";
        namaBarang.add("Cabe kriting"); Val[5] = "32323";

        brg1.setBackground(Color.white);
        brg1.setForeground(Color.BLACK);
        brg1.setBounds(100,12,225,25);
        brg1.setEditable(true);
        DefaultComboBoxModel<String> brg1model = new DefaultComboBoxModel<>();
        brg1model.addAll(namaBarang);
        brg1.setModel(brg1model);

        String[] columnNames = new String[]{"No","Nama Barang","Harga","Jumlah","Total"};
        tabelmodel.setColumnIdentifiers(columnNames);

        ArrayList<Integer>cacheJmlh= new ArrayList<>();
        ArrayList<Integer>cacheIndex=new ArrayList<>();
        ArrayList<Integer>cacheHarga = new ArrayList<>();

        //Listener

        brg1.addActionListener(e -> {
            int menu = brg1.getSelectedIndex();

            if (menu != -1 ){
                tfHarga.setText(Val[menu]);

            }});

        delete.addActionListener(e -> {
            int total=0;
            int no =1 ;
            int a = tabelmodel.getRowCount();
            cacheIndex.remove(tabel.getSelectedRow());
            cacheJmlh.remove(tabel.getSelectedRow());
            cacheHarga.remove(tabel.getSelectedRow());
            for (int i = a-1 ; i>=0 ; i--){
                tabelmodel.removeRow(i);
            }

            for (int i = 0; i < a-1; i++) {
                tabelmodel.addRow(new Object[]{no,namaBarang.get(cacheIndex.get(i)),Val[cacheIndex.get(i)],cacheJmlh.get(i),cacheHarga.get(i)});
                no++;
            }


            for (int i = 0; i < tabelmodel.getRowCount(); i++) {
                total += (int)tabelmodel.getValueAt(i,4);
            }

            int discount =0 ;
            if (total > 250000 && total<1000000){
                discount= 2;
            }else if (total > 1000000 && total < 2500000){
                discount = 3;
            }else if (total>2500000){
                discount = 5;
            }
            int discountinrp = total * discount/100;
            int tagihanAkhir= total-discountinrp;

            tftotharga.setText(String.format("%d",total));
            tfDiskon.setText(String.valueOf(discount));
            tftotdiskon.setText(String.format("%d",discountinrp));
            getTagihan.setText(String.format("Rp.%,d",tagihanAkhir));


        });

        tambahkan.addActionListener(new ActionListener() {

            int no=1;
            int index = 0;
            int tot ;

            @Override
            public void actionPerformed(ActionEvent e) {


                try {
                    if (jmlah.getValue().equals(0) && brg1.getSelectedIndex()!=-1){
                        JOptionPane.showMessageDialog(null,"Tolong masukkan Jumlah barang","Peringatan",JOptionPane.WARNING_MESSAGE);
                    }else {

                        String nama = (String) brg1.getSelectedItem();
                        int harga = Integer.parseInt(tfHarga.getText()); // generate exception
                        int jumlah = (int)jmlah.getValue();
                        int total = harga*jumlah;
                        int discount=0;

                        if (index == 0){
                            tot = 0;
                        }else {
                            tot = Integer.parseInt(tftotharga.getText());
                        }

                        cacheIndex.add(brg1.getSelectedIndex());
                        cacheJmlh.add(jumlah);
                        cacheHarga.add(total);

                        tabelmodel.addRow(new Object[]{no,nama,harga,jumlah,total});


                        tot +=total;

                        if (tot > 250000 && tot<1000000){
                            discount= 2;
                        }else if (tot > 1000000 && tot < 2500000){
                            discount = 3;
                        }else if (tot>2500000){
                            discount = 5;
                        }
                        int discountinrp = tot * discount/100;
                        int tagihanAkhir= tot-discountinrp;

                        tftotharga.setText(String.format("%d",tot));
                        tfDiskon.setText(String.valueOf(discount));
                        tftotdiskon.setText(String.format("%d",discountinrp));
                        getTagihan.setText(String.format("Rp.%,d",tagihanAkhir));
                        no++;
                        index++;
                    }

                }catch (Exception as){
                    JOptionPane.showMessageDialog(null,"Tolong pilih barang !!","Peringatan",JOptionPane.WARNING_MESSAGE);
                }

                clear.addActionListener(e1 -> {

                    int rowcount = tabel.getRowCount();
                    for (int i = rowcount-1 ; i>=0 ; i--){
                        tabelmodel.removeRow(i);
                    }
                    no =1;
                    index = 0;
                    brg1.setSelectedIndex(-1);
                    tfHarga.setText("");
                    tftotdiskon.setText("");
                    tfbayar.setText("");
                    tftotharga.setText("");
                    tfDiskon.setText("");
                    getKembalian.setText("Rp.");
                    getTagihan.setText("Rp.");
                    uang.clearSelection();
                    jmlah.setValue(0);
                    cacheIndex.clear();
                    cacheJmlh.clear();
                    cacheHarga.clear();


                });

            }});

        k50.addActionListener(e -> tfbayar.setText("50000"));

        k100.addActionListener(e -> tfbayar.setText("100000"));
        k250.addActionListener(e -> tfbayar.setText("250000"));

        hitung.addActionListener(e -> {
            int totharga = Integer.parseInt(tftotharga.getText())-Integer.parseInt(tftotdiskon.getText());
            int kembalian = Integer.parseInt(tfbayar.getText())-totharga;
            getKembalian.setText(String.format("Rp.%,d",kembalian));
        });

        tabel.setModel(tabelmodel);
        TableColumnModel nm = tabel.getColumnModel();
        nm.getColumn(0).setPreferredWidth(10);
        nm.getColumn(1).setPreferredWidth(250);
        nm.getColumn(2).setPreferredWidth(200);
        nm.getColumn(3).setPreferredWidth(10);
        nm.getColumn(4).setPreferredWidth(250);

        DefaultTableCellRenderer centrerenderer = new DefaultTableCellRenderer();

        centrerenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i =0 ; i < tabelmodel.getColumnCount();i++){
            nm.getColumn(i).setCellRenderer(centrerenderer);
        }



        scrollPane = new JScrollPane(tabel);
        scrollPane.setBounds(5, 5, 1360, 190);
        scrollPane.setBackground(Color.white);
        scrollPane.setForeground(Color.BLACK);

        panelatas.add(icon);
        panelatas.add(lb1);
        panelatas.add(lb2);
        panelatas.setBounds(0, 0, 1560, 150);
        panelatas.setBorder(new LineBorder(Color.BLACK,2));
        panelatas.setLayout(null);
        panelatas.setBackground(new Color(255,255,255,240));

        panelIputpenj.add(namabrg);
        panelIputpenj.add(harga);
        panelIputpenj.add(jumlah);
        panelIputpenj.add(tfHarga);
        panelIputpenj.add(jmlah);
        panelIputpenj.add(tambahkan);
        panelIputpenj.add(brg1);

        panelIputpenj.setBounds(30,50,350,120);
        panelIputpenj.setBorder(new LineBorder(Color.WHITE,1));
        panelIputpenj.setOpaque(false);
        panelIputpenj.setLayout(null);
        panelIputpenj.setVisible(true);

        paneldatapenj.add(scrollPane);
        paneldatapenj.setBounds(30,200,1370,200);
        paneldatapenj.setBorder(new LineBorder(Color.WHITE,1));
        paneldatapenj.setLayout(null);
        paneldatapenj.setOpaque(false);
        paneldatapenj.setVisible(true);

        mainPanel.add(panelIputpenj);
        mainPanel.add(paneldatapenj);
        mainPanel.add(paneltotal);
        mainPanel.add(inppenj);
        mainPanel.add(tagihan);
        mainPanel.add(datapenjualan);
        mainPanel.add(diskon);
        mainPanel.add(persentase);
        mainPanel.add(totharga);
        mainPanel.add(kembalian);
        mainPanel.add(bayar);
        mainPanel.add(tftotdiskon);
        mainPanel.add(tftotharga);
        mainPanel.add(tfDiskon);
        mainPanel.add(bayar);
        mainPanel.add(tfbayar);
        mainPanel.add(getKembalian);
        mainPanel.add(hitung);
        mainPanel.add(clear);
        mainPanel.add(k50);
        mainPanel.add(k100);
        mainPanel.add(k250);
        mainPanel.add(delete);

       mainPanel.setBounds(0, 150, 1560, 700);
       mainPanel.setBorder(new LineBorder(Color.BLACK,2));
       mainPanel.setBackground(new Color(52, 152, 219,255));
       mainPanel.setLayout(null);
       mainPanel.setVisible(true);
       add(panelatas);
       add(mainPanel);

       setSize(2000,850);
       setLayout(null);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLocationRelativeTo(null);
       setVisible(true);

    }

}

