# cljaos

Experiment with chaotic systems in clojure

## Usage

Get cljaos:
```bash
git clone https://github.com/avh4/cljaos.git
cd cljaos
```

Start the REPL:
```bash
lein repl
```

Plot some bifurication diagrams:
```clojure
(use '(cljaos core examples))
(view-bif logistic 0.1 (range 1 4 0.01))
(view-bif (partial gauss 4.90) 0.1 (range -1 1 0.01))
(view-bif 1000 100 tent 0.5 (range 1 2 0.01))
```

## License

Copyright © 2013 Aaron VonderHaar

Distributed under the Eclipse Public License, the same as Clojure.
