SUMMARY = "NPM: @babel/helpers"
DESCRIPTION = "Collection of helper functions used by Babel transforms."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helpers"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-template-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helpers/-/helpers-7.16.3.tgz"
SRC_URI[md5sum] = "44f30114511d9d504ea38d7a441c2466"
SRC_URI[sha256sum] = "bb474720bf644fd80c5f55b0cdb44302a893ec50e1a81204d0cd593e22fc8c25"

NPM_PKGNAME = "@babel/helpers"

inherit npmhelper
inherit native
