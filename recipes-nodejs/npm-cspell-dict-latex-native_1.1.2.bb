SUMMARY = "NPM: cspell-dict-latex"
DESCRIPTION = "LaTeX cspell dictionary"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/latex#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-latex/-/cspell-dict-latex-1.1.2.tgz"
SRC_URI[md5sum] = "816c2a84dcc56b74e3b396c49d2f29b3"
SRC_URI[sha256sum] = "b985828581907503a6219ced2ec00041958d49620358522f461ba27549dee939"

NPM_PKGNAME = "cspell-dict-latex"

inherit npmhelper
inherit native
