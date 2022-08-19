package com.aurionpro.model;

public abstract class Game {

    abstract void gym();
    abstract void jogging();
    public final void warmUp(){
        gym();
        jogging();
    }

    abstract void planning();
    abstract void play();
    public final void StartPlaying()
    {
        planning();
        play();
    }


    abstract void win();
    abstract void congratulate();
    public final void  endPlaying(){
        win();
        congratulate();
    }
}


