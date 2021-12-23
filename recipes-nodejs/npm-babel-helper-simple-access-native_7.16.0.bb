SUMMARY = "NPM: @babel/helper-simple-access"
DESCRIPTION = "Babel helper for ensuring that access to a given value is performed through simple accesses"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-simple-access"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-simple-access/-/helper-simple-access-7.16.0.tgz"
SRC_URI[md5sum] = "955ce29e0e9da5573ccf8e053875db31"
SRC_URI[sha256sum] = "ab82632a4bf4152a266b2725cbba46fa323f654c6a9d2736916bc685af284f51"

NPM_PKGNAME = "@babel/helper-simple-access"

inherit npmhelper
inherit native
