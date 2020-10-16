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

SRC_URI = "https://registry.npmjs.org/@babel/traverse/-/traverse-7.12.1.tgz"
SRC_URI[md5sum] = "e8163e1bd6b9ac2ed91ac9b64f24c220"
SRC_URI[sha256sum] = "a1b104d910673a95f2fe34ec2fc5c1f155164aaa833f9ec159028a85a21da6ac"

NPM_PKGNAME = "@babel/traverse"

inherit npmhelper
inherit native
