(ns re-native.cacheable-image
  (:require [reagent.core :as r]
            [re-frame.core :as re]))

(def react-native-cacheable-image (js/require "react-native-cacheable-image"))
(def CacheableImage (aget react-native-cacheable-image "default"))

(assert react-native-cacheable-image)
(assert CacheableImage)

(def cacheable-image (r/adapt-react-class CacheableImage))
