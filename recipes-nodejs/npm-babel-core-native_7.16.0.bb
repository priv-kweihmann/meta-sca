SUMMARY = "NPM: @babel/core"
DESCRIPTION = "Babel compiler core."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-core"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-code-frame-native \
           npm-babel-generator-native \
           npm-babel-helper-compilation-targets-native \
           npm-babel-helper-module-transforms-native \
           npm-babel-helpers-native \
           npm-babel-parser-native \
           npm-babel-template-native \
           npm-babel-traverse-native \
           npm-babel-types-native \
           npm-convert-source-map-native \
           npm-debug-native \
           npm-gensync-native \
           npm-json5-native \
           npm-semver-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/@babel/core/-/core-7.16.0.tgz"
SRC_URI[md5sum] = "41217ee58503ed67420b5e6c6e98e6d2"
SRC_URI[sha256sum] = "3903d0912dacd7937cda934361c5bbc90255b8db493e980c72d5cc09c5b1dc23"

NPM_PKGNAME = "@babel/core"

inherit npmhelper
inherit native
