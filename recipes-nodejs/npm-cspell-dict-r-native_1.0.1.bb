SUMMARY = "NPM: @cspell/dict-r"
DESCRIPTION = "R dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/r#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f1061ae89a4a730d3ea85fff550b51ca"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-r/-/dict-r-1.0.1.tgz"
SRC_URI[md5sum] = "534242e78fd25329ec94963ae5ff7421"
SRC_URI[sha256sum] = "8eee940ca45ef3af08ec3dcbf4704efddb67a1b3d8449aecc749aecce1282346"

NPM_PKGNAME = "@cspell/dict-r"

inherit npmhelper
inherit native
