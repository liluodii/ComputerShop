package com.example.computershop;

import java.util.ArrayList;
import java.util.List;

public class AccessoriesRepo {
    private static AccessoriesRepo instance = null;
    private List<Accessories> accessories = new ArrayList<>();

    private AccessoriesRepo() //constructor
    {
        accessories.add(new Accessories("$75","Razer Mamba 16000 DPI Wireless Optical Gaming Mouse - Black",
                "RZ01-02710100-R3U1","Wireless","Windows","Black",
                "4.5",R.drawable.access1,R.drawable.star5));
        accessories.add(new Accessories("$399.99","Bose QuietComfort 35 wireless headphones II - Black",
                "QC35 II Black","Wireless","Windows","Black",
                "3.9",R.drawable.access2,R.drawable.star4));
        accessories.add(new Accessories("$36.18","Logitech Wireless Keyboard and Mouse Combo - Black (MK270)",
                "920-004536","Wireless","Windows","Black",
                "4.6",R.drawable.access3,R.drawable.star5));
        accessories.add(new Accessories("$25","Apple 2m (6.5ft) USB-C to USB-C Charge Cable (MLL82AM/A)",
                "MLL82AM/A","Wired","Mac","White",
                "4.7",R.drawable.access4,R.drawable.star5));

        accessories.add(new Accessories("$40.14","Logitech HD Webcam (C270)",
                "960-000694","USB","Windows/Mac","Black",
                "4.0",R.drawable.access5,R.drawable.star4));

        accessories.add(new Accessories("$95.23","Apple Magic Mouse 2 (MLA02LL/A) - White",
                "MLA02LL/A","Wireless","Mac","White",
                "4.7",R.drawable.access6,R.drawable.star5));
    }
    public static AccessoriesRepo getInstance() //Method
    {
        if (instance == null) {
            instance = new  AccessoriesRepo();
        }
        return instance;
    }

    public void addAccessories(Accessories accessories) {
        this.accessories.add(accessories);
    }

    public List<Accessories> getAccessories() {
        return this.accessories;
    }

}
