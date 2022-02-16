SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.222.tgz"
SRC_URI[md5sum] = "e98fff1fc34b50489c2fcbef9569362b"
SRC_URI[sha256sum] = "d75a6dd1b5722f32e33f8bbd5ba7c169f9583df719b42f0814d0639ea23491b5"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
