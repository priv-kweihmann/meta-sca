SUMMARY = "NPM: @babel/generator"
DESCRIPTION = "Turns an AST into code."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-generator"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native \
           npm-jsesc-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/@babel/generator/-/generator-7.14.3.tgz"
SRC_URI[md5sum] = "45979b76779dfc292265eba01b9bb4e0"
SRC_URI[sha256sum] = "32074b574b4919c6d85b139b794fe8407a505768eaea9c40b1a5e4682b677c79"

NPM_PKGNAME = "@babel/generator"

inherit npmhelper
inherit native
