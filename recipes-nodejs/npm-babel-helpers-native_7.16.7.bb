SUMMARY = "NPM: @babel/helpers"
DESCRIPTION = "Collection of helper functions used by Babel transforms."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helpers"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-template-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helpers/-/helpers-7.16.7.tgz"
SRC_URI[md5sum] = "ad6df3256bd8c2a5eb22b8208ad79572"
SRC_URI[sha256sum] = "9291e8e17dd75d1bcad7adfc70b602f9da56624b97eca99ef6269e94806ef0d0"

NPM_PKGNAME = "@babel/helpers"

inherit npmhelper
inherit native
