SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.65.tgz"
SRC_URI[md5sum] = "118cd6e2e823ea89fdac889e4e4511dd"
SRC_URI[sha256sum] = "5ab58c351c60dc6c02f45c25dd7d521a5ebed6337fbab62679b0dfc61aab39d3"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
