SUMMARY = "NPM: @babel/traverse"
DESCRIPTION = "The Babel Traverse module maintains the overall tree state, and is responsible for replacing, removing, and adding nodes"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-traverse"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-code-frame-native \
           npm-babel-generator-native \
           npm-babel-helper-function-name-native \
           npm-babel-helper-hoist-variables-native \
           npm-babel-helper-split-export-declaration-native \
           npm-babel-parser-native \
           npm-babel-types-native \
           npm-debug-native \
           npm-globals-native"

SRC_URI = "https://registry.npmjs.org/@babel/traverse/-/traverse-7.14.9.tgz"
SRC_URI[md5sum] = "59852928ba38138d36a4e1f642da60c0"
SRC_URI[sha256sum] = "83791768049c931055167abd288864c4a55232c2522e0e71bd2e50f524e8c637"

NPM_PKGNAME = "@babel/traverse"

inherit npmhelper
inherit native
