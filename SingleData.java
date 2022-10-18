
package javaapplication1;

public class SingleData {
    private static SingleData instance = new SingleData();
    private String data = "default data";
    private SingleData() {
    }
    public static SingleData getInstance() {
        return instance;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
}
