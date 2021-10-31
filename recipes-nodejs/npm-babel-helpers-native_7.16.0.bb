SUMMARY = "NPM: @babel/helpers"
DESCRIPTION = "Collection of helper functions used by Babel transforms."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helpers"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-template-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helpers/-/helpers-7.16.0.tgz"
SRC_URI[md5sum] = "3942ed5a953ec214e3713eaf88d89cf6"
SRC_URI[sha256sum] = "5e53321b015c2c669edb264fb1d87fcb28ae3e0d62b6e029620278b51100ca17"

NPM_PKGNAME = "@babel/helpers"

inherit npmhelper
inherit native
