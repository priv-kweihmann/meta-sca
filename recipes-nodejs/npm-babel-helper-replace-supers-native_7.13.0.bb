SUMMARY = "NPM: @babel/helper-replace-supers"
DESCRIPTION = "Helper function to replace supers"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-replace-supers"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-member-expression-to-functions-native \
           npm-babel-helper-optimise-call-expression-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-replace-supers/-/helper-replace-supers-7.13.0.tgz"
SRC_URI[md5sum] = "16c7442742c70f5ae1fea5a59cdda1dd"
SRC_URI[sha256sum] = "c909374926e92547e2ffaa19e6bede32223cfe8ae80b687a122ba674d0844c3a"

NPM_PKGNAME = "@babel/helper-replace-supers"

inherit npmhelper
inherit native
