SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.184.tgz"
SRC_URI[md5sum] = "121e08641a08d6eb03e866ed1711f393"
SRC_URI[sha256sum] = "73ca53708a8d29807fe4b94bac102e349bed9fd84762b184c9c9eaa4c24e841d"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
