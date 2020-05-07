package com.example.computershop;

import java.util.ArrayList;
import java.util.List;

public class DesktopRepo {
    private static  DesktopRepo instance = null;
   // --------------------------------------Desktop ArrayList---------------------------------------------------------------
    private List<ComputerTypeData> dell = new ArrayList<>();
    private List<ComputerTypeData> Apple=new ArrayList<>();
    private List<ComputerTypeData> HP=new ArrayList<>();
    private List<ComputerTypeData> Lenovo=new ArrayList<>();
    private List<ComputerTypeData> Acer=new ArrayList<>();
    //---------------------------------------Laptop Array list--------------------------------------------------------------
    private List<ComputerTypeData> Applelaptop=new ArrayList<>();
    private List<ComputerTypeData> Delllaptop=new ArrayList<>();
    private List<ComputerTypeData> HPlaptop=new ArrayList<>();
    private List<ComputerTypeData> Lenovolaptop=new ArrayList<>();
    private List<ComputerTypeData> Acerlaptop=new ArrayList<>();



    private DesktopRepo() //constructor
    {
        dell.add(new ComputerTypeData("Dell Inspiron 22 3000 All-in-One Desktop w/ Intel Core - 1TB - Windows 10 Home - di223280_s105we","IInspiron 22 3000",
                "$649.99","3.8(1200)","21.5-inch FHD (1920 x 1080)","4 GB, 1 x 4 GB, DDR4, 2666 MHz","Windows 10 Home 64bit English","Intel® UHD Graphics 610 with shared graphics memory",
                "802.11ac + Bluetooth 4.1","White Dell KB216 Wired Keyboard","Dell MS116 Wired Mouse",
                "1TB 5400 rpm 2.5\" SATA Hard Drive",R.drawable.dell1,R.drawable.star4));
        dell.add(new ComputerTypeData("Dell Inspiron 27 7000 Touch All-in-One Desktop w/ Intel Core 27- inch - 8GB - 256GB - Windows 10 Home - di277790_h104e","Inspiron 27 7000 ",
                "$1,299.99","4.3(788)","13.3-inch FHD (1920 x 1080) InfinityEdge Non-Touch Display","8GB, 8Gx1, DDR4, 2666MHz","Windows 10 Home 64bit English","Intel® UHD Graphics",
                "802.11ac 1x1 WiFi and Bluetooth","Black Wireless Dell KM636 Keyboard ","Mouse with Keyboard",
                "256GB M.2 PCIe NVMe Solid State Drive (Boot) + 1TB 5400 rpm 2.5\" SATA Hard Drive (Storage)",R.drawable.dell2,R.drawable.star5));

        dell.add(new ComputerTypeData("Dell i3475 23.8\" All-in-One PC - White (AMD A9-9425/1TB HDD/8GB RAM/Windows 10) - English","Dell i3475 23.8",
                "$899.79","4.0(1566)","23.8 in","8 GB 2400MHz DDR4","Windows 10","Radeon R5 Graphics, Integrated APU",
                "802.11ac + Bluetooth 4.1, Dual Band 2.4&5Ghz, 1x1","N/A","Yes",
                "1 TB",R.drawable.dell3,R.drawable.star4));

        dell.add(new ComputerTypeData("Dell Optiplex 7000 7470 All-in-one Computer - Core I7 I7-9700 - 8 Gb Ram - 500 Gb Hdd - 23.8\" 1920 X 1080 - Desktop - Windows 10 Pro 64-bit - Intel -","Dell OptiPlex 7000 7470 ",
                "$1,614.99","5.0(1000)","23.8 in","8 GB","Windows 10","DDR4 SDRAM",
                "Wireless LAN 802.11a/b/g/n/ac (2x2),Bluetooth 5.0","White HP KM636 Wireless Keyboard & Mouse","Mouse included with Keyboard",
                "500 GB",R.drawable.dell4,R.drawable.star5));

// ----------------------------Apple Desktop Data--------------------------------------------------
        Apple.add(new ComputerTypeData(
                "Apple iMac (MMQA2LL/A) 21.5\" Intel Core i5 Dual-Core 7th Gen 2.3GHz Computer - English",
                "IMMQA2LL/A",
                "$1,259.99","4.8(1545)",
                "21.5-Inch (Diagonal) LED-Backlit Display",
                "8 GB (2133 MHz DDR4)","macOS","Intel Iris Plus Graphics 640",
                "802.11ac",
                "N/A","N/A",
                "1TB",R.drawable.apple1,R.drawable.star5));
        Apple.add(new ComputerTypeData("Apple iMac (MRT32LL/A) 21.5\" Intel Core i3 Quad-Core 3.6GHz Computer - English - Open Box","MRT32LL/A",
                "$1,699.99","4.0(1224)","21.5-inch Retina","8 GB","macOS","Radeon Pro 555X",
                "802.11ac/a/b/g/n","N/A","N/A",
                "256 GB M.2 PCIe NVMe Solid-State Drive",R.drawable.apple2,R.drawable.star4));

        Apple.add(new ComputerTypeData("Apple iMac 21.5\" Desktop (Late 2013) - ME086LL/A&nbsp;- Intel Core i5-4570R 2.7GHz / 8GB RAM / 1TB HDD / OSX Loaded&nbsp;- Refurbished","ME086LL/A",
                "$1,299.99","4.2(1566)","27 Inch","8GB","MacOS","AMD Radeon R9 M380",
                "Yes","N/A","N/A",
                "1 GB",R.drawable.apple3,R.drawable.star4));

        Apple.add(new ComputerTypeData("iMac 21.5” 2.8GHz i5 8GB / 1TB - Super-Fast 2015 model!! - Refurbished, Grade A, Excellent Condition, 9/10!","MK142LL/A",
                "$989.99","5.0(1000)","21.5 inch","8 GB","MacOS","Intel Graphics", "802.11a/b/g/n","N/A","N/A",
                "1 GB",R.drawable.apple4,R.drawable.star5));
        // ----------------------------HP Desktop Data--------------------------------------------------------------------------

        HP.add(new ComputerTypeData("HP Pavilion 27\" All-in-One PC - White (Intel Core i5-9400T/2TB HDD/256GB SSD/12GB RAM) - English"," 27-xa0049",
                "$1,255","4.2(7566)","27 Inch Diagonal Widescreen FHD IPS WLED","12 GB DDR4-2666 SDRAM memory","Windows 10 Home","Intel UHD Graphics 630",
                "Wireless LAN 802.11a/b/g/n/ac (2x2)","White English","White",
                "2 TB",R.drawable.hp1,R.drawable.star4));

        HP.add(new ComputerTypeData("HP 21.5\" All-in-One PC - Snow White (AMD A9-9425/2TB HDD/8GB RAM/Windows 10) - English","22-c0049",
                "$655.49","3.8(1000)","21.5 inch diagonal FHD IPS anti-glare WLED","DDR4-2133 SDRAM memory","Windows 10 Home","AMD Radeon R5 Graphics",
                "Wireless LAN 802.11a/b/g/n/ac (2x2)","White English","White",
                "2 TB",R.drawable.hp2,R.drawable.star4));

        HP.add(new ComputerTypeData("Hp Pavilion 27-xa0159 27\" All-in-one Desktop Pc - Intel Core I7-9700t 2.0ghz","Hp Pavilion 27-xa0159 27",
                "$1,628.88","4.0(100)","21.5 inch diagonal FHD IPS anti-glare WLED","256gb Ssd","Windows 10 Home"," Intel® Uhd Graphics 630",
                "Wireless 10/100/1000 Gbe Lan - Bluetooth 4.2","Black English","black",
                "1 TB",R.drawable.hp3,R.drawable.star4));

        HP.add(new ComputerTypeData("Hp Envy 27-b200 27-b210 All-in-one Computer - Core I7 I7-8700t-27\" 2560 X 1440 Touchscreen Display - Desktop - W","HP Envy 27-b200 27-b210",
                "$2,305.99","4.8(100)","27\" 2560 x 1440 Touchscreen Display "," 16 GB ","Windows 10 Home","  NVIDIA GeForce GTX 1050 4 GB",
                " Wireless LAN - Bluetooth","Black English","black",
                "1 TB",R.drawable.hp4,R.drawable.star5));
        // ----------------------------HP Laptop Data--------------------------------------------------------------------------

        HPlaptop.add(new ComputerTypeData("HP Spectre x360 15-df1008ca 4K Convertible Laptop with Webcam kill switch","HP Spectre x360 15-df1008ca ",
                "$2 099.99","4.1(100)","15.6\" diagonal 4K touch display"," 16 GB DDR4-2666 SDRAM (2 x 8 GB) ","Windows 10 Home","Intel® UHD Graphics 630",
                "Intel® Wi-Fi 6 AX 201 (2x2) and Bluetooth® 5 Combo ","N/A","N/A",
                "16 GB ",R.drawable.hplaptop1,R.drawable.star4));
        HPlaptop.add(new ComputerTypeData("HP EliteBook 840 G6 14\" Touchscreen Notebook - 1920 x 1080 - Core i7 i7-8565U","HP EliteBook 840 G6 ",
                "$2,307.99","4.1(1200)","14\" Touchscreen Notebook - 1920 x 1080 "," 512 GB SSD -  ","Windows 10 Home","Intel® UHD Graphics 630",
                "Intel® Wi-Fi 6 AX 201 (2x2) and Bluetooth® 5 Combo ","N/A","N/A",
                "16 GB ",R.drawable.hplaptop2,R.drawable.star4));

        //-----------------------------------Lenovo Desktop Data---------------------------------------------------------------
        Lenovo.add(new ComputerTypeData("Lenovo ThinkCentre M820z All-in-One - 21.5\" - 500GB HDD - 4GB RAM","Lenovo ThinkCentre M820z",
                "$1,169.66","4.7(70)","23.8\" FHD (1920 x 1080) IPS, touchscreen","12GB DDR4 2666MHz (4GB + 8GB DIMM)","Windows 10 Home","Intel UHD Graphics 630",
                "Intel® 8265 802.11AC (2 x 2)","USB Traditional Black Keyboard - English","Black",
                "500 GB 7200 RPM HDD",R.drawable.lenovo1,R.drawable.star5));

        Lenovo.add(new ComputerTypeData("Lenovo IdeaCentre A540 - 23.8\" - AMD Ryzen 5 3400GE (3.30GHz) - 2TB HDD 5400RPM - 128GB SSD PCIe-NVMe - 12GB RAM","IdeaCentre A540 (24”, AMD) ",
                "$655.49","3.8(100)","21.5 inch diagonal FHD IPS anti-glare WLED","12GB DDR4 2666MHz (4GB + 8GB DIMM)","Windows 10 Home","AAMD Radeon™ RX Vega 11 Graphics",
                "\"802.11AC (1 X 1) + Bluetooth® 4.0","Wireless - French","Wireless Mouse",
                "2TB HDD 5400RPM + 128GB SSD PCIe-NVMe",R.drawable.lenovo2,R.drawable.star4));
        //---------------------------------------Lenovo Laptop Data-----------------------------------------------------------------------------
        Lenovolaptop.add(new ComputerTypeData("Lenovo ThinkPad P1 Gen 2 - 15.6\" - Intel Core i9 Processor (2.30 GHz) - 512GB SSD - 16GB RAM","ThinkPad P1 Gen 2 (15”)",
                "$3,959.00","4.0(10)","15.6\" UHD 4K (3840 x 2160) OLED, 400 nits, AR/AS, touchscreen Dolby Vision™ HDR 500","Up to 64GB DDR4 2666MHz","Windows 10 Home"," NVIDIA® Quadro® T1000 4GB",
                "Intel® AX200 Wi-Fi 6 802.11AX (2 x 2) & Bluetooth® 5.1",
                "Backlit - US English","N/A",
                "512 GB PCIe SSD",R.drawable.lenovolap1,R.drawable.star4));

        Lenovolaptop.add(new ComputerTypeData("Lenovo ThinkPad X1 Yoga Gen 4 Laptop - 14\" - Intel Core i7 Processor (1.90 GHz) - 512GB SSD - 16GB RAM","ThinkPad X1 Yoga Gen 4 ",
                "$2,976.35","4.6(100)","14.0\" WQHD (2560 x 1440) IPS, anti-reflective, anti-smudge, touchscreen, 300 nits"," 16 GB LPDDR3 2133MHz (Soldered) ","Windows 10 Home","Integrated Intel® UHD Graphics 620",
                "Intel® 9560 802.11AC vPro™ (2 x 2) & Bluetooth® 5.0","Backlit - US English","N/A",
                "512 GB PCIe SSD",R.drawable.lenovolap2,R.drawable.star5));


        //-----------------------------------Acer Desktop Data---------------------------------------------------------------
        Acer.add(new ComputerTypeData("Acer C27 27\" PC - Silver (Intel Core i5-1035G1/512GB SSD/12GB RAM/Windows 10)","Acer C27",
                "$1,305.66","4.0(770)","27 Inch LCD","12GB DDR4 2666 MHz soDIMM","Windows 10 Home","Intel UHD Graphics",
                "802.11ac/a/b/g/n","USB Traditional Black Keyboard - English","Black",
                "512 GB SSD",R.drawable.acer1,R.drawable.star4));

        Acer.add(new ComputerTypeData("Acer Chromebase 24 Ca24v2 All-in-one Computer - Core I7 I7-8550u - 4 Gb Ram - 128 Gb Ssd - 23.8\" 1920 X 1080 - Desktop - Chrome Os - Intel Uhd Graphic","Acer Chromebase 24 CA24V2 ",
                "$1,452.99","3.8(110)","23.8\" 1920 x 1080","4GB DDR4 SDRAM","Chrome OS ","Intel UHD Graphics 620 ",
                "\"802.11AC (1 X 1) + Bluetooth® 4.0","Black","Black",
                "2TB HDD 5400RPM + 128GB SSD PCIe-NVMe",R.drawable.acer2,R.drawable.star4));
       // ---------------------------------------Acer Laptop Data--------------------------------------------------------------

        Acerlaptop.add(new ComputerTypeData("Acer Nitro 7 An715-51-752b 15.6\" Gaming Notebook - 1920 X 1080 - Core I7 I7-9750h - 16 Gb Ram - 512 Gb Ssd - Black - Windows 10 Home 64-bit - Nvidia G","Acer Nitro 7 AN715-51-752B",
                "$1,590.06","4.6(356)","15.6\" Gaming Notebook - 1920 x 1080 "," 32GB DDR4 2666MHz","Windows 10 Home","NVIDIA GeForce GTX 1650",
                "IEEE 802.11a/b/g/n/ac",
                "Yes","Tocuh Pointing",
                "512 GB PCIe SSD",R.drawable.acerlap1,R.drawable.star5));

        Acerlaptop.add(new ComputerTypeData("Acer Swift 7 Sf714-51t-m9h0 Laptop 14\" Fhd I7 8gb 256gb Ssd 4g Lte"," SF714-51T-M9H0",
                "$2,976.35","4.6(100)","14\" Fhd I7"," 8 GB ","Windows 10 Home","Intel HD Graphics 615",
                "Intel® 9560 802.11AC vPro™ (2 x 2) & Bluetooth® 5.0","Yes","Touchpad",
                "512 GB PCIe SSD",R.drawable.acerlap2,R.drawable.star5));



        // ----------------------------Apple Laptop Data-----------------------------------------------------------------------

        Applelaptop.add(new ComputerTypeData(
                "Apple MacBook Air 13.3” 512GB, 1.1GHz with Intel i5 10th Generation Processor - Space Grey - English",
                "Apple MacBook Air 13.3",
                "$1,700.79","4.8(1545)",
                "3.3\" LED Display (2560 x 1600)",
                "8 GB of LPDDR4X SDRAM","macOS","Intel Iris Plus Graphics",
                "802.11ac",
                "N/A","N/A",
                "512GB Solid State Drive",R.drawable.applelap1,R.drawable.star5));
        Applelaptop.add(new ComputerTypeData("Apple MacBook Pro 16” 512GB with Touch Bar - Space Grey - English","Apple MacBook Pro 16",
                "$2,999.99","4.8(1224)","16\" QHD LED Display (3072 x 1920)"," 16 GB of DDR4 SDRAM","macOS","AMD Radeon™ Pro 5300M 4GB graphics",
                "802.11ac/a/b/g/n","N/A","N/A",
                " 512GB Solid State Drive",R.drawable.applelap2,R.drawable.star4));

        Applelaptop.add(new ComputerTypeData("Apple Macbook Air 13 ́ ́ I5 1.1/8gb/256gb One Size"," Macbook Air 13",
                "$1,483.49","4.2(1566)","13.0-13.9","256 GB","MacOS","Intel",
                "Yes","N/A","N/A",
                "256 GB",R.drawable.applelap3,R.drawable.star4));

        Applelaptop.add(new ComputerTypeData("Apple MacBook Air 13.3\" - Silver (Intel Core i7 2.2GHz / 512GB SSD / 8GB RAM) - French","MacBook Air 13.3\" - Silver",
                "$1999.88","5.0(1000)","13.3 in","512 GB","Macos","Intel HD Graphics 6000", "802.11a/b/g/n","N/A","N/A",
                "1 GB",R.drawable.applelap4,R.drawable.star5));
 //-------------------------------------------Dell Laptop Data-----------------------------------------------------------------------
        Delllaptop.add(new ComputerTypeData(
                "Dell Inspiron 15 3000 (AMD) Laptop 15.6- inch - 4GB - 500GB - Windows 10 Home - ni153595_sb_h252e",
                "Inspiron 15 3000 (AMD)",
                "$419.99","3.8(155)",
                "15.6-inch HD (1366 x 768)",
                "4GB, 4Gx1, DDR4, 2133MHz","Windows 10 Home 64-bit English","Radeon™ R4 Graphics - Integrated APU",
                "Qualcomm® DW1810, 1 x 1",
                "Internal US English Keyboard","N/A",
                "500GB 5400 rpm 2.5 SATA Hard Drive",R.drawable.delllaptop1,R.drawable.star4));
        Delllaptop.add(new ComputerTypeData("Dell Inspiron 15 7000 Laptop w/ Intel Core 15.6- inch - 512GB - Windows 10 Home - ni157591n_wr_s106e","Inspiron 15 7000",
                "$1,249.99","4.8(1289)","15.6-inch FHD (1920 x 1080) "," 8 GB, 1 x 8 GB, DDR4, 2666 MHz","Windows 10 Home 64-bit English","NVIDIA® GeForce® GTX 1050 3GB GDDR5",
                "802.11ac 2x2 WiFi and Bluetooth","Backlit Keyboard, English","N/A",
                " 512GB M.2 PCIe NVMe Solid State Drive",R.drawable.delllaptop2,R.drawable.star5));

        Delllaptop.add(new ComputerTypeData("Dell XPS 15 Laptop w/ Intel Core 15.6 inch Notebook - 16GB - 256GB - Windows 10 Home - nxps157590_s1656e","XPS 15 ",
                "$1,829.99","4.2(1566)","15.6\" FHD (1920 x 1080)","16GB DDR4-2666MHz, 2x8G","Windows 10 Home 64-bit English","NVIDIA® GeForce® GTX 1650 4GB GDDR5",
                "Killer Wi-Fi 6 AX1650 (2x2) and Bluetooth 5.0","Backlit Keyboard, English","N/A",
                "256GB M.2 PCIe NVMe Solid State Drive",R.drawable.delllaptop3,R.drawable.star4));
        Delllaptop.add(new ComputerTypeData("Dell 15.6\" Laptop - Black (Intel Core i5-8265U/256GB SSD/8GB RAM/Windows 10 S)"," i3583-5933BLK-PCA",
                "$700.88","4.6(1000)","15.6 in","256 GB SSD","Windows 10 Home","Intel UHD Graphics 620", "802.11ac + Bluetooth 4.1","Backlit Keyboard, English","N/A",
                "256GB M.2 PCIe NVMe Solid State Drive",R.drawable.delllaptop4,R.drawable.star5));
    }
    public static DesktopRepo getInstance() //Method
    {
        if (instance == null) {
            instance = new DesktopRepo();
        }
        return instance;
    }
//---------------------------------Add Method-----------------------------------------------------------------------------

    public void adddelldata(ComputerTypeData dell) {
        this.dell.add(dell);
    }
    public void addappledata(ComputerTypeData apple) {
        this.Apple.add(apple);
    }
    public void addapplelaptopdata(ComputerTypeData applelaptop) { this.Applelaptop.add(applelaptop); }
    public void adddelllaptopdata(ComputerTypeData delllaptop) { this.Delllaptop.add(delllaptop); }
    public void addhplaptopdata(ComputerTypeData hplaptop) { this.HPlaptop.add(hplaptop); }
    public void addhpdata(ComputerTypeData hp) { this.HP.add(hp); }
    public void addlenovodata(ComputerTypeData lenovo) { this.Lenovo.add(lenovo); }
    public void addlenovolaptopdata(ComputerTypeData lenovolaptop) { this.Lenovo.add(lenovolaptop); }
    public void addacerdata(ComputerTypeData acer) { this.Acer.add(acer); }
    public void addacerlaptopdata(ComputerTypeData acerlaptop) { this.Acerlaptop.add(acerlaptop); }


    //---------------------------------------Get Method----------------------------------------------------------------------
    public List<ComputerTypeData> getDellData() {
        return this.dell;
    }
    public List<ComputerTypeData> getAppleData() {
        return this.Apple;
    }
    public List<ComputerTypeData> getApplelaptopData() {
        return this.Applelaptop;
    }
    public List<ComputerTypeData> getDelllaptopData() {
        return this.Delllaptop;
    }
    public List<ComputerTypeData> getHPlaptopData() {
        return this.HPlaptop;
    }
    public List<ComputerTypeData> getHPData() {
        return this.HP;
    }
    public List<ComputerTypeData> getLenovoData() {
        return this.Lenovo;
    }
    public List<ComputerTypeData> getLenovolaptopData() { return this.Lenovolaptop;}
    public List<ComputerTypeData> getAcerData() {
        return this.Acer;
    }
    public List<ComputerTypeData> getAcerlaptopData() { return this.Acerlaptop;}

}
