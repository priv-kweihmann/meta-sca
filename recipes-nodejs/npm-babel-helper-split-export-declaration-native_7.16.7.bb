SUMMARY = "NPM: @babel/helper-split-export-declaration"
DESCRIPTION = ""
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-split-export-declaration"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-split-export-declaration/-/helper-split-export-declaration-7.16.7.tgz"
SRC_URI[md5sum] = "cce660616c0b0f8c1c699b95ad639d03"
SRC_URI[sha256sum] = "0bf2cab0c3fb41fb2d3ef0b24a31dad8d781ca53ce6765c09e3243e04b52750f"

NPM_PKGNAME = "@babel/helper-split-export-declaration"

inherit npmhelper
inherit native
