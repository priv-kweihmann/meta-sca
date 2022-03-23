SUMMARY = "NPM: node-forge"
DESCRIPTION = "JavaScript implementations of network transports, cryptography, ciphers, PKI, message digests, and various utilities."
HOMEPAGE = "https://github.com/digitalbazaar/forge"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause | GPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3468e584d830bfb0ffd2d0af6e129136"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-forge/-/node-forge-1.3.0.tgz"
SRC_URI[md5sum] = "b835b74356c717cf1e0bc9e547dc1d97"
SRC_URI[sha256sum] = "97f0276c32b39411ad85c5762bf546ca281451eeaa93bdd383ff082e8e0181b4"

NPM_PKGNAME = "node-forge"

inherit npmhelper
inherit native
