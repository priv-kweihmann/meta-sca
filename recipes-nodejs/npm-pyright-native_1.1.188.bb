SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.188.tgz"
SRC_URI[md5sum] = "3fe8fb8d42b2ad44149727bc3e894722"
SRC_URI[sha256sum] = "33913ac8a26227f0906793301fcb64d731ce7eaa7a75affd2bb8cc2ebe67ac94"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
