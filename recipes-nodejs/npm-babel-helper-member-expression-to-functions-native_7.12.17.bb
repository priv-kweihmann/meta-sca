SUMMARY = "NPM: @babel/helper-member-expression-to-functions"
DESCRIPTION = "Helper function to replace certain member expressions with function calls"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-member-expression-to-functions"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-member-expression-to-functions/-/helper-member-expression-to-functions-7.12.17.tgz"
SRC_URI[md5sum] = "dd62c4e642e10dc7576d90b654cd0914"
SRC_URI[sha256sum] = "e69cd6c1a4710ed5b70d3134b2ba41ae580f30068aebf083cb088f9bb6940cfd"

NPM_PKGNAME = "@babel/helper-member-expression-to-functions"

inherit npmhelper
inherit native
