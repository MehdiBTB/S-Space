package edu.ucla.sspace.sim;

import edu.ucla.sspace.common.Similarity;

import edu.ucla.sspace.vector.DoubleVector;
import edu.ucla.sspace.vector.IntegerVector;
import edu.ucla.sspace.vector.Vector;


/**
 * Returns the Pearson Correlation between any two {@link Vector}s. 
 *
 * </p>
 *
 * This metric is symmetric.
 *
 * @author Keith Stevens
 */
public class PearsonCorrelation extends AbstractSymmetricSimilarityFunction {

    /**
     * {@inheritDoc}
     */
    public double sim(DoubleVector v1, DoubleVector v2) {
        return Similarity.correlation(v1, v2);
    }

    /**
     * {@inheritDoc}
     */
    public double sim(IntegerVector v1, IntegerVector v2) {
        return Similarity.correlation(v1, v2);
    }

    /**
     * {@inheritDoc}
     */
    public double sim(Vector v1, Vector v2) {
        return Similarity.correlation(v1, v2);
    }
}
