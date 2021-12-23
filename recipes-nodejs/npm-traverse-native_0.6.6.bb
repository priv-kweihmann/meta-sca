SUMMARY = "NPM: traverse"
DESCRIPTION = "traverse and transform objects by visiting every node on a recursive walk"
HOMEPAGE = "https://github.com/substack/js-traverse"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0f6546e91538ce8c26b2da1623705c62"

SRC_URI = "https://registry.npmjs.org/traverse/-/traverse-0.6.6.tgz"
SRC_URI[md5sum] = "0cfa4ec1f861d6ebb972c19093b471d6"
SRC_URI[sha256sum] = "93083a78f95d429992e38a4c3c2590c44e7b38c87f0985b88ebd53d8cc61cff4"

NPM_PKGNAME = "traverse"

inherit npmhelper
inherit native
