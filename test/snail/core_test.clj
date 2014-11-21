(ns snail.core-test
  (:require [clojure.test :refer :all]
            [snail.core :refer :all]))

(deftest right-test
  (testing "right test"
    (let [m [[1 2 3 4][5 6 7 8][9 10 11 12][13 14 15 16]]]
      (is (= (right m) [1 2 3 4])))))

(deftest down-test
  (testing "down test"
    (let [m [[1 2 3 4][5 6 7 8][9 10 11 12][13 14 15 16]]]
      (is (= (down m) [8 12 16])))))

(deftest left-test
  (testing "left test"
    (let [m [[1 2 3 4][5 6 7 8][9 10 11 12][13 14 15 16]]]
      (is (= (left m) [15 14 13])))))

(deftest up-test
  (testing "up test"
    (let [m [[1 2 3 4][5 6 7 8][9 10 11 12][13 14 15 16]]]
      (is (= (up m) [9 5])))))

(deftest border-test
  (testing "border test"
    (let [m [[1 2 3 4][5 6 7 8][9 10 11 12][13 14 15 16]]]
      (is (= (border m) [1 2 3 4 8 12 16 15 14 13 9 5])))))

(deftest submatrix-test
  (testing "submatrix test"
    (let [m [[1 2 3 4][5 6 7 8][9 10 11 12][13 14 15 16]]]
      (is (= (submatrix m) [[6 7][10 11]])))))

(deftest snail-test
  (testing "snail test"
    (let [m [[1 2 3 4][5 6 7 8][9 10 11 12][13 14 15 16]]]
      (is (= (snail m) [1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10])))))
