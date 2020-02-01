(defn bhaskara_raizes
  [a b c delta]
  (println(/ (- (* -1 b) (Math/sqrt delta)) (* 2 a) ))
  (print (/ (+ (* -1 b) (Math/sqrt delta)) (* 2 a) ))
  )

(defn bhaskara
[a b c]
  (def delta (- (* b b) (* 4 a c)))
  (cond
    (< delta 0) "sem raiz"
    (>= delta 0) (bhaskara_raizes a b c delta)
    
    :else "zero")
)

(bhaskara 1 4 -5)
