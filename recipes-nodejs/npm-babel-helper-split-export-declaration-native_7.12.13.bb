SUMMARY = "NPM: @babel/helper-split-export-declaration"
DESCRIPTION = ""
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-split-export-declaration"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-split-export-declaration/-/helper-split-export-declaration-7.12.13.tgz"
SRC_URI[md5sum] = "8db09a6f5e6d9084dbf2df40154de08f"
SRC_URI[sha256sum] = "c62fe860b48645cb4e2bdbe1089cc97a369f5dcc1970b42c6b9782f8da1ca818"

NPM_PKGNAME = "@babel/helper-split-export-declaration"

inherit npmhelper
inherit native
