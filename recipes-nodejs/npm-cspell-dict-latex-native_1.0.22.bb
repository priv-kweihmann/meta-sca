SUMMARY = "NPM: cspell-dict-latex"
DESCRIPTION = "LaTeX cspell dictionary"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/latex#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-latex/-/cspell-dict-latex-1.0.22.tgz"
SRC_URI[md5sum] = "6115434ec1e11485f40ead7d7b599c05"
SRC_URI[sha256sum] = "90b33a0ea6c6d04155320ced7dde7102719db7bb4c70222fbbe82e9c6cebaf61"

NPM_PKGNAME = "cspell-dict-latex"

inherit npmhelper
inherit native
