SUMMARY = "NPM: @babel/helper-optimise-call-expression"
DESCRIPTION = "Helper function to optimise call expression"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-optimise-call-expression"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-optimise-call-expression/-/helper-optimise-call-expression-7.12.13.tgz"
SRC_URI[md5sum] = "b06d494852b8183bbceff5cedb7b35d4"
SRC_URI[sha256sum] = "bf99da6d67ff090a4b3d417a8c6724a2f6f9315d6dfc7da7b64d4eba76e588f4"

NPM_PKGNAME = "@babel/helper-optimise-call-expression"

inherit npmhelper
inherit native
