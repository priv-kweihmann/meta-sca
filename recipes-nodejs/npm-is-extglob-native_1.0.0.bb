SUMMARY = "NPM: is-extglob"
DESCRIPTION = "Returns true if a string has an extglob."
HOMEPAGE = "https://github.com/jonschlinkert/is-extglob"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=360e60c9b7aa16428ee600ff20935e1f"

SRC_URI = "https://registry.npmjs.org/is-extglob/-/is-extglob-1.0.0.tgz"
SRC_URI[md5sum] = "2abcdb854a7d2b4446afc7b636916db7"
SRC_URI[sha256sum] = "473e563bc34d59eac27dfaacaac6c154e3fb4596b2e44e04157ebef4765c599d"

S = "${WORKDIR}/package"

NPM_PKGNAME = "is-extglob"

inherit npmhelper
inherit native
