SUMMARY = "NPM: @cspell/dict-lua"
DESCRIPTION = "Lua dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/lua#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-lua/-/dict-lua-2.0.0.tgz"
SRC_URI[md5sum] = "e55633cd8878e19005aeaff3f33cba4e"
SRC_URI[sha256sum] = "0a97d4555639d8c166f7378b03e2c8fa281ccd9a3de05184acd378ea48e8f72d"

NPM_PKGNAME = "@cspell/dict-lua"

inherit npmhelper
inherit native
