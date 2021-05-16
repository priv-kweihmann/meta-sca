SUMMARY = "NPM: istextorbinary"
DESCRIPTION = "Determine if a filename and/or buffer is text or binary. Smarter detection than the other solutions."
HOMEPAGE = "https://github.com/bevry/istextorbinary"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=90c2e5df173fd34066031c1476c854ec"

DEPENDS = "npm-binaryextensions-native \
           npm-editions-native \
           npm-textextensions-native"

SRC_URI = "https://registry.npmjs.org/istextorbinary/-/istextorbinary-5.12.0.tgz"
SRC_URI[md5sum] = "bee22563c59c1b8e561dde30595efcd6"
SRC_URI[sha256sum] = "a2018c615a23f22c56b22b587b4a07e9b6ad5e1d468e34b6b85230bcdbbeb3b1"

NPM_PKGNAME = "istextorbinary"

inherit npmhelper
inherit native
