SUMMARY = "NPM: @cspell/dict-en-gb"
DESCRIPTION = "British English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/en_GB#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=044e57042be98f6562001f5825fee708"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-en-gb/-/dict-en-gb-3.1.6.tgz"
SRC_URI[md5sum] = "95998cd804aaaf64f31028efb0a6da95"
SRC_URI[sha256sum] = "d24cbd56ab086fc68107dffbc1c0a923602df11752fe2d41901ca0f2ea72de87"

NPM_PKGNAME = "@cspell/dict-en-gb"

inherit npmhelper
inherit native
