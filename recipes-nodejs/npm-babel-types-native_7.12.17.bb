SUMMARY = "NPM: @babel/types"
DESCRIPTION = "Babel Types is a Lodash-esque utility library for AST nodes"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-types"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-lodash-native \
           npm-to-fast-properties-native"

SRC_URI = "https://registry.npmjs.org/@babel/types/-/types-7.12.17.tgz"
SRC_URI[md5sum] = "f8631ea0f54b5c926c340a10c6c724be"
SRC_URI[sha256sum] = "7e95bba926d051400f1364cfc07a369de961f3e4599014cc336f9ff8c152981a"

NPM_PKGNAME = "@babel/types"

inherit npmhelper
inherit native
