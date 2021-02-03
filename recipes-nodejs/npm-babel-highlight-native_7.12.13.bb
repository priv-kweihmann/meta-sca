SUMMARY = "NPM: @babel/highlight"
DESCRIPTION = "Syntax highlight JavaScript strings for output in terminals."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-highlight"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-chalk-native \
           npm-js-tokens-native"

SRC_URI = "https://registry.npmjs.org/@babel/highlight/-/highlight-7.12.13.tgz"
SRC_URI[md5sum] = "55ef0df1b744cf4957c1ac4c8283ad13"
SRC_URI[sha256sum] = "0b7c3a161e990fc34f22549b01436e8116c2d0038e47b6aaecb27be602ea852d"

NPM_PKGNAME = "@babel/highlight"

inherit npmhelper
inherit native
