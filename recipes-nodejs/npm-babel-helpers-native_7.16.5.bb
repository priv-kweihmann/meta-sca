SUMMARY = "NPM: @babel/helpers"
DESCRIPTION = "Collection of helper functions used by Babel transforms."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helpers"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-template-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helpers/-/helpers-7.16.5.tgz"
SRC_URI[md5sum] = "798af5550b5300a83a0bb4e0f6a13b53"
SRC_URI[sha256sum] = "99e5aa25fc3ccf685d800180e0d629d4192b52af09e0d176252c0e8cf847e9a1"

NPM_PKGNAME = "@babel/helpers"

inherit npmhelper
inherit native
