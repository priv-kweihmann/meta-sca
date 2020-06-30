SUMMARY = "NPM: @babel/highlight"
DESCRIPTION = "Syntax highlight JavaScript strings for output in terminals."
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-chalk-native \
           npm-js-tokens-native"

SRC_URI = "https://registry.npmjs.org/@babel/highlight/-/highlight-7.10.4.tgz"
SRC_URI[md5sum] = "006c01371007436d4dc43b818d5dc788"
SRC_URI[sha256sum] = "20b607fd904d899edf3a5c71afaa2b595fb5d079f7a064e2b0e2465892f6bd4a"

NPM_PKGNAME = "@babel/highlight"

inherit npmhelper
inherit native
