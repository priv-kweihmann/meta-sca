SUMMARY = "NPM: cspell-dict-typescript"
DESCRIPTION = "TypeScript and JavaScript dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/typescript#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-typescript/-/cspell-dict-typescript-1.0.15.tgz"
SRC_URI[md5sum] = "c85f5696fa843f7fa396eaa22f978e38"
SRC_URI[sha256sum] = "1ee682183a98d16922a872fff3cd7cc12fef71fe5c763dbd772ec8589eb47b80"

NPM_PKGNAME = "cspell-dict-typescript"

inherit npmhelper
inherit native
