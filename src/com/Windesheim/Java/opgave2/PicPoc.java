package com.Windesheim.Java.opgave2;

//vraag 2
public class PicPoc {
    private Plaatje img;

    public void uploadPlaatje(Plaatje i) {
        img = i;
    }

    public void setImg(Plaatje img) {
        this.img = img;
    }

    // Je moet setter maken, hierbij sta je toe dat de waarde van de property veranderd mag worden

    public Plaatje downloadPlaatje() {
        img.toon(); // dit plaatje wordt gedownload.
        return img;
    }

    public void toon() {
        img.toon();
    }
}