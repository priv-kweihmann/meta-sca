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

SRC_URI = "https://registry.npmjs.org/@babel/core/-/core-7.11.1.tgz"
SRC_URI[md5sum] = "793b0145f1f89e52f30f0820f1165382"
SRC_URI[sha256sum] = "0c4325249d3bb02411e6db15fb2719b02705d8aee60854b874aa49bc6b68bb10"

NPM_PKGNAME = "@babel/core"

inherit npmhelper
inherit native
