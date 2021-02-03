SUMMARY = "NPM: @babel/helpers"
DESCRIPTION = "Collection of helper functions used by Babel transforms."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helpers"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-template-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helpers/-/helpers-7.12.13.tgz"
SRC_URI[md5sum] = "580610ed8e4e8c7a416fa66bf972b22c"
SRC_URI[sha256sum] = "146b595a980720a5e0e98c7e04fdab2b72c41843a3c0189978b2bd5489439364"

NPM_PKGNAME = "@babel/helpers"

inherit npmhelper
inherit native
