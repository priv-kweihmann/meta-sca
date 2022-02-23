SUMMARY = "NPM: node-forge"
DESCRIPTION = "JavaScript implementations of network transports, cryptography, ciphers, PKI, message digests, and various utilities."
HOMEPAGE = "https://github.com/digitalbazaar/forge"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause | GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3468e584d830bfb0ffd2d0af6e129136"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-forge/-/node-forge-1.2.1.tgz"
SRC_URI[md5sum] = "bce5c141cb60e1316acf6d2bc7fc524d"
SRC_URI[sha256sum] = "7e6fe180f83e013f7e86abd87020e4389f62a5ad2a070d0f5f24b24de54e055c"

NPM_PKGNAME = "node-forge"

inherit npmhelper
inherit native
