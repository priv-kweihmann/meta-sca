SUMMARY = "NPM: @cspell/dict-html-symbol-entities"
DESCRIPTION = "Html Symbol Entities dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/html-symbol-entities#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-html-symbol-entities/-/dict-html-symbol-entities-2.0.0.tgz"
SRC_URI[md5sum] = "5c8d3326d2c18efceefc2a3062230dee"
SRC_URI[sha256sum] = "184c18d83cc973a243a208ccf900c8dd3623e8734ce8437cda9c2936b401e30d"

NPM_PKGNAME = "@cspell/dict-html-symbol-entities"

inherit npmhelper
inherit native
