(ns casl.numerical-computation.primitive-operators.addition.sum-cubes-rec
  (:use [casl.math-util.helper :all ()]))

(defn sum-cubes [a b]
  (if (> a b)
    0
    (+ (cube a)
       (sum-cubes (add1 a) b))))

(println (sum-cubes 2 5))
