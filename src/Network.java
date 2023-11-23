/*
* File: app.js
* Author: Németh Angéla
* Copyright: 2023, Németh Angéla
* Group: Szoft 2-1 E
* Date: 2023-11-23
* Github: https://github.com/NemethAngela/
* Licenc: GNU GPL
*/

public class Network implements IConnectable{

    String connect;
    String disconnect;

    public Network(String connect, String disconnect) {
        this.connect=connect;
        this.disconnect=disconnect;
    }

    @Override
    public void connectToNetwork(String networkName) {
        System.out.println("Kapcsolódott a hálózathoz'");
    }
    @Override
    public void disconnectFromNetwork() {
        System.out.println("A kapcsolat megszakadt.'");
    }


    
}
