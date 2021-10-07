SUMMARY = "NPM: @cspell/dict-en-gb"
DESCRIPTION = "British English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/en_GB#readme"

LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=044e57042be98f6562001f5825fee708"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-en-gb/-/dict-en-gb-3.1.1.tgz"
SRC_URI[md5sum] = "5f3636689ac4e9dc2c8e9b9cc9c213d6"
SRC_URI[sha256sum] = "e39c8c0d135dbc780540b23e5a42fe752449885f102781dc5e9801bdc217324a"

NPM_PKGNAME = "@cspell/dict-en-gb"

inherit npmhelper
inherit native
