SUMMARY = "NPM: @babel/generator"
DESCRIPTION = "Turns an AST into code."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-generator"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native \
           npm-jsesc-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/@babel/generator/-/generator-7.14.8.tgz"
SRC_URI[md5sum] = "3e7eab0b58780cc51c4375ebd4aefa94"
SRC_URI[sha256sum] = "39437b95a7582709fa2dc70a683ab5f629331ee35b3e120a64aabf783bd4966c"

NPM_PKGNAME = "@babel/generator"

inherit npmhelper
inherit native
