package com.example.computershop;

import java.util.ArrayList;
import java.util.List;

public class ComputerTypeRepo {

    private static ComputerTypeRepo instance = null;
    private List<ComputerTypeData> computerTypesdata = new ArrayList<>();

    private ComputerTypeRepo() //constructor
    {
                computerTypesdata.add(new ComputerTypeData("Dell Inspiron 24 3000 (AMD ) Touch All-in-One Desktop - 8GB - 1TB - Windows 10 Home - di243475_ft_s1407e","Inspiron 24 3000 (AMD )",
                "$799.99","3.7(1553)","23.8\" FHD 1920x1080 IPS Anti-Glare LED-Backlit Touch Narrow Border Display","8GB,DDR4 2400MHz","Windows 10 Home 64bit English","Integrated graphics with AMD APU",
                "802.11ac + Bluetooth 4.1, Dual Band 2.4&5Ghz, 1x1","White Dell KM636 Wireless Keyboard & Mouse","Mouse included with Keyboard",
                "1TB 5400RPM SATA",R.drawable.popcomp1,R.drawable.stars3));
                 computerTypesdata.add(new ComputerTypeData("Dell XPS 13 Laptop w/ Intel Core 13.3- inch Notebook - Windows 10 Home - nxps137390i_wr_h607e","XPS 13",
                "$1,299.99","4.0(1234)","13.3-inch FHD (1920 x 1080) InfinityEdge Non-Touch Display","8 GB, LPDDR3,2133 MHz, Integrated","Windows 10 Home 64bit English","Intel® UHD Graphics with shared graphics memory",
                "Killer™ Wi-Fi 6 AX1650, 2 x 2, Bluetooth 5.0","N/A","N/A",
                "256 GB M.2 PCIe NVMe Solid-State Drive",R.drawable.poplap1,R.drawable.star4));

                computerTypesdata.add(new ComputerTypeData("Microsoft Surface Go 10\" 128GB Windows 10 S Tablet With Intel Pentium Gold Processor - Silver","Surface Go 10",
                "$650.79","4.0(1566)","10.3-inch Touch Display","128GB","Windows 10","N/A",
                "Wi-Fi 6 AX1650, 2 x 2, Bluetooth 5.0","N/A","N/A",
                "",R.drawable.poptab1,R.drawable.star4));

                computerTypesdata.add(new ComputerTypeData("HP 21.5\" All-in-One PC - Snow White (AMD A9-9425/2TB HDD/8GB RAM/Windows 10) - English","HP 21.5",
                "$655.78","3.8(1000)","21.5 inch diagonal FHD IPS anti-glare WLED-backlit three-sided micro-edge","DDR4-2133 SDRAM memory","Windows 10","AMD Radeon R5 Graphics",
                "Wireless LAN 802.11a/b/g/n/ac (2x2),Bluetooth 5.0","White HP KM636 Wireless Keyboard & Mouse","Mouse included with Keyboard",
                "",R.drawable.hp,R.drawable.stars3));



    }
    public static ComputerTypeRepo getInstance() //Method
    {
        if (instance == null) {
            instance = new ComputerTypeRepo();
        }
        return instance;
    }

    public void addCustomer(ComputerTypeData computerTypeData) {
        this.computerTypesdata.add(computerTypeData);
    }

    public List<ComputerTypeData> getComputerData() {
        return this.computerTypesdata;
    }


}
