SUMMARY = "Query metadatdata from sdists / bdists / installed packages"
HOMEPAGE = "https://bazaar.launchpad.net/~tseaver/pkginfo/trunk/files"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6fc86b61c6077306ca1f5edc8edcc490"

PYPI_PACKAGE = "pkginfo"

SRC_URI[md5sum] = "ac4eb5be627809f5a09f1b775a992222"
SRC_URI[sha256sum] = "65175ffa2c807220673a41c371573ac9a1ea1b19ffd5eef916278f428319934f"

inherit pypi
inherit setuptools3
inherit native
