SUMMARY = "NPM: @babel/generator"
DESCRIPTION = "Turns an AST into code."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-generator"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native \
           npm-jsesc-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/@babel/generator/-/generator-7.15.4.tgz"
SRC_URI[md5sum] = "8d4c665ec0e977979b52514ba22e580c"
SRC_URI[sha256sum] = "1fa5e5da2a769c705fb1793f677dd31f84625a0bf96ddbcece7de7b98c4c0aeb"

NPM_PKGNAME = "@babel/generator"

inherit npmhelper
inherit native
