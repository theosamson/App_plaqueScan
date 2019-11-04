import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class MainMenu extends JFrame{

    private JPanel container = new JPanel();
        private JPanel ZoneText = new JPanel();
                private JTextField codeCD = new JTextField();

                //-------------------------------------
                private String[] listContent = {"MenuPrinc", "CD_1", "CD_2", "CD_3", "CD_4", "CD_5", "CD_6", "CD_7"};
            private CardLayout pile = new CardLayout();
        private JPanel pileCard = new JPanel();
                private JPanel MenuPrinc = new JPanel();
                private JPanel CD_1 = new JPanel();
                private JPanel CD_2 = new JPanel();
                private JPanel CD_3 = new JPanel();
                private JPanel CD_4 = new JPanel();
                private JPanel CD_5 = new JPanel();
                private JPanel CD_6 = new JPanel();
                private JPanel CD_7 = new JPanel();

    //**check input on textfield**

    MainMenu() throws IOException {

        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setUndecorated(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.getContentPane().add(container);
        container.setLayout(new BorderLayout());
            container.add(ZoneText, BorderLayout.NORTH);
            container.add(pileCard, BorderLayout.CENTER);

        //++zone cardLayout++
        pileCard.setLayout(pile);

        pileCard.add(MenuPrinc, listContent[0]);
            BufferedImage image0 = ImageIO.read(getClass().getResource("/resources/images/background.png"));
            JLabel label0 = new JLabel(new ImageIcon(image0));
            MenuPrinc.add(label0);
                MenuPrinc.setBackground(Color.BLACK);

        pileCard.add(CD_1, listContent[1]);
            BufferedImage image1 = ImageIO.read(getClass().getResource("/resources/images/abydos.png"));
            JLabel label1 = new JLabel(new ImageIcon(image1));
            CD_1.add(label1);
                    CD_1.setBackground(Color.BLACK);

        pileCard.add(CD_2, listContent[2]);
            BufferedImage image2 = ImageIO.read(getClass().getResource("/resources/images/arrakis.png"));
            JLabel label2 = new JLabel(new ImageIcon(image2));
            CD_2.add(label2);
                    CD_2.setBackground(Color.BLACK);

        pileCard.add(CD_3, listContent[3]);
            BufferedImage image3 = ImageIO.read(getClass().getResource("/resources/images/caprica.png"));
            JLabel label3 = new JLabel(new ImageIcon(image3));
            CD_3.add(label3);
                    CD_3.setBackground(Color.BLACK);

        pileCard.add(CD_4, listContent[4]);
            BufferedImage image4 = ImageIO.read(getClass().getResource("/resources/images/gallifrey.png"));
            JLabel label4 = new JLabel(new ImageIcon(image4));
            CD_4.add(label4);
                    CD_4.setBackground(Color.BLACK);

        pileCard.add(CD_5, listContent[5]);
            BufferedImage image5 = ImageIO.read(getClass().getResource("/resources/images/namek.png"));
            JLabel label5 = new JLabel(new ImageIcon(image5));
            CD_5.add(label5);
                    CD_5.setBackground(Color.BLACK);

        pileCard.add(CD_6, listContent[6]);
            BufferedImage image6 = ImageIO.read(getClass().getResource("/resources/images/talos.png"));
            JLabel label6 = new JLabel(new ImageIcon(image6));
            CD_6.add(label6);
                    CD_6.setBackground(Color.BLACK);

        pileCard.add(CD_7, listContent[7]);
            BufferedImage image7 = ImageIO.read(getClass().getResource("/resources/images/tatooine.png"));
            JLabel label7 = new JLabel(new ImageIcon(image7));
            CD_7.add(label7);
                    CD_7.setBackground(Color.BLACK);
        //--zone cardLayout--


        //++zone JTextField++

        ZoneText.setPreferredSize(new Dimension(300,25));

        ZoneText.setBackground(Color.decode("#0d141e"));
        ZoneText.add(codeCD);

        codeCD.requestFocus(true);
        codeCD.setColumns(7);
        codeCD.setOpaque(false);

        codeCD.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {

                super.keyTyped(e);

                if (codeCD.getText().length() >= 7 ) // limit textfield to 7 characters
                    e.consume();

                switch (codeCD.getText()) {
                    //---CARDLAYOUT 1---
                    case "6524875":
                        pile.show(pileCard, listContent[1]);

                        codeCD.setText("");
                        break;

                    //---CARDLAYOUT 2---
                    case "7854862":
                        pile.show(pileCard, listContent[2]);

                        codeCD.setText("");
                        break;

                    //---CARDLAYOUT 3---
                    case "8632547":
                        pile.show(pileCard, listContent[3]);

                        codeCD.setText("");
                        break;

                    //---CARDLAYOUT 4---
                    case "1447559":
                        pile.show(pileCard, listContent[4]);

                        codeCD.setText("");
                        break;

                    //---CARDLAYOUT 5---
                    case "3567487":
                        pile.show(pileCard, listContent[5]);

                        codeCD.setText("");
                        break;

                    //---CARDLAYOUT 6---
                    case "5556897":
                        pile.show(pileCard, listContent[6]);

                        codeCD.setText("");
                        break;

                    //---CARDLAYOUT 7---
                    case "3558774":
                        pile.show(pileCard, listContent[7]);

                        codeCD.setText("");
                        break;

                    //---MENU DEFAULT---
                    default:
                        pile.show(pileCard, listContent[0]);
                        break;
                }
            }
        });
        //--zone JTextField--

        this.setVisible(true);

    }

}
