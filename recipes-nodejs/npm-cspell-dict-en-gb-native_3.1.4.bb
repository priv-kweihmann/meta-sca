SUMMARY = "NPM: @cspell/dict-en-gb"
DESCRIPTION = "British English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/en_GB#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=044e57042be98f6562001f5825fee708"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-en-gb/-/dict-en-gb-3.1.4.tgz"
SRC_URI[md5sum] = "262fd8e8a26a6a85270bb8eee36494f8"
SRC_URI[sha256sum] = "6a10ad2f2f52188cfc70f5c2056492b780f5c842b84678aa7770a1a3da243c58"

NPM_PKGNAME = "@cspell/dict-en-gb"

inherit npmhelper
inherit native
