# cljaos

Experiment with chaotic systems in clojure

## Usage

    lein repl

    (use '(cljaos core examples))
    (view-bif logistic 0.1 (range 1 4 0.01))
    (view-bif (partial gauss 4.90) 0.1 (range -1 1 0.01))
    (view-bif 1000 100 tent 0.5 (range 1 2 0.01))

## License

Copyright © 2013 Aaron VonderHaar

Distributed under the Eclipse Public License, the same as Clojure.
