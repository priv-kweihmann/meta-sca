SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.167.tgz"
SRC_URI[md5sum] = "65df7e661d86e317440d3128bdc3b84f"
SRC_URI[sha256sum] = "dcfbc9b28ebcc9b3559e77ec2e4d0b5e3e69c811099638a27e8ef9419363b85a"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
