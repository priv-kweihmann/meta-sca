SUMMARY = "NPM: extend"
DESCRIPTION = "Port of jQuery.extend for node.js and the browser"
HOMEPAGE = "https://github.com/justmoon/node-extend#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=33d9f7a91df276ec16aa941032ee1476"

SRC_URI = "https://registry.npmjs.org/extend/-/extend-3.0.2.tgz"
SRC_URI[md5sum] = "df4de1d88eebbf445584322ecbb7d65e"
SRC_URI[sha256sum] = "1d91d0b0faa50cba223fa937c7b5a4a662968b1d78b3e59dca5c917dd5cf72b2"

S = "${WORKDIR}/package"

NPM_PKGNAME = "extend"

inherit npmhelper
inherit native
