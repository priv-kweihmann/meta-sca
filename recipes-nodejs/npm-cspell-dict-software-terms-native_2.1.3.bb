SUMMARY = "NPM: @cspell/dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/software-terms#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-software-terms/-/dict-software-terms-2.1.3.tgz"
SRC_URI[md5sum] = "d8e6f21a40fda102b27edd032d470ad9"
SRC_URI[sha256sum] = "e11ebeef87e90a70b9fffce5706e235243e270fcb9eae63432114e62f67a9b09"

NPM_PKGNAME = "@cspell/dict-software-terms"

inherit npmhelper
inherit native
