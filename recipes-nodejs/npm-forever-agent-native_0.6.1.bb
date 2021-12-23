SUMMARY = "NPM: forever-agent"
DESCRIPTION = "HTTP Agent that keeps socket connections alive between keep-alive requests. Formerly part of mikeal/request, now a standalone module."
HOMEPAGE = "https://github.com/mikeal/forever-agent"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f3f8ead5440d1c311b45be065d135d90"

SRC_URI = "https://registry.npmjs.org/forever-agent/-/forever-agent-0.6.1.tgz"
SRC_URI[md5sum] = "0c2c460c7ac767b7c00cb1e3b9984397"
SRC_URI[sha256sum] = "eca862e1fd07bf54ff68ccf70450a64dc3d6b807ee9e3ddeb5d96773a3c806c5"

S = "${WORKDIR}/package"

NPM_PKGNAME = "forever-agent"

inherit npmhelper
inherit native
