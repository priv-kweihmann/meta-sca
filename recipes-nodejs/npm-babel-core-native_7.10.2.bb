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

SRC_URI = "https://registry.npmjs.org/@babel/core/-/core-7.10.2.tgz"
SRC_URI[md5sum] = "9358d953d9454b73e6171d8ecfa95dcd"
SRC_URI[sha256sum] = "837a58f4a1e85ea3d7902ddb92870c79a21d88408d3758fd0ce7fbf9182c8b40"

NPM_PKGNAME = "@babel/core"

inherit npmhelper
inherit native
