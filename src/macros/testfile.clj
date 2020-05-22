(ns macros.testfile)

(defmacro when [x & body]
  (list 'if x (cons 'do body)))

(defmacro when-falsy [x & body]
  (list 'when x (list 'not x)
        (cons 'do body)))

(macroexpand-1 (when-falsy (= 1 2) (println "hi!")))

(macroexpand '(when-falsy (= 1 2) (println "hi!")))