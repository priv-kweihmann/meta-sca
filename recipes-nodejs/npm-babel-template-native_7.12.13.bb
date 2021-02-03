SUMMARY = "NPM: @babel/template"
DESCRIPTION = "Generate an AST from a string template."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-template"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-code-frame-native \
           npm-babel-parser-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/template/-/template-7.12.13.tgz"
SRC_URI[md5sum] = "0326d436b3127e3419765111a116a58b"
SRC_URI[sha256sum] = "36d2d87b053e91827083d0d94364c7f673536aa963add7a3c10129d816a2ef71"

NPM_PKGNAME = "@babel/template"

inherit npmhelper
inherit native
