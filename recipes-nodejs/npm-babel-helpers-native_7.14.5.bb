SUMMARY = "NPM: @babel/helpers"
DESCRIPTION = "Collection of helper functions used by Babel transforms."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helpers"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-template-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helpers/-/helpers-7.14.5.tgz"
SRC_URI[md5sum] = "2f79c3d8ac3e513484f7784331d867ea"
SRC_URI[sha256sum] = "843d4feda384c1ed83027d5578ac0fff7b778608cabb0afec8055ef0f0a37fa2"

NPM_PKGNAME = "@babel/helpers"

inherit npmhelper
inherit native
