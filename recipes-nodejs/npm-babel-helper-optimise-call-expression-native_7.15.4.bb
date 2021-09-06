SUMMARY = "NPM: @babel/helper-optimise-call-expression"
DESCRIPTION = "Helper function to optimise call expression"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-optimise-call-expression"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-optimise-call-expression/-/helper-optimise-call-expression-7.15.4.tgz"
SRC_URI[md5sum] = "a5e41fbdaf25ad3143ce5712fe037241"
SRC_URI[sha256sum] = "ccefb0249c975a7c3f7c2353d303337a908d7cbdc13b5e853f180d825fd535d2"

NPM_PKGNAME = "@babel/helper-optimise-call-expression"

inherit npmhelper
inherit native
