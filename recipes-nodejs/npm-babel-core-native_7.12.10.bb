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
           npm-semver-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/@babel/core/-/core-7.12.10.tgz"
SRC_URI[md5sum] = "7b6fca5a460f09729fd2b5aa05e75c62"
SRC_URI[sha256sum] = "77478bc9855682349a40ecc3ff4f00329f47989dcca3f6379a7585201fecb6dd"

NPM_PKGNAME = "@babel/core"

inherit npmhelper
inherit native
