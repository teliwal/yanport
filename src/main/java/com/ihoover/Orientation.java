package com.ihoover;

public enum Orientation {

    N("North"){
        @Override
        public Orientation turnRight(){ return E;}
        @Override
        public Orientation turnLeft(){ return W;}
    },
    E("East"){
        @Override
        public Orientation turnRight(){ return S;}
        @Override
        public Orientation turnLeft(){ return N;}
    },
    W("West"){
        @Override
        public Orientation turnRight(){ return N;}
        @Override
        public Orientation turnLeft(){ return S;}
    },
    S("South"){
        @Override
        public Orientation turnRight(){ return W;}
        @Override
        public Orientation turnLeft(){ return E;}
    };

    private String label;

    Orientation(String label){
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public abstract Orientation turnRight();

    public abstract Orientation turnLeft();
}
