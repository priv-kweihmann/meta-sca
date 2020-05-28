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

SRC_URI = "https://registry.npmjs.org/@babel/core/-/core-7.10.1.tgz"
SRC_URI[md5sum] = "04f76cabe605a7771e0228405fc51e01"
SRC_URI[sha256sum] = "34b7f74ea302bde08892b81cf70d61c420aa0c20ccb149a886d9e6e7d143623e"

NPM_PKGNAME = "@babel/core"

inherit npmhelper
inherit native
