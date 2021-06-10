SUMMARY = "NPM: @babel/generator"
DESCRIPTION = "Turns an AST into code."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-generator"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native \
           npm-jsesc-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/@babel/generator/-/generator-7.14.5.tgz"
SRC_URI[md5sum] = "f844edceda37d899faf8170e14d6384d"
SRC_URI[sha256sum] = "ccee4dcdfa812b5cd831047458f73e441c0b7606c3260924689d7a923ed0a6e6"

NPM_PKGNAME = "@babel/generator"

inherit npmhelper
inherit native
