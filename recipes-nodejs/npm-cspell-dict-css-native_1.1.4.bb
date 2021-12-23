SUMMARY = "NPM: cspell-dict-css"
DESCRIPTION = "CSS dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/css#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-css/-/cspell-dict-css-1.1.4.tgz"
SRC_URI[md5sum] = "6aba6f6113015288b5924e3189276e01"
SRC_URI[sha256sum] = "836f04a2e88410cb466e798372bd4f47bce7c79b599fee56513fec39b7e94834"

NPM_PKGNAME = "cspell-dict-css"

inherit npmhelper
inherit native
