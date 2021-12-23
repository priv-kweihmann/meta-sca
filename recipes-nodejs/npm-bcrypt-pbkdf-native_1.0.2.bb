SUMMARY = "NPM: bcrypt-pbkdf"
DESCRIPTION = "Port of the OpenBSD bcrypt_pbkdf function to pure JS"
HOMEPAGE = "https://github.com/joyent/node-bcrypt-pbkdf#readme"

DEPENDS = "npm-tweetnacl-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aaf6ebb9d1b815768d32661e72bdd761"

SRC_URI = "https://registry.npmjs.org/bcrypt-pbkdf/-/bcrypt-pbkdf-1.0.2.tgz"
SRC_URI[md5sum] = "ee5fb616e90ea464921ba8033c0b3a5c"
SRC_URI[sha256sum] = "e13e9e9f5d438223a02a906e6b77dfc97985a4ccf469ddb65261012973f07826"

S = "${WORKDIR}/package"

NPM_PKGNAME = "bcrypt-pbkdf"

inherit npmhelper
inherit native
