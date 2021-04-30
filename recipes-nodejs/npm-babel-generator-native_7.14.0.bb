SUMMARY = "NPM: @babel/generator"
DESCRIPTION = "Turns an AST into code."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-generator"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native \
           npm-jsesc-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/@babel/generator/-/generator-7.14.0.tgz"
SRC_URI[md5sum] = "cef57b9240ddde3deeb1ac7ff06560b1"
SRC_URI[sha256sum] = "98b89ef233c3c9f57c7be4d3060153d498de9ea13a1d784eeab78148266e4ca9"

NPM_PKGNAME = "@babel/generator"

inherit npmhelper
inherit native
