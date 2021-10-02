SUMMARY = "NPM: cspell-dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/software-terms#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-software-terms/-/cspell-dict-software-terms-1.1.25.tgz"
SRC_URI[md5sum] = "4b12abcf437c3bc7e49aa6f7d74ed321"
SRC_URI[sha256sum] = "b3fd86676109c843efd5041c64a092eb96427cd4975837ff16b5e6c1de63930b"

NPM_PKGNAME = "cspell-dict-software-terms"

inherit npmhelper
inherit native
