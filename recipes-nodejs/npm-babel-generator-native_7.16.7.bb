SUMMARY = "NPM: @babel/generator"
DESCRIPTION = "Turns an AST into code."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-generator"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native \
           npm-jsesc-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/@babel/generator/-/generator-7.16.7.tgz"
SRC_URI[md5sum] = "3472bee728362073777d9f8abcd65d11"
SRC_URI[sha256sum] = "c2463df8280a3e7ed4d191e1d4e91d7a2769a816c32f53ee2460ec7c3decee61"

NPM_PKGNAME = "@babel/generator"

inherit npmhelper
inherit native
