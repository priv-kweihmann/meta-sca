SUMMARY = "NPM: @babel/helper-replace-supers"
DESCRIPTION = "Helper function to replace supers"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-member-expression-to-functions-native \
           npm-babel-helper-optimise-call-expression-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-replace-supers/-/helper-replace-supers-7.12.11.tgz"
SRC_URI[md5sum] = "4a843f17557eed46094fc3f4baf5e14f"
SRC_URI[sha256sum] = "5bf9a64bd32a93bc60bf7468bff3a12f1453b07b40b115fd8e0568a3ae5a2dfc"

NPM_PKGNAME = "@babel/helper-replace-supers"

inherit npmhelper
inherit native
