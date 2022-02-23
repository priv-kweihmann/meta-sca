SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.223.tgz"
SRC_URI[md5sum] = "c883729a03a348d7bd04cf9afe1845a7"
SRC_URI[sha256sum] = "be4489b64c1ceb55cb2192d228898c3cd65f557ca4c9e464bb5c2cd7b99c0d71"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
