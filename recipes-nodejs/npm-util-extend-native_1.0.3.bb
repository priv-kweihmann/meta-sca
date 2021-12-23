SUMMARY = "NPM: util-extend"
DESCRIPTION = "Node's internal object extension function"
HOMEPAGE = "https://github.com/isaacs/util-extend#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d7351a4fc8e956f1a68413490d5e655e"

SRC_URI = "https://registry.npmjs.org/util-extend/-/util-extend-1.0.3.tgz"
SRC_URI[md5sum] = "417e04f750ae026ea8d7a6a60adaa076"
SRC_URI[sha256sum] = "0ad777f25a7a232c6f0e4520873f9815b9073768a6567073a1488f78989178d9"

NPM_PKGNAME = "util-extend"

inherit npmhelper
inherit native
