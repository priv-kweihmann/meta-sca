SUMMARY = "NPM: cspell-dict-node"
DESCRIPTION = "Node.js dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/node#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-node/-/cspell-dict-node-1.1.5.tgz"
SRC_URI[md5sum] = "c6d1b003fdb6514f838c618dd2de4e38"
SRC_URI[sha256sum] = "5a3304d1c9e92a940c617a96bd7c39e41a132aa42798f6520315b8282b98d007"

NPM_PKGNAME = "cspell-dict-node"

inherit npmhelper
inherit native
