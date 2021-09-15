SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.168.tgz"
SRC_URI[md5sum] = "cfd9223a101e60a0024d826c58ba74dd"
SRC_URI[sha256sum] = "51feafc68c70594608f2f2d3198a45c6ef28730f7b80587950096744caa9e6ba"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
