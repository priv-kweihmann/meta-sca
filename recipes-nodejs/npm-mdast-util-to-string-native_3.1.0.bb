SUMMARY = "NPM: mdast-util-to-string"
DESCRIPTION = "mdast utility to get the plain text content of a node"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-to-string#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/mdast-util-to-string/-/mdast-util-to-string-3.1.0.tgz"
SRC_URI[md5sum] = "05f59d11ead3078ee4620ab0bafbd842"
SRC_URI[sha256sum] = "74aa15df77e00b24a614a0ece11bf5ca406d92457011666ca373b4e5e7995234"

NPM_PKGNAME = "mdast-util-to-string"

inherit npmhelper
inherit native
