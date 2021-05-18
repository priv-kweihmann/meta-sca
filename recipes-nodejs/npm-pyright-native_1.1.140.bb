SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.140.tgz"
SRC_URI[md5sum] = "664c26102bb8cb98d9438ac71f29734f"
SRC_URI[sha256sum] = "1a5b760fb46b0d1cef10cbc769a2f159fc96c319ad4a04fd3a6e4ace29e92bb4"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
