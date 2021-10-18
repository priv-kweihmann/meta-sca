SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.179.tgz"
SRC_URI[md5sum] = "61af0da104a297ad5488d2b069401904"
SRC_URI[sha256sum] = "22bae2c3cfa62a586431b4eccddb34ca2750f9c9d45d4478775a81bf6e896398"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
