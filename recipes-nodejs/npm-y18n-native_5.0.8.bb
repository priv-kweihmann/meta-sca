SUMMARY = "NPM: y18n"
DESCRIPTION = "the bare-bones internationalization library used by yargs"
HOMEPAGE = "https://github.com/yargs/y18n"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=55e5f88040679148136545002139a8b1"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/y18n/-/y18n-5.0.8.tgz"
SRC_URI[md5sum] = "6018afaa99207dafc81cb56404a31454"
SRC_URI[sha256sum] = "d43743bad3a7cb3af5d3b6bf70fd32fe3923ea86e4148109c6dd0126deada769"

NPM_PKGNAME = "y18n"

inherit npmhelper
inherit native
