package com.designpatterns.strategy;

public class StrategyConsumer {
    private IRunStrategy runStrategy;

    public StrategyConsumer(IRunStrategy runStrategy) {
        this.runStrategy = runStrategy;
    }

    public void startRunning() {
        this.runStrategy.run();
    }

    //Helper static methdo to run the consumber with the strategies
    public static void main(String[] args) {
        StrategyConsumer slowConsumer = new StrategyConsumer(new SlowRunnerStrategy());
        slowConsumer.startRunning();

        StrategyConsumer fastConsumer = new StrategyConsumer(new SpeedRunnerStrategy());
        fastConsumer.startRunning();
    }
}