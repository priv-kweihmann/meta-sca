SUMMARY = "NPM: supports-color"
DESCRIPTION = "Detect whether a terminal supports color"
HOMEPAGE = "https://github.com/chalk/supports-color#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/supports-color/-/supports-color-9.1.0.tgz"
SRC_URI[md5sum] = "3aff7a047c1bb53497e02ebd45a4bac5"
SRC_URI[sha256sum] = "3781367b281cf3dfaedf1ac75ed30b56a5ba75520d95fe1909d35a6ff8ebbadd"

NPM_PKGNAME = "supports-color"

inherit npmhelper
inherit native
