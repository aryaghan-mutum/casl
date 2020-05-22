(ns casl.math-util.helper)

(defn sub1 [n] (- n 1))
(defn add1 [n] (+ n 1))
(defn sqr [n] (* n n))
(defn cube [n] (* n (sqr n)))

(defmacro sqr-list [lst]
  (list 'map '#(* % %) lst))

(println (sqr-list (range 10)))

(defmacro sqr-list-m2 [lst]
  `(map #(* % %) ~lst))

(println (sqr-list-m2 (range 10)))

(defmacro sqr-list-m3 [lst]
  `(map (fn [~'x] (* ~'x ~'x)) ~lst))

(println (sqr-list-m3 (range 10)))


(defmacro make-adder [n]
  (let [g (gensym)]
    `(fn [~g] (+ ~n ~g))))

;(println (make-adder 3))
((make-adder (+ 3 3)) 5)

(defmacro safe-math-expression? [exp]
  `(try ~exp
        true
        (catch ArithmeticException e# false)))

;(safe-math-expression?)




