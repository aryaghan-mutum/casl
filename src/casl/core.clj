(ns casl.core
  (:gen-class))

(defn -main [& args]
  (println "Hello, World!"))

(defn add [x y] (+ x y))
(defn sub [x y] (- x y))
;
;(defn fib [n]
;  (if (= n 0)
;    0
;    (+ (fib (- n 1) (fib (- n 2))))))

(defn fib-iterate [m]
  (->> (iterate (fn [[x y]] [y (+' x y)]) [0 1])
       (take m)
       (map first)))

(defn fib [n]
  (if (<= n 2)
    1
    (+ (fib (- n 1)) (fib (- n 2)))))

(def x 2)
(def y 3)
(println (add x y))
(println (sub x y))
(println (fib-iterate 10))
(println (fib 10))