package edu.ucla.sspace.sim;

import edu.ucla.sspace.vector.DoubleVector;
import edu.ucla.sspace.vector.IntegerVector;
import edu.ucla.sspace.vector.Vector;
import edu.ucla.sspace.vector.VectorMath;


/**
 * Returns {@code 1}, always.
 *
 * </p>
 *
 * This metric is symmetric.
 *
 * @author Keith Stevens
 */
public class OneSimilarity extends AbstractSymmetricSimilarityFunction {

    /**
     * {@inheritDoc}
     */
    public double sim(DoubleVector v1, DoubleVector v2) {
        return 1;
    }

    /**
     * {@inheritDoc}
     */
    public double sim(IntegerVector v1, IntegerVector v2) {
        return 1;
    }

    /**
     * {@inheritDoc}
     */
    public double sim(Vector v1, Vector v2) {
        return 1;
    }
}
