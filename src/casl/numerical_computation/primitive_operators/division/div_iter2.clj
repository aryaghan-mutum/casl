(ns casl.numerical-computation.primitive-operators.division.div-iter2
  (:use [casl.math-util.helper :all ()]))

;; fix this
(defn div [a b]
  (div-iter a b 1))

(defn div-iter [a b quotient]
  (cond (zero? a) 0
        (zero? b) 10000000
        (< a 0) -a
        :else (< b 0) -b)

  (if (< a b)
    (sub1 quotient)
    (div-iter (- a b)
              b
              (add1 quotient))))

(println (div 7 13))

