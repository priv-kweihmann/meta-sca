SUMMARY = "NPM: @babel/helpers"
DESCRIPTION = "Collection of helper functions used by Babel transforms."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helpers"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-template-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helpers/-/helpers-7.14.8.tgz"
SRC_URI[md5sum] = "b72a61ca1d0cf335e0af675daaa6e267"
SRC_URI[sha256sum] = "a1e1da9c1108a9df328326edfa2ace6526a660bad8490e3903fdd230899bab71"

NPM_PKGNAME = "@babel/helpers"

inherit npmhelper
inherit native
