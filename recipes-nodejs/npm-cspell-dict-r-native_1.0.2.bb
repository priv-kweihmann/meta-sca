SUMMARY = "NPM: @cspell/dict-r"
DESCRIPTION = "R dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/r#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f1061ae89a4a730d3ea85fff550b51ca"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-r/-/dict-r-1.0.2.tgz"
SRC_URI[md5sum] = "d4bdce065a4bd0685448621d8daa7d94"
SRC_URI[sha256sum] = "358364523f13abadd945e1e5c577b486d4577a7b8f82b446bb513a3708af7e22"

NPM_PKGNAME = "@cspell/dict-r"

inherit npmhelper
inherit native
