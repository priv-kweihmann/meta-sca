SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.61.tgz"
SRC_URI[md5sum] = "692d63aede245ef103dad411cc97245f"
SRC_URI[sha256sum] = "04d80c4722d57d7f7b23893fa8e62f93a688096e5c9fdf7f241d194a231ecc91"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
