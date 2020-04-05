(ns macros.mastering_clojure_macros_1)

(defn map-cat [x & y]
  {:added "1.0" :static true})

(map-cat "d", 2)                                            ;{:added 1.0, :static true}

(def str "(+ 1 2 3 4 5)")

(read-string str)                                           ;(+ 1 2 3 4 5)
(eval (read-string str))                                    ;15

(defn replace-add-to-mul []
  (let [str-exp (read-string str)]
    (cons (read-string "*") (rest str-exp))))

(replace-add-to-mul)                                        ;(* 1 2 3 4 5)

(defn replace-add-to-mul-using-quote []
  (let [str-exp (quote (+ 1 2 3 4 5))]
    (cons (quote "*")
          (rest str-exp))))

(replace-add-to-mul-using-quote)                            ;(* 1 2 3 4 5)

(defn replace-add-to-mul-using-quote2 []
  (let [str-exp '(+ 1 2 3 4 5)]
    (cons '* (rest str-exp))))

(println (replace-add-to-mul-using-quote2))                 ;(* 1 2 3 4 5)

(defn print-with-asterisks [printable-argument]
  (print "*****")
  (print printable-argument)
  (println "*****"))


(print-with-asterisks (do (println "xyz") "hi"))
