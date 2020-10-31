SUMMARY = "NPM: unist-util-inspect"
DESCRIPTION = "unist utility to inspect nodes"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-inspect#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6bbaa59ebe7f7015186221d4c07c0e65"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/unist-util-inspect/-/unist-util-inspect-6.0.1.tgz"
SRC_URI[md5sum] = "696a8d450294b788fb04042ecd1ea159"
SRC_URI[sha256sum] = "09a1b90f8b5cf0d4ed1c8e059b94e01eaf6ea13ea3c65e2a4e92751963bf274e"

NPM_PKGNAME = "unist-util-inspect"

inherit npmhelper
inherit native
