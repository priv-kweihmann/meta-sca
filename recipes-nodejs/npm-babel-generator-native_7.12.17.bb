SUMMARY = "NPM: @babel/generator"
DESCRIPTION = "Turns an AST into code."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-generator"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native \
           npm-jsesc-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/@babel/generator/-/generator-7.12.17.tgz"
SRC_URI[md5sum] = "60547f4f292ad3899bae9d9c8e39cc9c"
SRC_URI[sha256sum] = "dc2cbca72e44608395c9ccecec3a1593e0ca48346b1d5584c460f7e3953001ac"

NPM_PKGNAME = "@babel/generator"

inherit npmhelper
inherit native
