package homework4;

public class LightColorDetector {

    public String detect (int wavelength){
        if (wavelength >=620 && wavelength < 750){ return "Red"; }
        if (wavelength >=590 && wavelength < 620){ return "Orange"; }
        if (wavelength >=570 && wavelength < 590){ return "Yelow"; }
        if (wavelength >=495 && wavelength < 570){ return "Green"; }
        if (wavelength >=450 && wavelength < 495){ return "Blue"; }
        if (wavelength >=380 && wavelength < 450){ return "Violet"; }
        return "Other color";

    }
}

