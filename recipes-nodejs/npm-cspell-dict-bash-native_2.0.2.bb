SUMMARY = "NPM: @cspell/dict-bash"
DESCRIPTION = "Bash dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/bash#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-bash/-/dict-bash-2.0.2.tgz"
SRC_URI[md5sum] = "6e1581cf08143c371978d639a5cc2be6"
SRC_URI[sha256sum] = "a8660ba7065e02aa75b9bb22b833dcf34c2eba86b7475c9f8debd671706db24b"

NPM_PKGNAME = "@cspell/dict-bash"

inherit npmhelper
inherit native
