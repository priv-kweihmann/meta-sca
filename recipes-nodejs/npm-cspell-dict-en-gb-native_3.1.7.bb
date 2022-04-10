SUMMARY = "NPM: @cspell/dict-en-gb"
DESCRIPTION = "British English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/en_GB#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=044e57042be98f6562001f5825fee708"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-en-gb/-/dict-en-gb-3.1.7.tgz"
SRC_URI[md5sum] = "99145f2fc990faef7881a4bc75446126"
SRC_URI[sha256sum] = "0a6f2ad1530bee024a8f82853edefcc607ec2dea33b61a76313d36cadff4b9d4"

NPM_PKGNAME = "@cspell/dict-en-gb"

inherit npmhelper
inherit native
