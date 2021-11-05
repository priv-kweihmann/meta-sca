SUMMARY = "NPM: @cspell/dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/software-terms#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-software-terms/-/dict-software-terms-2.0.9.tgz"
SRC_URI[md5sum] = "b004c096b082213da6775fae98aa482d"
SRC_URI[sha256sum] = "4043a258dce21a5e3309f188ad2f014b81ed266a468c43c5e7c41b92b5d6862f"

NPM_PKGNAME = "@cspell/dict-software-terms"

inherit npmhelper
inherit native
