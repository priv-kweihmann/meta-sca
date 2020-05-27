SUMMARY = "NPM: @babel/types"
DESCRIPTION = "Babel Types is a Lodash-esque utility library for AST nodes"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-lodash-native \
           npm-to-fast-properties-native"

SRC_URI = "https://registry.npmjs.org/@babel/types/-/types-7.10.0.tgz"
SRC_URI[md5sum] = "8b10f402a128bf6b80a691623bb700fb"
SRC_URI[sha256sum] = "1d391412a3a97e1bd86e4edc08f15391ed88a85a67440edf05ad23041fbe67d4"

NPM_PKGNAME = "@babel/types"

inherit npmhelper
inherit native
