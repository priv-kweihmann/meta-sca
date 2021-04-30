SUMMARY = "NPM: @babel/types"
DESCRIPTION = "Babel Types is a Lodash-esque utility library for AST nodes"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-types"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-to-fast-properties-native"

SRC_URI = "https://registry.npmjs.org/@babel/types/-/types-7.14.0.tgz"
SRC_URI[md5sum] = "6cc0948a76af4155fc6e6d19bcac86ee"
SRC_URI[sha256sum] = "41c651020d13f4aa476f9ff2edd6a68cd0110e370753a1e41c7014957e4c860c"

NPM_PKGNAME = "@babel/types"

inherit npmhelper
inherit native
