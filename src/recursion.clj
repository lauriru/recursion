(ns recursion)

(defn product [coll]
  (if (empty? coll) 1
      (* (first coll) (product (rest coll)))))

(defn singleton? [coll]
  (if (empty? coll) false
      (empty? (rest coll))))

(defn my-last [coll]
  (cond
    (empty? coll) nil
    (singleton? coll) (first coll)
    :else (my-last (rest coll))))


(defn max-element [a-seq]
  (if (empty? a-seq) nil
      (let [fst (first a-seq)
            rst (rest a-seq)]
      (if (empty? rst) fst
      (max fst (max-element rst))))))

(defn seq-max [seq-1 seq-2]
  (if (> (count seq-1) (count seq-2)) seq-1 seq-2))

(defn longest-sequence [a-seq]
  (if (empty? a-seq) nil
      (seq-max (first a-seq) (longest-sequence (rest a-seq)))))

(defn my-filter [pred? a-seq]
  (if (empty? a-seq)
    a-seq
    (let [f (first a-seq)
          r (rest a-seq)]
      (if (pred? f)
        (cons f (my-filter pred? r))
        (my-filter pred? r)))))

(defn sequence-contains? [elem a-seq]
  (cond 
    (empty? a-seq) false
    (= (first a-seq) elem) true
    :else (sequence-contains? elem (rest a-seq))))

(defn my-take-while [pred? a-seq]
  (let [f (first a-seq)
        r (rest a-seq)]
    (cond
      (empty? a-seq) ()
      (pred? f) (cons f (my-take-while pred? r))
      :else ())))
  
(defn my-drop-while [pred? a-seq]
  (let [f (first a-seq)
        r (rest a-seq)]
    (cond
      (empty? a-seq) ()
      (pred? f) (my-drop-while pred? r)
      :else a-seq)))

(defn seq= [a-seq b-seq]
    (let [f1 (first a-seq) f2 (first b-seq)
          r1 (rest a-seq) r2 (rest b-seq)]
      (cond
        (and (empty? a-seq) (empty? b-seq)) true
        (or (empty? a-seq) (empty? b-seq)) false
        (= f1 f2) (seq= r1 r2)
        :else  false)))
      
(defn my-map [f seq-1 seq-2]
  (cond
    (or (empty? seq-1) (empty? seq-2)) ()
    :else (cons (f (first seq-1) (first seq-2)) (my-map f (rest seq-1) (rest seq-2)))))

(defn power [n k]
  (if (or (zero? k) (zero? n)) 1
      (* n (power n (dec k)))))
  

(defn fib [n]
  (cond
    (zero? n) 0
    (<= n 2) 1
    :else (+ (fib (dec n)) (fib (dec (dec n))))))

(defn my-repeat [how-many-times what-to-repeat]
  (cond
    (<= how-many-times 0) ()
    :else (cons what-to-repeat (my-repeat (dec how-many-times) what-to-repeat))))

(defn my-range [up-to]
  (cond
    (<= up-to 0) ()
    :else (let [new-up-to (dec up-to)]
            (cons new-up-to (my-range new-up-to)))))

(defn tails [a-seq]
  (cond
    (empty? a-seq) (cons () ())
    :else (cons (seq a-seq) (tails (rest a-seq)))))

(defn inits [a-seq]
  (map reverse (reverse (tails (reverse a-seq)))))

(defn rotations [a-seq]
  (cond
    (empty? a-seq) (cons () ())
    :else (

(defn my-frequencies-helper [freqs a-seq]
  [:-])

(defn my-frequencies [a-seq]
  [:-])

(defn un-frequencies [a-map]
  [:-])

(defn my-take [n coll]
  [:-])

(defn my-drop [n coll]
  [:-])

(defn halve [a-seq]
  [:-])

(defn seq-merge [a-seq b-seq]
  [:-])

(defn merge-sort [a-seq]
  [:-])

(defn split-into-monotonics [a-seq]
  [:-])

(defn permutations [a-set]
  [:-])

(defn powerset [a-set]
  [:-])

