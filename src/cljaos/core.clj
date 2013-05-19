(ns cljaos.core
  (:use [incanter core charts]))

(defn bif-col [skip samples f x0 r]
  (take-last samples (take (+ skip samples) (iterate (partial f r) x0))))

(defn bif-data [skip samples f x0 r]
  (map list (repeat r) (bif-col skip samples f x0 r)))

(defn bif-scatter [skip samples f x0 ks]
  (apply concat (map (partial bif-data skip samples f x0) ks)))

(defn view-bif 
  ([f x0 ks] (view-bif 100 100 f x0 ks))
  ([skip samples f x0 ks]
    (let [data (bif-scatter skip samples f x0 ks)]
      (view (scatter-plot (map first data) (map second data))) )))