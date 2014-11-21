(ns snail.core
  (:require [clojure.core.match :as match]))

(defn right [m]
  (first m))

(defn down [m]
  (map last (drop 1 m)))

(defn left [m]
  (reverse (drop-last (last m))))

(defn up [m]
  (reverse (map first (drop-last (drop 1 m)))))

(defn border [m]
  (concat (concat (right m) (down m)) (concat (left m) (up m))))

(defn submatrix [m]
  (map #(drop 1 %) (map drop-last (drop-last (drop 1 m)))))

(defn snail [m]
  (match/match (count m)
    0 []
    :else (concat (border m) (snail (submatrix m)))))
