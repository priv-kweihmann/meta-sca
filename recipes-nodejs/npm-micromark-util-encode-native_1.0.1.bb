SUMMARY = "NPM: micromark-util-encode"
DESCRIPTION = "micromark utility to encode dangerous html characters"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=76;endline=77;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/micromark-util-encode/-/micromark-util-encode-1.0.1.tgz"
SRC_URI[md5sum] = "f049463403d25d579f4f676067f05025"
SRC_URI[sha256sum] = "afe8d297319976216787956a6df6815ffca414828bb5064a56f16b5f966bc9ca"

NPM_PKGNAME = "micromark-util-encode"

inherit npmhelper
inherit native
