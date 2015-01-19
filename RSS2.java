/*
 * RSS FEED READER
 Developed by Sanat Rohatgi
 */
package rss;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class RSS2 extends javax.swing.JFrame {

    static int k = 0;
    String mainstring = "";
    static DocumentBuilderFactory dbf;
    static DocumentBuilder db;
    static URL News[];
    static URL Science[];
    static URL Sports[];
    static URL Tech[];
    static URL Miscellaneous[];
    String link;

    public RSS2() throws SAXException, IOException {    //Constructor
        initComponents();
        addlisteners();
        startshowing();// to display the news in window
    }

    void addlisteners() {
        jEditorPane1.addHyperlinkListener(new HyperlinkListener() {
            @Override
            public void hyperlinkUpdate(HyperlinkEvent e1) {
                if (e1.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                    openWebpage(e1.getURL());
                }
            }
        });
        jEditorPane2.addHyperlinkListener(new HyperlinkListener() {
            @Override
            public void hyperlinkUpdate(HyperlinkEvent e2) {
                if (e2.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                    openWebpage(e2.getURL());
                }
            }
        });
        jEditorPane3.addHyperlinkListener(new HyperlinkListener() {
            @Override
            public void hyperlinkUpdate(HyperlinkEvent e3) {
                if (e3.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                    openWebpage(e3.getURL());
                }
            }
        });
        jEditorPane4.addHyperlinkListener(new HyperlinkListener() {
            @Override
            public void hyperlinkUpdate(HyperlinkEvent e4) {
                if (e4.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                    openWebpage(e4.getURL());
                }
            }
        });
        jEditorPane5.addHyperlinkListener(new HyperlinkListener() {
            @Override
            public void hyperlinkUpdate(HyperlinkEvent e5) {
                if (e5.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                    openWebpage(e5.getURL());
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane2 = new javax.swing.JEditorPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        jEditorPane3 = new javax.swing.JEditorPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        jEditorPane4 = new javax.swing.JEditorPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        jEditorPane5 = new javax.swing.JEditorPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RSS FEED");

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setOpaque(true);

        jEditorPane1.setEditable(false);
        jEditorPane1.setContentType("text/html"); // NOI18N
        jScrollPane6.setViewportView(jEditorPane1);

        jTabbedPane1.addTab("News", jScrollPane6);

        jEditorPane2.setEditable(false);
        jEditorPane2.setContentType("text/html"); // NOI18N
        jScrollPane2.setViewportView(jEditorPane2);

        jTabbedPane1.addTab("Science", jScrollPane2);

        jEditorPane3.setEditable(false);
        jEditorPane3.setContentType("text/html"); // NOI18N
        jScrollPane7.setViewportView(jEditorPane3);

        jTabbedPane1.addTab("Sports", jScrollPane7);

        jEditorPane4.setEditable(false);
        jEditorPane4.setContentType("text/html"); // NOI18N
        jScrollPane8.setViewportView(jEditorPane4);

        jTabbedPane1.addTab("Tech", jScrollPane8);

        jEditorPane5.setEditable(false);
        jEditorPane5.setContentType("text/html"); // NOI18N
        jEditorPane5.addHyperlinkListener(new javax.swing.event.HyperlinkListener() {
            public void hyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {
                jEditorPane5HyperlinkUpdate(evt);
            }
        });
        jScrollPane9.setViewportView(jEditorPane5);

        jTabbedPane1.addTab("Miscellaneous", jScrollPane9);

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Refresh");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Miscellaneous");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItem3.setText("Information");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        System.exit(0);                 //Exit button
    }                                          
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        JFrame jf = new JFrame("About");                            //About page
        jf.getContentPane().setSize(1600, 1600);
        jf.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        JTextArea jt = new JTextArea();
        jt.setSize(400, 400);
        jt.setPreferredSize(new Dimension(800, 800));
        jt.setEditable(false);
        jt.setText("\t\t RSS FEED\n\tDeveloped By Sanat Rohatgi");
        jf.add(jt);
        jf.setVisible(true);
    }                                          
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        final JFrame jf1 = new JFrame("Miscellaneous");                     //Button opens a new window to enter the user wanted feed
        String prefinal;
        jf1.setLayout(new BorderLayout());
        jf1.getContentPane().setSize(1600, 1600);
        jf1.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        Box box = Box.createVerticalBox();
        JLabel jl = new JLabel("Enter The RSS feed you want to read about");

        box.add(jl);
        JButton jb = new JButton("submit");
        jb.setVisible(true);

        jf1.setVisible(true);
        final JTextArea jts[] = new JTextArea[5];
        for (int u = 0; u < 5; u++) {
            jts[u] = new JTextArea();
            box.add(jts[u]);
            jf1.add(box);
            if (Miscellaneous[u] != null) {

                prefinal = Miscellaneous[u].toString();
                if (!prefinal.equals("")) {
                    jts[u].setText(prefinal);
                } else {
                    jts[u].setText(null);
                }

            }
        }
        box.add(jb);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 5; i++) {
                    try {
                        String temp = (jts[i].getText());
                        if (!temp.equalsIgnoreCase("")) {
                            Miscellaneous[i] = new URL(temp);
                        } else {
                            Miscellaneous[i] = null;
                        }
                    } catch (MalformedURLException ex) {
                        Logger.getLogger(RSS2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                jf1.setVisible(false);
                try {
                    startshowing();
                } catch (SAXException ex) {
                    Logger.getLogger(RSS2.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(RSS2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });


    }                                          
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        try {
            startshowing();                                 // Refresh page
        } catch (SAXException ex) {
            Logger.getLogger(RSS2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RSS2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                          

    private void jEditorPane5HyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {                                             
        //  if (HyperlinkEvent.EventType.ACTIVATED.equals(evt.getEventType())) {
        //     System.out.println(evt.getURL());
        //  }
    }                                            

    public static void main(String args[]) throws ParserConfigurationException, MalformedURLException, SAXException, IOException {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RSS2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RSS2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RSS2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RSS2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        dbf = DocumentBuilderFactory.newInstance();
        try {
            db = dbf.newDocumentBuilder();
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(RSS2.class.getName()).log(Level.SEVERE, null, ex);
        }
        int area = 0;
        News = new URL[5];//URL array for different tabs
        try {
            News[0] = new URL("http://timesofindia.feedsportal.com/c/33039/f/533921/index.rss");
            News[1] = new URL("http://economictimes.indiatimes.com/rssfeedsdefault.cms");
            News[2] = new URL("http://www.thehindu.com/?service=rss");
            News[3] = new URL("http://feeds.feedburner.com/digit/latest-from-digit");
            News[4] = new URL("http://zeenews.india.com/rss/india-national-news.xml");
            Science = new URL[5];
            Science[0] = new URL("http://feeds.feedburner.com/DiscoverTopStories");
            Science[1] = new URL("http://economictimes.indiatimes.com/rssfeedsdefault.cms");
            Science[2] = new URL("http://www.thehindu.com/?service=rss");
            Science[3] = new URL("http://feeds.feedburner.com/digit/latest-from-digit");
            Science[4] = new URL("http://zeenews.india.com/rss/india-national-news.xml");
            Sports = new URL[5];
            Sports[0] = new URL("http://www.deccanchronicle.com/rss/sports/rss.xml");
            Sports[1] = new URL("http://economictimes.indiatimes.com/rssfeedsdefault.cms");
            Sports[2] = new URL("http://www.thehindu.com/?service=rss");
            Sports[3] = new URL("http://feeds.feedburner.com/digit/latest-from-digit");
            Sports[4] = new URL("http://zeenews.india.com/rss/india-national-news.xml");
            Tech = new URL[5];
            Tech[0] = new URL("http://www.cnet.com/rss/news/");
            Tech[1] = new URL("http://feeds.feedburner.com/digit/how-to");
            Tech[2] = new URL("http://feeds.feedburner.com/viralpatelnet?format=xml");
            Tech[3] = new URL("http://www.electronicsweekly.com/news/feed/");
            Tech[4] = new URL("http://feeds.feedburner.com/TechCrunch/");
            Miscellaneous = new URL[5];
            Miscellaneous[0] = new URL("http://timesofindia.feedsportal.com/c/33039/f/533921/index.rss");
            Miscellaneous[1] = new URL("http://economictimes.indiatimes.com/rssfeedsdefault.cms");
            Miscellaneous[2] = new URL("http://www.thehindu.com/?service=rss");
            Miscellaneous[3] = new URL("http://feeds.feedburner.com/digit/latest-from-digit");
            Miscellaneous[4] = new URL("http://feeds.feedburner.com/javatpointsonoo?format=xml");

        } catch (MalformedURLException ex) {
            Logger.getLogger(RSS2.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new RSS2().setVisible(true);
                } catch (SAXException ex) {
                    Logger.getLogger(RSS2.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(RSS2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

    }

    void startshowing() throws SAXException, IOException {          //function to call rss feed pages from the links

        collectanddisplay2(News, 1);
        collectanddisplay2(Science, 2);
        collectanddisplay2(Sports, 3);
        collectanddisplay2(Tech, 4);
        collectanddisplay2(Miscellaneous, 5);
    }

    void collectanddisplay2(URL[] url, int tabno) throws SAXException, IOException {        //reads the XML pages from URL and procees it 
        mainstring = "";
        String tile = "", desc = "";
        for (int i = 0; i < url.length; i++) {
            if (url[i] != null) {
                Document doc = (Document) db.parse(url[i].openStream());
                Element E;
                Element el = doc.getDocumentElement();
                NodeList OneChannel = el.getElementsByTagName("channel");
                Element Channel = (Element) OneChannel.item(0);
                NodeList Items = Channel.getElementsByTagName("item");
                if (Items.getLength() == 0) {
                    Items = Channel.getElementsByTagName("Item");
                }
                for (int k = 0; k < (((Items.getLength()) > 5) ? (5) : (Items.getLength())); k++) {
                    Element Item = (Element) Items.item(k);
                    NodeList titles = Item.getElementsByTagName("title");
                    if (titles.getLength() == 0) {
                        titles = Item.getElementsByTagName("Title");
                    }
                    tile = (titles.item(0).getChildNodes().item(0).getNodeValue());
                    tile = tile.replaceAll("(?s)\\<.*?\\>", "");
                    NodeList links = Item.getElementsByTagName("link");
                    link = (links.item(0).getChildNodes().item(0).getNodeValue());

                    mainstring += "<html><a href=" + link + ">" + tile + "</a>\n";
                    NodeList description = Item.getElementsByTagName("description");
                    if (description.getLength() == 0) {
                        description = Item.getElementsByTagName("Description");
                    }
                    desc = (description.item(0).getChildNodes().item(0).getNodeValue()).replaceAll("(?s)\\<.*?\\>", "");// + "\n";
                    mainstring += desc;
                    NodeList pubdate = Item.getElementsByTagName("pubDate");
                    if (pubdate.getLength() == 0) {
                        pubdate = Item.getElementsByTagName("pubdate");
                    }
                    if (pubdate.getLength() != 0) {
                        mainstring += "<font size=\"2\">" + (pubdate.item(0).getChildNodes().item(0).getNodeValue()) + "</font>" + "\n";
                    }
                    mainstring += "\n ========================================\n";
                }

            }
        }
        addtoscreen(null, mainstring, link, tabno);

    }

    @SuppressWarnings("empty-statement")
    void addtoscreen(ImageIcon image, String m, final String link, int tabno) {//to show it to the screen and add listeners to HTML links 
        switch (tabno) {
            case (1): {
                jEditorPane1.setText((m.replaceAll("\\n", "<br>") + "</html>"));
                break;
            }
            case (2): {
                jEditorPane2.setText((m.replaceAll("\\n", "<br>") + "</html>"));
                break;
            }
            case (3): {
                jEditorPane3.setText((m.replaceAll("\\n", "<br>") + "</html>"));
                break;
            }
            case (4): {
                jEditorPane4.setText((m.replaceAll("\\n", "<br>") + "</html>"));
                break;
            }
            case (5): {
                jEditorPane5.setText((m.replaceAll("\\n", "<br>") + "</html>"));
                break;
            }

        }
    }

    public static void openWebpage(URL uri) {           //Desktop Class to open clicked linksin a Browser
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                desktop.browse((uri).toURI());
            } catch (URISyntaxException | IOException e) {
            }
        }
    }
    // Variables declaration - do not modify                     
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JEditorPane jEditorPane2;
    private javax.swing.JEditorPane jEditorPane3;
    private javax.swing.JEditorPane jEditorPane4;
    private javax.swing.JEditorPane jEditorPane5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration                   
}
