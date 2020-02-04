(defn bhaskara_raizes
  [a b c delta]
  (def x1 (/ (- (* -1 b) (Math/sqrt delta)) (* 2 a) ) )
  (def x2 (/ (+ (* -1 b) (Math/sqrt delta)) (* 2 a) ) )
  (println "delta: " delta  )
  (println "x1: " x1 )
  (println "x2: " x2 )
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
