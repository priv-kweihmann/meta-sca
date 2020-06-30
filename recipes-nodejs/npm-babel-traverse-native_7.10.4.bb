SUMMARY = "NPM: @babel/traverse"
DESCRIPTION = "The Babel Traverse module maintains the overall tree state, and is responsible for replacing, removing, and adding nodes"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-code-frame-native \
           npm-babel-generator-native \
           npm-babel-helper-function-name-native \
           npm-babel-helper-split-export-declaration-native \
           npm-babel-parser-native \
           npm-babel-types-native \
           npm-debug-native \
           npm-globals-native \
           npm-lodash-native"

SRC_URI = "https://registry.npmjs.org/@babel/traverse/-/traverse-7.10.4.tgz"
SRC_URI[md5sum] = "44b94539d1bff3725634c7b488589a85"
SRC_URI[sha256sum] = "693efd6b2b8809e7a497c8b46ed692df6581bf5a4e28360ea0f2b76c5988d42c"

NPM_PKGNAME = "@babel/traverse"

inherit npmhelper
inherit native
