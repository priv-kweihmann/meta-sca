SUMMARY = "NPM: cspell-dict-latex"
DESCRIPTION = "LaTeX cspell dictionary"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/latex#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-latex/-/cspell-dict-latex-1.1.3.tgz"
SRC_URI[md5sum] = "ce634e04c85f598a6a8d6caabf4952c2"
SRC_URI[sha256sum] = "69238392729784867b82d8a5d6ebe249ce0f4e1a16e16af21c573a3c29b601dd"

NPM_PKGNAME = "cspell-dict-latex"

inherit npmhelper
inherit native
