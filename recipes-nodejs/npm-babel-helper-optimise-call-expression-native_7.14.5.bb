SUMMARY = "NPM: @babel/helper-optimise-call-expression"
DESCRIPTION = "Helper function to optimise call expression"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-optimise-call-expression"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-optimise-call-expression/-/helper-optimise-call-expression-7.14.5.tgz"
SRC_URI[md5sum] = "fec5db12b33b7b9a57046cc0f7516a86"
SRC_URI[sha256sum] = "a8d0554e196dd8f734658825a6569cbc0d1046a569575699e55a5660b31d5c00"

NPM_PKGNAME = "@babel/helper-optimise-call-expression"

inherit npmhelper
inherit native
