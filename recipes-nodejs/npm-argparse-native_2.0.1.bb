SUMMARY = "NPM: argparse"
DESCRIPTION = "CLI arguments parser. Native port of python's argparse."
HOMEPAGE = "https://github.com/nodeca/argparse#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Python-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=203a6dbc802ee896020a47161e759642"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/argparse/-/argparse-2.0.1.tgz"
SRC_URI[md5sum] = "864f41f5cacfed3315deeba37ba7954b"
SRC_URI[sha256sum] = "27903847fc8215e6fc5a33e81490f7baba66403f8aade33771b988cca097728c"

NPM_PKGNAME = "argparse"

inherit npmhelper
inherit native
