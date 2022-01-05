SUMMARY = "NPM: node-forge"
DESCRIPTION = "JavaScript implementations of network transports, cryptography, ciphers, PKI, message digests, and various utilities."
HOMEPAGE = "https://github.com/digitalbazaar/forge"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause | GPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3468e584d830bfb0ffd2d0af6e129136"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-forge/-/node-forge-1.0.0.tgz"
SRC_URI[md5sum] = "564320707a888fdc52902a9739d1c921"
SRC_URI[sha256sum] = "57f6d7c92698489f76c30874c13e3f1a2ac7f7dd8aedff8351ce739ba58ab05d"

NPM_PKGNAME = "node-forge"

inherit npmhelper
inherit native
