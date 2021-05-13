SUMMARY = "NPM: istextorbinary"
DESCRIPTION = "Determine if a filename and/or buffer is text or binary. Smarter detection than the other solutions."
HOMEPAGE = "https://github.com/bevry/istextorbinary"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=04a9afc24140a62c48528d0a8cac4c82"

DEPENDS = "npm-binaryextensions-native \
           npm-textextensions-native"

SRC_URI = "https://registry.npmjs.org/istextorbinary/-/istextorbinary-3.3.0.tgz"
SRC_URI[md5sum] = "306664719bfba0ff52a9f8ea4a721ca5"
SRC_URI[sha256sum] = "0da9c1134b8d53c939bdd5b7e162df1fbed0178dbbc85dba00c159775add9d59"

NPM_PKGNAME = "istextorbinary"

inherit npmhelper
inherit native
