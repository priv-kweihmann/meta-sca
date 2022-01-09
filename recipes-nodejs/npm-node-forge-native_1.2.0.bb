SUMMARY = "NPM: node-forge"
DESCRIPTION = "JavaScript implementations of network transports, cryptography, ciphers, PKI, message digests, and various utilities."
HOMEPAGE = "https://github.com/digitalbazaar/forge"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause | GPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3468e584d830bfb0ffd2d0af6e129136"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-forge/-/node-forge-1.2.0.tgz"
SRC_URI[md5sum] = "de7078481a86e60a81b8d43aa54fe96f"
SRC_URI[sha256sum] = "5c35ace28a2ccd745e7ac34ea630c0dc1da2d5283bf38566da78e10e0880460b"

NPM_PKGNAME = "node-forge"

inherit npmhelper
inherit native
