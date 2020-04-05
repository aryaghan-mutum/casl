;(ns casl.numerical-computation.primitive-operators.division.div-iter
;  (:use [casl.math-util.helper :all ()]))
;
;(defn div [a b]
;  (div-iter a b 1 1))
;
;(defn div-iter [a b count result]
;  (cond (zero? b) (error-handler "error: division by zero")
;        (zero? a) 0)
;         ;if remainder of a and b is zero then do the division using iter
;        (zero? (rem a b))
;  (if (= result a)
;                 (sub1 count)
;                 (div-iter a
;                           b
;                           (add1 count)
;                           (* count b))))
;                 ; if both numer and denom are odd then return numer/denom
;
;
;
;(println (div 2 3))