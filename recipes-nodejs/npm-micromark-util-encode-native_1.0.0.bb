SUMMARY = "NPM: micromark-util-encode"
DESCRIPTION = "micromark utility to encode dangerous html characters"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=76;endline=77;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/micromark-util-encode/-/micromark-util-encode-1.0.0.tgz"
SRC_URI[md5sum] = "a60df848365d133dd061312771574aeb"
SRC_URI[sha256sum] = "6a06e3f11ba25a302f3f1e52336e8b7bb4193a26059544f0a28e3b57580a4f5a"

NPM_PKGNAME = "micromark-util-encode"

inherit npmhelper
inherit native
