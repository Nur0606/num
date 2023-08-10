public abstract class Device {
    private String name;

    public Device(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String soundes(){
        return "soundes";
    }

    @Override
    public String toString() {
        return "hello{" +
                "aty='" + name + '\'' +
                '}';
    }


    public abstract String sound();
}


