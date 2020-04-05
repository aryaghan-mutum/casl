(ns casl.numerical-computation.primitive-operators.addition.sum-cubes-iter
  (:use [casl.math-util.helper :all ()]))

(defn sum-cubes [a b]
  (sum-cubes-iter a b 0))

(defn sum-cubes-iter [a b c]
  (let ((m a) (n b))
    (if (> a b)
      c
      (sum-cubes-iter (add1 a)
                      b
                      (cube m)))))

(println (sum-cubes 2 5))
