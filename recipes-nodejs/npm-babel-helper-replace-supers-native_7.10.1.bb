SUMMARY = "NPM: @babel/helper-replace-supers"
DESCRIPTION = "Helper function to replace supers"
HOMEPAGE = "https://github.com/babel/babel#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-member-expression-to-functions-native \
           npm-babel-helper-optimise-call-expression-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-replace-supers/-/helper-replace-supers-7.10.1.tgz"
SRC_URI[md5sum] = "7c1c2d7b8684d5163b7a86904d27fbf7"
SRC_URI[sha256sum] = "c07981826906a8aab3e08d013b5320dab419ae7e11858d6357d63476262aaed4"

NPM_PKGNAME = "@babel/helper-replace-supers"

inherit npmhelper
inherit native
