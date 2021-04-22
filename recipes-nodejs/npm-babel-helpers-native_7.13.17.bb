SUMMARY = "NPM: @babel/helpers"
DESCRIPTION = "Collection of helper functions used by Babel transforms."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helpers"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-template-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helpers/-/helpers-7.13.17.tgz"
SRC_URI[md5sum] = "95cbf405d0989f10cd94e3b3d4da4831"
SRC_URI[sha256sum] = "6f521d813077acd7f89209a57c35add6346abc1a958f2a4b122041905f374aa8"

NPM_PKGNAME = "@babel/helpers"

inherit npmhelper
inherit native
