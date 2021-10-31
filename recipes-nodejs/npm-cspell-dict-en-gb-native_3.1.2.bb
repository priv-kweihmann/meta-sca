SUMMARY = "NPM: @cspell/dict-en-gb"
DESCRIPTION = "British English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/en_GB#readme"

LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=044e57042be98f6562001f5825fee708"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-en-gb/-/dict-en-gb-3.1.2.tgz"
SRC_URI[md5sum] = "14d68de76149326c49f1ecf9654f75a3"
SRC_URI[sha256sum] = "9f8839c916269c090484d9908b93b1ce5e8a7eb215d1bac9a807a2d42ec4a12e"

NPM_PKGNAME = "@cspell/dict-en-gb"

inherit npmhelper
inherit native
