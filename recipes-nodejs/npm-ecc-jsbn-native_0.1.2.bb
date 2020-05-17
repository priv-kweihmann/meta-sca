SUMMARY = "NPM: ecc-jsbn"
DESCRIPTION = "ECC JS code based on JSBN"
HOMEPAGE = "https://github.com/quartzjer/ecc-jsbn"

DEPENDS = "npm-jsbn-native npm-safer-buffer-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0d289b6d63cbcc18e4b2af9a5bd28b54"

SRC_URI = "https://registry.npmjs.org/ecc-jsbn/-/ecc-jsbn-0.1.2.tgz"
SRC_URI[md5sum] = "7e3ad5fca20a2858e7f645289d48dda2"
SRC_URI[sha256sum] = "609ad25ccc6d5301c822fbf52ccd3f77f46dd02ce626b85d8020c3fb61a46974"

S = "${WORKDIR}/package"

NPM_PKGNAME = "ecc-jsbn"

inherit npmhelper
inherit native
