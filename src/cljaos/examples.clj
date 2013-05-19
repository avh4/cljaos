(ns cljaos.examples
  (:require [incanter.core]))

(defn logistic [r xn] (* r xn (- 1 xn)))
; (view-bif logistic 0.1 (range 1 4 0.01))

(defn gauss [a b xn] (+ (incanter.core/exp (* (- a) xn xn)) b))
; (view-bif (partial gauss 4.90) 0.1 (range -1 1 0.01))
; (view-bif #(gauss %1 -0.5 %2) 0.1 (range 1 6 0.01))

(defn tent [u xn]
  (if (< xn 1/2)
      (* u xn)
      (* u (- 1 xn)) ))
; (view-bif 1000 100 tent 0.5 (range 1 2 0.01))
