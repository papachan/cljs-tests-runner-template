### simple clojurescript project using reagent, tests runners with clj command line wrapper

A very basic template to have tests running in Clojurescript without
leiningen tooling. Just clojure command line wrapper.

This project uses following tools and deps:

* Figwheel-main
* cljs-test-display
* reagent
* core.async
* cljs-http
* cljs-ajax



### Browser testing

Run your dev env:

```bash
    $ clj -A:dev
```

- Just open this url:


http://localhost:9500/tests.html


Run clojurescript tests separately:


```bash
    $ clj -m cljs.main -i tests/testing/core_tests.cljs -e "(cljs.test/run-tests 'testing.core-tests)"

```


### Headless Browser Testing


- install node modules:

  ```bash
  $ yarn -i
  ```

Now run:

  ```bash
  $ clj -A:test-headless
  ```

Ouput:


```
Testing testing.core-test

Ran 1 tests containing 1 assertions.
0 failures, 0 errors.
:figwheel.main.testing/success
```
