SUMMARY = "NPM: micromark-util-normalize-identifier"
DESCRIPTION = "micromark utility normalize identifiers (as found in references, definitions)"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=84;endline=85;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-micromark-util-symbol-native"

SRC_URI = "https://registry.npmjs.org/micromark-util-normalize-identifier/-/micromark-util-normalize-identifier-1.0.0.tgz"
SRC_URI[md5sum] = "ceda47647993a200fcbe164a063843b2"
SRC_URI[sha256sum] = "2fe7deb4ecc43e50847ad2b855ab47343be93154725a8df6f1169ca08a6ab3eb"

NPM_PKGNAME = "micromark-util-normalize-identifier"

inherit npmhelper
inherit native
