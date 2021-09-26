SUMMARY = "NPM: @cspell/dict-en-gb"
DESCRIPTION = "British English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/en_GB#readme"

LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=044e57042be98f6562001f5825fee708"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-en-gb/-/dict-en-gb-3.1.0.tgz"
SRC_URI[md5sum] = "123f9fc53ddeb65fa918832c1ebd057c"
SRC_URI[sha256sum] = "b2e07298f7cdc0635a676683738049e822e7d52e44af9179ad2aea40fdad09a0"

NPM_PKGNAME = "@cspell/dict-en-gb"

inherit npmhelper
inherit native
