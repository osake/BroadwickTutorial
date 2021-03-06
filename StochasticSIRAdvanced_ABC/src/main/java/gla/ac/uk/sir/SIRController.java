package gla.ac.uk.sir;

import broadwick.stochastic.SimulationController;
import broadwick.stochastic.StochasticSimulator;
import lombok.Getter;
import lombok.Setter;

/**
 * A simple implementation of a {@link SimulationController} causing the simulation to stop after a given time.
 */
class SIRController implements SimulationController {

    /**
     * Creates the controller for a given time where the simulation has to stop.
     * @param maxTime the maximum time the simulation should run. Once the simulation time reaches this value, goOn()
     *                will return false.
     */
    public SIRController(final double maxTime) {
        this.maxTime = maxTime;
    }

    @Override
    public boolean goOn(final StochasticSimulator process) {
        return process.getCurrentTime() < maxTime;
    }

    @Getter
    @Setter
    private double maxTime;

}
