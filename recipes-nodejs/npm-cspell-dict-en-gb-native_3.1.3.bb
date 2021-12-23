SUMMARY = "NPM: @cspell/dict-en-gb"
DESCRIPTION = "British English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/en_GB#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=044e57042be98f6562001f5825fee708"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-en-gb/-/dict-en-gb-3.1.3.tgz"
SRC_URI[md5sum] = "2e25adcf911a270c4de9fd5d30212b83"
SRC_URI[sha256sum] = "dfda15d88200cb9f2ae8706a6bb1892d0582219605cde1a4873fb6019582f79a"

NPM_PKGNAME = "@cspell/dict-en-gb"

inherit npmhelper
inherit native
