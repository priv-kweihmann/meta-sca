SUMMARY = "NPM: @cspell/dict-en-gb"
DESCRIPTION = "British English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/en_GB#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=044e57042be98f6562001f5825fee708"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-en-gb/-/dict-en-gb-3.1.5.tgz"
SRC_URI[md5sum] = "9ceadd0b82962a36cbedfe8cba07b458"
SRC_URI[sha256sum] = "c19245ed26c5b982bed49cdf09b48a72c327f7fe992440a3fac479b54f8ed289"

NPM_PKGNAME = "@cspell/dict-en-gb"

inherit npmhelper
inherit native
