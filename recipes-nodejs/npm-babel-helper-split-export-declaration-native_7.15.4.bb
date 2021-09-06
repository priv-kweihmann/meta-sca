SUMMARY = "NPM: @babel/helper-split-export-declaration"
DESCRIPTION = ""
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-split-export-declaration"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-split-export-declaration/-/helper-split-export-declaration-7.15.4.tgz"
SRC_URI[md5sum] = "be5f6233d17468e5a9eca1cd218d715b"
SRC_URI[sha256sum] = "44c844b26be84f4f926a113124ad238b63173c27b0a0d1ff1a01ad14665e1e5f"

NPM_PKGNAME = "@babel/helper-split-export-declaration"

inherit npmhelper
inherit native
