SUMMARY = "NPM: @babel/highlight"
DESCRIPTION = "Syntax highlight JavaScript strings for output in terminals."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-highlight"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-chalk-native \
           npm-js-tokens-native"

SRC_URI = "https://registry.npmjs.org/@babel/highlight/-/highlight-7.14.0.tgz"
SRC_URI[md5sum] = "a7164fb60c04809245ab0030cf2697b4"
SRC_URI[sha256sum] = "ed2e07f2c2e6c862267adb493013e97079ed3ad64b1f009b6ed43e87b0980df0"

NPM_PKGNAME = "@babel/highlight"

inherit npmhelper
inherit native
