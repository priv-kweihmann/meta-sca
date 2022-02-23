SUMMARY = "NPM: @cspell/dict-latex"
DESCRIPTION = "LaTeX cspell dictionary"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/latex#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-latex/-/dict-latex-2.0.0.tgz"
SRC_URI[md5sum] = "aa8b668ed8872494634cd53d47f5e286"
SRC_URI[sha256sum] = "60b487b75a38f2d7dadb4486b6ea3134c5a4f18b07bd20fd63c0e780c1966593"

NPM_PKGNAME = "@cspell/dict-latex"

inherit npmhelper
inherit native
