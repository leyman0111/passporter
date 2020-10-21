package ru.fmeter.model;

public enum DeviceType {
    TD_100(0, "td100"),
    TD_150(1, "td150"),
    TD_500(2, "td500"),
    TD_600(3, "td600"),
    DU_180(4, "du180"),
    DB_2(5, "db2"),
    C_200_M(6, "c200m"),
    TD_ONLINE(7, "tdonline"),
    DU_BLE(8, "duble"),
    TD_BLE(9, "tdble");

    private int code;
    private String name;

    DeviceType(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public DeviceType findByCode(int code) {
        for (DeviceType deviceType : DeviceType.values())
            if (deviceType.code == code) return deviceType;
        return null;
    }

    public DeviceType findByName(String name) {
        for (DeviceType deviceType : DeviceType.values())
            if (deviceType.name.equalsIgnoreCase(name)) return deviceType;
        return null;
    }
}
