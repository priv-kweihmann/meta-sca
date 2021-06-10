SUMMARY = "NPM: @babel/template"
DESCRIPTION = "Generate an AST from a string template."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-template"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-code-frame-native \
           npm-babel-parser-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/template/-/template-7.14.5.tgz"
SRC_URI[md5sum] = "11f4be9d2a7d8e5eed3f60da266775db"
SRC_URI[sha256sum] = "b9b59417d066942b01af3800f0fd953568dd250206c844e8e53a0a290cae39bb"

NPM_PKGNAME = "@babel/template"

inherit npmhelper
inherit native
