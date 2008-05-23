;   Copyright (c) Rich Hickey. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Common Public License 1.0 (http://opensource.org/licenses/cpl.php)
;   which can be found in the file CPL.TXT at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.

(in-ns 'int)
(clojure/refer 'clojure :exclude '(+ - * / == < <= > >= zero? pos? neg? inc dec))
(import '(clojure.lang Numbers$I))

(definline + [x y] `(. Numbers$I add ~x ~y))
(definline - [x y] `(. Numbers$I subtract ~x ~y))
(definline * [x y] `(. Numbers$I multiply ~x ~y))
(definline / [x y] `(. Numbers$I divide ~x ~y))
(definline == [x y] `(. Numbers$I equiv ~x ~y))
(definline < [x y] `(. Numbers$I lt ~x ~y))
(definline <= [x y] `(. Numbers$I lte ~x ~y))
(definline > [x y] `(. Numbers$I gt ~x ~y))
(definline >= [x y] `(. Numbers$I gte ~x ~y))
(definline zero? [x] `(. Numbers$I zero ~x))
(definline pos? [x] `(. Numbers$I pos ~x))
(definline neg? [x] `(. Numbers$I neg ~x))
(definline inc [x] `(. Numbers$I inc ~x))
(definline dec [x] `(. Numbers$I dec ~x))
(definline negate [x] `(. Numbers$I negate ~x))

(in-ns 'long)
(clojure/refer 'clojure :exclude '(+ - * / == < <= > >= zero? pos? neg? inc dec))
(import '(clojure.lang Numbers$L))

(definline + [x y] `(. Numbers$L add ~x ~y))
(definline - [x y] `(. Numbers$L subtract ~x ~y))
(definline * [x y] `(. Numbers$L multiply ~x ~y))
(definline / [x y] `(. Numbers$L divide ~x ~y))
(definline == [x y] `(. Numbers$L equiv ~x ~y))
(definline < [x y] `(. Numbers$L lt ~x ~y))
(definline <= [x y] `(. Numbers$L lte ~x ~y))
(definline > [x y] `(. Numbers$L gt ~x ~y))
(definline >= [x y] `(. Numbers$L gte ~x ~y))
(definline zero? [x] `(. Numbers$L zero ~x))
(definline pos? [x] `(. Numbers$L pos ~x))
(definline neg? [x] `(. Numbers$L neg ~x))
(definline inc [x] `(. Numbers$L inc ~x))
(definline dec [x] `(. Numbers$L dec ~x))
(definline negate [x] `(. Numbers$L negate ~x))

(in-ns 'float)
(clojure/refer 'clojure :exclude '(+ - * / == < <= > >= zero? pos? neg? inc dec))
(import '(clojure.lang Numbers$F))

(definline + [x y] `(. Numbers$F add ~x ~y))
(definline - [x y] `(. Numbers$F subtract ~x ~y))
(definline * [x y] `(. Numbers$F multiply ~x ~y))
(definline / [x y] `(. Numbers$F divide ~x ~y))
(definline == [x y] `(. Numbers$F equiv ~x ~y))
(definline < [x y] `(. Numbers$F lt ~x ~y))
(definline <= [x y] `(. Numbers$F lte ~x ~y))
(definline > [x y] `(. Numbers$F gt ~x ~y))
(definline >= [x y] `(. Numbers$F gte ~x ~y))
(definline zero? [x] `(. Numbers$F zero ~x))
(definline pos? [x] `(. Numbers$F pos ~x))
(definline neg? [x] `(. Numbers$F neg ~x))
(definline inc [x] `(. Numbers$F inc ~x))
(definline dec [x] `(. Numbers$F dec ~x))
(definline negate [x] `(. Numbers$F negate ~x))

(in-ns 'double)
(clojure/refer 'clojure :exclude '(+ - * / == < <= > >= zero? pos? neg? inc dec))
(import '(clojure.lang Numbers$D))

(definline + [x y] `(. Numbers$D add ~x ~y))
(definline - [x y] `(. Numbers$D subtract ~x ~y))
(definline * [x y] `(. Numbers$D multiply ~x ~y))
(definline / [x y] `(. Numbers$D divide ~x ~y))
(definline == [x y] `(. Numbers$D equiv ~x ~y))
(definline < [x y] `(. Numbers$D lt ~x ~y))
(definline <= [x y] `(. Numbers$D lte ~x ~y))
(definline > [x y] `(. Numbers$D gt ~x ~y))
(definline >= [x y] `(. Numbers$D gte ~x ~y))
(definline zero? [x] `(. Numbers$D zero ~x))
(definline pos? [x] `(. Numbers$D pos ~x))
(definline neg? [x] `(. Numbers$D neg ~x))
(definline inc [x] `(. Numbers$D inc ~x))
(definline dec [x] `(. Numbers$D dec ~x))
(definline negate [x] `(. Numbers$D negate ~x))
