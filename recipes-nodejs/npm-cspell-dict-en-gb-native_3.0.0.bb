SUMMARY = "NPM: @cspell/dict-en-gb"
DESCRIPTION = "British English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/en_GB#readme"

LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=044e57042be98f6562001f5825fee708"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-en-gb/-/dict-en-gb-3.0.0.tgz"
SRC_URI[md5sum] = "286b1c44c95d5b4dc3366b80832d209e"
SRC_URI[sha256sum] = "343843c3f0e46c7783d05089e62cbaa78a409bde9f1e9fd5a2928e70cb9fb070"

NPM_PKGNAME = "@cspell/dict-en-gb"

inherit npmhelper
inherit native
