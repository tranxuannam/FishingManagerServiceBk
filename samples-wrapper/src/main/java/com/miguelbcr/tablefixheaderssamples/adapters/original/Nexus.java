package com.miguelbcr.tablefixheaderssamples.adapters.original;

/**
 * Created by miguel on 13/02/2016.
 */
public class Nexus {
    public final String type;
    public final String[] data;

    public Nexus(String type) {
        this.type = type;
        data = null;
    }

    public Nexus(String name, String company, String version, String api, String storage, String inches, String ram) {
        this.type = null;
        data = new String[] {
                name,
                company,
                version,
                api,
                storage,
                inches,
                ram };
    }

    public Nexus(String type, String name, String company, String version, String api, String storage, String inches, String ram) {
        this.type = type;
        data = new String[] {
                name,
                company,
                version,
                api,
                storage,
                inches,
                ram };
    }

    public boolean isSection() {
        return data == null;
    }
}