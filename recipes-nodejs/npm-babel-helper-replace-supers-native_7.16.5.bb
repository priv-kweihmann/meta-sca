SUMMARY = "NPM: @babel/helper-replace-supers"
DESCRIPTION = "Helper function to replace supers"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-replace-supers"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-environment-visitor-native \
           npm-babel-helper-member-expression-to-functions-native \
           npm-babel-helper-optimise-call-expression-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-replace-supers/-/helper-replace-supers-7.16.5.tgz"
SRC_URI[md5sum] = "32d4aea884264c11ae3b98d5dc825074"
SRC_URI[sha256sum] = "61e7c1c0dd89223ed260e04dd62366c3631f3ee0ae8dc1f0770b7735050bc4ec"

NPM_PKGNAME = "@babel/helper-replace-supers"

inherit npmhelper
inherit native
