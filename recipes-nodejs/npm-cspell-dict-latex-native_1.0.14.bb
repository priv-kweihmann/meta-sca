SUMMARY = "NPM: cspell-dict-latex"
DESCRIPTION = "LaTeX cspell dictionary"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/latex#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-latex/-/cspell-dict-latex-1.0.14.tgz"
SRC_URI[md5sum] = "821f2f11bd598aff5929b1155a87e28f"
SRC_URI[sha256sum] = "d0f697ff8fefebb13fecbc13c67a89775ad893fa1d121324938eaa28a2bb182a"

NPM_PKGNAME = "cspell-dict-latex"

inherit npmhelper
inherit native
