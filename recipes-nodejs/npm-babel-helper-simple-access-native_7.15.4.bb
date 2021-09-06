SUMMARY = "NPM: @babel/helper-simple-access"
DESCRIPTION = "Babel helper for ensuring that access to a given value is performed through simple accesses"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-simple-access"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-simple-access/-/helper-simple-access-7.15.4.tgz"
SRC_URI[md5sum] = "b6a771e20191b2df435794d1540ad6d4"
SRC_URI[sha256sum] = "ddde8de7d5d1b66700bb301b3f1047f15aae9b7126d26ebe32bf794902c5c4a8"

NPM_PKGNAME = "@babel/helper-simple-access"

inherit npmhelper
inherit native
