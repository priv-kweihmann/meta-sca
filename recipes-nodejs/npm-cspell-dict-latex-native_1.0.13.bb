SUMMARY = "NPM: cspell-dict-latex"
DESCRIPTION = "LaTeX cspell dictionary"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/latex#readme"

DEPENDS = "npm-configstore-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

SRC_URI = "https://registry.npmjs.org/cspell-dict-latex/-/cspell-dict-latex-1.0.13.tgz"
SRC_URI[md5sum] = "74ca26396c6fec8e60cece34d41313be"
SRC_URI[sha256sum] = "e06ad728ab814af34ad785c2d1636c446bec52272da82fa3223b223bbfd57025"

S = "${WORKDIR}/package"

NPM_PKGNAME = "cspell-dict-latex"

inherit npmhelper
inherit native
