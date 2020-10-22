SUMMARY = "NPM: cspell-dict-latex"
DESCRIPTION = "LaTeX cspell dictionary"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/latex#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-latex/-/cspell-dict-latex-1.0.15.tgz"
SRC_URI[md5sum] = "2aa3f94d4ec675fdaead48341c72daf5"
SRC_URI[sha256sum] = "56f215f98dce8a277fcfee8e917d208a36ad88f23f51a175bc8158e3bdd19491"

NPM_PKGNAME = "cspell-dict-latex"

inherit npmhelper
inherit native
