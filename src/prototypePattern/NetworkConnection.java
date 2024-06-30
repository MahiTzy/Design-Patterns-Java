package prototypePattern;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {
    private String connectionType;
    private String connectionIP;
    private String connectionPort;
    private List<String> connectionPorts = new ArrayList<>();

    public NetworkConnection() {
    }

    public String getConnectionIP() {
        return connectionIP;
    }

    public void setConnectionIP(String connectionIP) {
        this.connectionIP = connectionIP;
    }

    public String getConnectionPort() {
        return connectionPort;
    }

    public void setConnectionPort(String connectionPort) {
        this.connectionPort = connectionPort;
    }

    public void getData() throws InterruptedException {
        this.connectionType = "Ethernet";
        this.connectionPorts.add("8080");
        this.connectionPorts.add("8081");
        this.connectionPorts.add("8082");
        Thread.sleep(2000);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setConnectionType(this.connectionType);
        networkConnection.setConnectionIP(this.connectionIP);
        networkConnection.setConnectionPort(this.connectionPort);

        for (String port : this.getConnectionPorts()) {
            networkConnection.getConnectionPorts().add(port);
        }

        return networkConnection;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public List<String> getConnectionPorts() {
        return connectionPorts;
    }

    public void setConnectionPorts(List<String> connectionPorts) {
        this.connectionPorts = connectionPorts;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    @Override
    public String toString() {
        return "NetworkConnection [connectionType=" + connectionType + ", connectionIP=" + connectionIP
                + ", connectionPort=" + connectionPort + ", connectionPorts=" + connectionPorts + "]";
    }

}
