(ns macros.cond-macro
  (:use [macros.when_macro :all ()]))

(defmacro cond [& clauses]
  (list 'if (first clauses)
        (if (next clauses)
          (second clauses)
          (throw (IllegalArgumentException.
                   "cond requires an even number of forms")))
        (cons 'clojure.core/cond (next (next clauses)))))

;(cond)

