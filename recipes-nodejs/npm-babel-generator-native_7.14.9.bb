SUMMARY = "NPM: @babel/generator"
DESCRIPTION = "Turns an AST into code."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-generator"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native \
           npm-jsesc-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/@babel/generator/-/generator-7.14.9.tgz"
SRC_URI[md5sum] = "10285fc9dc006f604f63d23fce5274fd"
SRC_URI[sha256sum] = "671c0058cfd9e76f5e2c0a8013e0eb2393fa2d661e2180424f6d01bf32173b2a"

NPM_PKGNAME = "@babel/generator"

inherit npmhelper
inherit native
