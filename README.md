### simple clojurescript project using reagent, tests runners with clj command line wrapper


Run your dev env:

```
clj -A:dev
```

Just open:


`http://localhost:9500/tests.html`



Run clojurescript tests separately:

```
clj -m cljs.main -i tests/testing/core_tests.cljs -e "(cljs.test/run-tests 'testing.core-tests)"

```
