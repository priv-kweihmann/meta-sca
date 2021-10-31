SUMMARY = "NPM: @cspell/dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/software-terms#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-software-terms/-/dict-software-terms-2.0.8.tgz"
SRC_URI[md5sum] = "8ed94f490506ecb96e6f30be99f19723"
SRC_URI[sha256sum] = "5f8ddba3193dc05b7b7f1e979882c759d93120d48741bd464fd793e133d270f4"

NPM_PKGNAME = "@cspell/dict-software-terms"

inherit npmhelper
inherit native
