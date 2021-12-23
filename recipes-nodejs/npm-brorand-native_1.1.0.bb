SUMMARY = "NPM: brorand"
DESCRIPTION = "Random number generator for browsers and node.js"
HOMEPAGE = "https://github.com/indutny/brorand"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=5;md5=dad318f18fd3c89e1c15dcf36aebbddf"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/brorand/-/brorand-1.1.0.tgz"
SRC_URI[md5sum] = "2b53290ae2cb05e6da864b9c21b0e35c"
SRC_URI[sha256sum] = "6add0656db12f5694a96d922916edf764f1a52ee332e2773271733a38fa51225"

NPM_PKGNAME = "brorand"

inherit npmhelper
inherit native
