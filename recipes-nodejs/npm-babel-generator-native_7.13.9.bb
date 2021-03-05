SUMMARY = "NPM: @babel/generator"
DESCRIPTION = "Turns an AST into code."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-generator"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native \
           npm-jsesc-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/@babel/generator/-/generator-7.13.9.tgz"
SRC_URI[md5sum] = "2a72d4e03835f235e028681c7b31ed41"
SRC_URI[sha256sum] = "b144c96c6ae5d8b1d5469b171278ad5486c7bfaf194a45062e3714f0dba248c7"

NPM_PKGNAME = "@babel/generator"

inherit npmhelper
inherit native
