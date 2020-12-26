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

SRC_URI = "https://registry.npmjs.org/@babel/traverse/-/traverse-7.12.12.tgz"
SRC_URI[md5sum] = "3facfed4c35d24e9b04990c476bdef8a"
SRC_URI[sha256sum] = "728c21d55fecbc3d6c95e687f8a2c1856d9bafb17decd52cecf229adf7b3e94b"

NPM_PKGNAME = "@babel/traverse"

inherit npmhelper
inherit native
