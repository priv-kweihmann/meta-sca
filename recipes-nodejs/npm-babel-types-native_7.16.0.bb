SUMMARY = "NPM: @babel/types"
DESCRIPTION = "Babel Types is a Lodash-esque utility library for AST nodes"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-types"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-to-fast-properties-native"

SRC_URI = "https://registry.npmjs.org/@babel/types/-/types-7.16.0.tgz"
SRC_URI[md5sum] = "4f293e8d20870099c40ceb567e928e5c"
SRC_URI[sha256sum] = "ae27f4b2054b0b7c3bf0705ded30b6e108227b8e6b3248b901e538a2e6fcd127"

NPM_PKGNAME = "@babel/types"

inherit npmhelper
inherit native
