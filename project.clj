(defproject casl "0.1.0-SNAPSHOT"

  :description "Computing Algorithms using Symbolic Language"

  :url "http://example.com/FIXME"

  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.trace "0.7.10"]]

  :main ^:skip-aot casl.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})