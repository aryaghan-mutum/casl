(ns casl.numerical-computation.primitive-operators.addition.add-iter-process
  (:use [casl.math-util.helper :all ()]))

(use 'clojure.tools.trace)

(defn plus [a b]
  (if (zero? a)
    b
    (plus (sub1 a) (add1 b))))

(println (plus 4 5))
