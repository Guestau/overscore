(defproject overscore "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojure/tools.logging "0.2.3"]
                 [overtone "0.7.1"]
                 ;[incanter "1.5.0-SNAPSHOT"]
                 [org.encog/encog-core "3.1.0"]
                 [enclog "0.5.8-SNAPSHOT"]]
  ;:source-paths ["opencv-2.4.9.jar"]
  ;:jvm-opts ["-Djava.library.path=/usr/local/lib"]
  :offline? true
  :main overscore.main)
