SUMMARY = "NPM: node-forge"
DESCRIPTION = "JavaScript implementations of network transports, cryptography, ciphers, PKI, message digests, and various utilities."
HOMEPAGE = "https://github.com/digitalbazaar/forge"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause | GPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3468e584d830bfb0ffd2d0af6e129136"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-forge/-/node-forge-1.3.1.tgz"
SRC_URI[md5sum] = "69dc8225cc6755031bf42b78264c2df9"
SRC_URI[sha256sum] = "77de03720cd00fafdbcda47e3e995a1f548f2e9028d11a98b0d9bef37ec2ad85"

NPM_PKGNAME = "node-forge"

inherit npmhelper
inherit native
