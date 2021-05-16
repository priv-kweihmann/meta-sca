SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.139.tgz"
SRC_URI[md5sum] = "b4d6b757f65b413c0f11054e8e1f69cf"
SRC_URI[sha256sum] = "7a7070495b33a3e42aa96731f8b8c3fa0fd714ae88ef9bd90436723784fdec76"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
