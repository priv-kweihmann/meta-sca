SUMMARY = "NPM: @babel/helpers"
DESCRIPTION = "Collection of helper functions used by Babel transforms."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helpers"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-template-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helpers/-/helpers-7.15.3.tgz"
SRC_URI[md5sum] = "054bbc3a35c592aa286976420dc47a62"
SRC_URI[sha256sum] = "7b7dd081fa064c6d5c1e57fc28eb9d66d03483f259917a1635d747bec651fd4c"

NPM_PKGNAME = "@babel/helpers"

inherit npmhelper
inherit native
