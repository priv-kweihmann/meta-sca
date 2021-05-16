SUMMARY = "NPM: @babel/traverse"
DESCRIPTION = "The Babel Traverse module maintains the overall tree state, and is responsible for replacing, removing, and adding nodes"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-traverse"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-code-frame-native \
           npm-babel-generator-native \
           npm-babel-helper-function-name-native \
           npm-babel-helper-split-export-declaration-native \
           npm-babel-parser-native \
           npm-babel-types-native \
           npm-debug-native \
           npm-globals-native"

SRC_URI = "https://registry.npmjs.org/@babel/traverse/-/traverse-7.14.2.tgz"
SRC_URI[md5sum] = "9f7ea6cd2583ae056654a4ed295db07b"
SRC_URI[sha256sum] = "ba82ae358b5fa2e95703d0d35f594d02c86f372dd26c3d9a4390586d059a967b"

NPM_PKGNAME = "@babel/traverse"

inherit npmhelper
inherit native
