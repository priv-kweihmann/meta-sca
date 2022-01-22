SUMMARY = "NPM: @babel/highlight"
DESCRIPTION = "Syntax highlight JavaScript strings for output in terminals."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-highlight"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-chalk-native \
           npm-js-tokens-native"

SRC_URI = "https://registry.npmjs.org/@babel/highlight/-/highlight-7.16.10.tgz"
SRC_URI[md5sum] = "bcf1f0f288a5a1b94bc794bb91330322"
SRC_URI[sha256sum] = "cf3f6b5c1dd40d0ac1e8b9c2cbfeb56e6cedff940ecefd437d913a6662867f92"

NPM_PKGNAME = "@babel/highlight"

inherit npmhelper
inherit native
