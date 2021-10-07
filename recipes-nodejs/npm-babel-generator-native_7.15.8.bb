SUMMARY = "NPM: @babel/generator"
DESCRIPTION = "Turns an AST into code."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-generator"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native \
           npm-jsesc-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/@babel/generator/-/generator-7.15.8.tgz"
SRC_URI[md5sum] = "7089aec4bf2a3e9f0d7369ed0eea7190"
SRC_URI[sha256sum] = "e8075cc28ea16ae07ab967a197b77c53d0158030508f73bdaf8d40d904e42e19"

NPM_PKGNAME = "@babel/generator"

inherit npmhelper
inherit native
