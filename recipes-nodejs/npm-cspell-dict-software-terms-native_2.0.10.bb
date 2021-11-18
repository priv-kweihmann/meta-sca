SUMMARY = "NPM: @cspell/dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/software-terms#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-software-terms/-/dict-software-terms-2.0.10.tgz"
SRC_URI[md5sum] = "dc6f8782ea587a73499a620480eb7d1b"
SRC_URI[sha256sum] = "abf711b5b599db184eff0061229fdbed3889a459c5fab28c891906971e66eb5f"

NPM_PKGNAME = "@cspell/dict-software-terms"

inherit npmhelper
inherit native
