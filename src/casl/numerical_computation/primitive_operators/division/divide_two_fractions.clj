(ns casl.numerical-computation.primitive-operators.division.divide-two-fractions)

(defn reciprocal [n]
  (/ 1 n))

(defn div-fractions [a b]
  (* a (reciprocal b)))

(println (div-fractions 1/6 1/3))                           ;1/2
(println (div-fractions 5 7/3))                             ;15/7