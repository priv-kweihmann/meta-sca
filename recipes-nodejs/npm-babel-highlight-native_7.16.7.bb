SUMMARY = "NPM: @babel/highlight"
DESCRIPTION = "Syntax highlight JavaScript strings for output in terminals."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-highlight"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-chalk-native \
           npm-js-tokens-native"

SRC_URI = "https://registry.npmjs.org/@babel/highlight/-/highlight-7.16.7.tgz"
SRC_URI[md5sum] = "3c24408a451de066d7fad4c1ca5564fb"
SRC_URI[sha256sum] = "b4c488791b2d2de4642a0872a05b218c5ea028b8ca47c7c86ccca5afbe9ef9d2"

NPM_PKGNAME = "@babel/highlight"

inherit npmhelper
inherit native
