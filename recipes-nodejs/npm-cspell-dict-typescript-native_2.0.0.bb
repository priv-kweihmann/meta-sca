SUMMARY = "NPM: @cspell/dict-typescript"
DESCRIPTION = "TypeScript and JavaScript dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/typescript#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-typescript/-/dict-typescript-2.0.0.tgz"
SRC_URI[md5sum] = "f843fc4f313c4a37ea507971b17f6791"
SRC_URI[sha256sum] = "f41f1ac5e73977f156cdaedec286ee2fb0fcbfb1d07caaa1082a88bb0d40daae"

NPM_PKGNAME = "@cspell/dict-typescript"

inherit npmhelper
inherit native
