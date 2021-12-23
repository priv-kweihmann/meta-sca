SUMMARY = "NPM: is-date-object"
DESCRIPTION = "Is this value a JS Date object? This module works cross-realm/iframe, and despite ES6 @@toStringTag."
HOMEPAGE = "https://github.com/inspect-js/is-date-object#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = "npm-has-tostringtag-native"

SRC_URI = "https://registry.npmjs.org/is-date-object/-/is-date-object-1.0.5.tgz"
SRC_URI[md5sum] = "3b3393d413d848d50129f3f80d37e86a"
SRC_URI[sha256sum] = "3312b2b10df8e3f2465948a62e1c6cfb9007edb7ea9c9f8d81b0bb8afbeec5d4"

NPM_PKGNAME = "is-date-object"

inherit npmhelper
inherit native
