SUMMARY = "NPM: @cspell/dict-public-licenses"
DESCRIPTION = "Common Public Licenses dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/public-licenses#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-public-licenses/-/dict-public-licenses-1.0.4.tgz"
SRC_URI[md5sum] = "60bda130998798ff47d91092e062c632"
SRC_URI[sha256sum] = "3e1eef079b7cb2b11913cf3e4fb4e9bbb40f4d892a2b4fa8b2ab76f6670efd30"

NPM_PKGNAME = "@cspell/dict-public-licenses"

inherit npmhelper
inherit native
