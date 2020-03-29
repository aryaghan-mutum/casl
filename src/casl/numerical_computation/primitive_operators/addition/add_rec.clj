(ns casl.numerical-computation.primitive-operators.addition.add-rec
  (:use [casl.math-util.helper :all ()]))

(defn plus [a b]
  (if (zero? a)
    b
    (add1 (plus (sub1 a) b))))

(println (plus 4 5))
