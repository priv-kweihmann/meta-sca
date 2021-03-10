SUMMARY = "NPM: @babel/highlight"
DESCRIPTION = "Syntax highlight JavaScript strings for output in terminals."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-highlight"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-chalk-native \
           npm-js-tokens-native"

SRC_URI = "https://registry.npmjs.org/@babel/highlight/-/highlight-7.13.10.tgz"
SRC_URI[md5sum] = "852d33d968fa9e2d84f77b8375ef394e"
SRC_URI[sha256sum] = "0117efd7dbfa94acca0aa82567568872ca2bf4ced8054ee29ce55bbff5a353af"

NPM_PKGNAME = "@babel/highlight"

inherit npmhelper
inherit native
