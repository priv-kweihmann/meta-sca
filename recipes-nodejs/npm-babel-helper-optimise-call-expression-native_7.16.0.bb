SUMMARY = "NPM: @babel/helper-optimise-call-expression"
DESCRIPTION = "Helper function to optimise call expression"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-optimise-call-expression"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-optimise-call-expression/-/helper-optimise-call-expression-7.16.0.tgz"
SRC_URI[md5sum] = "95acec73396888ecb58eff175d2d5f53"
SRC_URI[sha256sum] = "733420d0adf42f56c71394427856b0899fd979ba51c04c01b3c4a4e8e6f0e445"

NPM_PKGNAME = "@babel/helper-optimise-call-expression"

inherit npmhelper
inherit native
