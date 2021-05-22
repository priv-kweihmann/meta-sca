SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.142.tgz"
SRC_URI[md5sum] = "bff9c547b1f12f576448d145b92d21d2"
SRC_URI[sha256sum] = "ba5faa9bca7a4163c75c62da155a9588a6bad0a94fc23124ca0f3af568a652c1"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
