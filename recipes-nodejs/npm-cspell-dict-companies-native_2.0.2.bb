SUMMARY = "NPM: @cspell/dict-companies"
DESCRIPTION = "Company names dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/companies#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-companies/-/dict-companies-2.0.2.tgz"
SRC_URI[md5sum] = "1ef2212692c65985a4a8995e7881d5d6"
SRC_URI[sha256sum] = "2b79860d0e7aea2852b8e3e220dd3ae1ed92fff61bda14808aa9e2afc990c09a"

NPM_PKGNAME = "@cspell/dict-companies"

inherit npmhelper
inherit native
