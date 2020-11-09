SUMMARY = "NPM: cspell-dict-latex"
DESCRIPTION = "LaTeX cspell dictionary"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/latex#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-latex/-/cspell-dict-latex-1.0.19.tgz"
SRC_URI[md5sum] = "c2ba4569a67cc64caa33cc57f74555b1"
SRC_URI[sha256sum] = "8fda4680fe9878c8a928241449f5d250fd1739ce36e02b396574582211ffcd6a"

NPM_PKGNAME = "cspell-dict-latex"

inherit npmhelper
inherit native
