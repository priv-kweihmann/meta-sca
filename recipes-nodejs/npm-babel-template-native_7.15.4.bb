SUMMARY = "NPM: @babel/template"
DESCRIPTION = "Generate an AST from a string template."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-template"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-code-frame-native \
           npm-babel-parser-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/template/-/template-7.15.4.tgz"
SRC_URI[md5sum] = "9f22978cac083a358c1dac5375b737d5"
SRC_URI[sha256sum] = "6ea5393cdc6438f4ab807061ef60e0c4ca6ce84eec96530aa135a0beb79a3c8c"

NPM_PKGNAME = "@babel/template"

inherit npmhelper
inherit native
