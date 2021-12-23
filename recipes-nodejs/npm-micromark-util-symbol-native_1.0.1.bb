SUMMARY = "NPM: micromark-util-symbol"
DESCRIPTION = "micromark utility with symbols"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=75;endline=76;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/micromark-util-symbol/-/micromark-util-symbol-1.0.1.tgz"
SRC_URI[md5sum] = "8d7d2542a2660b284bfb5f0af66f98c7"
SRC_URI[sha256sum] = "036b0d6c434993dbf1ae9f9fd92ab188094c9e40a1f1e2e5359bf46607446bad"

NPM_PKGNAME = "micromark-util-symbol"

inherit npmhelper
inherit native
