SUMMARY = "NPM: cspell-dict-php"
DESCRIPTION = "Php dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/php#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-php/-/cspell-dict-php-1.0.22.tgz"
SRC_URI[md5sum] = "03804ece2e425c1300f5f767eacb7036"
SRC_URI[sha256sum] = "e11aa771931ac740b098feb4e51ed5b582cee5a1795c4e6a6754dbb86cb6c70b"

NPM_PKGNAME = "cspell-dict-php"

inherit npmhelper
inherit native
