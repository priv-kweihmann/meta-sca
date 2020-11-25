SUMMARY = "NPM: @babel/core"
DESCRIPTION = "Babel compiler core."
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-code-frame-native \
           npm-babel-generator-native \
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
           npm-lodash-native \
           npm-resolve-native \
           npm-semver-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/@babel/core/-/core-7.12.9.tgz"
SRC_URI[md5sum] = "0f7f85bac7c6e68d3cd7a138fa34dd2b"
SRC_URI[sha256sum] = "5735f6d4256f0e81b5c3ba1c0a0df1f9364c9955987829a4c84d5f5a20074381"

NPM_PKGNAME = "@babel/core"

inherit npmhelper
inherit native
