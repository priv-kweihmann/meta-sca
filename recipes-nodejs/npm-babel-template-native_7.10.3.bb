SUMMARY = "NPM: @babel/template"
DESCRIPTION = "Generate an AST from a string template."
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-code-frame-native \
           npm-babel-parser-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/template/-/template-7.10.3.tgz"
SRC_URI[md5sum] = "e0b6d042bdebf953375ceac516f11766"
SRC_URI[sha256sum] = "96c7fe18f838ea96493a6a438d5c32c689326664a4397d25438870dc7b615b1e"

NPM_PKGNAME = "@babel/template"

inherit npmhelper
inherit native
