SUMMARY = "NPM: @cspell/dict-css"
DESCRIPTION = "CSS dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/css#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-css/-/dict-css-2.0.0.tgz"
SRC_URI[md5sum] = "7580dba7aee83f7fc9bbbb483a81a977"
SRC_URI[sha256sum] = "7dad4a385628d327df45c7901e62c586f7043b168453f266fb3eb4027f4f8d76"

NPM_PKGNAME = "@cspell/dict-css"

inherit npmhelper
inherit native
