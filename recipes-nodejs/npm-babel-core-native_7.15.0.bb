SUMMARY = "NPM: @babel/core"
DESCRIPTION = "Babel compiler core."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-core"

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

SRC_URI = "https://registry.npmjs.org/@babel/core/-/core-7.15.0.tgz"
SRC_URI[md5sum] = "ac787f2debaab7afa289b11ef9f7984e"
SRC_URI[sha256sum] = "ebd86ef86c1bf844a2f7abdf7cfd300dde29537dd427eed6049f059f3c31d0c2"

NPM_PKGNAME = "@babel/core"

inherit npmhelper
inherit native
