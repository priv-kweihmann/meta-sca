SUMMARY = "NPM: cspell-dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/software-terms#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-software-terms/-/cspell-dict-software-terms-1.1.2.tgz"
SRC_URI[md5sum] = "194a7513010e41c2f559dfc5d276d5a8"
SRC_URI[sha256sum] = "a123f948ae0bc905d92cdb24a7dba34f8ec7452b53053769945eee30321194af"

NPM_PKGNAME = "cspell-dict-software-terms"

inherit npmhelper
inherit native
