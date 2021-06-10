SUMMARY = "NPM: @babel/helper-simple-access"
DESCRIPTION = "Babel helper for ensuring that access to a given value is performed through simple accesses"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-simple-access"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-simple-access/-/helper-simple-access-7.14.5.tgz"
SRC_URI[md5sum] = "fe075317afbbc59b0c28f4264658099e"
SRC_URI[sha256sum] = "bd66a72ef66051c9f4ce21b3ad6d90d0889525c274179d37ea787c1ca8d1ca2d"

NPM_PKGNAME = "@babel/helper-simple-access"

inherit npmhelper
inherit native
