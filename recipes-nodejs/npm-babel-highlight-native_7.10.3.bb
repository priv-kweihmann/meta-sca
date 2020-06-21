SUMMARY = "NPM: @babel/highlight"
DESCRIPTION = "Syntax highlight JavaScript strings for output in terminals."
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-chalk-native \
           npm-js-tokens-native"

SRC_URI = "https://registry.npmjs.org/@babel/highlight/-/highlight-7.10.3.tgz"
SRC_URI[md5sum] = "9d9ae78706195126f14dafb3eef72ef1"
SRC_URI[sha256sum] = "bf91e3dde9f75e5df9eb3ba5dfd2416c9419809c040290681a60165f96472643"

NPM_PKGNAME = "@babel/highlight"

inherit npmhelper
inherit native
