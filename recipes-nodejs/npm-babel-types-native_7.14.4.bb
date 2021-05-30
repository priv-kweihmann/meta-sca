SUMMARY = "NPM: @babel/types"
DESCRIPTION = "Babel Types is a Lodash-esque utility library for AST nodes"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-types"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-to-fast-properties-native"

SRC_URI = "https://registry.npmjs.org/@babel/types/-/types-7.14.4.tgz"
SRC_URI[md5sum] = "411d5ccf6c5c363eccc62d78b967afdf"
SRC_URI[sha256sum] = "e21678bbe714e0d76c97a71c6843de52ee46235a0f0ee28bb45552c9425af264"

NPM_PKGNAME = "@babel/types"

inherit npmhelper
inherit native
