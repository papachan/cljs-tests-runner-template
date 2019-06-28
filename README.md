### simple clojurescript project using reagent, tests runners with clj command line wrapper

A very basic template to have tests running in Clojurescript without
leiningen tooling. Just clojure command line wrapper.

This project uses following tools and deps:

* Figwheel-main
* cljs-test-display
* reagent
* core.async
* cljs-http and cljs-ajax


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
