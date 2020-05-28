SUMMARY = "NPM: @babel/helper-simple-access"
DESCRIPTION = "Babel helper for ensuring that access to a given value is performed through simple accesses"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-template-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-simple-access/-/helper-simple-access-7.10.1.tgz"
SRC_URI[md5sum] = "5c12eb0ca2d3345b45d2ccbb39b46169"
SRC_URI[sha256sum] = "5bb35e9849f8d3879e7185fb80078a7615c459572b80eab52ed42726f16b1f82"

NPM_PKGNAME = "@babel/helper-simple-access"

inherit npmhelper
inherit native
