SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.160.tgz"
SRC_URI[md5sum] = "bfda5cae5f6efe922ad11ea3c694d3df"
SRC_URI[sha256sum] = "c45bbdbcbb1a1c0e9c929cf3aa213178655eacaea9b9fe0400dad7330ab9b36a"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
