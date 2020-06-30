SUMMARY = "NPM: @babel/helper-simple-access"
DESCRIPTION = "Babel helper for ensuring that access to a given value is performed through simple accesses"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-template-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-simple-access/-/helper-simple-access-7.10.4.tgz"
SRC_URI[md5sum] = "cffbbad38cd95c47f9a84096f1ca2e51"
SRC_URI[sha256sum] = "74893b39a7ee8aecd7b6fbd2f81b9ad22327fd4a65117ab4014ec119d872147f"

NPM_PKGNAME = "@babel/helper-simple-access"

inherit npmhelper
inherit native
