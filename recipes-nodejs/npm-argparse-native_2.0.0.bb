SUMMARY = "NPM: argparse"
DESCRIPTION = "CLI arguments parser. Native port of python's argparse."
HOMEPAGE = "https://github.com/nodeca/argparse#readme"

LICENSE = "Python-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=203a6dbc802ee896020a47161e759642"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/argparse/-/argparse-2.0.0.tgz"
SRC_URI[md5sum] = "48040e8e7bc3d92c0520b5a537c42f53"
SRC_URI[sha256sum] = "c69dae85661d7493073639c8b66a7b27f8726fe06f54ffaec4cb8915f207e2cc"

NPM_PKGNAME = "argparse"

inherit npmhelper
inherit native
