SUMMARY = "NPM: @babel/highlight"
DESCRIPTION = "Syntax highlight JavaScript strings for output in terminals."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-highlight"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-chalk-native \
           npm-js-tokens-native"

SRC_URI = "https://registry.npmjs.org/@babel/highlight/-/highlight-7.14.5.tgz"
SRC_URI[md5sum] = "14101f561647f7cb3981db828412232c"
SRC_URI[sha256sum] = "80f5c14890f61f926dc501dc6628df541f328d8dc2fca1da33144f6c9207e8d4"

NPM_PKGNAME = "@babel/highlight"

inherit npmhelper
inherit native
