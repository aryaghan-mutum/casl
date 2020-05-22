(ns macros.assert-macro)

;(defmacro my-assert [x]
;  (when *assert*
;    (list 'when-not x
;          (list 'throw
;                (list 'new 'AssertionError
;                      (list 'str "Assert failed: "
;                            (list 'pr-str (list 'quote x))))))))


(defmacro my-assert [x]
  (when *assert*
    `(when-not ~x
       (throw (new AssertionError
                   (str "Assert failed: "
                        (pr-str '~x)))))))

(macroexpand '(my-assert (= 4 6)))


