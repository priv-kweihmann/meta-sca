SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.157.tgz"
SRC_URI[md5sum] = "91041030ce84217ba4cef76c78700d3a"
SRC_URI[sha256sum] = "004d3efe71855f1e5ebbaceb68ae76ca93497b93df8e921133add8b7d96143f8"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
