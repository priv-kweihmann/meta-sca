SUMMARY = "NPM: node-forge"
DESCRIPTION = "JavaScript implementations of network transports, cryptography, ciphers, PKI, message digests, and various utilities."
HOMEPAGE = "https://github.com/digitalbazaar/forge"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause | GPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3468e584d830bfb0ffd2d0af6e129136"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-forge/-/node-forge-0.10.0.tgz"
SRC_URI[md5sum] = "675f82d7d6c2e5d681739611570680a0"
SRC_URI[sha256sum] = "253ea369b43846a4d29234b7f4d4ea0d9fe7f8383873713d7762f43b00b1c33e"

NPM_PKGNAME = "node-forge"

inherit npmhelper
inherit native
