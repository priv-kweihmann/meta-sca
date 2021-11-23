SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.189.tgz"
SRC_URI[md5sum] = "d1c60cec8b534814a18d217d8b848031"
SRC_URI[sha256sum] = "d6f3ff95234564bd3b37d59377d1937b4f8b878dacc7de1b36c143fc8ab9f348"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
