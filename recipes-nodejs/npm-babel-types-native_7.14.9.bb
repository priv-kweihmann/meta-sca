SUMMARY = "NPM: @babel/types"
DESCRIPTION = "Babel Types is a Lodash-esque utility library for AST nodes"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-types"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-to-fast-properties-native"

SRC_URI = "https://registry.npmjs.org/@babel/types/-/types-7.14.9.tgz"
SRC_URI[md5sum] = "94addfc0068c85868fcc885ef18c15d2"
SRC_URI[sha256sum] = "dd8e55c713003d7b5fe71afbf693c0e546b5749ad0b42086fff9a459d6e284bf"

NPM_PKGNAME = "@babel/types"

inherit npmhelper
inherit native
