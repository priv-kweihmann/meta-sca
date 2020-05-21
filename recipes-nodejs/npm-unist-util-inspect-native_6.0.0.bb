SUMMARY = "NPM: unist-util-inspect"
DESCRIPTION = "unist utility to inspect nodes"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-inspect#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6bbaa59ebe7f7015186221d4c07c0e65"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/unist-util-inspect/-/unist-util-inspect-6.0.0.tgz"
SRC_URI[md5sum] = "b5b94070b255949154230b563f1a5546"
SRC_URI[sha256sum] = "6fcd510e3bb1dba2ef720f56f27b1740a3403df1dbdba44f006d6dd058c8b12d"

NPM_PKGNAME = "unist-util-inspect"

inherit npmhelper
inherit native
