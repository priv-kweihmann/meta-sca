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

SRC_URI = "https://registry.npmjs.org/@babel/core/-/core-7.14.2.tgz"
SRC_URI[md5sum] = "4b12fb0e725d90833cc41c956db6123f"
SRC_URI[sha256sum] = "c0bf2dbc4714cdb6341001b120d4a99b6919ffe4960aa4fb9ffbcab8e1b11616"

NPM_PKGNAME = "@babel/core"

inherit npmhelper
inherit native
