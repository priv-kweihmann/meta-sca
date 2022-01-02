SUMMARY = "NPM: @babel/helper-simple-access"
DESCRIPTION = "Babel helper for ensuring that access to a given value is performed through simple accesses"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-simple-access"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-simple-access/-/helper-simple-access-7.16.7.tgz"
SRC_URI[md5sum] = "04fc4c5e57b1f7c07f524259c792b13c"
SRC_URI[sha256sum] = "08e167f023c3100ec4cfc438eddb6c4945f0fdf85668e692b6ed016194da934a"

NPM_PKGNAME = "@babel/helper-simple-access"

inherit npmhelper
inherit native
