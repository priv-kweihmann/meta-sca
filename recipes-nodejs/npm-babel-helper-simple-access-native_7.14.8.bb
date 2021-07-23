SUMMARY = "NPM: @babel/helper-simple-access"
DESCRIPTION = "Babel helper for ensuring that access to a given value is performed through simple accesses"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-simple-access"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-simple-access/-/helper-simple-access-7.14.8.tgz"
SRC_URI[md5sum] = "54aa9d02858fcc17b5fa684711e73c47"
SRC_URI[sha256sum] = "e3cd867813e230a026b64601705f350aa2d64d1aaccda356cbce1f33e71a3e47"

NPM_PKGNAME = "@babel/helper-simple-access"

inherit npmhelper
inherit native
