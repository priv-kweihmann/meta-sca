SUMMARY = "NPM: @babel/helper-simple-access"
DESCRIPTION = "Babel helper for ensuring that access to a given value is performed through simple accesses"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-simple-access"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-simple-access/-/helper-simple-access-7.12.13.tgz"
SRC_URI[md5sum] = "e84bc3d78539d7dfdf173b23509b9110"
SRC_URI[sha256sum] = "2e4854abdaebdb65d6fde6d39cf8606245a8e8f89c922eab28166433d6cd2105"

NPM_PKGNAME = "@babel/helper-simple-access"

inherit npmhelper
inherit native
