SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.153.tgz"
SRC_URI[md5sum] = "f6b569c359d4b7e81ec762ffed5b30a3"
SRC_URI[sha256sum] = "c3fbc77b77146b5dc444589f2c0756b5d7278c9b20453974f54ff384c136fd27"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
