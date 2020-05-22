(defproject casl "0.1.0-SNAPSHOT"

  :description "Computing Algorithms using Symbolic Language"

  :url "http://example.com/FIXME"

  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.trace "0.7.10"]
                 [org.clojure/tools.macro "0.1.2"]
                 [riddley "0.2.0"]
                 [potemkin "0.4.5"]
                 ]

  :main ^:skip-aot casl.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
