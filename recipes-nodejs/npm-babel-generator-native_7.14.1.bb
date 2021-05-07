SUMMARY = "NPM: @babel/generator"
DESCRIPTION = "Turns an AST into code."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-generator"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native \
           npm-jsesc-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/@babel/generator/-/generator-7.14.1.tgz"
SRC_URI[md5sum] = "ebbdb53592b8ad21575e14fa89f06caf"
SRC_URI[sha256sum] = "0abd63f827295a1197f89271464a6a5573b9db5b10a21606c68d71fa2d4be0cb"

NPM_PKGNAME = "@babel/generator"

inherit npmhelper
inherit native
