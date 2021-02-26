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
           npm-lodash-native \
           npm-semver-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/@babel/core/-/core-7.13.1.tgz"
SRC_URI[md5sum] = "0bd90d3f3a1017b0c052923f63de602c"
SRC_URI[sha256sum] = "bba8ef486e7624e9708e06b64076baf2c5275ccdd1e43b155f7e24e6491ba961"

NPM_PKGNAME = "@babel/core"

inherit npmhelper
inherit native
