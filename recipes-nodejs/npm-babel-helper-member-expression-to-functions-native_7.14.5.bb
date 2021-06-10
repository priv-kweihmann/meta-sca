SUMMARY = "NPM: @babel/helper-member-expression-to-functions"
DESCRIPTION = "Helper function to replace certain member expressions with function calls"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-member-expression-to-functions"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-member-expression-to-functions/-/helper-member-expression-to-functions-7.14.5.tgz"
SRC_URI[md5sum] = "2efe30566b781d6793aab85a8a84e8fa"
SRC_URI[sha256sum] = "9b57e260a9da19a85d129415a6d352583ca75e6c10969c8c8d0d53d10164ed11"

NPM_PKGNAME = "@babel/helper-member-expression-to-functions"

inherit npmhelper
inherit native
