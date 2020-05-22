(ns macros.and-macro)

(defmacro and
  ([] true)
  ([x] x)
  ([x & next]
   `(let [and# ~x]
      (if and# (and ~@next) and#))))

(and (= 1 1) (= 1 1))

