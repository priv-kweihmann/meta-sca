SUMMARY = "NPM: cspell-dict-latex"
DESCRIPTION = "LaTeX cspell dictionary"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/latex#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-latex/-/cspell-dict-latex-1.1.4.tgz"
SRC_URI[md5sum] = "ac4d272c8bf16414bee12ab64c4a3082"
SRC_URI[sha256sum] = "c0da5620eb00c856a2e550bdedd6828c96614afcdea23a4c4efec044fb9dcd1e"

NPM_PKGNAME = "cspell-dict-latex"

inherit npmhelper
inherit native
