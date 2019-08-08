package com.example.hendrokom_v31;

import java.util.ArrayList;

public class PartsData {
    public static String[][] data = new String[][]{
            {"Gigabyte Z370 HD3", "(Intel LGA1151, Intel Z370, 4 x DDR4 (up to 64GB), DVI-D + HDMI, Gigabit LAN, 3 x PCI-e x16, 3 x PCI-e 3.0 x1, 6 x SATA3 + 1 x M.2 slot, 4 x USB3.1 + 2 x USB2.0 (back panel), ATX)","https://www.sentracomputer.com/img/products/221.jpg"},
            {"Team DDR4 Night Hawk RGB 16GB Kit (2x8GB) 3200 MHz", "(PC-25600, CL 16-18-18-38, 1.35V)","https://www.sentracomputer.com/img/products/943.jpg"},
            {"MSI NVIDIA GeForce GTX 1660 Ti GAMING X 6G", "(PCI-e 3.0 x16, 6GB, DDR5, 192-bit, GPU up to 1860 MHz, Memory 8 Gbps, HDMI + 3 * Display Port, 8-pin power connector)","https://www.sentracomputer.com/img/products/1445.jpg"},
            {"AMD Ryzen 5 Pinnacle Ridge 2600", "(AMD AM4, 3.4 GHz (up to 3.9 GHz), 6 x 512KB L2 Cache, 2 x 8MB L3 Cache, 6 Cores, 12 Threads, 65W, no integrated graphics)","https://www.sentracomputer.com/img/products/313.jpg"},
            {"Corsair CX650M 650W Modular", "(80 Plus Bronze, Modular, 1 * 20+4 motherboard pin, 1 * 4+4 CPU pin, 4 * PCI-e 6+2 pin, 6 * SATA, 3 * molex, 1 * FDD cable 4 pin)","https://www.sentracomputer.com/img/products/2478.jpg"},
            {"Samsung M.2 SATA SSD 860 EVO 500GB", "860 Evo, M.2 2280, 500GB, SATA III Controller: Samsung MJX Controller, Memory: Samsung V-NAND 3bit MLC","https://www.sentracomputer.com/img/products/353.jpg"},
            {"Logitech Keyboard Gaming G810 Orion Spectrum RGB Mechanical", "(Romer-G mechanical switch, customizable RGB lighting, custom button macros on F1-F12)","https://www.sentracomputer.com/img/products/1753.jpg"},
            {"SteelSeries Mouse Rival 500", "(15 Button, PixArt PMW3360 optical sensor, 100 to 16000 CPI, 1ms polling rate)","https://www.sentracomputer.com/img/products/256.jpg"},
            {"LG LED 24in 24UD58-B 4K", "(Widescreen, 4K 3840x2160, 5ms Response Time, 2x HDMI + Display Port, FreeSync, VESA Mount, IPS Panel)","https://www.sentracomputer.com/img/products/1432.jpg"},
            {"NZXT Phantom 530 Black", "(EATX Full Tower, 235mm x 572mm x 543mm, 1 x 20cm front fan + 1 x 14cm rear fan included, 3 x 5.25\", USB 3.0)","https://www.sentracomputer.com/img/products/1951.jpg"},

    };
    public static ArrayList<Part> getListData(){
        ArrayList<Part> list = new ArrayList<>();
        for (String[] aData : data) {
            Part part = new Part();
            part.setName(aData[0]);
            part.setHarga(aData[1]);
            part.setPhoto(aData[2]);
            list.add(part);
        }
        return list;
    }
}
