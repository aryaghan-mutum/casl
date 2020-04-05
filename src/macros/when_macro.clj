(ns macros.when_macro)

;; Examples:
(defmacro when [x & body]
  (println (list 'if x (cons 'do body))))

(when (= 2 (+ 1 1))
      (print "you got")
      (print " the touch!")
      (println))                                                     ;(if (= 2 (+ 1 1)) (do (print you got) (print  the touch!) (println)))

(when clauses
      (list 'if (first clauses)
            (if (next clauses)
              (second clauses)
              (throw (IllegalArgumentException.
                       "cond requires an even number of forms")))
            (cons 'clojure.core/cond (next (next clauses)))))        ;(if clauses (do (list (quote if) (first clauses) (if (next clauses) (second clauses) (throw (IllegalArgumentException. cond requires an even number of forms))) (cons (quote clojure.core/cond) (next (next clauses))))))

(defn is-this-number? [n]
  (when (number? n)
        (println "Yes it is a number")))

(is-this-number? 4)

(defn this-is-func [x & body]
  (println (list 'if x (cons 'do body))))

(this-is-func (= 2 (+ 1 1))
              (list "you got")
              (list " the touch!")
              (println))                                              ;(if true (do (you got) ( the touch!) nil))

(defn this-is-func2 []
  (if (= 2 (+ 1 1))
    (do (print "You got")
        (print " the touch!")
        (println))))

(this-is-func2)