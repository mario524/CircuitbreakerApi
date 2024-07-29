package co.com.coding.togegher.enume;

import lombok.Getter;

@Getter
public enum EventEnum {

    DELAY(1, "DELAY"),
    EXCEPTION_NOTFOUND(2, "EXCEPTION_NOTFOUND");

    private int opcion;

    private String event;

    EventEnum(int opcion, String event) {
        this.opcion = opcion;
        this.event = event;
    }
}
