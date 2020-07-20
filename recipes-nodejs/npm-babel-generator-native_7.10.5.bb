SUMMARY = "NPM: @babel/generator"
DESCRIPTION = "Turns an AST into code."
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native \
           npm-jsesc-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/@babel/generator/-/generator-7.10.5.tgz"
SRC_URI[md5sum] = "f2351ec7f3ee59fadb91f34cdaad3c88"
SRC_URI[sha256sum] = "ab52bb7bc0adf97c5c0479126f6bdbc27cbb391039946ae7e98c8964ebe475bb"

NPM_PKGNAME = "@babel/generator"

inherit npmhelper
inherit native
