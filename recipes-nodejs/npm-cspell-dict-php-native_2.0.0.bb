SUMMARY = "NPM: @cspell/dict-php"
DESCRIPTION = "Php dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/php#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-php/-/dict-php-2.0.0.tgz"
SRC_URI[md5sum] = "98a514768b2499326fd0825eac397573"
SRC_URI[sha256sum] = "a5f5f0691bba26b7665ba3b525e6503329052e5faa8c2cb5feb4c76c372e7f17"

NPM_PKGNAME = "@cspell/dict-php"

inherit npmhelper
inherit native
